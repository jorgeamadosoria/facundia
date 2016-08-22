package org.jasr.facundia.cardinal;

import java.math.BigInteger;
import java.util.Arrays;

import org.apache.commons.lang3.StringUtils;

public class CardinalNumber {

    public String getText(BigInteger number) {
        return process(number.toString());
    }

    public String getText(Long number) {
        return process(number.toString());
    }

    public String getText(Integer number) {
        return process(number.toString());
    }

    public String getText(String number) {
        return process(number);
    }

    private String process(String number) {

        char[] preDigits = number.toCharArray();

        if (!validate(number))
            return "NaN";

        // remove leftmost zeros
        int i = 0;
        while (i < preDigits.length && preDigits[i] == '0')
            i++;

        // nothing but zeros
        if (i == preDigits.length)
            return Constants._0;

        char[] digits = Arrays.copyOfRange(preDigits, i, preDigits.length);

        StringBuilder result = new StringBuilder();
        int len = digits.length / 6;
        int periodCounter = 0;
        for (int j = 0; j < len; j++) {
            processPeriod(result, digits, periodCounter++, j);
        }

        if (digits.length % 6 > 0) {
            processPeriod(result, digits, periodCounter, len);
        }

        return postProcessing(result);
    }

    private void processPeriod(StringBuilder result, char[] digits, int periodCounter, int j) {
        StringBuilder period = new StringBuilder();
        period.append(periods(digits, Math.max(0,digits.length - (j * 6) - 6), digits.length - (j * 6)));
        period.append(getPeriodMarker(period, periodCounter));
        result.insert(0, period);
    }

    private String postProcessing(StringBuilder result) {
        String strRes = result.toString();
        if (strRes.endsWith(Constants._21))
            return strRes.substring(0, strRes.lastIndexOf(Constants._21)) + Constants._21o;
        if (strRes.endsWith(Constants._1))
            return strRes.substring(0, strRes.lastIndexOf(Constants._1)) + Constants._1o;
        return result.toString().trim();
    }

    private String getPeriodMarker(StringBuilder period, int periodMarker) {
        if (period.toString().equals(Constants._1))
            return Constants.singularPeriods[periodMarker];
        return Constants.Periods[periodMarker];
    }

    private boolean validate(String digits) {
        //invalid if string is null or ""
        if (StringUtils.isEmpty(digits))
            return false;
        
        // valid if all digits are... digits
        for (char c : digits.toCharArray()) {
            if (!Character.isDigit(c))
                return false;
        }
        
        //valid if within range
        BigInteger current = new BigInteger(new String(digits));
        if (current.compareTo(Constants.minimum) < 0 && current.compareTo(Constants.maximum) > 0)
            return false;
        return true;
    }

    private StringBuilder periods(char[] digits, int ini, int end) {
        StringBuilder result = new StringBuilder();
        if (end - ini > 3) {
            StringBuilder higherOrder = orders(true, digits, ini, end <= 3 ? end : end - 3);
            result.append(higherOrder);
        }
        StringBuilder lesserOrder = orders(false, digits, Math.max(end - 3, 0), end);
        result.append(lesserOrder);

        return result;
    }

    private StringBuilder orders(boolean higher, char[] order, int ini, int end) {
        StringBuilder result = new StringBuilder();
        char h = '0', t = '0', u = '0';

        u = order[end - 1];
        if (end - 1 > ini) {
            t = order[end - 2];
        }
        if (end - 2 > ini) {
            h = order[end - 3];
        }

        // special case: if one on the higher order, nothing, to avoid "un mil"
        if (higher && h == '0' && t == '0' && u == '1') {
            return new StringBuilder(Constants._1000);
        }
        else
        // special case: if cero, nothing
        if (h == '0' && t == '0' && u == '0') {
            return new StringBuilder();
        }
        else
        // special case: 100 -> cien, 1xx -> ciento
        if (h == '1' && t == '0' && u == '0')
            result.append(Constants._100n);
        else {
            hundreds(result, h);
            if (t == '0')
                units(result, u);
            else if (t == '1' || t == '2')
                specialtenths(result, t, u);
            else {
                tenths(result, t);
                if (u != '0') {
                    result.append(Constants._y);
                    units(result, u);
                }
            }
        }
        return higher ? result.append(Constants._1000) : result;
    }

    private void hundreds(StringBuilder result, char hundred) {
        switch (hundred) {
        case '1':
            result.append(Constants._100);
            break;
        case '2':
            result.append(Constants._200);
            break;
        case '3':
            result.append(Constants._300);
            break;
        case '4':
            result.append(Constants._400);
            break;
        case '5':
            result.append(Constants._500);
            break;
        case '6':
            result.append(Constants._600);
            break;
        case '7':
            result.append(Constants._700);
            break;
        case '8':
            result.append(Constants._800);
            break;
        case '9':
            result.append(Constants._900);
            break;
        }
    }

    private void specialtenths(StringBuilder result, char tenth, char unit) {
        if (tenth == '1') {
            switch (unit) {
            case '0':
                result.append(Constants._10);
                break;
            case '1':
                result.append(Constants._11);
                break;
            case '2':
                result.append(Constants._12);
                break;
            case '3':
                result.append(Constants._13);
                break;
            case '4':
                result.append(Constants._14);
                break;
            case '5':
                result.append(Constants._15);
                break;
            case '6':
                result.append(Constants._16);
                break;
            case '7':
                result.append(Constants._17);
                break;
            case '8':
                result.append(Constants._18);
                break;
            case '9':
                result.append(Constants._19);
                break;
            }
        }
        else if (tenth == '2') {
            switch (unit) {
            case '0':
                result.append(Constants._20);
                break;
            case '1':
                result.append(Constants._21);
                break;
            case '2':
                result.append(Constants._22);
                break;
            case '3':
                result.append(Constants._23);
                break;
            case '4':
                result.append(Constants._24);
                break;
            case '5':
                result.append(Constants._25);
                break;
            case '6':
                result.append(Constants._26);
                break;
            case '7':
                result.append(Constants._27);
                break;
            case '8':
                result.append(Constants._28);
                break;
            case '9':
                result.append(Constants._29);
                break;
            }
        }
    }

    private void tenths(StringBuilder result, char tenth) {
        switch (tenth) {
        case '3':
            result.append(Constants._30);
            break;
        case '4':
            result.append(Constants._40);
            break;
        case '5':
            result.append(Constants._50);
            break;
        case '6':
            result.append(Constants._60);
            break;
        case '7':
            result.append(Constants._70);
            break;
        case '8':
            result.append(Constants._80);
            break;
        case '9':
            result.append(Constants._90);
            break;
        }
    }

    private void units(StringBuilder result, char unit) {
        switch (unit) {
        case '0':
            result.append(Constants._0);
            break;
        case '1':
            result.append(Constants._1);
            break;
        case '2':
            result.append(Constants._2);
            break;
        case '3':
            result.append(Constants._3);
            break;
        case '4':
            result.append(Constants._4);
            break;
        case '5':
            result.append(Constants._5);
            break;
        case '6':
            result.append(Constants._6);
            break;
        case '7':
            result.append(Constants._7);
            break;
        case '8':
            result.append(Constants._8);
            break;
        case '9':
            result.append(Constants._9);
            break;
        }
    }

}

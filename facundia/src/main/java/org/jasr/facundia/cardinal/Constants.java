package org.jasr.facundia.cardinal;

import java.math.BigInteger;

public class Constants {

    public static final String _y = "y ";
    //without whitespace because these only occur at the end of the number
    public static final String _1o = "uno";
    public static final String _21o = "veintiuno";

    public static final String _0 = "cero ";
    public static final String _1 = "un ";
    public static final String _2 = "dos ";
    public static final String _3 = "tres ";
    public static final String _4 = "cuatro ";
    public static final String _5 = "cinco ";
    public static final String _6 = "seis ";
    public static final String _7 = "siete ";
    public static final String _8 = "ocho ";
    public static final String _9 = "nueve ";
    public static final String _10 = "diez ";
    public static final String _11 = "once ";
    public static final String _12 = "doce ";
    public static final String _13 = "trece ";
    public static final String _14 = "catorce ";
    public static final String _15 = "quince ";
    public static final String _16 = "dieciséis ";
    public static final String _17 = "diecisiete ";
    public static final String _18 = "dieciocho ";
    public static final String _19 = "diecinueve ";
    public static final String _20 = "veinte ";
    public static final String _21 = "veintiún ";
    public static final String _22 = "veintidós ";
    public static final String _23 = "veintitrés ";
    public static final String _24 = "veinticuatro ";
    public static final String _25 = "veinticinco ";
    public static final String _26 = "veintiséis ";
    public static final String _27 = "veintisiete ";
    public static final String _28 = "veintiocho ";
    public static final String _29 = "veintinueve ";
    public static final String _30 = "treinta ";
    public static final String _40 = "cuarenta ";
    public static final String _50 = "cincuenta ";
    public static final String _60 = "sesenta ";
    public static final String _70 = "setenta ";
    public static final String _80 = "ochenta ";
    public static final String _90 = "noventa ";
    public static final String _100n = "cien ";
    public static final String _100 = "ciento ";
    public static final String _200 = "doscientos ";
    public static final String _300 = "trescientos ";
    public static final String _400 = "cuatrocientos ";
    public static final String _500 = "quinientos ";
    public static final String _600 = "seiscientos ";
    public static final String _700 = "setecientos ";
    public static final String _800 = "ochocientos ";
    public static final String _900 = "novecientos ";
    public static final String _1000 = "mil ";
    public static final String _10E6n = "millón ";
    public static final String _10E6 = "millones ";
    public static final String _10E12n = "billón ";
    public static final String _10E12 = "billones ";
    public static final String _10E18n = "trillón ";
    public static final String _10E18 = "trillones ";
    public static final String _10E24n = "cuatrillón ";
    public static final String _10E24 = "cuatrillones ";
    
    public static final String[] Periods = {"",_10E6,_10E12,_10E18,_10E24};
    public static final String[] singularPeriods = {"",_10E6n,_10E12n,_10E18n,_10E24n};
    
    public static final BigInteger minimum = new BigInteger("0");
    public static final BigInteger maximum = new BigInteger("999999999999999999999999999999");
}

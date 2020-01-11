package org.jasr.facundia.verbs;

import java.util.Arrays;

import org.jasr.facundia.verbs.conjugators.ConjugadorBase;
import org.jasr.facundia.verbs.conjugators.imperative.ImpTu;
import org.jasr.facundia.verbs.conjugators.imperative.ImpUd;
import org.jasr.facundia.verbs.conjugators.imperative.ImpUds;
import org.jasr.facundia.verbs.conjugators.imperative.ImpVos;
import org.jasr.facundia.verbs.conjugators.imperative.ImpVosotros;
import org.jasr.facundia.verbs.conjugators.impersonal.Gerundio;
import org.jasr.facundia.verbs.conjugators.impersonal.Infinitivo;
import org.jasr.facundia.verbs.conjugators.impersonal.Participio;
import org.jasr.facundia.verbs.conjugators.indicative.cop.IndCopNos;
import org.jasr.facundia.verbs.conjugators.indicative.cop.IndCopTuVos;
import org.jasr.facundia.verbs.conjugators.indicative.cop.IndCopUdEl;
import org.jasr.facundia.verbs.conjugators.indicative.cop.IndCopUdsEllos;
import org.jasr.facundia.verbs.conjugators.indicative.cop.IndCopVosotros;
import org.jasr.facundia.verbs.conjugators.indicative.cop.IndCopYo;
import org.jasr.facundia.verbs.conjugators.indicative.fut.IndFutNos;
import org.jasr.facundia.verbs.conjugators.indicative.fut.IndFutTuVos;
import org.jasr.facundia.verbs.conjugators.indicative.fut.IndFutUdEl;
import org.jasr.facundia.verbs.conjugators.indicative.fut.IndFutUdsEllos;
import org.jasr.facundia.verbs.conjugators.indicative.fut.IndFutVosotros;
import org.jasr.facundia.verbs.conjugators.indicative.fut.IndFutYo;
import org.jasr.facundia.verbs.conjugators.indicative.pos.IndPosNos;
import org.jasr.facundia.verbs.conjugators.indicative.pos.IndPosTuVos;
import org.jasr.facundia.verbs.conjugators.indicative.pos.IndPosUdEl;
import org.jasr.facundia.verbs.conjugators.indicative.pos.IndPosUdsEllos;
import org.jasr.facundia.verbs.conjugators.indicative.pos.IndPosVosotros;
import org.jasr.facundia.verbs.conjugators.indicative.pos.IndPosYo;
import org.jasr.facundia.verbs.conjugators.indicative.pres.IndPresNos;
import org.jasr.facundia.verbs.conjugators.indicative.pres.IndPresTu;
import org.jasr.facundia.verbs.conjugators.indicative.pres.IndPresUdEl;
import org.jasr.facundia.verbs.conjugators.indicative.pres.IndPresUdsEllos;
import org.jasr.facundia.verbs.conjugators.indicative.pres.IndPresVos;
import org.jasr.facundia.verbs.conjugators.indicative.pres.IndPresVosotros;
import org.jasr.facundia.verbs.conjugators.indicative.pres.IndPresYo;
import org.jasr.facundia.verbs.conjugators.indicative.pret.IndPretNos;
import org.jasr.facundia.verbs.conjugators.indicative.pret.IndPretTuVos;
import org.jasr.facundia.verbs.conjugators.indicative.pret.IndPretUdEl;
import org.jasr.facundia.verbs.conjugators.indicative.pret.IndPretUdsEllos;
import org.jasr.facundia.verbs.conjugators.indicative.pret.IndPretVosotros;
import org.jasr.facundia.verbs.conjugators.indicative.pret.IndPretYo;
import org.jasr.facundia.verbs.conjugators.subjunctive.fut.SubjFutNos;
import org.jasr.facundia.verbs.conjugators.subjunctive.fut.SubjFutTuVos;
import org.jasr.facundia.verbs.conjugators.subjunctive.fut.SubjFutUdEl;
import org.jasr.facundia.verbs.conjugators.subjunctive.fut.SubjFutUdsEllos;
import org.jasr.facundia.verbs.conjugators.subjunctive.fut.SubjFutVosotros;
import org.jasr.facundia.verbs.conjugators.subjunctive.fut.SubjFutYo;
import org.jasr.facundia.verbs.conjugators.subjunctive.pres.SubjPresNos;
import org.jasr.facundia.verbs.conjugators.subjunctive.pres.SubjPresTuVos;
import org.jasr.facundia.verbs.conjugators.subjunctive.pres.SubjPresUdEl;
import org.jasr.facundia.verbs.conjugators.subjunctive.pres.SubjPresUdsEllos;
import org.jasr.facundia.verbs.conjugators.subjunctive.pres.SubjPresVosotros;
import org.jasr.facundia.verbs.conjugators.subjunctive.pres.SubjPresYo;
import org.jasr.facundia.verbs.conjugators.subjunctive.pret.SubjPretNos;
import org.jasr.facundia.verbs.conjugators.subjunctive.pret.SubjPretNos2;
import org.jasr.facundia.verbs.conjugators.subjunctive.pret.SubjPretTuVos;
import org.jasr.facundia.verbs.conjugators.subjunctive.pret.SubjPretTuVos2;
import org.jasr.facundia.verbs.conjugators.subjunctive.pret.SubjPretUdEl;
import org.jasr.facundia.verbs.conjugators.subjunctive.pret.SubjPretUdEl2;
import org.jasr.facundia.verbs.conjugators.subjunctive.pret.SubjPretUdsEllos;
import org.jasr.facundia.verbs.conjugators.subjunctive.pret.SubjPretUdsEllos2;
import org.jasr.facundia.verbs.conjugators.subjunctive.pret.SubjPretVosotros;
import org.jasr.facundia.verbs.conjugators.subjunctive.pret.SubjPretVosotros2;
import org.jasr.facundia.verbs.conjugators.subjunctive.pret.SubjPretYo;
import org.jasr.facundia.verbs.conjugators.subjunctive.pret.SubjPretYo2;

public class Conjugator {

	ConjugadorBase[] conjugadores = new ConjugadorBase[] { new Infinitivo(), new Gerundio(), new Participio()

			, new IndPresYo(), new IndPresTu(), new IndPresVos(), new IndPresUdEl(), new IndPresNos(), new IndPresVosotros(), new IndPresUdsEllos()

			, new IndCopYo(), new IndCopTuVos(), new IndCopUdEl(), new IndCopNos(), new IndCopVosotros(), new IndCopUdsEllos()

			, new IndPretYo(), new IndPretTuVos(), new IndPretUdEl(), new IndPretNos(), new IndPretVosotros(), new IndPretUdsEllos()

			, new IndFutYo(), new IndFutTuVos(), new IndFutUdEl(), new IndFutNos(), new IndFutVosotros(), new IndFutUdsEllos()

			, new IndPosYo(), new IndPosTuVos(), new IndPosUdEl(), new IndPosNos(), new IndPosVosotros(), new IndPosUdsEllos()

			, new SubjPresYo(), new SubjPresTuVos(), new SubjPresUdEl(), new SubjPresNos(), new SubjPresVosotros(), new SubjPresUdsEllos()

			, new SubjFutYo(), new SubjFutTuVos(), new SubjFutUdEl(), new SubjFutNos(), new SubjFutVosotros(), new SubjFutUdsEllos()

			, new SubjPretYo(), new SubjPretYo2(), new SubjPretTuVos(), new SubjPretTuVos2(), new SubjPretUdEl(), new SubjPretUdEl2(), new SubjPretNos(), new SubjPretNos2(), new SubjPretVosotros(), new SubjPretVosotros2(), new SubjPretUdsEllos(), new SubjPretUdsEllos2()

			, new ImpTu(), new ImpVos(), new ImpVosotros(), new ImpUd(), new ImpUds() };

	public Conjugacion conjugate(String infinitivo) {
		Conjugacion conjugacion = new Conjugacion(infinitivo);
		Arrays.stream(conjugadores).forEach(c -> {
		//	System.out.println(c.getForma());
			c.conjugar(conjugacion);
		});
		return conjugacion;
	}
}

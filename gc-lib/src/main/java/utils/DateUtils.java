package utils;

import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateUtils {

	public boolean dataAntecedente(Date data) throws ParseException {
		Date dataOdierna = new Date();
		if(dataOdierna.getTime() > data.getTime()) {
			return true;
		}
		return false;
	}
	
	public boolean dataSusseguente(Date data) throws ParseException {
		Date dataOdierna = new Date();
		if(dataOdierna.getTime() < data.getTime()) {
			return true;
		}
		return false;
	}
	
	public boolean dataAntecedenteGiorni(Date data,long numGiorni) {
		Date dataOdierna = new Date();
		
		long data1 = dataOdierna.getTime();
		long data2 = data.getTime();
		long dist = data1-data2;
		long giorniMassimi=1000*60*60*24*numGiorni;
		if(dist < giorniMassimi) {
			System.out.println("siamo ancora in tempo");
		}else if(dist > giorniMassimi) {
			System.out.println("esplodera tutto");
		}else {
			System.out.println("e vabbe");
		}
		System.out.println("ms dist: "+dist);
		System.out.println("ms giorni: "+giorniMassimi);
		
		return false;
	}
	
	public boolean rangeDate(Date dataInit,int numGiorniDa,int numGiorniA) {
		
		Calendar calDataDa = GregorianCalendar.getInstance();
		calDataDa.setTime(dataInit);
		calDataDa.add(Calendar.DAY_OF_YEAR, numGiorniDa);
		Calendar calDataA = GregorianCalendar.getInstance();
		calDataA.setTime(dataInit);
		calDataA.add(Calendar.DAY_OF_YEAR, numGiorniA);
		Date oggi = new Date();
		return calDataDa.getTime().before(oggi) && calDataA.getTime().after(oggi);
	}
}

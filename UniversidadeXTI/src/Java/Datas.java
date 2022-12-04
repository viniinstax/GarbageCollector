package Java;

import java.util.Calendar;
import java.util.Date;

public class Datas {

	public static void main(String[] args) {
		
		/* 01 de Jan 1970*/
		
		System.out.println(System.currentTimeMillis());
		
		Date agora = new Date();
		System.out.println(agora);
		
		Date data = new Date(1_000_000_000L);
		System.out.println(data);
		
		/* Métodos */
		
		data.getTime();
		data.setTime(1_000_000_000L);
		
		Calendar c = Calendar.getInstance();
		c.set(1991, Calendar.JULY, 17);
		System.out.println(c.getTime());;
		
		

	}

}

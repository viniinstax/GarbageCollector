package Java;

import java.text.NumberFormat;
import java.util.Locale;

public class Numero {
	
	public static void main(String[] args) {
		
		double saldo = 123_456.789;
		NumberFormat f = NumberFormat.getInstance();
		System.out.println(f.format(saldo));
		
		f = NumberFormat.getIntegerInstance(); /*inteiros*/
		System.out.println(f.format(saldo));
		
		f = NumberFormat.getPercentInstance(); /*perentual*/
		System.out.println(f.format(0.25));
		
		f = NumberFormat.getCurrencyInstance(); /*moeda*/
		System.out.println(f.format(saldo));
		
		f.setMinimumFractionDigits(3);
		System.out.println(f.format(saldo));
		
		/* internacionalizar*/
		
		f = NumberFormat.getCurrencyInstance(Locale.US); /*moeda*/
		System.out.println(f.format(saldo));
		
		
		
		
		
	}

}

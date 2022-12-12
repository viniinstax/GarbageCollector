package threads;

import java.lang.reflect.Array;
import java.util.Random;

public class Produtor implements Runnable {
	
	
	private Ponte ponte;
	public Produtor (Ponte ponte) {
		this.ponte = ponte;
		
	}
	
	private Random random = new Random();

	@Override
	public void run() {
		int total = 0; 
		for(int i = 0; i < 5; i++) {
			try {
			 Thread.sleep(random.nextInt(3000));
			 total += i;
			 ponte.set(i);
			 System.out.println("\t" + total);
			}catch (InterruptedException e) {}
		 }
		
		
	}
	
	

}

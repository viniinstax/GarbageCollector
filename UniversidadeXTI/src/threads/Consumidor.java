package threads;

import java.util.Random;

public class Consumidor implements Runnable {
	
	
	private Random random = new Random();
	private Ponte ponte;
	public Consumidor (Ponte ponte) {
		this.ponte = ponte;
		
	}
	
	

	@Override
	public void run() {
		int total = 0; 
		for(int i = 0; i < 5; i++) {
			try {
			 Thread.sleep(random.nextInt(3000));
			 total += ponte.get();
			
			 System.err.println("\t" + total);
			}catch (InterruptedException e) {}
		 }
		
		
	}
	
	

}




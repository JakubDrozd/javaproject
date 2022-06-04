package Drugi.przyklady.WatkiJoinIsAlive;

public class Main {
	public static void main(String[] args) {
		System.out.println("Started downloading process:");
		
		
		Thread watekThread = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for (int i = 0; i <= 100; i++) {
					System.out.println("Download progress: " + i + "%");
					try {
						Thread.sleep((int) (1000 + Math.random() * (10000-1000)));
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					i+=(int) (1 + Math.random() * (25-1));
				}
				
			}
		});
		watekThread.start();
		
		System.out.println("Is downloading : " + watekThread.isAlive());
		 
		try {
			watekThread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Is downloading : " + watekThread.isAlive());
		
		System.out.println("Download has ended successfully!");
	}
}

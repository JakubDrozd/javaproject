package Drugi.przyklady.PodwojnyStart;

public class MojeRunanble implements Runnable{

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Coœ robiê: " + i );
		}
		
	}

}

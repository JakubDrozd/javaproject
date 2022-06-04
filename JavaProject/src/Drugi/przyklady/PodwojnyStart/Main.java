package Drugi.przyklady.PodwojnyStart;

public class Main {
	public static void main(String[] args) throws InterruptedException {

		MojeRunanble mojeRunanble = new MojeRunanble();
		Thread watekThread = new Thread(mojeRunanble);
		watekThread.start();

		Thread.sleep(1000);

		Thread watekThread2 = new Thread(mojeRunanble);
		watekThread2.start();
	}
}

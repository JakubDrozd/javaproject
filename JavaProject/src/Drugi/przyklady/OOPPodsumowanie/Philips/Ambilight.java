package Drugi.przyklady.OOPPodsumowanie.Philips;

public abstract class Ambilight extends TelewizorPhilips {

    protected Ambilight(int cale) {
	super(cale);
    }

    @Override
    public void wlacz() {
	super.wlacz();
	ambilight();
    }

    @Override
    public void wylacz() {
	// TODO Auto-generated method stub
	super.wylacz();
    }

    private void ambilight() {
	new Thread(new Runnable() {

	    @Override
	    public void run() {
		while (statusWlaczony) {
		    try {
			System.out.println("Wyœwietlaj kolorki z ty³u");
			Thread.sleep(1000);
		    } catch (InterruptedException e) {
			e.printStackTrace();
		    }
		}

	    }
	});

    }
}

package Drugi.Zadania.AbstrakcjaZadanie2;

public class Kolo implements Figury {
	float promien;

	public Kolo(float promien) {
		this.promien = promien;
	}

	@Override
	public float obwod() {
		return (float) (2 * Math.PI * promien);
	}

	@Override
	public float pole() {
		return (float) (Math.PI * Math.pow(promien, 2));
	}

}

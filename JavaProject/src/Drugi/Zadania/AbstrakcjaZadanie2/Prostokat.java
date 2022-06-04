package Drugi.Zadania.AbstrakcjaZadanie2;

public class Prostokat implements Figury {
	float bokA;
	float bokB;

	public Prostokat(float bokA, float bokB) {
		this.bokA = bokA;
		this.bokB = bokB;
	}

	@Override
	public float obwod() {
		return (2 * bokA) + (2 * bokB);
	}

	@Override
	public float pole() {
		return bokA * bokB;
	}

}

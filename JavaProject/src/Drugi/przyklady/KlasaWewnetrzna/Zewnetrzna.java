package Drugi.przyklady.KlasaWewnetrzna;

public class Zewnetrzna {
	int poleZewnetrzne;
	
	public int metodaZewnetrzna() {
		Wewnetrzna obieWewnetrzna = new Wewnetrzna();
		obieWewnetrzna.poleWewnetrzne = 20;
		return -1;
	}
	class Wewnetrzna{
		int poleWewnetrzne;
		private int metodaWewnetrzna() {
			metodaZewnetrzna();
			poleZewnetrzne = 11;
			return -2;
		}
	}
}

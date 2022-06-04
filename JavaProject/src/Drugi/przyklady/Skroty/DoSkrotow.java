package Drugi.przyklady.Skroty;

public class DoSkrotow {
    public static void main(String[] args) {
	System.out.println("?");
    }

    private int poleA;
    private int poleB;
    private String poleCString;

    public int getPoleA() {
	return poleA;
    }

    public DoSkrotow(int poleA, int poleB, String poleCString) {
	super();
	this.poleA = poleA;
	this.poleB = poleB;
	this.poleCString = poleCString;
    }

    public void setPoleA(int poleA) {
	this.poleA = poleA;
    }

    public int getPoleB() {
	return poleB;
    }

    public void setPoleB(int poleB) {
	this.poleB = poleB;
    }

    public String getPoleCString() {
	return poleCString;
    }

    public void setPoleCString(String poleCString) {
	this.poleCString = poleCString;
    }
}
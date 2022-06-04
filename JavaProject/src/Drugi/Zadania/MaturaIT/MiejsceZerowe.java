package Drugi.Zadania.MaturaIT;

public class MiejsceZerowe {

    public static double f(double x) {
	return Math.pow(x, 3) - 4 * Math.pow(x, 2) + 6 * x - 24;
    }

    public static double miejsceZerowe(double epsilon) {
	double c = 0.0;
	double a = -16;
	double b = 16;
	while ((Math.abs(a - b)) > epsilon) {
	    c = (a + b) / 2;
	    if (f(c) > 0) {
		b = c;
	    } else {
		a = c;
	    }
	}
	return c;
    }

    public static void main(String[] args) {
	System.out.println(miejsceZerowe(0.1));
    }
}

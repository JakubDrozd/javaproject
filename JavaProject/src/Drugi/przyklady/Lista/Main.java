package Drugi.przyklady.Lista;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
	List<Integer> listaIntegers = new ArrayList<>();
	listaIntegers.add(123);
	listaIntegers.add(5);
	listaIntegers.add(-333);
	listaIntegers.add(50000);
	listaIntegers.add(123123);

	listaIntegers.remove(2);
	for (int i = 0; i < listaIntegers.size(); i++) {
	    System.out.println(listaIntegers.get(i));
	}

	List<String> list = new ArrayList<>();
	list.add("Numer 1");
	list.add("Numer 2");
	list.add("Numer 3");
	
	
    }

}

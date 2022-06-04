package Drugi.przyklady.InputStreamReader;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
	List <String> allList = Files.readAllLines(Paths.get("PrzykladowyPlik.txt"));
	System.out.println(allList);
    }
}

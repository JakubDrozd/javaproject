package com.example.basics;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.nio.Buffer;

public class ChuckExample {
    public static void main(String[] args) {

        try{

            URL strona = new URL("https://api.chucknorris.io/jokes/random");
            InputStream stream = strona.openStream();
            BufferedReader odczyt = new BufferedReader(new InputStreamReader(stream));

            String line = null;
            while((line = odczyt.readLine()) !=null){
                System.out.println(line);
            }

        }catch(Exception e){
            e.printStackTrace();
        }

    }
}

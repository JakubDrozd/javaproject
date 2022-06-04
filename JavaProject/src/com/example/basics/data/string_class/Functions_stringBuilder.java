package com.example.basics.data.string_class;

public class Functions_stringBuilder {
    public static void main(String args[]){
        String nazwa = "Rek'sai";
        StringBuilder budowa = new StringBuilder();
        budowa.append("Kaisa ").append("Veigar ").append("222 ").append("88822 ").append(nazwa);
        System.out.println(budowa);
        budowa.insert(0,"Kasia ma psa. ");
        System.out.println(budowa.toString());
        budowa.replace(0,5,"Julia");
        System.out.println(budowa.toString());
        budowa.delete(3,10);
        System.out.println(budowa.toString());
        int index = budowa.indexOf("222");
        budowa.delete(index,budowa.length());
        System.out.println(budowa.toString());
    }
}

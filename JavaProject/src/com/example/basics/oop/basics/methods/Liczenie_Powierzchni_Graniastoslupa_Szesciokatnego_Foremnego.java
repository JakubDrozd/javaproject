package com.example.basics.oop.basics.methods;

class Kalkulator{


    public void liczeniePoleCalkowite(float bokPodstawy, float wysokosc){
        float polePodstaw = (float) (2*(6 * ((Math.pow(bokPodstawy,2) * Math.sqrt(3))/4)));
        float poleBoczne = (6* (bokPodstawy * wysokosc));
        float poleCalkowite = polePodstaw + poleBoczne;
        System.out.println("Pole podstawy (Pp) o podanych argumentach: " + polePodstaw);
        System.out.println("Pole boczne (Pb) o podanych argumentach: " + poleBoczne);
        System.out.println("Pole całkowite (Pc) o podanych argumentach: " + poleCalkowite);
    }

    public void liczenieObjetosci(float bokPodstawy, float wysokosc){
        float obwodPodstawy = 6 * bokPodstawy;
        float objetosc = obwodPodstawy * wysokosc;
        System.out.println("Objętość (V) graniastosłupa o podanych argumentach: " + objetosc);

    }


}

public class Liczenie_Powierzchni_Graniastoslupa_Szesciokatnego_Foremnego {
    public static void main(String args[]){

        Kalkulator test = new Kalkulator();
                int bok = 16;
                    int wysokosc = 4;
                    test.liczeniePoleCalkowite(bok,wysokosc);
                    test.liczenieObjetosci(bok, wysokosc);
    }
}

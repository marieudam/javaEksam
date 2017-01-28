package Algoritm;

import java.util.Arrays;

/**
 * Antud on massiiv. Mitu sõne on massiivis keskmisest pikemad?
 */
public class PikadSoned {
    public static void main(String[] args) {

        String[] naide = {"kaalikas", "joonas", "maakera", "homeros", "mandel"}; // vastus on 3

        //leian iga sõna pikkuse
        //leian sõnade keskmise pikkuse
        //if sõna on pikem kui x, siis count = count + 1 vms

        int summa = 0;
        int loendur = 0;
        for (int i = 0; i < naide.length; i++) {
            int pikkus = naide[i].length();
            //System.out.println(pikkus);
            summa += pikkus;

        }
        int keskmine = summa / naide.length;
        //System.out.println("Keskmine: " + keskmine);

        for (int i = 0; i < naide.length; i++) {
            int pikkus = naide[i].length();
            if (pikkus > keskmine) {
            loendur++;

            }

        }
        System.out.println("Massiivis keskmisest pikemaid sõnu: " + loendur);
    }
}
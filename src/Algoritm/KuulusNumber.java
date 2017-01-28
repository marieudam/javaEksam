package Algoritm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * Antud on int[] massiiv. Eemalda kõik nr 3 väärtused ja leia millist numbrit esineb siis kõige rohkem?
 * Mitte siis number, mis on kolmandal indeksil, vaid nr kolm ise.
 */
public class KuulusNumber {

    public static void main(String[] args) {

        int[] naide = {1, 5, 3, 3, 6, 3, 7, 7}; // vastus on 7

        ArrayList<Integer> tulemus = new ArrayList();
        ArrayList<Integer> moodid = new ArrayList();

        for (int i = 0; i < naide.length; i++) {
            if (naide[i] != 3) {
                tulemus.add(naide[i]);  //lisame kõik peale 3 ArrayListi tulemus
            }
        }
        //System.out.println(tulemus);

        int mood = 0;
        for (int i : tulemus) {

            int sagedus = Collections.frequency(tulemus, i);
            //System.out.println(sagedus);

            if (sagedus == mood) {
                moodid.add(i);
            }

            if (sagedus > mood) {
                moodid.clear();
                moodid.add(i);
                mood = sagedus;
            }
        }
        //System.out.println(moodid);
        System.out.println("Kõige rohkem esineb numbrit: " +  moodid.get(0));

        }

    }


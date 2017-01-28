package Algoritm;

import java.util.Arrays;

/**
 * Antud on int[] massiiv. Korruta kõik seitsmed kahega ja leia arvude keskmine.
 */
public class MaagilineSeitse {

    public static void main(String[] args) {

        int[] naide = {7, 4, 324, 65, 4, 78, 7, 45, 4};

        for (int i = 0; i < naide.length; i++) {
            if (naide[i] == 7) {
                naide[i] = naide[i]*2;
            }

        }

        System.out.println(Arrays.toString(naide));

        int summa = 0;
        for (int i = 0; i < naide.length; i++) {
            summa += naide[i];
        }

        System.out.println(summa);

        double keskmine = summa/naide.length;
        System.out.println(keskmine);

    }

}

package Algoritm;

/**
 * Antud on kaks massiivi õhu temperatuuridega. Arvuta mõlema puhul mitu positiivset temperatuuri
 * on massiivis rohkem kui negatiivseid.
 */
public class Suusailm {
    public static void main(String[] args) {
        int[] kraadid1 = {11, 10, 5, 1, 3, -2, -6, 2, -13, -24, -9, 0};
        int[] kraadid2 = {-23, -25, -22, -18, -15, -19, -13};


        int loendurPos1 = 0;
        int loendurNeg1 = 0;
        int loendurPos2 = 0;
        int loendurNeg2 = 0;
        for (int i = 0; i < kraadid1.length; i++) {
            if (kraadid1[i] > 0){
                loendurPos1++;
            }
            if (kraadid1[i] < 0) {
                loendurNeg1++;
            }
        }

        for (int j = 0; j < kraadid2.length; j++) {
            if (kraadid2[j] > 0){
                loendurPos2++;
            }
            if (kraadid2[j] < 0) {
                loendurNeg2++;
            }
        }

        int vahe1 = loendurPos1 - loendurNeg1;
        int vahe2 = loendurPos2 - loendurNeg2;
        System.out.println("Positiivseid temperatuure on esimeses massiivis rohkem: " + vahe1);
        System.out.println("Negatiivseid temperatuure on teises massiivis rohkem: " + vahe2);
    }
}

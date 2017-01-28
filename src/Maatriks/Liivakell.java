package Maatriks;

import java.util.Arrays;

/**
 * Loo 9*9 maatriks, millel on kujutatud liivakella. Värvitud ala on number 0 ja
 * värvimata on punkt. Kui ei oska siis joonista esiteks rist ja liigu sealt edasi.
 *
 * Näide
 * 0 0 0 0 0 0 0 0 0
 * . 0 0 0 0 0 0 0 .
 * . . 0 0 0 0 0 . .
 * . . . 0 0 0 . . .
 * . . . . 0 . . . .
 * . . . 0 0 0 . . .
 * . . 0 0 0 0 0 . .
 * . 0 0 0 0 0 0 0 .
 * 0 0 0 0 0 0 0 0 0
 *
 */
public class Liivakell {

    public static void main(String[] args) {
        int ridasid = 9;
        int veerge = 9;
        String[][] tabel = new String[ridasid][veerge];
        for (int i = 0; i < tabel.length; i++) {
            for (int j = 0; j < tabel[i].length; j++) {
                if (i == 0 || i == 8){
                    tabel[i][j] = "0";
                    //if i = 0+i või 8-i
                    //tabel[i][j] =
                }
                else{
                    tabel[i][j] = ".";
                }
            }
        }
        printMaatriks(tabel);

    }

    // Lihtsalt abiline meetod, et maatriksit välja printida
    private static void printMaatriks(String[][] laud) {
        for (int i = 0; i < laud.length; i++) {
            System.out.println(Arrays.toString(laud[i]));
        }
        System.out.println("");
    }
}

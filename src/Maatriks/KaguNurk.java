package Maatriks;

import java.util.Arrays;

/**
 * Loo 9*9 suurune maatriks, millele tekib kagu suunaline nurkade muster, nagu näites.
 * Tundub raske? Sul tuleb lihtsalt veeru ja rea indeksi seos leida.
 *
 * Näide
 * 9 8 7 6 5 4 3 2 1
 * 8 8 7 6 5 4 3 2 1
 * 7 7 7 6 5 4 3 2 1
 * 6 6 6 6 5 4 3 2 1
 * 5 5 5 5 5 4 3 2 1
 * 4 4 4 4 4 4 3 2 1
 * 3 3 3 3 3 3 3 2 1
 * 2 2 2 2 2 2 2 2 1
 * 1 1 1 1 1 1 1 1 1
 *
 * Tundub raske? Leia seoseid rea ja veeru indeksi numbritega.
 */
//public class KaguNurk {
//    public static void main(String[] args) {
//
//        int ridasid = 9;
//        int veerge = 9;
//        int[][] tabel = new int[ridasid][veerge];
//        for (int i = 0; i < tabel.length; i++) {
//            int maxnr = veerge - i;
//            for (int j = 0; j < tabel[i].length; j++) {
//                tabel[i][j] = maxnr;
//                if (i <= j) {
//                    maxnr--;
//                }
//            }
//        }
//
//        printMaatriks(tabel);
//    }
//
//    // Lihtsalt abiline meetod, et maatriksit välja printida
//    private static void printMaatriks(int[][] laud) {
//        for (int i = 0; i < laud.length; i++) {
//            System.out.println(Arrays.toString(laud[i]));
//        }
//        System.out.println("");
//    }
//}

//Prindib 1-9 ja siis 9-1 üle rea
//
//public class KaguNurk {
//    public static void main(String[] args) {
//        int ridasid = 9;
//        int veerge = 9;
//        int loendur;
//        int[][] tabel = new int[ridasid][veerge];
//        for (int i = 0; i < tabel.length; i++) {
//            if (i == 0 || i % 2 == 0) {
//                loendur = 1;
//            } else {
//                loendur = 9;
//            }
//            for (int j = 0; j < tabel[i].length; j++) {
//                tabel[i][j] = loendur;
//                if (i == 0 || i % 2 == 0) {
//                    loendur++;
//                } else {
//                    loendur--;
//                }
//            }
//        }
//        printMaatriks(tabel);
//    }
//
//    // Lihtsalt abiline meetod, et maatriksit välja printida
//    private static void printMaatriks(int[][] laud) {
//        for (int i = 0; i < laud.length; i++) {
//            System.out.println(Arrays.toString(laud[i]));
//        }
//        System.out.println("");
//    }
//}

//Prindib 9x9 maatriksis välja nr 1
//
//public class KaguNurk {
//    public static void main(String[] args) {
//        int ridasid = 9;
//        int veerge = 9;
//        int loendur;
//        int[][] tabel = new int[ridasid][veerge];
//        for (int i = 0; i < tabel.length; i++) {
//                loendur = 1;
//            for (int j = 0; j < tabel[i].length; j++) {
//                tabel[i][j] = loendur;
//                }
//            }
//        printMaatriks(tabel);
//
//        }
//
//
//    // Lihtsalt abiline meetod, et maatriksit välja printida
//    private static void printMaatriks(int[][] laud) {
//        for (int i = 0; i < laud.length; i++) {
//            System.out.println(Arrays.toString(laud[i]));
//        }
//        System.out.println("");
//    }
//}

public class KaguNurk {
    public static void main(String[] args) {
        int ridasid = 9;
        int veerge = 9;
        int loendur;
        int[][] tabel = new int[ridasid][veerge];
        for (int i = 0; i < tabel.length; i++) {
                loendur = 1;
            for (int j = 0; j < tabel[i].length; j++) {
                tabel[i][j] = loendur;
                }
            }
        printMaatriks(tabel);

        }


    // Lihtsalt abiline meetod, et maatriksit välja printida
    private static void printMaatriks(int[][] laud) {
        for (int i = 0; i < laud.length; i++) {
            System.out.println(Arrays.toString(laud[i]));
        }
        System.out.println("");
    }
}


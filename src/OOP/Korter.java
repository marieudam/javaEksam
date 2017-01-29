package OOP;

import java.util.ArrayList;

/**
 * Created by User on 28.01.2017.
 */
public class Korter {

    ArrayList<String> saabujad = new ArrayList<>();
    int mahutavus;

    public Korter(int mahutab) {
        this.mahutavus = mahutab;
    }

    public void saabus(String nimi) {
        if (saabujad.size() < 10) {
            saabujad.add(saabujad.size(), nimi);
        }
    }

    public void prindiKylalisteArv() {
        System.out.println("Külaliste arv on: " + this.saabujad.size());
    }

    public void prindiPaljuVeelMahub() {
        System.out.println("Korter mahutab: " + (this.mahutavus - this.saabujad.size()));
    }

    public void lahkus(String nimi) {
        saabujad.remove(nimi);

    }

}

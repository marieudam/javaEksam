package OOP;

import java.util.ArrayList;

/**
 * Created by User on 29.01.2017.
 */
public class Kassa {

    String kassapidajaNimi;
    ArrayList<String> tooted = new ArrayList<>();

    public Kassa(String kassapidaja) {
        this.kassapidajaNimi = kassapidaja;
    }

    public void lisaToode(String toode) {
        tooted.add(tooted.size(), toode);
    }

    public void eemaldaToode(String toode) {
        tooted.remove(toode);
    }

    public void prindiOstutsekk() {
        System.out.println("Ostutšekk: " + this.tooted);
    }

    public void prindiKassapidajaNimi() {
        System.out.println("Kassapidaja nimi: " + kassapidajaNimi);
    }

}

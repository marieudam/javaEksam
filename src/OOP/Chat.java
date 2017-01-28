package OOP;

import java.util.ArrayList;

/**
 * Created by User on 28.01.2017.
 */
public class Chat {

    ArrayList<String> nimed = new ArrayList<>();
    ArrayList<String> sonumid = new ArrayList<>();
    String toaNimi;

    public Chat(String toaNimi) {
        this.toaNimi = toaNimi;
    }

    public void sisestaSonum(String nimi, String sonum) {
        nimed.add(nimed.size(), nimi);
        sonumid.add(sonumid.size(),sonum);
    }

    public void prindiKoikSonumidKoosKasutajanimega() {
        for (int i = 0; i < nimed.size(); i++) {
            System.out.println(nimed.get(i) + ": " + sonumid.get(i));
        }
        System.out.println();
    }

    public void adminKustutabSonumi(String sonum) {
        for (int i = 0; i < sonumid.size(); i++) {
            if (sonum == sonumid.get(i)) sonumid.set(i, "KUSTUTATUD!");
        }
    }

    public void prindiToaNimi() {
        System.out.println(toaNimi);
    }
}

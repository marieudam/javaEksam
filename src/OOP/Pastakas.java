package OOP;

import java.util.ArrayList;

/**
 * Created by User on 28.01.2017.
 */
public class Pastakas {

    int tindiKogus;


    public Pastakas(int tindiKogus) {
        this.tindiKogus = tindiKogus;
    }

    public void kirjuta(String sonum) {
        if (sonum.length() <= tindiKogus){
            System.out.println(sonum);
            this.tindiKogus = this.tindiKogus - sonum.length();
        }
        else{
            System.out.println(sonum.substring(0, this.tindiKogus));
            this.tindiKogus = 0;
        }
    }

    public void prindiPaljuTintiAlles() {
        //arvutan tähtede arvu
        System.out.println("Tinti on alles " + this.tindiKogus + " ühikut.");
    }

}

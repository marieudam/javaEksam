package OOP;

/**
 * Created by User on 28.01.2017.
 */
public class Zelda {

    int elud;

    public Zelda(int elusid) {
        this.elud = elusid;
    }

    public void kaklusKolliga(int kollilElusid) {
        this.elud = this.elud - kollilElusid;
    }

    public void prindiMituEluAlles() {
        System.out.println(this.elud);
    }

    public void prindiKasOnElus() {
        if (this.elud > 0){
            System.out.println("Tegelane on elus.");
        }
        else {
            System.out.println("Tegelane on surnud.");
        }
    }

}

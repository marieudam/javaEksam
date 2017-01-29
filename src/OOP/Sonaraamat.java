package OOP;

import java.util.ArrayList;

/**
 * Created by User on 29.01.2017.
 */
public class Sonaraamat {

    String raamatuKeel;
    ArrayList<String> sonad = new ArrayList<>();

    public Sonaraamat(String keel) {
        this.raamatuKeel = keel;
    }

    public void sisestaSona(String sona) {
        sonad.add(sonad.size(), sona);
    }

    public String[] otsiEsimeseTaheJargi(String taht) {
        ArrayList<String> tulemus = new ArrayList();
        for (int i = 0; i < sonad.size(); i++) {
            if (sonad.get(i).startsWith(taht)) {
                tulemus.add(sonad.get(i));
            }
        }
        String[] tulem = new String[tulemus.size()];
        for (int i = 0; i < tulemus.size() ; i++) {
            tulem[i] = tulemus.get(i);
        }
        return tulem;
    }

    public void eemaldaSona(String sona) {
        for (int i = 0; i < sonad.size(); i++) {
            if (sona == sonad.get(i)){
                sonad.remove(i);
            }
        }
        System.out.println(sonad);
    }

    public void misKeelesRaamatOn() {
        System.out.println(raamatuKeel);
    }

}

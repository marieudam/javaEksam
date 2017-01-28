package JavaFX;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

import java.util.ArrayList;

/**
 * Joonista 500x500 ekraanile hunnikuga punaseid ringe.
 * Kui hiir ringile vastu läheb, muutub ring roheliseks.
 * Kordan - ring muudab värvi juba hiire puudutusest, mitte klikist.
 */

public class FooridUnenaos extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        //Aken
        primaryStage.show();

        //Raamistik
        Pane kujund = new Pane();

        //Stseen
        Scene stseen = new Scene(kujund, 500, 500);
        primaryStage.setScene(stseen);

        ArrayList<Circle> list = new ArrayList<>();   //punaste ringide moodustamine, listi lisamine
        for (int i = 0; i < 20; i++) {
            Circle joonistanRingi = new Circle(30);
            joonistanRingi.setTranslateX(Math.random()*500); //paigutab ringi pane'il suvalistesse kohtadesse
            joonistanRingi.setTranslateY(Math.random()*500); //paigutab ringi pane'il suvalistesse kohtadesse
            kujund.getChildren().add(joonistanRingi);
            list.add(joonistanRingi);
            joonistanRingi.setFill(Color.RED);
        }
        for (int i = 0; i < list.size(); i++) { //ringide listist välja võtmine, roheliseks värvimine
            Circle tsekinRingi = list.get(i);
            tsekinRingi.setOnMouseEntered(event -> {
                tsekinRingi.setFill(Color.GREEN);
            });
        }
    }
}
package JavaFX;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

import java.util.ArrayList;

/**
 * Loo JavaFXis koristaja mäng.
 * 1. Ekraan (näiteks 500x500) on paksult ringe täis. Nii, et läbi ei näe.
 * 2. Ringile hiirega vastu minnes kaob ring ära.
 * 3. Ringide all on peidus sõnum (näiteks Labeliga), mida kasutaja lõpuks näeb.
 */

public class Koristaja extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        //Aken
        primaryStage.show();

        //Raamistik
        Pane raamistik = new Pane();

        //Stseen
        Scene stseen = new Scene(raamistik, 500, 500);
        primaryStage.setScene(stseen);

        //Sõnum
        Label tekst = new Label("SIIN ON TEKST");
        tekst.setTranslateX(250);
        tekst.setTranslateY(250);
        raamistik.getChildren().add(tekst);

        ArrayList<Circle> list = new ArrayList<>();   //ringide moodustamine, listi lisamine
        for (int i = 0; i < 100; i++) {
            Circle ring = new Circle(100);
            ring.setTranslateX(Math.random() * 500); //paigutab ringi pane'il suvalistesse kohtadesse
            ring.setTranslateY(Math.random() * 500); //paigutab ringi pane'il suvalistesse kohtadesse
            raamistik.getChildren().add(ring);
            list.add(ring);
            ring.setFill(Color.BLUE);
        }

        for (int i = 0; i < list.size(); i++) { //ringide listist välja võtmine, kustutamine
            Circle uusRing = list.get(i);
            uusRing.setOnMouseEntered(event -> {
                uusRing.setVisible(false);
            });
}
    }
}

package JavaFX;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.util.ArrayList;

/**
 * Joonista ekraanile hunnik ristkülikuid, suvalistel positsioonidel. Ühe korra kastile klikates
 * muutub ta 2x väiksemaks. Teist korda klikates kaob ta sootuks.
 */

//NB! Väiksema ristküliku ärakadumine toimub topeltklikiga!

public class PixelChaser extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        //Aken
        primaryStage.show();

        //Raamistik
        Pane kujund = new Pane();

        //Stseen
        Scene stseen = new Scene(kujund, 1000, 1000);
        primaryStage.setScene(stseen);

        ArrayList<Rectangle> list = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            Rectangle ristkulik = new Rectangle(160, 80, 160, 80);
            ristkulik.setTranslateX(Math.random() * 500);
            ristkulik.setTranslateY(Math.random() * 500);
            kujund.getChildren().add(ristkulik);
            list.add(ristkulik);
            ristkulik.setFill(Color.BLUE);
        }
        for (int i = 0; i < list.size() ; i++) {
            Rectangle uusRistkulik = list.get(i);
            uusRistkulik.setOnMouseClicked(mouseEvent -> {
                if (mouseEvent.getClickCount() == 2) {
                    uusRistkulik.setVisible(false);
                }
                uusRistkulik.setHeight(40);
                uusRistkulik.setWidth(80);
            });
        }
    }
}

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
            Rectangle rectangle = new Rectangle(Math.random()*450,Math.random()*450, 100, 100);
            rectangle.setFill(Color.rgb((int)(Math.random()*255),(int)(Math.random()*255),(int)(Math.random()*255)));
            kujund.getChildren().add(rectangle);
            list.add(rectangle);
        }
        for (int i = 0; i <list.size() ; i++) {
            Rectangle changeSize = list.get(i);
            changeSize.setOnMouseClicked(event -> {
                if (changeSize.getId() == "klikitud") {
                    changeSize.setVisible(false);
                }
                else {
                    changeSize.setHeight(50);
                    changeSize.setWidth(50);
                }
                changeSize.setId("klikitud");
            });
        }
    }
}

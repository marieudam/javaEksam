package JavaFX;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

import java.util.ArrayList;

/**
 * Joonista 500x500 ekraanile ring. Kui hiir ringile vastu läheb, leiab ring omale
 * uue koha. Ei pea animeerima ega midagi fäänsit. Lihtsalt ilmub uues kohas ja kõik.
 * Ehk hiirega saab ringi taga ajada. Kordan - ring leiab uue koha juba hiire puudutusest,
 * mitte klikist. Aga alustada võid muidugi klikist.
 */

public class Tagaajamine extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        //Aken
        primaryStage.show();

        //Raamistik
        Pane raamistik = new Pane();

        //Stseen
        Scene stseen = new Scene(raamistik, 500, 500);
        primaryStage.setScene(stseen);

        //Ring
        Circle ring = new Circle(70);
        ring.setCenterX(260);
        ring.setCenterY(260);

        raamistik.getChildren().add(ring);

        ring.setOnMouseEntered(event -> {
            ring.setCenterX(Math.random() * 500);
            ring.setCenterY(Math.random() * 500);
        });
    }
}

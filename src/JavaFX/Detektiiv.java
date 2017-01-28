package JavaFX;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/**
 * Tee JavaFXiga detektiivi mäng, kus kasutaja saab nähtamatuid ringe otsida.
 * 1. Ekraanil (näiteks 500x500) on suvalistes kohtades 3 ringi, mida näha ei ole.
 * 2. Hiirega ringile vastu minnes tuleb ring nähtavale.
 */

    public class Detektiiv extends Application {
        @Override
        public void start(Stage primaryStage) throws Exception {

            //Aken
            Stage aken = primaryStage;
            aken.setTitle("Detektiiv");

            //Raamistik
            GridPane raamistik = new GridPane();

            Scene stseen = new Scene(raamistik, 500, 500);
            aken.setScene(stseen);
            aken.show();

            Circle ring1 = new Circle(60);
            ring1.setFill(Color.WHITE);
            Circle ring2 = new Circle(60);
            ring2.setFill(Color.WHITE);
            Circle ring3 = new Circle(60);
            ring3.setFill(Color.WHITE);

            GridPane.setConstraints(ring1, 0, 0);
            GridPane.setConstraints(ring2, 2, 3);
            GridPane.setConstraints(ring3, 4, 5);

            raamistik.getChildren().addAll(ring1, ring2, ring3);

            ring1.setOnMouseClicked(event -> {
                ring1.setFill(Color.BLACK);
                    });

            ring2.setOnMouseClicked(event -> {
                ring2.setFill(Color.BLACK);
            });

            ring3.setOnMouseClicked(event -> {
                ring3.setFill(Color.BLACK);
            });

        }

    }

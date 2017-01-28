package JavaFX;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

/**
 * Küsi kasutajalt x, y kordinaadid ja raadius ning joonista talle ring.
 * Küsi kasutajalt sisendit kuidas soovid, pealselt, et teed seda JavaFXis.
 */

public class Ring extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        //Aken
        Stage aken = primaryStage;

        //Raamistik
        GridPane raamistik = new GridPane();
        raamistik.setPadding(new Insets(20, 20, 20, 20));
        raamistik.setVgap(20);
        raamistik.setHgap(20);

        Scene stseen = new Scene(raamistik, 500, 500);
        aken.setScene(stseen);
        aken.show();

        //Sisendi küsimise tekst1
        Label tekst1 = new Label("Sisesta ringi keskpunkti x-koordinaat: ");
        raamistik.setConstraints(tekst1, 0, 0);

        //Sisendi lahter1
        TextField lahter1 = new TextField();
        raamistik.setConstraints(lahter1, 0, 1);

        //Sisendi küsimise tekst2
        Label tekst2 = new Label("Sisesta ringi keskpunkti y-koordinaat: ");
        raamistik.setConstraints(tekst2, 0, 2);

        //Sisendi lahter2
        TextField lahter2 = new TextField();
        raamistik.setConstraints(lahter2, 0, 3);

        //Sisendi küsimise tekst3
        Label tekst3 = new Label("Sisesta ringi raadius: ");
        raamistik.setConstraints(tekst3, 0, 4);

        //Sisendi lahter3
        TextField lahter3 = new TextField();
        raamistik.setConstraints(lahter3, 0, 5);

        //Nupp
        Button nupp = new Button();
        nupp.setText("OK");
        raamistik.setConstraints(nupp, 0, 6);

        raamistik.getChildren().addAll(tekst1, tekst2, tekst3, lahter1, lahter2, lahter3, nupp);

        //Raamistik2
        GridPane raamistik2 = new GridPane();
        raamistik2.setPadding(new Insets(20, 20, 20, 20));
        raamistik2.setVgap(20);
        raamistik2.setHgap(20);

        Scene stseen2 = new Scene(raamistik2, 500, 500);

        nupp.setOnAction(event -> {
            primaryStage.setScene(stseen2);
            int xKoordinaat = Integer.parseInt(lahter1.getText());
            int yKoordinaat = Integer.parseInt(lahter2.getText());
            int raadius = Integer.parseInt(lahter3.getText());

            Circle ring = new Circle(raadius);
            ring.setCenterX(xKoordinaat);
            ring.setCenterY(yKoordinaat);

            raamistik2.getChildren().addAll(ring);
        });


    }

}

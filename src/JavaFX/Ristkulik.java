package JavaFX;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 * Küsi kasutajalt alguskordinaadid ja laius-kõrgus ning joonista talle ristkülik.
 * Küsi kasutajalt sisendit kuidas soovid, pealselt, et teed seda JavaFXis.
 */
public class Ristkulik extends Application {
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
        Label tekst1 = new Label("Sisesta ristküliku alguspunkti x-koordinaat: ");
        raamistik.setConstraints(tekst1, 0, 0);

        //Sisendi lahter1
        TextField lahter1 = new TextField();
        raamistik.setConstraints(lahter1, 0, 1);

        //Sisendi küsimise tekst2
        Label tekst2 = new Label("Sisesta ristküliku alguspunkti y-koordinaat: ");
        raamistik.setConstraints(tekst2, 0, 2);

        //Sisendi lahter2
        TextField lahter2 = new TextField();
        raamistik.setConstraints(lahter2, 0, 3);

        //Sisendi küsimise tekst3
        Label tekst3 = new Label("Sisesta ristküliku laius: ");
        raamistik.setConstraints(tekst3, 0, 4);

        //Sisendi lahter3
        TextField lahter3 = new TextField();
        raamistik.setConstraints(lahter3, 0, 5);

        //Sisendi küsimise tekst4
        Label tekst4 = new Label("Sisesta ristküliku kõrgus: ");
        raamistik.setConstraints(tekst4, 0, 6);

        //Sisendi lahter4
        TextField lahter4 = new TextField();
        raamistik.setConstraints(lahter4, 0, 7);

        //Nupp
        Button nupp = new Button();
        nupp.setText("OK");
        raamistik.setConstraints(nupp, 0, 8);

        raamistik.getChildren().addAll(tekst1, tekst2, tekst3, tekst4, lahter1, lahter2, lahter3, lahter4, nupp);

        //Raamistik2
        GridPane raamistik2 = new GridPane();
        raamistik2.setPadding(new Insets(20, 20, 20, 20));
        raamistik2.setVgap(20);
        raamistik2.setHgap(20);

        Scene stseen2 = new Scene(raamistik2, 500, 500);

        nupp.setOnAction(event -> {
            primaryStage.setScene(stseen2);
            int xKoordinaatAlgus = Integer.parseInt(lahter1.getText());
            int yKoordinaatAlgus = Integer.parseInt(lahter2.getText());
            int xKoordinaatLaius = Integer.parseInt(lahter3.getText());
            int yKoordinaatKorgus = Integer.parseInt(lahter4.getText());

            Rectangle ristkulik = new Rectangle();
            ristkulik.setX(xKoordinaatAlgus);
            ristkulik.setY(yKoordinaatAlgus);
            ristkulik.setHeight(80);
            ristkulik.setWidth(yKoordinaatKorgus);

            raamistik2.getChildren().addAll(ristkulik);
        });


    }

}

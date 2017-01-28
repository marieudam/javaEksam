package JavaFX;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

/**
 * Küsi kasutajalt alguse ja lõpu x-y kordinaadid ning joonista talle joon.
 * Akna võime limiteerida 500x500 piksli peale.
 * Küsi kasutajalt sisendit kuidas soovid, pealselt, et teed seda JavaFXis.
 */
public class Joon extends Application {
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
        Label tekst1 = new Label("Sisesta joone alguse x-koordinaat: ");
        raamistik.setConstraints(tekst1, 0, 0);

        //Sisendi lahter1
        TextField lahter1 = new TextField();
        raamistik.setConstraints(lahter1, 0, 1);

        //Sisendi küsimise tekst2
        Label tekst2 = new Label("Sisesta joone alguse y-koordinaat: ");
        raamistik.setConstraints(tekst2, 0, 2);

        //Sisendi lahter2
        TextField lahter2 = new TextField();
        raamistik.setConstraints(lahter2, 0, 3);

        //Sisendi küsimise tekst3
        Label tekst3 = new Label("Sisesta joone lõpu x-koordinaat: ");
        raamistik.setConstraints(tekst3, 0, 4);

        //Sisendi lahter3
        TextField lahter3 = new TextField();
        raamistik.setConstraints(lahter3, 0, 5);

        //Sisendi küsimise tekst4
        Label tekst4 = new Label("Sisesta joone lõpu y-koordinaat: ");
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
            int xKoordinaatLopp = Integer.parseInt(lahter3.getText());
            int yKoordinaatLopp = Integer.parseInt(lahter4.getText());

            Line joon = new Line();
            joon.setStartX(xKoordinaatAlgus);
            joon.setStartY(yKoordinaatAlgus);
            joon.setEndX(xKoordinaatLopp);
            joon.setEndY(yKoordinaatLopp);

            raamistik2.getChildren().addAll(joon);
        });


    }

}

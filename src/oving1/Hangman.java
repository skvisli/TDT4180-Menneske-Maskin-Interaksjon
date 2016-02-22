package oving1;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class Hangman extends Application{

    @Override
    public void start(Stage stage) throws Exception {
        Pane pane = new Pane();
        Scene scene = new Scene(pane, 500, 500);
        stage.setScene(scene);
        stage.setTitle("Hangman");
        stage.show();

        //Bakke
        Line bakke = new Line(50, 400, 300, 400); //x, y

        //Galge
        Line galge = new Line(100, 400, 100, 100);
        Line utheng = new Line(100, 100, 225, 100);
        Line tau = new Line(225, 100, 225, 150);

        //Person - kropp
        Ellipse hode = new Ellipse(225, 175, 40, 40);
        hode.setFill(Color.WHITE);
        hode.setStroke(Color.BLACK);

        Line kropp = new Line(225, 215, 225, 300);
        Line venstreArm = new Line(225, 225, 190, 270);
        Line h�yreArm = new Line(225, 225, 260, 270);
        Line venstreBein = new Line(225, 300, 190, 350);
        Line h�yreBein = new Line(225, 300, 260, 350);

        //Person - ansikt
        Arc munn = new Arc(225, 200, 15, 20, 40, 100);//xyStart, xyRadius, angle, lenght
        munn.setFill(Color.WHITE);
        munn.setStroke(Color.BLACK);

        Line venstre�ye1 = new Line(205, 150, 215, 160);
        Line venstre�ye2 = new Line(215, 150, 205, 160);

        Line h�yre�ye1 = new Line(235, 150, 245, 160);
        Line h�yre�ye2 = new Line(245, 150, 235, 160);


        pane.getChildren().addAll(bakke, galge, utheng, tau, hode, kropp, venstreArm,
                h�yreArm, venstreBein, h�yreBein, munn, venstre�ye1, venstre�ye2,
                h�yre�ye1, h�yre�ye2);

    }

    public static void main(String[] args) {
        launch(Hangman.class, args);

    }
}
package mx.edu.utez.u2_ti_05_formulario;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {

    //Labels y botones

        Label label = new Label("Chiste bien gracioso");
        Button button = new Button("Chiste");
        Button button1 = new Button("Remate");

        button.setOnAction(e -> {
            label.setText("¿Por que se extinguieron los mamuts?");
        });

        button1.setOnAction(e -> {
            label.setText("Porque no habia paputs");
        });

        VBox vbox = new VBox(20,label, button, button1);
        vbox.setAlignment(Pos.CENTER);
        Scene scene = new Scene(vbox, 500, 240);

        stage.setTitle("Hello!");
        Image image = new Image(getClass().getResourceAsStream("/Image/snek.jpg"));
        stage.getIcons().add(image);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
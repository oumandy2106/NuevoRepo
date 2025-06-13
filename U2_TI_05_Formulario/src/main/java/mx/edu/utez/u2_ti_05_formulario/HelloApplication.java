package mx.edu.utez.u2_ti_05_formulario;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
    //Labels y botones
        Label label = new Label("Chiste bien gracioso");
        Button button = new Button("Chiste");
        Button button1 = new Button("Remate");


    }

    public static void main(String[] args) {
        launch();
    }
}
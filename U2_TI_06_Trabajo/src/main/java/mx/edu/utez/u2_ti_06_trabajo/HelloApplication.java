package mx.edu.utez.u2_ti_06_trabajo;

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

        Label lblNombre = new Label("Nombre: ");
        TextField tfNombre = new TextField();

        Label lblApellido = new Label("Apellido: ");
        TextField tfApellido = new TextField();

        Label lblEdad = new Label("Edad ");
        TextField tfEdad = new TextField();

        Label lblGrupo = new Label("Grupos: ");
        ObservableList<String> grupos = FXCollections.observableArrayList("Estudiante", "Profesor", "admin");
        ComboBox<String> cbGrupo = new ComboBox<>(grupos);

        Button btnEnviar = new Button("Enviar");
        Label resultado = new Label();

        VBox vbox = new VBox(20,label, button, button1);
        vbox.setAlignment(Pos.CENTER);
        Scene scene = new Scene(vbox, 500, 240);





    }

    public static void main(String[] args) {
        launch();
    }
}
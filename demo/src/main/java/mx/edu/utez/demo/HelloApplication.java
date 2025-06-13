package mx.edu.utez.demo;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import javax.swing.*;
import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        Label lblNombre = new Label("Nombre: ");
        TextField txtNombre = new TextField();

        Label lblApellido = new Label("Apellido: ");
        TextField txtApellido = new TextField();

        Label lblEdad = new Label("Edad ");
        TextField txtEdad = new TextField();

        Label lblGrupo = new Label("Grupos: ");
        ComboBox<String> cbGrupo = new ComboBox<>();
        cbGrupo.getItems().addAll("Maestro", "Estudiante", "Admin");

        Label lblResultado = new Label(" ");

        Button enviar = new Button("Enviar");

        Button reset = new Button("Reset");

        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.add(lblNombre, 0, 0);
        grid.add(txtNombre, 1, 0);
        grid.add(lblApellido, 0, 1);
        grid.add(txtApellido, 1, 1);
        grid.add(lblEdad, 0, 2);
        grid.add(txtEdad, 1, 2);
        grid.add(lblGrupo, 0, 3);
        grid.add(cbGrupo, 1, 3);
        grid.add(enviar, 1, 4);
        grid.add(reset, 1, 5);
        grid.add(lblResultado, 0, 6);

        enviar.setOnAction(e -> {
            String nombre = txtNombre.getText();
            String apellido = txtApellido.getText();
            int edad = Integer.parseInt(txtEdad.getText());
            String grupo = cbGrupo.getSelectionModel().getSelectedItem();
            if (txtNombre.getText().isEmpty() || txtApellido.getText().isEmpty() || txtEdad.getText().isEmpty()) {
                lblResultado.setText("El nombre no puede estar vacio");
            }
            else {
            grid.setStyle("-fx-background-color: lightgreen;");
            lblResultado.setStyle("-fx-background-color: lightblue; -fx-text-fill: black;");
            lblResultado.setText( "Nombre: " + nombre + "\nApellido: " + apellido + "\nEdad : " + edad + "\nGrupo: " + grupo);
            }
        });
        reset.setOnAction(e -> {
           txtNombre.clear();
           txtApellido.clear();
           txtEdad.clear();
           cbGrupo.getSelectionModel().clearSelection();
           lblResultado.setText("");
        });



        Scene scene = new Scene(grid, 800, 600);
        stage.setTitle("Formulario");
        Image image = new Image(getClass().getResourceAsStream("/Image/snek.jpg"));
        stage.getIcons().add(image);
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args) {
        launch();
    }
}
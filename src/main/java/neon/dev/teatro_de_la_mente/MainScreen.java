package neon.dev.teatro_de_la_mente;

import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import neon.dev.teatro_de_la_mente.utils.TitleAnimator;

public class MainScreen {

    private StackPane root;

    public MainScreen() {
        root = new StackPane();
        root.setStyle("-fx-background-color: black;");

        Text title = new Text("TEATRO DE LA MENTE");
        title.setStyle("-fx-font-size: 40px; -fx-fill: white;");

        TitleAnimator.animateFade(title, 3000); // animación de título con JavaFX Titles

        Button startButton = new Button("Empezar");
        startButton.setOnAction(e -> {
            System.out.println("Iniciar juego...");
            // Aquí cambiarás de escena al acto I
        });

        VBox content = new VBox(30, title, startButton);
        content.setAlignment(Pos.CENTER);

        root.getChildren().add(content);
    }

    public Parent getRoot() {
        return root;
    }
}

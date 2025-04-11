package neon.dev.teatro_de_la_mente;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        MainScreen mainScreen = new MainScreen();
        Scene scene = new Scene(mainScreen.getRoot(), 800, 600); // Resolución inicial

        primaryStage.setTitle("Teatro de la Mente");
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

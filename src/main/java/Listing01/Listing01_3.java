package Listing01;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Listing01_3 extends Application {
    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void init() {}

    @Override
    public void start(Stage stage) {
        try {
            StackPane root = new StackPane();
            Scene scene = new Scene(root, 300, 200);
            stage.setScene(scene);
            stage.show();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void stop() {}
}

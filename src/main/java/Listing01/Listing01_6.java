package Listing01;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class Listing01_6 extends Application {
    public static void main(String[] args) {
        System.out.println("Uruchomiłem metodę main()");
        Application.launch(args);
        System.out.println("Wróciłem do metody main()");
    }

    @Override
    public void init() {
        System.out.println("Uruchomiłem metodę init()");
    }

    @Override
    public void start(Stage stage) {
        try {
            System.out.println("Uruchomiłem metodę start()");
            Label label = new Label("Witaj, świecie");
            VBox root = new VBox();
            Button stopButton = new Button("Żegnaj, świecie");
            stopButton.setOnAction(e -> {
                System.out.println("Kliknięto przycisk");
                Platform.exit();
            });
            root.getChildren().addAll(label, stopButton);
            Scene scene = new Scene(root,600, 400);
            stage.setScene(scene);
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void stop() {
        System.out.println("Uruchomiłem metodę stop()");
    }
}

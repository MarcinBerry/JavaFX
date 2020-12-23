package Listing01;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Listing01_5 extends Application {
    public static void main(String[] args) {
        System.out.println("Uruchomiłem metodę main()");
        Application.launch(args);
        System.out.println("Wróciłem do metody main()");
    }

    @Override
    public void init() {
        System.out.println("Uruchomiłem metode init()");
    }

    @Override
    public void start(Stage stage) {
        try {
            System.out.println("Uruchomiłem metodę start()");
            StackPane root = new StackPane();
            Scene scene = new Scene(root, 300, 200);
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

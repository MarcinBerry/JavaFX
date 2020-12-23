package Listing01;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.util.List;

public class Listing01_08 extends Application {
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
            Parameters p = this.getParameters();
            List<String> unParams = p.getUnnamed();
            StackPane root = new StackPane();
            Scene scene = new Scene(root, Double.parseDouble(unParams.get(0)),
                    Double.parseDouble(unParams.get(1)));
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

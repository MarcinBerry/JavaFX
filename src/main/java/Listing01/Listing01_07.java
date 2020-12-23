package Listing01;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.util.List;
import java.util.Map;


public class Listing01_07 extends Application {
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
            Parameters p = this.getParameters();
            Map<String, String> nParams = p.getNamed();
            List<String> unParams = p.getUnnamed();
            List<String> rParams = p.getRaw();
            TextArea ta = new TextArea(nParams + "\n" + unParams + "\n" + rParams);
            StackPane root = new StackPane();
            root.getChildren().add(ta);
            Scene scene = new Scene(root, 600, 400);
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

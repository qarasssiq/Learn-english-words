package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    private static Stage parentWindow;

    @Override
    public void start(Stage primaryStage) throws Exception{
        parentWindow = primaryStage;
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("MyApp");
        primaryStage.setScene(new Scene(root, 720, 492));
        primaryStage.show();
    }

    public static void main(String[] args) { launch(args); }
}

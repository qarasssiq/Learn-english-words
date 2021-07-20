package sample;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class DeathController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button check_button;

    @FXML
    private Button rise_button;

    public void setRise_button() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("rise.fxml"));
        Stage stage = (Stage) rise_button.getScene().getWindow();
        Scene scene = new Scene(loader.load());
        stage.setScene(scene);
    }

    @FXML
    void initialize() {
        rise_button.setOnAction(actionEvent -> {
            try {
                setRise_button();
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
    }
}

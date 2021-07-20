package sample;

import java.io.IOException;
import java.net.URL;
import java.nio.file.Paths;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;

public class MemesController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button return_button;

    @FXML
    private ImageView casino_img;

    @FXML
    private ImageView ricardo_img;

    @FXML
    private ImageView shrek_img;

    @FXML
    private ImageView goblin_img;

    @FXML
    private ImageView gachi_img;

    @FXML
    private ImageView stalker_img;

    private void setReturn_button() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("sample.fxml"));
        Stage stage = (Stage) return_button.getScene().getWindow();
        Scene scene = new Scene(loader.load());
        stage.setScene(scene);
    }

    MediaPlayer mediaPlayer;

    private void cycle(ImageView img) {
        img.setOnMouseClicked((MouseEvent e) -> {
            mediaPlayer.pause();
            img.setOnMouseClicked((MouseEvent v) -> {
                mediaPlayer.play();
                cycle(img);
            });
        });
    }

    public void setStalker_img() {
        String bip = "AudioFiles/stalker.mp3";
        Media hit = new Media(Paths.get(bip).toUri().toString());
        mediaPlayer = new MediaPlayer(hit);
        mediaPlayer.play();
        stalker_img.setOnMouseClicked((MouseEvent e) -> {
            mediaPlayer.pause();
            stalker_img.setOnMouseClicked((MouseEvent v) -> {
                mediaPlayer.play();
                cycle(stalker_img);
            });
        });
        gachi_img.setOnMouseClicked((MouseEvent a) -> {
            mediaPlayer.stop();
            setGachi_img();
        });
        ricardo_img.setOnMouseClicked((MouseEvent a) -> {
            mediaPlayer.stop();
            setRicardo_img();
        });
        goblin_img.setOnMouseClicked((MouseEvent a) -> {
            mediaPlayer.stop();
            setGoblin_img();
        });
        casino_img.setOnMouseClicked((MouseEvent a) -> {
            mediaPlayer.stop();
            setCasino_img();
        });
        shrek_img.setOnMouseClicked((MouseEvent a) -> {
            mediaPlayer.stop();
            setShrek_img();
        });
    }

    public void setGachi_img() {
        String bip = "AudioFiles/handclap.mp3";
        Media hit = new Media(Paths.get(bip).toUri().toString());
        mediaPlayer = new MediaPlayer(hit);
        mediaPlayer.play();
        gachi_img.setOnMouseClicked((MouseEvent e) -> {
            mediaPlayer.pause();
            gachi_img.setOnMouseClicked((MouseEvent v) -> {
                mediaPlayer.play();
                cycle(gachi_img);
            });
        });
        stalker_img.setOnMouseClicked((MouseEvent a) -> {
            mediaPlayer.stop();
            setStalker_img();
        });
        ricardo_img.setOnMouseClicked((MouseEvent a) -> {
            mediaPlayer.stop();
            setRicardo_img();
        });
        goblin_img.setOnMouseClicked((MouseEvent a) -> {
            mediaPlayer.stop();
            setGoblin_img();
        });
        casino_img.setOnMouseClicked((MouseEvent a) -> {
            mediaPlayer.stop();
            setCasino_img();
        });
        shrek_img.setOnMouseClicked((MouseEvent a) -> {
            mediaPlayer.stop();
            setShrek_img();
        });
    }

    public void setShrek_img() {
        String bip = "AudioFiles/shrek.mp3";
        Media hit = new Media(Paths.get(bip).toUri().toString());
        mediaPlayer = new MediaPlayer(hit);
        mediaPlayer.play();
        shrek_img.setOnMouseClicked((MouseEvent e) -> {
            mediaPlayer.pause();
            shrek_img.setOnMouseClicked((MouseEvent v) -> {
                mediaPlayer.play();
                cycle(shrek_img);
            });
        });
        stalker_img.setOnMouseClicked((MouseEvent a) -> {
            mediaPlayer.stop();
            setStalker_img();
        });
        ricardo_img.setOnMouseClicked((MouseEvent a) -> {
            mediaPlayer.stop();
            setRicardo_img();
        });
        goblin_img.setOnMouseClicked((MouseEvent a) -> {
            mediaPlayer.stop();
            setGoblin_img();
        });
        casino_img.setOnMouseClicked((MouseEvent a) -> {
            mediaPlayer.stop();
            setCasino_img();
        });
        gachi_img.setOnMouseClicked((MouseEvent a) -> {
            mediaPlayer.stop();
            setGachi_img();
        });
    }

    public void setCasino_img() {
        String bip = "AudioFiles/casino.mp3";
        Media hit = new Media(Paths.get(bip).toUri().toString());
        mediaPlayer = new MediaPlayer(hit);
        mediaPlayer.play();
        casino_img.setOnMouseClicked((MouseEvent e) -> {
            mediaPlayer.pause();
            casino_img.setOnMouseClicked((MouseEvent v) -> {
                mediaPlayer.play();
                cycle(casino_img);
            });
        });
        stalker_img.setOnMouseClicked((MouseEvent a) -> {
            mediaPlayer.stop();
            setStalker_img();
        });
        ricardo_img.setOnMouseClicked((MouseEvent a) -> {
            mediaPlayer.stop();
            setRicardo_img();
        });
        goblin_img.setOnMouseClicked((MouseEvent a) -> {
            mediaPlayer.stop();
            setGoblin_img();
        });
        shrek_img.setOnMouseClicked((MouseEvent a) -> {
            mediaPlayer.stop();
            setShrek_img();
        });
        gachi_img.setOnMouseClicked((MouseEvent a) -> {
            mediaPlayer.stop();
            setGachi_img();
        });
    }

    public void setRicardo_img() {
        String bip = "AudioFiles/ricardo.mp3";
        Media hit = new Media(Paths.get(bip).toUri().toString());
        mediaPlayer = new MediaPlayer(hit);
        mediaPlayer.play();
        ricardo_img.setOnMouseClicked((MouseEvent e) -> {
            mediaPlayer.stop();
            ricardo_img.setOnMouseClicked((MouseEvent v) -> {
                setRicardo_img();
                cycle(ricardo_img);
            });
        });
        stalker_img.setOnMouseClicked((MouseEvent a) -> {
            mediaPlayer.stop();
            setStalker_img();
        });
        goblin_img.setOnMouseClicked((MouseEvent a) -> {
            mediaPlayer.stop();
            setGoblin_img();
        });
        casino_img.setOnMouseClicked((MouseEvent a) -> {
            mediaPlayer.stop();
            setCasino_img();
        });
        shrek_img.setOnMouseClicked((MouseEvent a) -> {
            mediaPlayer.stop();
            setShrek_img();
        });
        gachi_img.setOnMouseClicked((MouseEvent a) -> {
            mediaPlayer.stop();
            setGachi_img();
        });
    }

    public void setGoblin_img() {
        String bip = "AudioFiles/goblin.mp3";
        Media hit = new Media(Paths.get(bip).toUri().toString());
        mediaPlayer = new MediaPlayer(hit);
        mediaPlayer.play();
        goblin_img.setOnMouseClicked((MouseEvent e) -> {
            mediaPlayer.stop();
            goblin_img.setOnMouseClicked((MouseEvent v) -> {
                setGoblin_img();
                cycle(goblin_img);
            });
        });
        stalker_img.setOnMouseClicked((MouseEvent a) -> {
            mediaPlayer.stop();
            setStalker_img();
        });
        ricardo_img.setOnMouseClicked((MouseEvent a) -> {
            mediaPlayer.stop();
            setRicardo_img();
        });
        casino_img.setOnMouseClicked((MouseEvent a) -> {
            mediaPlayer.stop();
            setCasino_img();
        });
        shrek_img.setOnMouseClicked((MouseEvent a) -> {
            mediaPlayer.stop();
            setShrek_img();
        });
        gachi_img.setOnMouseClicked((MouseEvent a) -> {
            mediaPlayer.stop();
            setGachi_img();
        });
    }

    @FXML
    void initialize() {
        return_button.setOnAction(actionEvent -> {
            try {
                setReturn_button();
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
    }
}

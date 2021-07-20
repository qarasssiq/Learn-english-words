package sample;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.*;

public class Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField translate_field;

    @FXML
    private Button check_button;

    @FXML
    private Button death_button;

    @FXML
    private Button memes_button;

    @FXML
    private Text word_text;

    @FXML
    private Text check_text;

    @FXML
    private Text correct_answer_text;

    @FXML
    private Text translate_text;

    @FXML
    private Button nextword_button;

    @FXML
    private Text statistics_text;

    @FXML
    private Text correct_answers_text;

    @FXML
    private Text incorrect_answers_text;

    private int correct = 0;
    private int incorrect = 0;
    private List<Words_new> Words = new ArrayList<>();

    private void create_List(String fileName) {
        String line;
        String word = "";
        String translate = "";
        Words_new WORD;
        try {
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            while((line = bufferedReader.readLine()) != null) {
                for (int i = 0; i < line.length(); i++) {
                    if (line.charAt(i) != '-')
                        word += line.charAt(i);
                    else {
                        i++;
                        for (int j = i; j < line.length(); j++) {
                            translate += line.charAt(j);
                            i++;
                        }
                    }
                }
                WORD = new Words_new(word, translate);
                Words.add(WORD);
                word = "";
                translate = "";
            }
            bufferedReader.close();
        }
        catch(FileNotFoundException ex) {
            System.out.println("Unable to open file '" + fileName + "'");
        }
        catch(IOException ex) {
            System.out.println("Error reading file '" + fileName + "'");
        }
    }

    private void setup() {
        word_text.setFill(Color.CORNFLOWERBLUE);
        translate_text.setFill(Color.GOLDENROD);
        translate_field.requestFocus();
        correct_answer_text.setText("");
        translate_text.setText("");
        check_text.setText("");
        translate_field.setText("");
        correct_answers_text.setText(String.valueOf(correct));
        incorrect_answers_text.setText(String.valueOf(incorrect));
        correct_answers_text.setFill(Color.GREEN);
        incorrect_answers_text.setFill(Color.RED);
        check_button.setDisable(false);
        check_button.setFocusTraversable(false);
        nextword_button.setFocusTraversable(false);
    }

    private void run() {

        setup();

        Words_new WORD = Words_new.getRandomWord(Words);
        String word = WORD.getWord();
        String full_translate = WORD.getTranslate();
        String translate1 = null;
        String translate2 = null;

        char[] chArray = full_translate.toCharArray();
        for (int j = 0; j < chArray.length; j++)
            if (chArray[j] == '/') {
                translate1 = full_translate.substring(0, j);
                translate2 = full_translate.substring(j + 1);
            }

        word_text.setText(word);
        String finalFull_translate = full_translate;
        String finalTranslate1 = translate1;
        String finalTranslate2 = translate2;


        check_button.setOnAction(actionEvent -> {
            correct_answer_text.setText("Correct answer: ");
            translate_text.setText(full_translate);
            String answer = translate_field.getText();
            if (answer.equalsIgnoreCase(finalFull_translate) || answer.equalsIgnoreCase(finalTranslate1) || answer.equalsIgnoreCase(finalTranslate2)) {
                check_text.setFill(Color.GREEN);
                check_text.setText("Correct!");
                correct++;
                correct_answers_text.setText(String.valueOf(correct));
            } else {
                check_text.setFill(Color.RED);
                check_text.setText("Incorrect!");
                incorrect++;
                incorrect_answers_text.setText(String.valueOf(incorrect));
            }
            check_button.setDisable(true);
            nextword_button.requestFocus();
        });

        translate_field.setOnKeyReleased(event -> {
            if(event.getCode() == KeyCode.ENTER) {
                correct_answer_text.setText("Correct answer: ");
                translate_text.setText(full_translate);
                String answer = translate_field.getText();
                if (answer.equalsIgnoreCase(finalFull_translate) || answer.equalsIgnoreCase(finalTranslate1) || answer.equalsIgnoreCase(finalTranslate2)) {
                    check_text.setFill(Color.GREEN);
                    check_text.setText("Correct!");
                    correct++;
                    correct_answers_text.setText(String.valueOf(correct));
                } else {
                    check_text.setFill(Color.RED);
                    check_text.setText("Incorrect!");
                    incorrect++;
                    incorrect_answers_text.setText(String.valueOf(incorrect));
                }
                check_button.setDisable(true);
                nextword_button.requestFocus();
            }
        });

        nextword_button.setOnAction(actionEvent1 -> run());
    }

    private void setMemes_button() throws IOException{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("memes.fxml"));
        Stage stage = (Stage) memes_button.getScene().getWindow();
        Scene scene = new Scene(loader.load());
        stage.setScene(scene);
    }

    private void setDeath_button() throws IOException{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("death.fxml"));
        Stage stage = (Stage) death_button.getScene().getWindow();
        Scene scene = new Scene(loader.load());
        stage.setScene(scene);
    }


    @FXML
    void initialize() {
        String fileName = "Words.txt";
        create_List(fileName);
        run();
        memes_button.setOnAction(actionEvent -> {
            try {
                setMemes_button();
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

        death_button.setOnAction(actionEvent -> {
            try {
                setDeath_button();
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
    }
}

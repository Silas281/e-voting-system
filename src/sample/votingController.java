package sample;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.event.ActionEvent;

import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ResourceBundle;
import java.net.URL;

public class votingController implements Initializable {
/*
votingController
 */

    @FXML
    private Button ndcButton;

    @FXML
    private Button nppButton;

    @FXML
    private Button cppButton;

    @FXML
    private Button doneButton;

    @FXML
    private Label finishmessagelabel;

    @FXML
    private ImageView logoImageView;

    @FXML
    private ImageView ndcImageView;

    @FXML
    private ImageView nppImageView;

    @FXML
    private ImageView cppImageView;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        File logofile = new File("@../../Images/vote45a.jpg");
        Image logoImage = new Image(logofile.toURI().toString());
        logoImageView.setImage(logoImage);

        File ndcfile = new File("@../../Images/vote1.jpeg");
        Image ndcImage = new Image(ndcfile.toURI().toString());
        ndcImageView.setImage(ndcImage);

        File nppfile = new File("@../../Images/vote2.jpeg");
        Image nppImage = new Image(nppfile.toURI().toString());
        nppImageView.setImage(nppImage);

        File cppfile = new File("@../../Images/vote3.jpg");
        Image cppImage = new Image(cppfile.toURI().toString());
        cppImageView.setImage(cppImage);

    }

    public void ndcbuttonOnAction(ActionEvent event) {
        finishmessagelabel.setText("You have voted. Click done to finish!");
    }

    public void nppbuttonOnAction(ActionEvent event) {
        finishmessagelabel.setText("You have voted. Click done to finish!");
    }

    public void cppbuttonOnAction(ActionEvent event) {
        finishmessagelabel.setText("You have voted. Click done to finish!");
    }

    public void donebuttonOnAction(ActionEvent event) throws IOException {

        Parent page2Parent1 = FXMLLoader.load(getClass().getResource("bye.fxml"));

        Stage window = (Stage) doneButton.getScene().getWindow();

        Scene page2View1 = new Scene(page2Parent1);

        window.setScene(page2View1);
        window.show();


    }
}
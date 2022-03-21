package sample;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
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

public class welcomeController implements Initializable{
    @FXML
    private Button voterButton;

    @FXML
    private Button ecButton;


    @FXML
    private ImageView welcomeImageView;




    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        File logofile = new File("@../../Images/vote45.jpg" );
        Image logoImage = new Image(logofile.toURI().toString());
        welcomeImageView.setImage(logoImage);
    }

    public void voterbuttonOnAction(ActionEvent event) throws IOException {

        Parent page2Parent2 = FXMLLoader.load(getClass().getResource("login.fxml"));

        Stage window = (Stage) voterButton.getScene().getWindow();

        Scene page2Viewa = new Scene(page2Parent2);

        window.setScene(page2Viewa);
        window.show();
    }

    public void officerbuttonOnAction(ActionEvent event) throws IOException {

        Parent page2Parent2 = FXMLLoader.load(getClass().getResource("officerlogin.fxml"));

        Stage window = (Stage) ecButton.getScene().getWindow();

        Scene page2Viewb = new Scene(page2Parent2);

        window.setScene(page2Viewb);
        window.show();
    }







    }









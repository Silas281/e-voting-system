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

public class byeController implements Initializable{
    @FXML
    private Button homeButton;

    @FXML
    private Button closevButton;


    @FXML
    private ImageView endImageView;




    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        File logofile = new File("@../../Images/vote45.jpg");
        Image logoImage = new Image(logofile.toURI().toString());
        endImageView.setImage(logoImage);
    }

    public void homebuttonOnAction(ActionEvent event) throws IOException {

        Parent page2Parent2 = FXMLLoader.load(getClass().getResource("welcome.fxml"));

        Stage window = (Stage) homeButton.getScene().getWindow();

        Scene page2Viewa = new Scene(page2Parent2);

        window.setScene(page2Viewa);
        window.show();
    }

    public void CloseButtonOnAction(ActionEvent event){
        Stage stage = (Stage) closevButton.getScene().getWindow();
        stage.close();

    }






}



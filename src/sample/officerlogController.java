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

public class officerlogController implements Initializable{
    @FXML
    private Button cancelbutton;

    @FXML
    private Button loginbutton;

    @FXML
    private Label loginmessagelabel;

    @FXML
    private ImageView brandingImageView;

    @FXML
    private ImageView lockImageView;

    @FXML
    private TextField usernameTextField;

    @FXML
    private PasswordField VoterIDTextField;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle){
        File brandingfile = new File("Images/vote1b.jpg");
        Image brandingImage = new Image(brandingfile.toURI().toString());
        brandingImageView.setImage(brandingImage);

        File lockfile = new File("Images/lock-xxl1.png");
        Image lockImage = new Image(lockfile.toURI().toString());
        lockImageView.setImage(lockImage);


    }

    public void loginbuttonOnAction(ActionEvent event) throws IOException {

        if(usernameTextField.getText().isBlank() == false && VoterIDTextField.getText().isBlank()== false){

            Parent page2Parent = FXMLLoader.load(getClass().getResource("Thanks.fxml"));

            Stage window = (Stage) loginbutton.getScene().getWindow();

            Scene page2View = new Scene(page2Parent);

            window.setScene(page2View);
            window.show();

        }else{
            loginmessagelabel.setText("Please enter username and voterID");

        }



    }


    public void CancelButtonOnAction(ActionEvent event){
        Stage stage = (Stage) cancelbutton.getScene().getWindow();
        stage.close();

    }


    public void validLogin(){
       /* DatabaseConnection connectNow = new DatabaseConnection();
       // Connection connectDB = connectNow.getConnection();

        String verifyLogin = "select count(1) from user_account where Username = '" + usernameTextField.getText() +
                "' AND voterID ='" + VoterIDTextField.getText() +"'" ;

        try{
            Statement statement = connectDB.createStatement();
            ResultSet queryResult = statement.executeQuery(verifyLogin);

            while (queryResult.next()){
                if (queryResult.getInt(1 )==1){
                    loginmessagelabel.setText("Congratulations!");

                }else{
                    loginmessagelabel.setText("Invalid Login. Please try again.");

                }
            }

        }catch (Exception e){
            e.printStackTrace();
            e.getCause();
        }*/


    }


}


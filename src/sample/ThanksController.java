package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class ThanksController implements Initializable {


    ObservableList pollingBox = FXCollections.observableArrayList();


    @FXML
    private Button resultsButton;

    @FXML
    TextArea textArea;

    @FXML
    private Button districtButton;

    @FXML
    private ImageView headImageView;

    @FXML
    private ChoiceBox<String> pullingList;



    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        File logofile = new File("@../../Images/vote45a.jpg");
        Image logoImage = new Image(logofile.toURI().toString());
        headImageView.setImage(logoImage);

        selectBox();
    }



    public void resultsbuttonOnAction(ActionEvent event) {

        PollingStation pollingStation1=new PollingStation("Berekuso center","Nadowli District","Mr. Martin");
        PollingStation pollingStation2=new PollingStation("Santa","Nadowli District","Mr. Martin");
        DistrictOffice districtOffice=new DistrictOffice("Tema","UWR");
        PollingStation p1 =new PollingStation();
        Candidate ndc=new Candidate("John Mahama-NDC ",25,"Male","Ghanaian","Nadowli",
                "NDC","Chaang R/C JHS","64562023AD","Presidential");
        Candidate npp=new Candidate("Akuffo Addo -NPP",25,"Male","Ghanaian","Nadowli",
                "NPP","Chaang R/C JHS","64562023AD","Presidential");
        Candidate cpp=new Candidate("Ivor Greenstreet- CPP",25,"male","Ghanaian","Nadowli",
                "CPP","Chaang R/C JHS","64562023AD","MP");
        Voter voter1=new Voter("Gladys",20,"Female","Ghanaian",
                "Berekuso","645562023AV");
        Voter voter2=new Voter("Prosper",18,"male","Ghanaian",
                "Kwabenya Station","745562023AV");
        Voter voter3=new Voter("Samson",18,"male","Ghanaian",
                "Berekuso","845562023AV");

        pollingStation1.addCandidate(ndc);
        pollingStation1.addCandidate(npp);
        pollingStation1.addCandidate(cpp);

        pollingStation1.vote(voter1,ndc);
        pollingStation1.vote(voter2,ndc);
        pollingStation1.vote(voter3,npp);
        pollingStation1.vote(voter3,npp);
        pollingStation1.vote(voter3,ndc);
        pollingStation1.vote(voter1,ndc);
        pollingStation1.vote(voter2,cpp);
        pollingStation1.vote(voter1,cpp);
        pollingStation1.vote(voter1,npp);
        pollingStation1.vote(voter3,ndc);


        Voter voter4=new Voter("Gladys",20,"Female","Ghanaian",
                "Chaang R/C JHS","645562023AV");
        Voter voter5=new Voter("Prosper",18,"Female","Ghanaian",
                "Chaang R/C JHS","745562023AV");
        Voter voter6=new Voter("Samson",18,"male","Ghanaian",
                "Chaang R/C JHS","845562023AV");

        pollingStation2.addCandidate(ndc);
        pollingStation2.addCandidate(npp);
        pollingStation2.addCandidate(cpp);


        pollingStation2.vote(voter4,ndc);
        pollingStation2.vote(voter5,cpp);
        pollingStation2.vote(voter6,npp);
        pollingStation2.vote(voter4,ndc);
        pollingStation2.vote(voter6,cpp);
        pollingStation2.vote(voter1,cpp);
        pollingStation2.vote(voter2,ndc);
        pollingStation2.vote(voter1,cpp);
        pollingStation2.vote(voter1,npp);
        pollingStation2.vote(voter3,ndc);



        districtOffice.addPollingStation(pollingStation2);
        districtOffice.addPollingStation(pollingStation1);
        textArea.setText(pollingStation1.results());

    }

    public void districtbuttonOnAction(ActionEvent event) throws IOException {
        Parent page2Parent = FXMLLoader.load(getClass().getResource("District.fxml"));

        Stage window = (Stage) districtButton.getScene().getWindow();

        Scene page2View3 = new Scene(page2Parent);

        window.setScene(page2View3);
        window.show();
    }
    private void selectBox(){
        pollingBox.removeAll(pollingBox);
        String a = "Berukuso";
        String b = "ashogman";
        pollingBox.addAll(a,b);
        pullingList.getItems().addAll(pollingBox);


    }

}



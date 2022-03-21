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

public class regionalController implements Initializable {

    ObservableList regionBox = FXCollections.observableArrayList();

    @FXML
    private Button baButton;

    @FXML
    private Button heButton;

    @FXML
    TextArea textArea;

    @FXML
    private Button reButton;

    @FXML
    private ImageView heaImageView;

    @FXML
    private ChoiceBox<String> regionList;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        File logofile = new File("@../../Images/vote45a.jpg");
        Image logoImage = new Image(logofile.toURI().toString());
        heaImageView.setImage(logoImage);

        selectBox2();
    }

    public void babuttonOnAction(ActionEvent event) throws IOException {
        Parent page2Parent2 = FXMLLoader.load(getClass().getResource("District.fxml"));

        Stage window = (Stage) baButton.getScene().getWindow();

        Scene page2View2 = new Scene(page2Parent2);

        window.setScene(page2View2);
        window.show();
    }

    public void resultsbuttonOnAction(ActionEvent event) {
        PollingStation pollingStation1=new PollingStation("Berekuso center","Nadowli District","Mr. Martin");
        PollingStation pollingStation2=new PollingStation("Santa","Nadowli District","Mr. Martin");
        DistrictOffice tema=new DistrictOffice("Tema","Greater Accra");
        DistrictOffice takoradi=new DistrictOffice("Takoradi","Eastern Accra");
        DistrictOffice santa=new DistrictOffice("Santa","Upper West");

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

        tema.addPollingStation(pollingStation2);
        takoradi.addPollingStation(pollingStation1);
        santa.addPollingStation(pollingStation2);

        tema.collatePollingResults();
        takoradi.collatePollingResults();
        santa.collatePollingResults();

        RegionalOffice grterAccra=new RegionalOffice("Accra","Greater Accra");
        RegionalOffice eastern=new RegionalOffice("Eastern","Eastern");
        grterAccra.addDistrict(tema);
        eastern.addDistrict(santa);
        grterAccra.addDistrict(takoradi);
        grterAccra.collateRegionalResults();
        eastern.collateRegionalResults();

        textArea.setText(grterAccra.regionalResults());

    }

    public void headquaterbuttonOnAction(ActionEvent event) throws IOException {
        Parent page2Parent = FXMLLoader.load(getClass().getResource("headquater.fxml"));

        Stage window = (Stage) heButton.getScene().getWindow();

        Scene page2View3 = new Scene(page2Parent);

        window.setScene(page2View3);
        window.show();
    }

    private void selectBox2(){
        regionBox.removeAll(regionBox);
        String a = "Greater Accra Region";
        String b = "Upper West Region";
        String c = "Eastern Region";
        String d = "Western Region";
        regionBox.addAll(a,b,c,d);
        regionList.getItems().addAll(regionBox);


    }

}

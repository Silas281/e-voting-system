package sample;

import java.util.HashMap;

/**
 * Tester.java
 * Tester Class to test Person class and it's subclasses

 */

public class Tester {
    //main method
    public static void main(String[] args) {

        PollingStation pollingStation1 = new PollingStation("Berekuso center", "Nadowli District", "Mr. Martin");
        PollingStation pollingStation2 = new PollingStation("Santa", "Nadowli District", "Mr. Martin");
        DistrictOffice tema = new DistrictOffice("Tema", "Greater Accra");
        DistrictOffice takoradi = new DistrictOffice("Takoradi", "Eastern Accra");
        DistrictOffice santa = new DistrictOffice("Santa", "Upper West");

        Candidate ndc = new Candidate("John Mahama-NDC ", 25, "Male", "Ghanaian", "Nadowli",
                "NDC", "Chaang R/C JHS", "64562023AD", "Presidential");
        Candidate npp = new Candidate("Akuffo Addo -NPP", 25, "Male", "Ghanaian", "Nadowli",
                "NPP", "Chaang R/C JHS", "64562023AD", "Presidential");
        Candidate cpp = new Candidate("Ivor Greenstreet- CPP", 25, "male", "Ghanaian", "Nadowli",
                "CPP", "Chaang R/C JHS", "64562023AD", "MP");
        Voter voter1 = new Voter("Gladys", 20, "Female", "Ghanaian",
                "Berekuso", "645562023AV");
        Voter voter2 = new Voter("Prosper", 18, "male", "Ghanaian",
                "Kwabenya Station", "745562023AV");
        Voter voter3 = new Voter("Samson", 18, "male", "Ghanaian",
                "Berekuso", "845562023AV");

        pollingStation1.addCandidate(ndc);
        pollingStation1.addCandidate(npp);
        pollingStation1.addCandidate(cpp);

        pollingStation1.vote(voter1, ndc);
        pollingStation1.vote(voter2, ndc);
        pollingStation1.vote(voter3, npp);
        pollingStation1.vote(voter3, npp);
        pollingStation1.vote(voter3, ndc);
        pollingStation1.vote(voter1, ndc);
        pollingStation1.vote(voter2, cpp);
        pollingStation1.vote(voter1, cpp);
        pollingStation1.vote(voter1, npp);
        pollingStation1.vote(voter3, ndc);


        Voter voter4 = new Voter("Gladys", 20, "Female", "Ghanaian",
                "Chaang R/C JHS", "645562023AV");
        Voter voter5 = new Voter("Prosper", 18, "Female", "Ghanaian",
                "Chaang R/C JHS", "745562023AV");
        Voter voter6 = new Voter("Samson", 18, "male", "Ghanaian",
                "Chaang R/C JHS", "845562023AV");

        pollingStation2.addCandidate(ndc);
        pollingStation2.addCandidate(npp);
        pollingStation2.addCandidate(cpp);


        pollingStation2.vote(voter4, ndc);
        pollingStation2.vote(voter5, cpp);
        pollingStation2.vote(voter6, npp);
        pollingStation2.vote(voter4, ndc);
        pollingStation2.vote(voter6, cpp);
        pollingStation2.vote(voter1, cpp);
        pollingStation2.vote(voter2, ndc);
        pollingStation2.vote(voter1, cpp);
        pollingStation2.vote(voter1, npp);
        pollingStation2.vote(voter3, ndc);

        tema.addPollingStation(pollingStation2);
        takoradi.addPollingStation(pollingStation1);
        santa.addPollingStation(pollingStation2);

        tema.collatePollingResults();
        takoradi.collatePollingResults();
        santa.collatePollingResults();

        RegionalOffice grterAccra = new RegionalOffice("Accra", "Greater Accra");
        RegionalOffice eastern = new RegionalOffice("Eastern", "Eastern");
        grterAccra.addDistrict(tema);
        eastern.addDistrict(santa);
        grterAccra.addDistrict(takoradi);
        grterAccra.collateRegionalResults();
        eastern.collateRegionalResults();

        grterAccra.regionalResults();

        Headquaters headquaters = new Headquaters("EC Head Office", "Ghana");


        headquaters.addRegion(grterAccra);
        headquaters.addRegion(eastern);
        headquaters.collateHeadquatersResults();
    }
}

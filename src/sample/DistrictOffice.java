
package sample;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * District Office class
 * Collates results from polling stations
 */
public class DistrictOffice {
    //variables
    String name;
    String region;
    ArrayList<PollingStation> pollingStations = new ArrayList<>();
    ArrayList<Candidate> candidates = new ArrayList<>();
    HashMap<String, Integer> districtBallotBox = new HashMap<>();

    //Default constructor
    public DistrictOffice() {

    }

    /**
     * overloaded constructor
     * @param name- district name
     * @param region-region
     */
    public DistrictOffice(String name, String region) {
        this.name = name;
        this.region = region;
    }

    /**
     * getters
     * @return String-District name
     */
    public String getName() {
        return this.name;
    }

    public String getRegion() {
        return this.region;
    }

    public ArrayList<PollingStation> getPollingStations() {
        return this.pollingStations;
    }

    public HashMap<String, Integer> getDistrictBallotBox() {
        return this.districtBallotBox;
    }

    /**
     * Setters
     * @param name- value to set to
     */

    public void setName(String name) {
        this.name = name;
    }

    public void setPollingStations(ArrayList<PollingStation> pollingStations) {
        this.pollingStations = pollingStations;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public void setRegionalBallotBox(HashMap<String, Integer> regionalBallotBox) {
        this.districtBallotBox = regionalBallotBox;
    }


    /**
     * A method to add a new polling station
     * @param pollingStation- polling Station
     */
    public void addPollingStation(PollingStation pollingStation) {
        this.pollingStations.add(pollingStation);
        //initialize hasMap
        for (PollingStation pollingStation1 : this.getPollingStations()) {
            for (Candidate candidate : pollingStation1.getCandidates()) {
                this.districtBallotBox.put(candidate.getName(), 0);
            }

        }
    }


    /**
     * A method that removes a polling sation
     * @param pollingStation
     */
    public void removePollingStation(PollingStation pollingStation) {
        this.pollingStations.remove(pollingStation);
    }

    /**
     * This method collates results from all the polling stations under it
     */
    public void collatePollingResults() {
        for (PollingStation pollingStation : this.pollingStations) {
            for (Candidate candidate : pollingStation.getCandidates()) {


                int pollTotal = pollingStation.getCandidateResults(candidate);
                int districtTotal = this.districtBallotBox.get(candidate.getName());

                this.districtBallotBox.replace(candidate.getName(), pollTotal + districtTotal);
            }

        }

    }

    /**
     * Returns the overall disrtict results
     * @return- String of candidate name and results
     */
    public String districtResults() {
        String results = "";
        for (String key : this.getDistrictBallotBox().keySet()) {
            results += key + "\t      " + this.getDistrictBallotBox().get(key) + "\n";
        }
        return results;
    }
}

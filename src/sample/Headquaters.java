package sample;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * EC Headquarters
 */
public class Headquaters {
    //variables
    private String name;
    private String country;
    private String official;
    private ArrayList<RegionalOffice> regions = new ArrayList<>();
    //hashMap to store candidate names and their respective results
    private HashMap<String, Integer> headBallotBox = new HashMap<>();

    /**
     * Constructors
     */

    public Headquaters() {

    }

    public Headquaters(String name, String country) {
        this.name = name;
        this.country = country;

    }

    /**
     * Getters
     * @return String name
     */
    public String getName() {
        return this.name;
    }

    public String getNation() {
        return this.country;
    }

    public ArrayList<RegionalOffice> getRegions() {
        return this.regions;
    }

    public HashMap<String, Integer> getHeadBallotBox() {
        return this.headBallotBox;
    }

    /**
     * Setters
     * @param name- String name
     */

    public void setName(String name) {
        this.name = name;
    }

    public void setRegions(ArrayList<RegionalOffice> regions) {
        this.regions = regions;
    }

    public void setNation(String country) {
        this.country = country;
    }

    public void setHeadBallotBox(HashMap<String, Integer> headBallotBox) {
        this.headBallotBox = headBallotBox;
    }

    /**
     * This method adds a region to the headquarters
     * @param region
     */
    public void addRegion(RegionalOffice region) {
        this.regions.add(region);
        //initialize hashMap
        //n^3
        for (RegionalOffice reg : this.getRegions()) {
            for(DistrictOffice districtOffice :reg.getDistricts()){
                for(PollingStation pollingStation:districtOffice.getPollingStations()){
                    for(Candidate candidate:pollingStation.getCandidates()) {
                        this.headBallotBox.put(candidate.getName(), 0); //initialize HashMap
                    }
                }
            }
        }
    }


    //remove a region
    public void removeRegion(RegionalOffice region) {
        this.regions.remove(region);
    }

    /**
     * Collates Regional results
     */
    public void collateHeadquatersResults() {
        for (RegionalOffice regionalOffice : this.regions) {
            for (String candidate : regionalOffice.getRegionalBallotBox().keySet()) {

                int regionalTotal=regionalOffice.getRegionalBallotBox().get(candidate);//get candidate vote count
                int headTotal=this.headBallotBox.get(candidate); //get already stored vote count of candidate
                this.headBallotBox.replace(candidate,regionalTotal+headTotal);//update hashMap
            }

        }

    }

    /**
     * Displas National Results
     * @return -String display of candidates names and vote counts
     */
    public String headquatersResults(){
        String results="";
        for(String key: this.headBallotBox.keySet()){
            results+=key + "\t    "+this.headBallotBox.get(key)+"\n";
        }
        return results;
    }
}

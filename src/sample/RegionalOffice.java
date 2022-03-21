package sample;

import java.util.ArrayList;
import java.util.HashMap;

public class RegionalOffice {
    private String name;
    private String region;
    private Person official;
    ArrayList<DistrictOffice> districts = new ArrayList<>();
    HashMap<String, Integer> regionalBallotBox = new HashMap<>();


    public RegionalOffice() {

    }

    public RegionalOffice(String name, String region) {
        this.name = name;
        this.region = region;

    }

    //getters
    public String getName() {
        return this.name;
    }

    public String getRegion() {
        return this.region;
    }

    public ArrayList<DistrictOffice> getDistricts() {
        return this.districts;
    }

    public HashMap<String, Integer> getRegionalBallotBox() {
        return this.regionalBallotBox;
    }

    //setters

    public void setName(String name) {
        this.name = name;
    }

    public void setDistricts(ArrayList<DistrictOffice> districts) {
        this.districts = districts;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public void setRegionalBallotBox(HashMap<String, Integer> regionalBallotBox) {
        this.regionalBallotBox = regionalBallotBox;
    }

    //add a polling Station to a region
    public void addDistrict(DistrictOffice district) {
        this.districts.add(district);
        //initialize hashMap
        for (DistrictOffice d : this.getDistricts()) {
            for(PollingStation pollingStation :d.getPollingStations()){
                ArrayList<Integer> votes=new ArrayList<>();
                //this.regionalBallotBox.putAll(pollingStation.getBallotBox());
                for(Candidate candidate:pollingStation.getCandidates()){
                    this.regionalBallotBox.put(candidate.getName(),0);
                }
            }
        }
    }


    //remove a polling Station
    public void removeDistrict(DistrictOffice d) {
        this.districts.remove(d);
    }

    public void collateRegionalResults() {
//        for(int i=0;i<this.pollingStations.get(0).getCandidates().size();i++){
//            this.districtBallotBox.put(this.pollingStations.get(0).getCandidates().get(i).getName(),0);
//
//        }

        for (DistrictOffice district : this.districts) {
            for (String candidate : district.getDistrictBallotBox().keySet()) {


                int districtTotal=district.getDistrictBallotBox().get(candidate);
                int regionalTotal=this.regionalBallotBox.get(candidate);
                //System.out.println(this.regionalBallotBox.get(candidate.getName()));
                //int districtTotal = candidate.getVoteCount();

                //Rodney, 0
                this.regionalBallotBox.replace(candidate,districtTotal+regionalTotal);
            }

        }

    }
    public String regionalResults(){
        String results="";
        for(String key: this.regionalBallotBox.keySet()){
            results+=key + "\t    "+this.regionalBallotBox.get(key)+"\n";
        }
        return results;
    }
}

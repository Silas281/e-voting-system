package sample;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Polling Station class
 */
public class PollingStation {
    //variables
    String station_name;
    String district;
    String supervisor_name;
    ArrayList<Candidate>Candidates=new ArrayList<>();
    HashMap<String,Integer> ballotBox=new HashMap<>();


    /**
     * Constructors
     */
    public PollingStation(){

    }
    public PollingStation(String name,String location,String supervisor){
        station_name=name;
        district=location;
        supervisor_name=supervisor;
    }

    /**
     * getters
     * @return
     */
    public String getStation_name(){
        return this.station_name;
    }
    public String getLocation(){
        return this.district;
    }
    public String getSupervisor_name(){
        return this.supervisor_name;
    }

    public ArrayList<Candidate> getCandidates() {
        return this.Candidates;
    }

    public HashMap<String, Integer> getBallotBox() {
        return ballotBox;
    }

    /**
     * Setters
     * @param name-String name
     */
    public void setStation_name(String name){
        station_name=name;
    }

    public void setLocation(String location) {
        this.district = location;
    }

    public void setSupervisor_name(String supervisor_name) {
        this.supervisor_name = supervisor_name;
    }

    public void setBallotBox(HashMap<String, Integer> ballotBox) {
        this.ballotBox = ballotBox;
    }

    /**
     * Add/register and candidate
     * @param candidate-Candidate
     */
    public void addCandidate(Candidate candidate){
        this.Candidates.add(candidate);
        this.ballotBox.put(candidate.getName(), candidate.getVoteCount());

    }

    /**
     * Vote method
     * @param voter- Voter
     * @param candidate-V=Candidate to be voted for
     * @return- Boolean value of true if successfully voted and false otherwise
     */
    public boolean vote(Voter voter,Candidate candidate){
            if(!voter.getHas_voted()) { //check if voter has voted or not
                int voteCount = candidate.getVoteCount(); //get current votes of candidates
                int ballotCount = voteCount + 1;  //update vote count

                candidate.setVoteCount(ballotCount); //update candidate vote count
                this.ballotBox.replace(candidate.getName(), ballotCount);
                voter.setHas_voted();
            }
            return false; //voter not qualify to vote

    }

    /**
     * This method returns overall polling station results
     * @return
     */
    public String results(){
        String results="";
        for(String key: this.ballotBox.keySet()){
            results+=key + "\t    "+this.ballotBox.get(key)+"\n";
        }
        return results;
    }

    /**
     * get a given candidate results
     * @param candidate- Candidate
     * @return integer value of results
     */
    public int getCandidateResults(Candidate candidate){
        return this.ballotBox.get(candidate.getName());
    }


}


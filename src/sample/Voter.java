package sample;

/**
 * Voter.java
 *
 * Voter class which inherites the Person class
 */

public class Voter extends Person {
    private String voterID;
    private String pollingStation;
    private boolean has_voted=false;

    /**
     * Constructors
     */
    public Voter(){
        super();
    }
    public Voter(String name, int age,String gender,String nationality, String pollingStation,
                 String voterID){
        super(name,age,gender,nationality);
        this.pollingStation=pollingStation;
        this.voterID=voterID;
    }
    /**
     * Mutators
     */

    public void setPollingStation(String pollingStation){
        this.pollingStation=pollingStation;
    }

    public void setVoterID(String voterID) {
        this.voterID = voterID;
    }

    public void setHas_voted(){
        this.has_voted=true;
    }

    public String getPollingStation(){
        return this.pollingStation;
    }
    public String getVoterID(){
        return this.voterID;
    }
    public boolean getHas_voted(){
        return has_voted;
    }

    /**
     * Returns a ballot count when called
     * @return interger value of ballots count
     */
    public int ballotCount(){
        int count=0;
        return count+1; //increment count by 1
    }

    /**
     * This method overrides the toString method in the person class to diplay voter attributes
     * @return String of Voter attributes
     */
    @Override
    public String toString(){
        return "Name: "+this.getName()+"\n Age: "+this.getAge()+"\nGender: "+this.getGender()+"\nPolling Station: "
                +this.getPollingStation()+"\nVoter ID: "+this.getVoterID();
}
}


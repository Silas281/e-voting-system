
package sample;

/**
 * Candidate.java

 * Candidate class inherites Person class
 */

public class Candidate extends Person {
    //instance variables
    private String party;
    private int voteCount=0;
    private String pollingStation;
    private String voterID;
    private String position;

    /**
     * Constructors
     */
    public Candidate(){
      super();
    }
    public Candidate(String name,int age,String gender,String nationality,String constituency,String party,
                     String pollingStation,String voterID,String position){
        super(name,age,gender,nationality,constituency);
        this.party=party;
        this.pollingStation=pollingStation;
        this.voterID=voterID;
        this.position=position;
    }

    /**
     * Mutators
     */
    public void setParty(String party){
        this.party=party;
    }
    public void setPollingStation(String pollingStation){
        this.pollingStation=pollingStation;
    }
    public void setVoterID(String voterID){
        this.voterID=voterID;
    }
    public void setPosition(String position){
        this.position=position;
    }

    public void setVoteCount(int voteCount) {
        this.voteCount = voteCount;
    }

    /**
     * Accessors
     */
    public String getParty(){
        return this.party;
    }
    public String getPollingStation(){
        return this.pollingStation;
    }
    public String getVoterID(){
        return this.voterID;
    }
    public String getPosition(){
        return this.position;
    }

    public int getVoteCount() {
        return voteCount;
    }

    public int voteCount(){
        int count=0;
        return count;
    }

    /**
     * toString method to display Candidate attributes by overriding the toString from Person t
     * @return String attributes of candidate
     */
    @Override
    public String toString() {
        return "Name: " + this.getName() + "\n Age: " + this.getAge() + "\nGender: " + this.getGender() +
                "\nPolling Station: " + this.getPollingStation()
                + "\nVoter ID: "+ this.getVoterID()+"\nParty ticket: "+this.getParty()+"\nPosition: "+this.getPosition();
    }

}

package sample;

/**
 * ElectoralOfficial.java

 * Ec Official Class inherites Person class
 */


public class ElectoralOfficer extends Person{
    //Instance variables
    private String pollingStation;
    private String voterID;
    private String officialID;

    /**
     * Constructors
     */
    public ElectoralOfficer(){
        super();
    }
    public ElectoralOfficer(String name,int age,String gender,String nationality,
                            String pollingStation,String voterID,String officialID){
        super(name,age,gender,nationality);
        this.pollingStation=pollingStation;
        this.officialID=officialID;
        this.voterID=voterID;

    }
    /**
     * Mutators
     */

    public void setPollingStation(String pollingStation){
        this.pollingStation=pollingStation;
    }
    public void setVoterID(String voterID){
        this.voterID=voterID;
    }
    public void setOfficialID(String officialID){
        this.officialID=officialID;
    }

    /**
     * Accessors
     */

    public String getPollingStation(){
        return this.pollingStation;
    }
    public String getVoterID(){
        return this.voterID;
    }
    public String getOfficialID(){
        return this.officialID;
    }

    /**
     * Display Official's Details
     * @return String of Official's attributes
     */
    @Override
    public String toString() {
        return "Name: " + this.getName() + "\n Age: " + this.getAge() + "\nGender: " + this.getGender() +
                "\nPolling Station: " + this.getPollingStation()
                + "\nVoter ID: "+ this.getVoterID()+"\nOfficial ID: "+this.getOfficialID();
    }

}

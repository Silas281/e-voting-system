package sample;

/**
 * Person.java

 * A person class with some attributes of a Person
 */

public class Person {
    //instance variables
    private String name;
    private int age;
    private String gender;
    private String nationality;


    /**
     * Constructors
     */
    public Person(){}


    public Person(String name,int age,String gender,String nationality,String constituency){
        this.name=name;
        this.age=age;
        this.gender=gender;
        this.nationality=nationality;

    }
    public Person(String name,int age,String gender,String constituency){
        this.name=name;
        this.age=age;
        this.gender=gender;
        this.nationality="Ghana";

    }

    /**
     * Mutators
     */
    public void setName(String name){
        this.name=name;
    }
    public void setAge(int age){
        this.age=age;
    }
    public void setGender(String gender){
        this.gender=gender;
    }
    public void setNationality(String nationality){
        this.nationality=nationality;
    }


    /**
     * Accessors
     */
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    public String getGender(){
        return this.gender;
    }
    public String getNationality(){
        return this.nationality;
    }


    /**
     * Displays the attributes of a Person
     * @return String of attributes
     */
    public String toString(){
        return "Name: "+this.getName()+"\n Age: "+this.getAge()+"\nGender: "+this.getGender();
    }
}


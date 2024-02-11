package University.People;

import University.AbstractClasses.ListCoursesClass;
import University.Interfaces.modifyInfo;
import University.Interfaces.printInfo;

public class Guest extends ListCoursesClass implements printInfo, modifyInfo{
    public String name;
    public String email;
    protected String address;
    private int id;
    static int numOfGuests;
    final int schoolCode;
    
    public Guest(int coursesNum, String courseName, String name, String email, int schoolCode){
        super(coursesNum, courseName);
        this.name = name;
        this.email = email;
        this.schoolCode = schoolCode;
        numOfGuests++;
    }
    //Constructor overloading
    public Guest(int coursesNum, String courseName, String name, String email, String address, int schoolCode){
        super(coursesNum, courseName);
        this.name = name;
        this.email = email;
        this.address = address;
        this.schoolCode = schoolCode;
        numOfGuests++;
    }
    
    //Access to private variable
    public void setId(int id){
        this.id = id;
    }
    public int getId(){
        return this.id;
    }

    //Methods from interfaces
    public void printsInfo(){
        System.out.println("Prints name and email");
    }
    //method overload 
    public void printsInfo(int id){
        System.out.println("Prints name, email, and Id");
    } 
    public void modifiesInfo(){
        System.out.println("Modifies info");
    }

    //Method overwrite from extended class
    public void access(){
        System.out.println("Access to courses from Guest class.");
    }

    //Method from extended class
    public void listCourses() {
        System.out.println("Lists courses avaiable.");
    }
    
}

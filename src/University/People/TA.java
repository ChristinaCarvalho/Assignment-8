package University.People;

import University.AbstractClasses.CreateCourseClass;
import University.Interfaces.modifyInfo;
import University.Interfaces.printInfo;

public class TA extends CreateCourseClass implements printInfo, modifyInfo{
    public String name;
    public String email;
    protected String address;
    private int id;
    static int numOfTAs;
    final int schoolCode;
    
    public TA(int coursesNum, String courseName, String name, String email, int schoolCode){
        super(coursesNum, courseName);
        this.name = name;
        this.email = email;
        this.schoolCode = schoolCode;
        numOfTAs++;
    }
    //Constructor overload
    public TA(int coursesNum, String courseName, String name, String email, String address, int schoolCode){
        super(coursesNum, courseName);
        this.name = name;
        this.email = email;
        this.address = address;
        this.schoolCode = schoolCode;
        numOfTAs++;
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
    //Method overload
    public void printsInfo(int id){
        System.out.println("Prints name, email, and Id");
    } 
    public void modifiesInfo(){
        System.out.println("Modifies info");
    }

    //Method overwrite from extended class
    public void access(){
        System.out.println("Access to courses from TA class.");
    }

    //Method from extended class
    public void createCourse() {
        System.out.println("Teaching assistants can create courses.");
    }
    
}

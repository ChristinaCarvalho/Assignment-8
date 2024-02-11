package University.People;

import University.AbstractClasses.ViewGradesClass;
import University.Interfaces.modifyInfo;
import University.Interfaces.printInfo;

public class Alumni extends ViewGradesClass implements printInfo, modifyInfo {
    public String name;
    public String email;
    protected String address;
    private int id;
    static int numOfAlumnis;
    final int schoolCode;
    
    public Alumni(int coursesNum, String courseName, String name, String email, int schoolCode){
        super(coursesNum, courseName);
        this.name = name;
        this.email = email;
        this.schoolCode = schoolCode;
        numOfAlumnis++;
    }
    //Constructor overloading
    public Alumni(int coursesNum, String courseName, String name, String email, String address, int schoolCode){
        super(coursesNum, courseName);
        this.name = name;
        this.email = email;
        this.address = address;
        this.schoolCode = schoolCode;
        numOfAlumnis++;
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
        System.out.println("Access to courses from Alumni class.");
    }

    //Method from extended class
    public void viewGrades() {
        System.out.println("Alumni can view their grades.");
    }
    
}

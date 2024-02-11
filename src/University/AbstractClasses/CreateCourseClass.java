package University.AbstractClasses;

public abstract class CreateCourseClass {    
    public int coursesNum;
    protected String courseName;
    private int courseId;

    public CreateCourseClass(int coursesNum, String courseName){
        this.coursesNum = coursesNum;
        this.courseName = courseName;
    }
    //Constructor overload
    public CreateCourseClass(int coursesNum){
        this.coursesNum = coursesNum;
    }

    //Access to private variables
    public void setCourseId(int courseId){
        this.courseId = courseId;
    }
    public int getCourseId(int courseId){
        return this.courseId;
    }

    //Defining abstract class
    public abstract void createCourse();

    public void access(){
        System.out.println("Access to courses from CreateCourseClass");
    }
    //Method overload
    public void access(int courseId){
        System.out.println("Access to course using Id");
    }

}

package University.AbstractClasses;

public abstract class CourseRegisterClass {    
    public int coursesNum;
    protected String courseName;
    private int courseId;

    public CourseRegisterClass(int coursesNum, String courseName){
        this.coursesNum = coursesNum;
        this.courseName = courseName;
    }
    //Constructor overload
    public CourseRegisterClass(int coursesNum){
        this.coursesNum = coursesNum;
    }

    //Access to private variable
    public void setCourseId(int courseId){
        this.courseId = courseId;
    }
    public int getCourseId(int courseId){
        return this.courseId;
    }

    //Defining an abstract class
    public abstract void courseRegister();

    public void access(){
        System.out.println("Access to courses from CourseRegisterClass");
    }
    //Method overload
    public void access(int courseId){
        System.out.println("Access to course using Id");
    }

}

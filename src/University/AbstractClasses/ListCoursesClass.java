package University.AbstractClasses;

public abstract class ListCoursesClass {    
    public int coursesNum;
    protected String courseName;
    private int courseId;

    public ListCoursesClass(int coursesNum, String courseName){
        this.coursesNum = coursesNum;
        this.courseName = courseName;
    }
    //Constructor overload
    public ListCoursesClass(int coursesNum){
        this.coursesNum = coursesNum;
    }

    //Access to private variable
    public void setCourseId(int courseId){
        this.courseId = courseId;
    }
    public int getCourseId(int courseId){
        return this.courseId;
    }

    //Defining abstract method
    public abstract void listCourses();

    public void access(){
        System.out.println("Access to courses from ListCoursesClass");
    }
    //Method overload
    public void access(int courseId){
        System.out.println("Access to course using Id");
    }

}

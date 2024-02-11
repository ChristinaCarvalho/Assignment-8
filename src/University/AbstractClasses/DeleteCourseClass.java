package University.AbstractClasses;

public abstract class DeleteCourseClass {    
    public int coursesNum;
    protected String courseName;
    private int courseId;

    public DeleteCourseClass(int coursesNum, String courseName){
        this.coursesNum = coursesNum;
        this.courseName = courseName;
    }
    //Constructor overload
    public DeleteCourseClass(int coursesNum){
        this.coursesNum = coursesNum;
    }

    //Access to private variable
    public void setCourseId(int courseId){
        this.courseId = courseId;
    }
    public int getCourseId(int courseId){
        return this.courseId;
    }

    //Defining abstract class
    public abstract void deleteCourse();

    public void access(){
        System.out.println("Access to courses from DeleteCourseClass");
    }
    //Method overload
    public void access(int courseId){
        System.out.println("Access to course using Id");
    }

}

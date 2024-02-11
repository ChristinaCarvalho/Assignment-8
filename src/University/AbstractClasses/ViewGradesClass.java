package University.AbstractClasses;

public abstract class ViewGradesClass {    
    public int coursesNum;
    protected String courseName;
    private int courseId;

    public ViewGradesClass(int coursesNum, String courseName){
        this.coursesNum = coursesNum;
        this.courseName = courseName;
    }
    //Constructor overload
    public ViewGradesClass(int coursesNum){
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
    public abstract void viewGrades();

    public void access(){
        System.out.println("Access to courses from ViewGradesClass");
    }
    //Method overload
    public void access(int courseId){
        System.out.println("Access to course using Id");
    }

}

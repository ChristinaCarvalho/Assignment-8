package University;
import University.People.Alumni;
import University.People.Guest;
import University.People.Student;
import University.People.TA;
import University.People.Teacher;

public class School {
    public String schoolName;
    protected String address;
    private int schoolCode;

    public School(String schoolName){
        this.schoolName = schoolName;
    }
    //Constructor overload
    public School(String schoolName, String address){
        this.schoolName = schoolName;
        this.address = address;
    }

    //Access to private variables
    public void setSchoolCode(int schoolCode){
        this.schoolCode = schoolCode;
    }
    public int getSchoolCode(){
        return this.schoolCode;
    }

    public void access(){
        System.out.println("Access to school info");
    }
    //Method Overloading
    public void access(int schoolCode){
        System.out.println("Access to additional school info");
    }
    
    public static void main(String[] args) throws Exception {
        
        //Testing classes
        School oakland = new School("Oakland");
        oakland.setSchoolCode(12345);
        System.out.println(oakland.getSchoolCode());

        Student student = new Student(2, "Math","Christina","ccarvalho@oakland.edu","12345 street",123456);
        Student student2 = new Student(2, "Math","Christina","ccarvalho@oakland.edu",123456);
        student.setId(12345);
        System.out.println(student.getId());
        student.printsInfo();
        student.printsInfo(12345);
        student.modifiesInfo();
        student.access();
        student.courseRegister();
        
        Teacher teacher = new Teacher(2, "Math","Christina","ccarvalho@oakland.edu","12345 street",123456);
        Teacher teacher2 = new Teacher(2, "Math","Christina","ccarvalho@oakland.edu",123456);
        
        TA teachingAssistant = new TA(2, "Math","Christina","ccarvalho@oakland.edu","12345 street",123456);
        TA teachingAssistant2 = new TA(2, "Math","Christina","ccarvalho@oakland.edu",123456);

        Alumni alumni = new Alumni(2, "Math","Christina","ccarvalho@oakland.edu","12345 street",123456);
        Alumni alumni2 = new Alumni(2, "Math","Christina","ccarvalho@oakland.edu",123456);

        Guest guest = new Guest(2, "Math","Christina","ccarvalho@oakland.edu","12345 street",123456);
        Guest guest2 = new Guest(2, "Math","Christina","ccarvalho@oakland.edu",123456);
        
    }
}

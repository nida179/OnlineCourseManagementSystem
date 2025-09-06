public class Course {
    private String courseName;
    private int courseID;
    protected int credits;


    // Default Constructor
    public Course() {
        this.courseName ="null";
        this.courseID=0;
        this.credits=0;
    }
    // 2-Parameterized Constructor
    Course(String courseName , int courseID){
        this.courseName = courseName;
        this.courseID = courseID;
    }
    // 3-Parameterized Constructor
    Course(String courseName , int courseID , int credits){
        this.courseName = courseName;
        this.courseID = courseID;
        this.credits = credits;
    }
    public String getCourseName(){
        return courseName;
    }
    public int getCourseID(){
        return courseID;
    }
    public int getCredits(){
        return credits;
    }
    public void getDetails(){
        System.out.println("COURSE NAME IS: "+getCourseName());
        System.out.println("COURSE ID IS: "+getCourseID());
        System.out.println("COURSE CREDIT HOURS ARE: "+getCredits());
    }
}

public class Instructor extends Course{
    private String instructorName;
    protected String department;


    Instructor(String instructorName , String department){
        this.instructorName = instructorName;
        this.department = department;
    }

    Instructor(String courseName , int courseID , int credits , String instructorName , String department){
        super(courseName,courseID,credits);
        this.instructorName = instructorName;
        this.department = department;
    }
    public String getInstructorName(){
        return instructorName;
    }
    public String getDepart(){
        return department;
    }
    @Override
    public void getDetails(){
        super.getDetails();
        System.out.println("INSTRUCTOR NAME IS: "+getInstructorName());
        System.out.println("ASSOCIATED DEPARTMENT IS: "+getDepart());
    }
}

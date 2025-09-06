public class Main {
    public static void main(String[] args) {
        Course course = new Course("Calculus",898,3);
        Instructor instructor = new Instructor("Dr.Brand","Mathematics");
        Instructor instructor1 = new Instructor("Calculus",898,3,"Dr.Brand","Mathematics");

        course.getDetails();
        System.out.println(".............");
        instructor1.getDetails();
        System.out.println(".............");
    }
}
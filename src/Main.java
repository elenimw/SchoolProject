
public class Main {

    public static void main(String args[]) {

        Course course1 = new Course(1, "Math", "Algebra");
        School school1 = new School("AAU", "Texas", "Dallas", "District of Forest Ridge");

        //Student std1 = new Student(3, 25, "Sean" , "Xenos", sch course1);
        Student std2 = new Student(3, 25, "Sean" , "Xenos", course1,  'A', school1);

    Student.staticVar;
    std2.getStudentName();
    std2.getCourseInfo();
    std2.getStudnetSchoolInfo();
   // std2.getStudentGradeInfo();

    std2.getStudentConduct(30,70);









    }
}
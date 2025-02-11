import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        //Create scanner object to accept user input

        Scanner scanner = new Scanner(System.in);

//        System.out.println("Enter Student ID: ");
//        int studentId = scanner.nextInt();
//        scanner.nextLine();

        System.out.println("Enter Student First Name");
        String firstName = scanner.nextLine();

        System.out.println("Enter Student Last Name");
        String lastName = scanner.nextLine();

        System.out.println("Enter Student Age");
        int age = scanner.nextInt();
        scanner.nextLine();

//        System.out.println("Enter Course ID");
//        int courseId = scanner.nextInt();
//        scanner.nextLine();

        System.out.println("Enter Course Name");
        String courseName = scanner.nextLine();

        System.out.println("Enter Course Description");
        String courseDesc = scanner.nextLine();

        System.out.println("Enter Grade(A, B, C..): ");
        char grade = scanner.next().charAt(0);
        scanner.nextLine();


        System.out.println("Enter School Name");
        String schoolName = scanner.nextLine();


        System.out.println("Enter School District");
        String schoolDistrict = scanner.nextLine();

        scanner.close();

        //Create Course Object
        Course course1 = new Course(courseName, courseDesc);

        //Create School Object
        School school1 = new School(schoolName, schoolDistrict);

        //Create Student Object

        Student student = new Student(1, age, firstName , lastName,  school1, course1, grade);

       //Print Student Information

        System.out.println("Student Roaster");
        student.getStudentName();
        student.getCourseInfo();
        student.getStudentSchoolInfo();










    }
}
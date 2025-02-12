import java.util.List;
import java.util.Scanner;
import  java.util.Random;


public class Student {

    public static int staticVar = 10;


    private int student_id;
    private int age;
    private String firstName;
    private String lastName;
    private School school;
    private Course course;
    private char grade;

   //Constructor
    public Student(int student_id, int age, String firstName, String lastName, School school, Course course, char grade) {
        super();
        this.student_id = student_id;
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
        this.school = school;
        this.course = course;
        this.grade = grade;
    }




    public  Student(){

    }

    // Getter and Setter Methods

    public void getStudentName(){
        System.out.print(  "Student First Name : " + firstName + " " + "Studnet Last Name : " + lastName + " \n");
    }

    public void getCourseInfo(){
        System.out.println( "The student is taking  : " + course.getCourseName() + " -  " + course.getCourseDesc() + "\n"  );
    }

    public void getStudentSchoolInfo(){
        System.out.println("The Student goes to " + school.getSchoolName() + " and  Scored : "+  grade);

    }
    public void getStudentGradeInfo() {
        System.out.println("Student Scored : " + grade);

    }

    public void getStudentConduct(int a, int b){

        int c = ( a + b) / 2;

        if (c >= 50){
            System.out.println("The student is good");
        } else {
                System.out.println("The student is not good");
            }
        }


    public int getStudent_id() {
        return student_id;
    }


    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }


    public School getSchool() {
        return school;
    }


    public void setSchool(School school) {
        this.school = school;
    }


    public Course getCourse() {
        return course;
    }


    public void setCourse(Course course) {
        this.course = course;
    }


    public char getGrade() {
        return grade;
    }

    public int getAge() {
        return age;
    }


    public void setAge(int age) {
        this.age = age;
    }


    public String getFirstName() {

        return firstName;
    }


    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }


    public String getLastName() {
        return lastName;
    }


    public void setLastName(String lastName) {
        this.lastName = lastName;
    }



}

import java.util.List;

public class Course {

    private int course_id;
    private String courseName;
    private String courseDesc;
    private Student student;
    private List<String> courses;


    public Course (int course_id, String courseName, String courseDesc){

        this.course_id = course_id;
        this.courseName = courseName;
        this.courseDesc = courseDesc;

    }


    public int getCourse_id() {
        return course_id;
    }


    public void setCourse_id(int course_id) {
        this.course_id = course_id;
    }


    public String getCourseName() {
        return courseName;
    }


    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }


    public String getCourseDesc() {
        return courseDesc;
    }


    public void setCourseDesc(String courseDesc) {
        this.courseDesc = courseDesc;
    }

}


public class School {
    private String schoolName;
    private String schoolDistrict;

    public School (String schoolName, String schoolDistrict) {
        this.schoolName = schoolName;
        this.schoolDistrict = schoolDistrict;

    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getSchoolDistrict() {
        return schoolDistrict;
    }


    public void setSchoolDistrict(String schoolDistrict) {
        this.schoolDistrict = schoolDistrict;
    }

}

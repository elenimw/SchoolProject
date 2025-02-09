
public class School {
    private String schoolName;
    private String schoolLocation;
    private String city;
    private String schoolDistrict;
    private Student student;


    public School (String schoolName, String schoolLocation, String city, String schoolDistrict) {
        this.schoolName = schoolName;
        this.schoolLocation = schoolLocation;
        this.city= city;
        this.schoolDistrict = schoolDistrict;

    }

    public String getSchoolName() {
        return schoolName;
    }

    public String getSchoolLocation() {
        return schoolLocation;
    }


    public void setSchoolLocation(String schoolLocation) {
        this.schoolLocation = schoolLocation;
    }


    public String getCity() {
        return city;
    }


    public void setCity(String city) {
        this.city = city;
    }


    public String getSchoolDistrict() {
        return schoolDistrict;
    }


    public void setSchoolDistrict(String schoolDistrict) {
        this.schoolDistrict = schoolDistrict;
    }

}

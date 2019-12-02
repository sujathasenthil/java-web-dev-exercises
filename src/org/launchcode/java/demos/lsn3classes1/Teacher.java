package src.org.launchcode.java.demos.lsn3classes1;

public class Teacher {
    //firstName, lastName, subject, and yearsTeaching
    private String fName;
    private String lName;
    private int yearsTeaching;
    private String subjectHandled;
    public Teacher(String fName,String lName,int yearsTeaching,String subjectHandled){
        this.fName=fName;
        this.lName=lName;
        this.yearsTeaching=yearsTeaching;
        this.subjectHandled=subjectHandled;
    }
    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }
    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }
    public int getyearsTeaching() {
        return yearsTeaching;
    }

    public void setYearsTeaching(int yearsTeaching) {
        this.yearsTeaching = yearsTeaching;
    }
    public String getSubjectHandled() {
        return subjectHandled;
    }

    public void setSubjectHandled(String subjectHandled) {
        this.subjectHandled = subjectHandled;
    }
}

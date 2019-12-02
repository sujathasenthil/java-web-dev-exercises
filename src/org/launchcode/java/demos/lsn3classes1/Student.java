package org.launchcode.java.demos.lsn3classes1;

// Start working here with your Student class.
// To instantiate the Student class, add your code to the main in the file, SchoolPractice.

public class Student {

    private String name;
    private int studentId;
    private static int nextStudentId = 1;
    private int numberOfCredits = 0;
    private double gpa = 0.0;
    public Student(String name) {
        this(name, nextStudentId);
        this.numberOfCredits=numberOfCredits;
        nextStudentId++;
    }
    public Student(String name,int studentId,int numberOfCredits, double gpa){
        this.name=name;
        this.studentId=studentId;
        this.numberOfCredits=numberOfCredits;
        this.gpa=gpa;
    }
    public Student(String name, int studentId){
        this.name=name;
        this.studentId=studentId;
        this.numberOfCredits=1;
        this.gpa=4;
    }
    public String getName(){
        return name;
    }
    public void setName(String aName){
        name=aName;
    }
    private int getStudentId(){
        return studentId;
    }
    private void setStudentId(int aStudentId){
        studentId=aStudentId;
    }
    public int getNumberOfCredits(){
        return numberOfCredits;
    }
    public void setNumberOfCredits(int aNumberOfCredits){
        numberOfCredits=aNumberOfCredits;
    }
    public double getGPA(){
        return gpa;
    }
    public void setGPA(double aGPA) {
        gpa=aGPA;
    }
}
/*


    private String name;
    private int studentId;
    private int numberOfCredits = 0;
    private double gpa = 0.0;

    public Student (String name, int studentId, int numberOfCredits, double gpa) {
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
    }

    public Student(String name, int studentId) {
        this(name, studentId, 0, 0);
    }

    public Student(String name) {
        this(name, nextStudentId);
        nextStudentId++;
    }

    public String studentInfo() {
        return (this.name + " has a GPA of: " + this.gpa);
    }


     //TODO: Uncomment and complete the getGradeLevel method here:
//    public String getGradeLevel() {
//        // Determine the grade level of the student based on numberOfCredits
//    }

    // TODO: Complete the addGrade method.
    public void addGrade(int courseCredits, double grade) {
        // Update the appropriate fields: numberOfCredits, gpa
    }

    // TODO: Add your custom 'toString' method here. Make sure it returns a well-formatted String rather
    //  than just the class fields.

    // TODO: Add your custom 'equals' method here. Consider which fields should match in order to call two
    //  Student objects equal.

    public String getName() {
        return name;
    }

    public int getStudentId() {
        return studentId;
    }

    public int getNumberOfCredits() {
        return numberOfCredits;
    }

    public double getGpa() {
        return gpa;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    private void setNumberOfCredits(int numberOfCredits) {
        this.numberOfCredits = numberOfCredits;
    }

    public static void main(String[] args) {
        Student sally = new Student("Sally",1,1,4.0);
        System.out.println("The Student class works! " + sally.getName() + " is a student!");
        System.out.println(sally);
        sally.addGrade(12, 3.5);
        System.out.println(sally);
        sally.addGrade(25, 3.8);
        System.out.println(sally);
    }
}

 */
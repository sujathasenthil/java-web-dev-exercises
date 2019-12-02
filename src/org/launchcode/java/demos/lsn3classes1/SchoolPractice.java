package org.launchcode.java.demos.lsn3classes1;

import src.org.launchcode.java.demos.lsn3classes1.Teacher;

public class SchoolPractice {
    public static void main(String[] args) {
        // Instantiate your Student class for part 2 here!
        org.launchcode.java.demos.lsn3classes1.Student stu =new org.launchcode.java.demos.lsn3classes1.Student("Sai",1);
        stu.setName("Ram");

        System.out.println("Student Name:"+stu.getName()+"Student No Of Credits: "+stu.getNumberOfCredits()+"Student GPA: "+stu.getGPA());
        Teacher tcher=new Teacher("Varshishta","Munivar",3,"maths");
//        tcher.setfName("Vashishta");
//        tcher.setlName("Munivar");
//        tcher.setYearsTeaching(3);
//        tcher.setSubjectHandled("maths");

    }
}

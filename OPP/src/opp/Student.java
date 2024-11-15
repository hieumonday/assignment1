package opp;


import java.util.Date;
import java.util.Scanner;

public class Student {

    String id;
    String fullName;
    Date dateOfBirth;
    String major;
    float gpa;
    public String getStudentId() {
        return id;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }



    public Student(String i, String n, Date d, String m, float g) {
        id = i;
        fullName = n;
        dateOfBirth = d;
        major = m;
        gpa = g;
    }

    void displayInformation() {
        System.out.println("Student ID: " + id);
        System.out.println("Full Name: " + fullName);
        System.out.println("Date of Birth: " + dateOfBirth);
        System.out.println("Major: " + major);
        System.out.println("GPA: " + gpa);
    }

    void enterStudentInfor() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter id:");
        id = sc.nextLine();
        System.out.println("enter full name:");
        fullName = sc.nextLine();
        System.out.print("Enter Date of Birth (yyyy-mm-dd): ");
        dateOfBirth = java.sql.Date.valueOf(sc.nextLine());
        System.out.println("enter major:");
        major = sc.nextLine();
        System.out.println("enter gpa:");
        gpa = sc.nextFloat();
    }

    
}

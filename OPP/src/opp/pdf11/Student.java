
package opp.pdf11;

import java.util.Date;

public class Student extends Person {
    private double gpa;
    private double tuitionFee;
    public Student(String id, String name, Date dateOfBirth, double gpa, double tuitionFee) {
        super(id, name, dateOfBirth);
        this.gpa = gpa;
        this.tuitionFee = tuitionFee;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public double getTuitionFee() {
        return tuitionFee;
    }

    public void setTuitionFee(double tuitionFee) {
        this.tuitionFee = tuitionFee;
    }
    
    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println("gpa:"+ gpa);
        System.out.println("tuition fee:"+ tuitionFee);
    }
    @Override
    public double calculateIncome() {
        double income = getTuitionFee();
        if(getGpa() > 3.5){
             income *= 0.5 ;
        }
        return income;
    }
    
}

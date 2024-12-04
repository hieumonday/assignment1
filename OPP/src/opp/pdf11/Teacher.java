
package opp.pdf11;

import java.util.Date;

public class Teacher extends Person {
    private int numberOfClasses;
    private double baseSalary;
    public Teacher(String id, String name, Date dateOfBirth,int numberOfClasses,double baseSalary) {
        super(id, name, dateOfBirth);
        this.baseSalary = baseSalary;
        this.numberOfClasses = numberOfClasses;
    }

    public int getNumberOfClasses() {
        return numberOfClasses;
    }

    public void setNumberOfClasses(int numberOfClasses) {
        this.numberOfClasses = numberOfClasses;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }
    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println("number of classes:"+ numberOfClasses);
        System.out.println("base salary:"+ baseSalary);
        System.out.println("income:"+ calculateIncome());
    }
    @Override
    public double calculateIncome() {
       double income;
       income = getNumberOfClasses() * getBaseSalary();
        return income;
    }
    
}

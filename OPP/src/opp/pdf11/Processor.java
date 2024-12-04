package opp.pdf11;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Scanner;

public class Processor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PersonList personList = new PersonList();
        while (true) {
            System.out.println("Options:");
            System.out.println("1. Add a new student (Student)");
            System.out.println("2. Add a new teacher (Teacher)");
            System.out.println("3. Update person by id");
            System.out.println("4. Delete person by id");
            System.out.println("5. Find person by id");
            System.out.println("6. Display all persons");
            System.out.println("7. Find the top 3 students with the highest GPA");
            System.out.println("8. Find the teacher with the highest income");
            System.out.println("9. Exit");

            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.println("Enter student details:");
                    System.out.print("ID: ");
                    String studentId = sc.nextLine();
                    System.out.print("Name: ");
                    String studentName = sc.nextLine();
                    System.out.print("Date of Birth (dd/MM/yyyy): ");
                    String studentDob = sc.nextLine();
                    System.out.print("GPA: ");
                    double gpa = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Tuition Fee: ");
                    double tuitionFee = sc.nextDouble();
                    sc.nextLine();
                    try {
                        Student student = new Student(studentId, studentName, new SimpleDateFormat("dd/MM/yyyy").parse(studentDob), gpa, tuitionFee);
                        personList.addPerson(student);
                        System.out.println("Student added successfully.");
                    } catch (ParseException e) {
                        System.out.println("Invalid date format. Please try again.");
                    }
                    break;
                case 2:
                    System.out.println("Enter teacher details:");
                    System.out.print("ID: ");
                    String teacherId = sc.nextLine();
                    System.out.print("Name: ");
                    String teacherName = sc.nextLine();
                    System.out.print("Date of Birth (dd/MM/yyyy): ");
                    String teacherDob = sc.nextLine();
                    System.out.print("Number of Classes: ");
                    int numberOfClasses = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Base Salary: ");
                    double baseSalary = sc.nextDouble();
                    sc.nextLine();
                    try {
                        Teacher teacher = new Teacher(teacherId, teacherName, new SimpleDateFormat("dd/MM/yyyy").parse(teacherDob), numberOfClasses, baseSalary);
                        personList.addPerson(teacher);
                        System.out.println("Teacher added successfully.");
                    } catch (ParseException e) {
                        System.out.println("Invalid date format. Please try again.");
                    }
                    break;
                case 3:
                    System.out.print("Enter ID of person to update: ");
                    String updateId = sc.nextLine();
                    try {
                        if (personList.updatePersonById(updateId, sc)) {
                            System.out.println("Person updated successfully.");
                        } else {
                            System.out.println("Person not found.");
                        }
                    } catch (ParseException e) {
                        System.out.println("Invalid input. Please try again.");
                    }
                    break;
                case 4:
                    System.out.print("Enter ID of person to delete: ");
                    String deleteId = sc.nextLine();
                    if (personList.deletePersonById(deleteId)) {
                        System.out.println("Person deleted successfully.");
                    } else {
                        System.out.println("Person not found.");
                    }
                    break;
                case 5:
                    System.out.print("Enter ID of person to find: ");
                    String findId = sc.nextLine();
                    Person foundPerson = personList.findPersonById(findId);
                    if (foundPerson != null) {
                        foundPerson.displayDetails();
                    } else {
                        System.out.println("Person not found.");
                    }
                    break;
                case 6:
                    personList.displayAll();
                    break;
                case 7:
                    List<Student> topStudents = personList.findTop3Students();
                    System.out.println("Top 3 students with the highest GPA:");
                    for (Student student : topStudents) {
                        student.displayDetails();
                    }
                    break;
                case 8:
                    Teacher topTeacher = personList.findTeacherWithHighestIncome();
                    if (topTeacher != null) {
                        System.out.println("Teacher with the highest income:");
                        topTeacher.displayDetails();
                    } else {
                        System.out.println("No teacher found.");
                    }
                    break;
                case 9:
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }
}

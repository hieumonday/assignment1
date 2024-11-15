package opp;

import java.util.Scanner;

public class proceesor {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        StudentList st = new StudentList();
        boolean run = true;
        while (run) {
            System.out.println("1. Enter information for n students");
            System.out.println("2. Display all students");
            System.out.println("3. Find student by ID");
            System.out.println("4. Delete student by ID");
            System.out.println("5. Edit student by ID");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter the number of students to add: ");
                    int n = sc.nextInt();
                    sc.nextLine(); // Consume newline
                    st.addStudent(n);
                    break;
                case 2:
                    st.displayAllStudent();
                    break;
                case 3:
                    System.out.print("Enter Student ID to find: ");
                    String findId = sc.nextLine();
                    Student foundStudent = st.FindStudentById(findId);
                    if (foundStudent != null) {
                        foundStudent.displayInformation();
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;
                case 4:
                    System.out.print("Enter Student ID to delete: ");
                    String deleteId = sc.nextLine();
                    if (st.deleteStudentById(deleteId)) {
                        System.out.println("Student deleted successfully.");
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;
                case 5:
                    System.out.print("Enter Student ID to edit: ");
                    String editId = sc.nextLine();
                    if (st.editStudentById(editId)) {
                        System.out.println("Student information updated.");
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;
                case 6:
                    run = false;
                    break;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
        sc.close();
    }
}

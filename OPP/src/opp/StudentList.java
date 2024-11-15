package opp;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentList {

    private ArrayList<Student> st = new ArrayList<>();

    public void addStudent(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("enter information for student" + (i + 1) + ":");
            Student newStudent = new Student(null, null, null, null, 0);//Khởi tạo đối tượng student mới
            newStudent.enterStudentInfor();
            st.add(newStudent);
        }
    }

    public void displayAllStudent() {
        for (Student student : st) {
            student.displayInformation();
        }
    }

    public Student FindStudentById(String findId) {
        for (Student student : st) {
            if (student.getStudentId().equals(findId));
            return student;// trả về student nếu tìm thấy
        }
        return null;
    }

    public boolean deleteStudentById(String deleteId) {
        Student student = FindStudentById(deleteId);
        if (student != null) {
            st.remove(student);
            return true;
        }
        return false;
    }

    public boolean editStudentById(String editId) {
        Student student = FindStudentById(editId);
        if (student != null) {
            Scanner sc = new Scanner(System.in);
            System.out.print(("enter new full name:"));
            student.setFullName(sc.nextLine());
            System.out.println("enter new date of birth(yyyy-mm-dd):");
            student.setDateOfBirth(java.sql.Date.valueOf(sc.nextLine()));
            System.out.println("enter new major:");
            student.setMajor(sc.nextLine());
            System.out.println("enter new gpa:");
            student.setGpa(sc.nextFloat());
            return true;
        }
        return false;
    }

}


package opp.pdf11;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;


public class PersonList {
    ArrayList<Person> personList;
    SimpleDateFormat dateFormat = new SimpleDateFormat("dd/mm/yyyy");
    public PersonList(){
        this.personList = new ArrayList();
    }
    public void addPerson(Person person){
        personList.add(person);
    }
    public boolean updatePersonById(String id, Scanner sc) throws ParseException{
       for(Person person : personList){
           if(person.getId().equals(id)){
               try{
               System.out.println("enter new name:");
               String name = sc.nextLine();
               System.out.println("enter new date of birth:");
               Date dateOfBirth = dateFormat.parse(sc.nextLine());
               person.setDateOfBirth(dateOfBirth);
               person.setId(id);
               person.setName(name);
               if(person instanceof Student){
                   System.out.println("enter new gpa:");
                   int gpa = sc.nextInt();
                   sc.nextLine();
                   System.out.println("enter new tuition fee:");
                   double tuitionFee = sc.nextDouble();
                   ((Student) person).setGpa(gpa);
                   ((Student) person).setTuitionFee(tuitionFee);    
               }else if(person instanceof Teacher){
                   System.out.println("enter new number of classes:");
                   int numberOfClasses = sc.nextInt();
                   sc.nextLine();
                   System.out.println("enter new base salary:");
                   double baseSalary = sc.nextDouble();
                   sc.nextLine();
                   ((Teacher)person).setBaseSalary(baseSalary);
                   ((Teacher)person).setNumberOfClasses(numberOfClasses);
               }
               }catch (ParseException e){
                   System.out.println("please enter again");
               }
               return true;
           }
       }
        return false;
    }
    public boolean deletePersonById(String id){
        for(Person person : personList){
            if(person.getId().equals(id)){
                personList.remove(person);
            }
            return true;
        }
        return false;
    }
    public Person findPersonById(String id){
        for(Person person : personList){
            if(person.getId().equals(id)){
                person.displayDetails();
                return person;
            }            
        }
        return null;
    }
    public void displayAll(){
        for(Person person : personList){
            person.displayDetails();
        }
    }
    public List<Student> findTop3Students() {
    List<Student> students = new ArrayList<>();
    for (Person person : personList) {
        if (person instanceof Student) {
            students.add((Student) person);
        }
    }
    students.sort((s1, s2) -> Double.compare(s2.getGpa(), s1.getGpa()));
    return students.size() > 3 ? students.subList(0, 3) : students;
}

   public Teacher findTeacherWithHighestIncome() {
    Teacher highestIncomeTeacher = null;
    for (Person person : personList) {
        if (person instanceof Teacher) {
            Teacher teacher = (Teacher) person;
            if (highestIncomeTeacher == null || teacher.calculateIncome()> highestIncomeTeacher.calculateIncome()) {
                highestIncomeTeacher = teacher;
            }
        }
    }
    return highestIncomeTeacher;
}

  public List<Student> findStudentsWithScholarships() {
    List<Student> scholarshipStudents = new ArrayList<>();
    for (Person person : personList) {
        if (person instanceof Student) {
            Student student = (Student) person;
            if (student.getGpa() > 3.5) {
                scholarshipStudents.add(student);
            }
        }
    }
    return scholarshipStudents;
}



}


package opp.pdf11;

import java.util.Date;

public abstract class Person implements IPerson {
    private String id;
    private String name;
    private Date dateOfBirth;
    public Person(String id,String name, Date dateOfBirth){
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    
    @Override
    public void displayDetails(){
        System.out.println("id:"+ id); 
        System.out.println("name:"+ name);
        System.out.println("date of birth:"+ dateOfBirth);
    }
}

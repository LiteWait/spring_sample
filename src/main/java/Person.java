package demo;
 
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
 
@Entity
public class Person {
 
    //
    // Decorate this to get autoincrement "id" field. ALL tables should have this
    //
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
 
    //
    // A couple of fields
    //
    private String firstName;
    private String lastName;

    //
    // Always need a default constructor
    //
    public Person() {
    }

    //
    // Only needed since we create records when Spring boots to have a few records
    //
    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
 
    //
    // getters and setters for every property
    //
    public String getFirstName() {
        return firstName;
    }
 
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
 
    public String getLastName() {
        return lastName;
    }
 
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}

package demo;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
 
@SpringBootApplication
public class Application implements CommandLineRunner {
 
    //
    // This is only used so we can add in some data, note this property is injected by Spring
    //
    @Autowired
    PersonRepository personRepository;

    //
    // Needed this is what starts Spring running
    //
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    //
    // This isn't needed, but this gives us some data to start each time we run
    //
    @Override
    public void run(String... args) throws Exception {
        personRepository.deleteAll();
        personRepository.save(new Person("Jack", "Smith"));
        personRepository.save(new Person("Adam", "Johnson"));
        personRepository.save(new Person("Kim", "Smith"));
        personRepository.save(new Person("David", "Williams"));
        personRepository.save(new Person("Peter", "Davis"));
    }
}

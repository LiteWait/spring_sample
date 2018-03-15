package demo;
 
import java.util.List;
 
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
 
//
// Fucking amazing what you get with this, define an entity, change Person to whatever and you are done !!!!!
//
@RepositoryRestResource
public interface PersonRepository extends CrudRepository<Person, Long> {   //  <----- Just rename Person !!!!
 
}

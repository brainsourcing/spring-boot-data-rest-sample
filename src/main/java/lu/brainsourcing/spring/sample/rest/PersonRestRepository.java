package lu.brainsourcing.spring.sample.rest;

import lu.brainsourcing.spring.sample.domain.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Created by laurent on 28/02/2016.
 */
@RepositoryRestResource
public interface PersonRestRepository extends CrudRepository<Person, Long> {
    Person findByLastName(@Param("lastName")String lastName);
}

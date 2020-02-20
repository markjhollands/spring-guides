package com.example.accessingdatarest;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

// @RepositoryRestResource is not required for a repository to be exported.
// It is used only to change the export details, such as using /people instead of the default value of /persons.
@RepositoryRestResource(collectionResourceRel = "people", path = "people")
public interface PersonRepository extends PagingAndSortingRepository<Person, Long> {

  // Here you have defined a custom query to retrieve a list of Person objects based on the lastNam
  List<Person> findByLastName(@Param("name") String name);

}
package moodimp.moodmp;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@Repository
@RepositoryRestResource(path ="journals", collectionResourceRel = "journals")
public interface JournalRepository extends PagingAndSortingRepository<Journal, Integer>{

  Journal getById(Integer id);




}

package moodimp.moodmp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
public class JournalService {


    @Autowired
    JournalRepository journalRepository;

   public Journal getById(Integer id){
       return journalRepository.getById(id);
   }


   public Iterable<Journal> getAll(){
       return journalRepository.findAll();
   }
   public Journal createJournal(Journal newJournal){
       return journalRepository.save(newJournal);
   }
}

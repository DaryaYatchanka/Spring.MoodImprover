package moodimp.moodmp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
public class JournalController {



   private JournalService journalService;

    @Autowired
    public JournalController(JournalService journalService){
        this.journalService = journalService;
    }

    @GetMapping("/journals/{id}")
    public Journal findById(@PathVariable Integer id) {
       return journalService.getById(id);
    }

    @GetMapping("/journals")
    public Iterable<Journal> findAll(){
       return journalService.getAll();
    }

    @PostMapping("/journals")
    public Journal createJournal(@RequestBody Journal newJournal){
        return this.journalService.createJournal(newJournal);
    }






}

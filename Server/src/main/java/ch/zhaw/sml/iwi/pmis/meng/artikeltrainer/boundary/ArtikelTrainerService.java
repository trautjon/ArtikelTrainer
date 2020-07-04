package ch.zhaw.sml.iwi.pmis.meng.artikeltrainer.boundary;

import java.util.Collections;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import ch.zhaw.sml.iwi.pmis.meng.artikeltrainer.model.Set;
import ch.zhaw.sml.iwi.pmis.meng.artikeltrainer.model.Wort;
import ch.zhaw.sml.iwi.pmis.meng.artikeltrainer.repository.SetRepository;
import ch.zhaw.sml.iwi.pmis.meng.artikeltrainer.repository.WortRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Transactional
@RestController
public class ArtikelTrainerService {

    @Autowired
    private WortRepository wortRepository;
    @Autowired
    private SetRepository setRepository;

    @CrossOrigin(origins = "http://localhost:8100") // Um den Cross Origin Fehler zu vermeiden
    @PostMapping(value = "/set/{id}")
    public ResponseEntity<Set> getSet(@PathVariable Long id) {
        Set set = setRepository.findById(id).get();
        set.setFinished(false);
        setRepository.save(set);
        Collections.shuffle(set.getWoerter());
        return new ResponseEntity<Set>(set, HttpStatus.OK);
    }

    @CrossOrigin(origins = "http://localhost:8100")
    @PostMapping(value="/addSet/{setName}")
    public ResponseEntity<List<Wort>> setSet(@PathVariable String setName, @RequestBody List<Wort> woerterListe) {
        Set newSet = new Set();
        newSet.setName(setName);
        for (Wort wort : woerterListe) {
            wort.setId(null);
            wortRepository.save(wort);
            newSet.getWoerter().add(wort);
        }
        setRepository.save(newSet);
        return new ResponseEntity<List<Wort>>(newSet.getWoerter(), HttpStatus.OK);
    }
   
    @CrossOrigin(origins = "http://localhost:8100")
    @GetMapping(value="/setsNotFinished")
    public ResponseEntity<List<Set>> getSetsNotFinished() {
        List<Set> setsNotFinished = setRepository.findByFinishedFalse();
        return new ResponseEntity<List<Set>>(setsNotFinished, HttpStatus.OK);
    }
   

    @CrossOrigin(origins = "http://localhost:8100")
    @GetMapping(value="/setsFinished")
    public ResponseEntity<List<Set>> getSetsFinished() {
        List<Set> setsFiniished = setRepository.findByFinishedTrue();
        return new ResponseEntity<List<Set>>(setsFiniished, HttpStatus.OK);
    }
    
    @CrossOrigin(origins = "http://localhost:8100")
    @PostMapping(value="/set/{id}/finished")
    public ResponseEntity<Set> getSetsFinished(@PathVariable Long id) {
        Set set = setRepository.findById(id).get();
        set.setFinished(true);
        setRepository.save(set);
        return new ResponseEntity<Set>(set, HttpStatus.OK);
    }

}

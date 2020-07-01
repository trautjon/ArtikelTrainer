package ch.zhaw.sml.iwi.pmis.meng.artikeltrainer.boundary;

import java.util.Collections;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import ch.zhaw.sml.iwi.pmis.meng.artikeltrainer.model.Set;
import ch.zhaw.sml.iwi.pmis.meng.artikeltrainer.model.Wort;
import ch.zhaw.sml.iwi.pmis.meng.artikeltrainer.repository.ArtikelRepository;
import ch.zhaw.sml.iwi.pmis.meng.artikeltrainer.repository.SetRepository;
import ch.zhaw.sml.iwi.pmis.meng.artikeltrainer.repository.WortRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;





@Transactional
@RestController
public class ArtikelTrainerService {

    @Autowired
    private ArtikelRepository artikelRepository;
    @Autowired
    private WortRepository wortRepository;
    @Autowired
    private SetRepository setRepository;

    @GetMapping(value="/set/{id}")
    public ResponseEntity<List<Wort>> getSet(@PathVariable Long id) {
        List<Wort> woerterVonSet = wortRepository.findByWortSetId(id);
        Collections.shuffle(woerterVonSet);
        return new ResponseEntity<List<Wort>>(woerterVonSet, HttpStatus.OK);
    }

    @PostMapping(value="/addSet/{setName}")
    public ResponseEntity<List<Wort>> setSet(@PathVariable String setName, @RequestBody List<Wort> woerterListe) {
        Set newSet = new Set();
        newSet.setName(setName);
        setRepository.save(newSet);
        for (Wort wort : woerterListe) {
            wort.setId(null);
            wort.setWortSet(newSet);
            wortRepository.save(wort);
        }
        return new ResponseEntity<List<Wort>>(woerterListe, HttpStatus.OK);
    }

    @GetMapping(value="/showAllSets")
    public ResponseEntity<List<Set>> getAllSets() {
        List<Set> sets = setRepository.findAll();
        return new ResponseEntity<List<Set>>(sets, HttpStatus.OK);
    }
    
        
    
}

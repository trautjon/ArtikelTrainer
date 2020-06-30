package ch.zhaw.sml.iwi.pmis.meng.artikeltrainer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import ch.zhaw.sml.iwi.pmis.meng.artikeltrainer.model.Artikel;
import ch.zhaw.sml.iwi.pmis.meng.artikeltrainer.model.Set;
import ch.zhaw.sml.iwi.pmis.meng.artikeltrainer.model.Wort;
import ch.zhaw.sml.iwi.pmis.meng.artikeltrainer.repository.ArtikelRepository;
import ch.zhaw.sml.iwi.pmis.meng.artikeltrainer.repository.SetRepository;
import ch.zhaw.sml.iwi.pmis.meng.artikeltrainer.repository.WortRepository;

@SpringBootApplication
public class ArtikelTrainer {
    public static void main(String[] args) {
        SpringApplication.run(ArtikelTrainer.class, args);
    }
  
    @Autowired
    private ArtikelRepository artikelRepository;
    @Autowired
    private WortRepository wortRepository;
    @Autowired
    private SetRepository setRepository;



    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        return args -> {
            //TODO: dummy Data
            Set s1 = new Set();
            s1.setName("Fahrzeuge");
            Artikel der = new Artikel();
            der.setArtikel("der");
            Artikel die = new Artikel();
            die.setArtikel("die");
            Artikel das = new Artikel();
            das.setArtikel("das");
            artikelRepository.save(das);
            setRepository.save(s1);
            Wort w1 = new Wort();
            w1.setWort("Auto");
            w1.setWortArtikel(das);
            w1.setWortSet(s1);
            wortRepository.save(w1);
            
            

            
        };
    }
    
}

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
import ch.zhaw.sml.iwi.pmis.meng.artikeltrainer.repository.SetRepository;
import ch.zhaw.sml.iwi.pmis.meng.artikeltrainer.repository.WortRepository;

@SpringBootApplication
public class ArtikelTrainer {
    public static void main(String[] args) {
        SpringApplication.run(ArtikelTrainer.class, args);
    }

    @Autowired
    private WortRepository wortRepository;
    @Autowired
    private SetRepository setRepository;


    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        return args -> {

            Set s1 = new Set();
            s1.setName("Bewegungsmittel");
            setRepository.save(s1);
            Wort w1 = new Wort();
            w1.setWort("Auto");
            w1.setArtikel(Artikel.DAS);
            wortRepository.save(w1);
            w1.setId(null);
            w1.setWort("Flugzeug");
            w1.setArtikel(Artikel.DAS);
            
            wortRepository.save(w1);
            w1.setId(null);
            w1.setWort("Zug");
            w1.setArtikel(Artikel.DER);
            
            wortRepository.save(w1);
            w1.setId(null);
            w1.setWort("Fahrrad");
            w1.setArtikel(Artikel.DAS);
            
            wortRepository.save(w1);

            Set s2 = new Set();
            s2.setName("Tiere");
            setRepository.save(s2);
            w1.setId(null);
            w1.setWort("Hund");
            w1.setArtikel(Artikel.DER);
            
            wortRepository.save(w1);
            w1.setId(null);
            w1.setWort("Katze");
            w1.setArtikel(Artikel.DIE);
            
            wortRepository.save(w1);
            w1.setId(null);
            w1.setWort("Kuh");
            w1.setArtikel(Artikel.DIE);
            
            wortRepository.save(w1);
            w1.setId(null);
            w1.setWort("Huhn");
            w1.setArtikel(Artikel.DAS);
            
            wortRepository.save(w1);

            Set s3 = new Set();
            s3.setName("Landschaft");
            setRepository.save(s3);
            w1.setId(null);
            w1.setWort("Hügel");
            w1.setArtikel(Artikel.DER);
            
            wortRepository.save(w1);
            w1.setId(null);
            w1.setWort("Wolke");
            w1.setArtikel(Artikel.DIE);
            
            wortRepository.save(w1);
            w1.setId(null);
            w1.setWort("Gras");
            w1.setArtikel(Artikel.DAS);
            
            wortRepository.save(w1);
            w1.setId(null);
            w1.setWort("Baum");
            w1.setArtikel(Artikel.DER);
            
            wortRepository.save(w1);

            Set s4 = new Set();
            s4.setName("Schule");
            setRepository.save(s4);
            w1.setId(null);
            w1.setWort("Klassenzimmer");
            w1.setArtikel(Artikel.DAS);
            
            wortRepository.save(w1);
            w1.setId(null);
            w1.setWort("Turnhalle");
            w1.setArtikel(Artikel.DIE);
            
            wortRepository.save(w1);
            w1.setId(null);
            w1.setWort("Pausenplatz");
            w1.setArtikel(Artikel.DER);
            
            wortRepository.save(w1);
            w1.setId(null);
            w1.setWort("Schulgebäude");
            w1.setArtikel(Artikel.DAS);
            
            wortRepository.save(w1);            
        };
    }
    
}

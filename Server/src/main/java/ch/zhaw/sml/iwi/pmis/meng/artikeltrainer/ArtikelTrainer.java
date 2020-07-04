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

    private Set saveSetWithWort(Set set, String wort, Artikel artikel) {
        Wort w = new Wort();
        w.setWort(wort);
        w.setArtikel(artikel);
        wortRepository.save(w);
        set.getWoerter().add(w);
        return set;
    }

    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        return args -> {

            Set s1 = new Set();
            s1.setName("Bewegungsmittel");
            s1=saveSetWithWort(s1, "Auto", Artikel.DAS);
            s1=saveSetWithWort(s1, "Flugzeug", Artikel.DAS);
            s1=saveSetWithWort(s1, "Zug", Artikel.DER);
            s1=saveSetWithWort(s1, "Fahrrad", Artikel.DAS);
            setRepository.save(s1);
            
            s1=new Set();
            s1.setName("Tiere");
            s1=saveSetWithWort(s1, "Hund", Artikel.DER);
            s1=saveSetWithWort(s1, "Katze", Artikel.DIE);
            s1=saveSetWithWort(s1, "Kuh", Artikel.DIE);
            s1=saveSetWithWort(s1, "Huhn", Artikel.DAS);
            setRepository.save(s1);

            s1=new Set();
            s1.setName("Landschaft");
            s1=saveSetWithWort(s1, "Hügel", Artikel.DER);
            s1=saveSetWithWort(s1, "Wolke", Artikel.DIE);
            s1=saveSetWithWort(s1, "Gras", Artikel.DAS);
            s1=saveSetWithWort(s1, "Baum", Artikel.DER);
            setRepository.save(s1);
            
            s1=new Set();
            s1.setName("Schule");
            s1=saveSetWithWort(s1, "Klassenzimmer", Artikel.DAS);
            s1=saveSetWithWort(s1, "Turnhalle", Artikel.DIE);
            s1=saveSetWithWort(s1, "Schulhaus", Artikel.DAS);
            s1=saveSetWithWort(s1, "Pausenplatz", Artikel.DER);
            setRepository.save(s1);
            
        };
    }
    
}

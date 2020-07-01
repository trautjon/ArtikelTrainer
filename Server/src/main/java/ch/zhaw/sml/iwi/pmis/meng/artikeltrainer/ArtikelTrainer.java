package ch.zhaw.sml.iwi.pmis.meng.artikeltrainer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import ch.zhaw.sml.iwi.pmis.meng.artikeltrainer.model.Artikel;
import ch.zhaw.sml.iwi.pmis.meng.artikeltrainer.model.Set;
import ch.zhaw.sml.iwi.pmis.meng.artikeltrainer.model.User;
import ch.zhaw.sml.iwi.pmis.meng.artikeltrainer.model.UserSets;
import ch.zhaw.sml.iwi.pmis.meng.artikeltrainer.model.Wort;
import ch.zhaw.sml.iwi.pmis.meng.artikeltrainer.repository.ArtikelRepository;
import ch.zhaw.sml.iwi.pmis.meng.artikeltrainer.repository.SetRepository;
import ch.zhaw.sml.iwi.pmis.meng.artikeltrainer.repository.UserRepository;
import ch.zhaw.sml.iwi.pmis.meng.artikeltrainer.repository.UserSetsRepository;
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
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private UserSetsRepository userSetsRepository;


    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        return args -> {
            User user1 = new User();
            user1.setVorname("Laurent");
            user1.setNachname("von Wurstemberger");
            userRepository.save(user1);

            Artikel der = new Artikel();
            der.setArtikel("der");
            Artikel die = new Artikel();
            die.setArtikel("die");
            Artikel das = new Artikel();
            das.setArtikel("das");
            artikelRepository.save(der);
            artikelRepository.save(die);
            artikelRepository.save(das);

            Set s1 = new Set();
            s1.setName("Bewegungsmittel");
            setRepository.save(s1);
            Wort w1 = new Wort();
            w1.setWort("Auto");
            w1.setArtikel(das);
            w1.setWortSet(s1);
            wortRepository.save(w1);
            w1.setId(null);
            w1.setWort("Flugzeug");
            w1.setArtikel(das);
            w1.setWortSet(s1);
            wortRepository.save(w1);
            w1.setId(null);
            w1.setWort("Zug");
            w1.setArtikel(der);
            w1.setWortSet(s1);
            wortRepository.save(w1);
            w1.setId(null);
            w1.setWort("Fahrrad");
            w1.setArtikel(das);
            w1.setWortSet(s1);
            wortRepository.save(w1);

            Set s2 = new Set();
            s2.setName("Tiere");
            setRepository.save(s2);
            w1.setId(null);
            w1.setWort("Hund");
            w1.setArtikel(der);
            w1.setWortSet(s2);
            wortRepository.save(w1);
            w1.setId(null);
            w1.setWort("Katze");
            w1.setArtikel(die);
            w1.setWortSet(s2);
            wortRepository.save(w1);
            w1.setId(null);
            w1.setWort("Kuh");
            w1.setArtikel(die);
            w1.setWortSet(s2);
            wortRepository.save(w1);
            w1.setId(null);
            w1.setWort("Huhn");
            w1.setArtikel(das);
            w1.setWortSet(s2);
            wortRepository.save(w1);

            Set s3 = new Set();
            s3.setName("Landschaft");
            setRepository.save(s3);
            w1.setId(null);
            w1.setWort("Hügel");
            w1.setArtikel(der);
            w1.setWortSet(s3);
            wortRepository.save(w1);
            w1.setId(null);
            w1.setWort("Wolke");
            w1.setArtikel(die);
            w1.setWortSet(s3);
            wortRepository.save(w1);
            w1.setId(null);
            w1.setWort("Gras");
            w1.setArtikel(das);
            w1.setWortSet(s3);
            wortRepository.save(w1);
            w1.setId(null);
            w1.setWort("Baum");
            w1.setArtikel(der);
            w1.setWortSet(s3);
            wortRepository.save(w1);

            Set s4 = new Set();
            s4.setName("Schule");
            setRepository.save(s4);
            w1.setId(null);
            w1.setWort("Klassenzimmer");
            w1.setArtikel(das);
            w1.setWortSet(s4);
            wortRepository.save(w1);
            w1.setId(null);
            w1.setWort("Turnhalle");
            w1.setArtikel(die);
            w1.setWortSet(s4);
            wortRepository.save(w1);
            w1.setId(null);
            w1.setWort("Pausenplatz");
            w1.setArtikel(der);
            w1.setWortSet(s4);
            wortRepository.save(w1);
            w1.setId(null);
            w1.setWort("Schulgebäude");
            w1.setArtikel(das);
            w1.setWortSet(s4);
            wortRepository.save(w1);
            
            
            UserSets us1= new UserSets();
            us1.setSet(s4);
            us1.setUser(user1);
            us1.setFinished(false);
            userSetsRepository.save(us1);

            UserSets us2= new UserSets();
            us2.setSet(s1);
            us2.setUser(user1);
            us2.setFinished(true);
            userSetsRepository.save(us2);
            
        };
    }
    
}

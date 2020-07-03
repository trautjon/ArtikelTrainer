package ch.zhaw.sml.iwi.pmis.meng.artikeltrainer.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;

@Data
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String vorname;
    private String nachname;
    private String passwort;
    
    @OneToMany
    private List<Set> sets;
}
package ch.zhaw.sml.iwi.pmis.meng.artikeltrainer.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;

/**
 * Set
 */
@Entity
@Data
public class Set {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private boolean finished;
    @OneToMany
    private List<Wort> woerter;

    
}
package ch.zhaw.sml.iwi.pmis.meng.artikeltrainer.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Data;

@Entity
@Data
public class Wort {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String wort;

    @ManyToOne
    private Artikel wortArtikel;
    @ManyToOne
    private Set wortSet;
}
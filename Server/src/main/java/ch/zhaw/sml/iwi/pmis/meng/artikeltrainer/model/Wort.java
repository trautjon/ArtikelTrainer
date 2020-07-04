package ch.zhaw.sml.iwi.pmis.meng.artikeltrainer.model;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Wort {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String wort;
    @Enumerated(EnumType.STRING)
    private Artikel artikel;

}
package ch.zhaw.sml.iwi.pmis.meng.artikeltrainer.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Artikel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String artikel;

    
}
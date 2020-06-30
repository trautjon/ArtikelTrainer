package ch.zhaw.sml.iwi.pmis.meng.artikeltrainer.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ch.zhaw.sml.iwi.pmis.meng.artikeltrainer.model.Artikel;

public interface ArtikelRepository extends JpaRepository<Artikel, Long>{
    
}
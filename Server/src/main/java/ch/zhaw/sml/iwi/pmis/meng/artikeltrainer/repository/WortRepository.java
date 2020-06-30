package ch.zhaw.sml.iwi.pmis.meng.artikeltrainer.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ch.zhaw.sml.iwi.pmis.meng.artikeltrainer.model.Wort;

public interface WortRepository extends JpaRepository<Wort, Long>{
    
}
package ch.zhaw.sml.iwi.pmis.meng.artikeltrainer.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import ch.zhaw.sml.iwi.pmis.meng.artikeltrainer.model.Set;

public interface SetRepository extends JpaRepository<Set, Long>{

	List<Set> findByFinishedTrue();

	List<Set> findByFinishedFalse();
    
} 
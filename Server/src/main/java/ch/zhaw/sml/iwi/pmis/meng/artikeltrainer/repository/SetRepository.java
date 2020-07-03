package ch.zhaw.sml.iwi.pmis.meng.artikeltrainer.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import ch.zhaw.sml.iwi.pmis.meng.artikeltrainer.model.Set;

public interface SetRepository extends JpaRepository<Set, Long>{

    //List<Set> findSetAssigned(Long userId);

	@Query("Select us From User u JOIN u.sets us where us.finished=false and u.id =?1")
	List<Set> findFinishedSet(Long userId);

    
} 
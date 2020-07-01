package ch.zhaw.sml.iwi.pmis.meng.artikeltrainer.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import ch.zhaw.sml.iwi.pmis.meng.artikeltrainer.model.Set;

public interface SetRepository extends JpaRepository<Set, Long>{

    @Query(value="Select * from Set Join User_Sets on set.id=User_Sets.set_id Join User On User_Sets.user_Id=user.id where user.id =?1 And User_Sets.finished=false", nativeQuery = true)
	List<Set> findSetAssigned(Long userId);

	@Query(value="Select * from Set Join User_Sets on set.id=User_Sets.set_id Join User On User_Sets.user_Id=user.id where user.id =?1 And User_Sets.finished=true", nativeQuery = true)
	List<Set> findSetFinished(Long userId);

    
} 
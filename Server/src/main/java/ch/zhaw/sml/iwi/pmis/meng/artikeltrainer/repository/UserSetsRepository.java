package ch.zhaw.sml.iwi.pmis.meng.artikeltrainer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ch.zhaw.sml.iwi.pmis.meng.artikeltrainer.model.UserSets;

public interface UserSetsRepository extends JpaRepository<UserSets, Long> {
    
}
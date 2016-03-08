package com.btapp.repository;

import com.btapp.domain.Btr;

import org.springframework.data.jpa.repository.*;

import java.util.List;

/**
 * Spring Data JPA repository for the Btr entity.
 */
public interface BtrRepository extends JpaRepository<Btr,Long> {

    @Query("select btr from Btr btr where btr.user.login = ?#{principal.username}")
    List<Btr> findByUserIsCurrentUser();

}

package org.example.proect_lavka.repository;

import org.example.proect_lavka.entity.AllArtcEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface AllArtcEntityRepository extends JpaRepository<AllArtcEntity,String> {
    Optional<List<AllArtcEntity>> findByCodArtic(String codArtic) ;
}

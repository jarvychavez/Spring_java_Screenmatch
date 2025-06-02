package com.aluracursos.screenmatch.repository;

import com.aluracursos.screenmatch.model.Serie;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SerieRepository extends JpaRepository<Serie,Long> {
   Optional<Serie> findByTituloContainsIgnoreCase(String nombreSerie);


   List<Serie>findTop5ByOrderByEvaluacionDesc();
}

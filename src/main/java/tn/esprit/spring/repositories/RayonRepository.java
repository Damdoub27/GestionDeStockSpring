package tn.esprit.spring.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import tn.esprit.spring.entities.Category;
import tn.esprit.spring.entities.Rayon;

import java.util.List;

@Repository
public interface RayonRepository extends CrudRepository<Rayon, Integer> {
  
}

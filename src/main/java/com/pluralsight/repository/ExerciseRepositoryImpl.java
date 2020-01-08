package com.pluralsight.repository;

import com.pluralsight.model.Exercise;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

@Repository("exerciseRepository")
public class ExerciseRepositoryImpl implements ExerciseRepository {

  @PersistenceContext
  private EntityManager em;

  public Exercise save(Exercise exercise) {
    em.persist(exercise);
    em.flush();
    return exercise;
  }
}

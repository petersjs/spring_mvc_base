package com.pluralsight.service;

import com.pluralsight.model.Exercise;
import java.util.List;

import com.pluralsight.model.Activity;

public interface ExerciseService {

	List<Activity> findAllActivities();

	Exercise save(Exercise exercise);
}
package com.pluralsight.service;

import com.pluralsight.model.Goal;
import com.pluralsight.model.GoalReport;
import com.pluralsight.repository.GoalRepository;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("goalService")
public class GoalServiceImpl implements GoalService {

  @Autowired
  private GoalRepository goalRepository;

  @Transactional
  public Goal saveGoal(Goal goal) {
    return goalRepository.save(goal);
  }

  public List<Goal> findAllGoals() {
    return goalRepository.loadAll();
  }

  public List<GoalReport> findAllGoalReports() {
    return goalRepository.loadAllGoalReports();
  }
}

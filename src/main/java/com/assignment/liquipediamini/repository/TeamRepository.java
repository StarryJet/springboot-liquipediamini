package com.assignment.liquipediamini.repository;

import com.assignment.liquipediamini.model.Team;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface TeamRepository extends JpaRepository<Team, Long> {
    // Function 5: Search based on team name (case-insensitive)
    List<Team> findByNameContainingIgnoreCase(String name);
}
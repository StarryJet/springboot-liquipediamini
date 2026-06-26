package com.assignment.liquipediamini.service;

import com.assignment.liquipediamini.model.Team;
import com.assignment.liquipediamini.repository.TeamRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TeamService {

    private final TeamRepository repository;

    public TeamService(TeamRepository repository) {
        this.repository = repository;
    }

    // 1. CREATE: Registering new team
    public Team createTeam(Team team) {
        return repository.save(team);
    }

    // 2. READ: Retrieve all team data
    public List<Team> getAllTeams() {
        return repository.findAll();
    }

    // 3. UPDATE: Edit Team data
    public Team updateTeam(Long id, Team updatedTeam) {
        return repository.findById(id).map(team -> {
            team.setName(updatedTeam.getName());
            team.setGame(updatedTeam.getGame());
            team.setRegion(updatedTeam.getRegion());
            team.setStatus(updatedTeam.getStatus());
            return repository.save(team);
        }).orElseThrow(() -> new RuntimeException("Tim nggak ketemu bro!"));
    }

    // 4. DELETE: Remove team data
    public void deleteTeam(Long id) {
        repository.deleteById(id);
    }

    // 5. SEARCH: Finding team
    public List<Team> searchTeams(String keyword) {
        return repository.findByNameContainingIgnoreCase(keyword);
    }
}
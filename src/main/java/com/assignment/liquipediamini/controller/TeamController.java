package com.assignment.liquipediamini.controller;

import com.assignment.liquipediamini.model.Team;
import com.assignment.liquipediamini.service.TeamService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/teams")
public class TeamController {

    private final TeamService service;

    public TeamController(TeamService service) {
        this.service = service;
    }

    // REST API 1: CREATE (POST Method)
    @PostMapping
    public Team registerTeam(@RequestBody Team team) {
        return service.createTeam(team);
    }

    // REST API 2: READ (GET Method)
    @GetMapping
    public List<Team> showAllTeams() {
        return service.getAllTeams();
    }

    // REST API 3: UPDATE (PUT Method)
    @PutMapping("/{id}")
    public Team editTeam(@PathVariable Long id, @RequestBody Team team) {
        return service.updateTeam(id, team);
    }

    // REST API 3: DELETE (DELETE Method)
    @DeleteMapping("/{id}")
    public void removeTeam(@PathVariable Long id) {
        service.deleteTeam(id);
    }

    // REST API 5: SEARCH (GET Method)
    @GetMapping("/search")
    public List<Team> findTeam(@RequestParam String name) {
        return service.searchTeams(name);
    }  
}

package com.assignment.liquipediamini.model;

import jakarta.persistence.*;

@Entity
public class Team {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String game;
    private String region;
    private String status; // Format: "Active", "Eliminated", "Disqualified"
    private String roster; // Format: "Roster: Player1, Player2, Player3, Player4, Player5"
    private String staff; // Format: "Coach: Alecks, Manager: Eraser"
    private String category; // Format: "Playoffs" atau "Swiss Stage"

    // Empty Constructor (Essential for JPA)
    public Team() {
    }

    // Getters dan Setters (Essential for spring boot to read/write data)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGame() {
        return game;
    }

    public void setGame(String game) {
        this.game = game;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getRoster() {
        return roster;
    }

    public void setRoster(String roster) {
        this.roster = roster;
    }

    public String getStaff() {
        return staff;
    }

    public void setStaff(String staff) {
        this.staff = staff;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
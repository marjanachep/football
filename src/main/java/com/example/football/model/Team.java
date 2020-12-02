package com.example.football.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "teams")
public class Team {
    @Id
    @Column(name = "teams_id")
   private int teamsId;
    @Column(name = "name_team")
   private String nameTeam;
    @Column(name = "year_of_fondation")
   private int yearOfFoundation;
    @Column(name = "sity_teams")
   private String sityTeams;

    public int getTeamsId() {
        return teamsId;
    }

    public void setTeamsId(int teamsId) {
        this.teamsId = teamsId;
    }

    public String getNameTeam() {
        return nameTeam;
    }

    public void setNameTeam(String nameTeam) {
        this.nameTeam = nameTeam;
    }

    public int getYearOfFoundation() {
        return yearOfFoundation;
    }

    public void setYearOfFoundation(int yearOfFoundation) {
        this.yearOfFoundation = yearOfFoundation;
    }

    public String getSityTeams() {
        return sityTeams;
    }

    public void setSityTeams(String sityTeams) {
        this.sityTeams = sityTeams;
    }
}

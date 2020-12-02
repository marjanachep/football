package com.example.football.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "fan")
public class Fan {
    @Id
    @Column(name = "id")
    private int playsId;
    @Column(name = "name")
    private String name;
    @Column(name = "email")
    private String email;
    @Column(name = "teams")
    private String teams;
    @Column(name = "match_score")
    private String matchScore;
    @Column(name = "number_ticket")
    private String numberTicket;

      public Fan( int playsId, String name, String email,String teams, String matchScore, String numberTicket) {
        this.playsId = playsId;
        this.name = name;
        this.email = email;
        this.teams = teams;
        this.matchScore = matchScore;
        this.numberTicket = numberTicket;
    }
    public Fan() {    }

    public int getPlaysId() {
        return playsId;
    }

    public void setPlaysId(int playsId) {
        this.playsId = playsId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTeams() {
        return teams;
    }

    public void setTeams(String teams) {
        this.teams = teams;
    }

    public String getMatchScore() {
        return matchScore;
    }

    public void setMatchScore(String matchScore) {
        this.matchScore = matchScore;
    }

    public String getNumberTicket() {
        return numberTicket;
    }

    public void setNumberTicket(String numberTicket) {
        this.numberTicket = numberTicket;
    }
}

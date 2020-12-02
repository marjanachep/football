package com.example.football.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "matches")
public class Match {
    @Id
    @Column(name = "game_id")
    private int gameId;
    @Column(name = "teams_play")
    private String teamsPlay;

    @Column(name = "data_of_game")
    private String dataOfGame;
    @Column(name = "games_sity")
    private String gameSity;
    @Column(name = "time_play")
    private String timePlay;
    @Column(name = "fields_master")
    private String fieldsMaster;

    public int getGameId() {
        return gameId;
    }

    public void setGameId(int gameId) {
        this.gameId = gameId;
    }

    public String getTeamsPlay() {
        return teamsPlay;
    }

    public void setTeamsPlay(String teamsPlay) {
        this.teamsPlay = teamsPlay;
    }

    public String getDataOfGame() {
        return dataOfGame;
    }

    public void setDataOfGame(String dataOfGame) {
        this.dataOfGame = dataOfGame;
    }

    public String getGameSity() {
        return gameSity;
    }

    public void setGameSity(String gameSity) {
        this.gameSity = gameSity;
    }

    public String getTimePlay() {
        return timePlay;
    }

    public void setTimePlay(String timePlay) {
        this.timePlay = timePlay;
    }

    public String getFieldsMaster() {
        return fieldsMaster;
    }

    public void setFieldsMaster(String fieldsMaster) {
        this.fieldsMaster = fieldsMaster;
    }
}

package com.example.football.service;

import com.example.football.model.Fan;

import java.util.List;

public interface FanService {
    List<Fan>  findAll();
    Fan findFanById(int playsId);
    Fan createFan(Fan fan);
    Fan updateFan(Fan fan);
    void deleteFan(int playsId);
}

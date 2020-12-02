package com.example.football.service;

import com.example.football.model.Fan;
import com.example.football.repository.FanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class FanServiceImpl implements FanService{
    @Autowired
    private FanRepository fanRepository;


    @Override
    public List<Fan> findAll() {
        return fanRepository.findAll();
    }

    @Override
    public Fan findFanById(int playsId) {
        return fanRepository.findById(playsId).orElse(null);
    }

    @Override
    public Fan createFan(Fan fan) {
        if (fan.getName() == null || fan.getName().length()==0) {throw new IllegalArgumentException("Field Name could not be empty");}
        if(fan.getTeams()== null|| fan.getTeams().length()==0){ throw new IllegalArgumentException("Field Teams could not be empty");}
        if(fan.getEmail()== null|| fan.getEmail().length()==0){ throw new IllegalArgumentException("Field Email could not be empty");}
        if(fan.getMatchScore()== null|| fan.getMatchScore().length()==0){ throw new IllegalArgumentException("Field MatchScore could not be empty");}
        if(fan.getNumberTicket()== null|| fan.getNumberTicket().length()==0){ throw new IllegalArgumentException("Field Number could not be empty");}
        if(!fan.getMatchScore().contains(":")) {throw new IllegalArgumentException("The score of the match is not correct");}
        if(!fan.getEmail().contains("@")) {throw new IllegalArgumentException("The email is not correct");}

        List<Fan> all = fanRepository.findAll();
        if(all.isEmpty()){
            throw new RuntimeException("We have lost all fan!!");
        }
        fanRepository.save(fan);
        return fan;
    }


    @Override
    public Fan updateFan(Fan fan) {
        if (fan.getName() == null || fan.getName().length()==0) {throw new IllegalArgumentException("Field Name could not be empty");}
        if (fan.getTeams() == null || fan.getTeams().length()==0 ){ throw new IllegalArgumentException("Field Teams could not be empty");}
        if(fan.getEmail()== null|| fan.getEmail().length()==0){ throw new IllegalArgumentException("Field Email could not be empty");}
        if(fan.getMatchScore() == null || fan.getMatchScore().length()==0){   throw new IllegalArgumentException("Field MatchScore could not be empty"); }
        if(fan.getNumberTicket()== null|| fan.getNumberTicket().length()==0){ throw new IllegalArgumentException("Field Number could not be empty");}
        if(!fan.getMatchScore().contains(":")){
            throw new IllegalArgumentException("The score of the match is not correct");}
        if(!fan.getEmail().contains("@")) {throw new IllegalArgumentException("The email is not correct");}
        fanRepository.save(fan);
        return fan;
    }

    @Override
    public void deleteFan(int playsId) {
        fanRepository.deleteById(playsId);  }
}

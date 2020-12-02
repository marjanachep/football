package com.example.football.controller;

import com.example.football.model.Fan;
import com.example.football.service.FanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1/plays")
public class FanController {

    @Autowired
    private FanService fanService;

        @GetMapping
        public List<Fan> getAll(){
            return fanService.findAll();
        }

        @GetMapping("/{playsId}")
         public Fan getFan(@PathVariable int playsId){
        return fanService.findFanById(playsId);
        }

        @PostMapping
        public Fan createFan(@RequestBody Fan fan){ return fanService.createFan(fan);
        }

        @PutMapping(value = "/{playsId}")
        public Fan updateFan(@RequestBody Fan fan) {
            return fanService.updateFan(fan);
        }

            @DeleteMapping(value = "/{playsId}")
             public ResponseEntity deleteFan(@PathVariable int playsId) {
            fanService.deleteFan(playsId);
            return ResponseEntity.ok(HttpEntity.EMPTY);
}
    }


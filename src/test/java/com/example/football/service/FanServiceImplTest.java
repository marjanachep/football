package com.example.football.service;

import com.example.football.model.Fan;
import com.example.football.repository.FanRepository;
import org.junit.Test;
//import org.junit.jupiter.api.Assertions;
import org.assertj.core.api.Assertions;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.stubbing.OngoingStubbing;

import java.util.List;

import static org.mockito.Mockito.when;
import static org.mockito.Mockito.any;

@RunWith(MockitoJUnitRunner.class)

public class FanServiceImplTest {
    @Mock
    private FanRepository repository;

    @InjectMocks
    private FanServiceImpl fanService;

    @Test
    public void shouldThrowExceptionForEmptyName(){
        Fan fan = new Fan( 1, "","sivchuk@gmail.com", "Баварія-Динамо", "2:1",  "1239");
        Assertions.assertThatThrownBy(()->fanService.createFan(fan)).
                hasMessage("Field Name could not be empty");
    }
    @Test
    public void shouldThrowExceptionForNullName(){
        Fan fan = new Fan( 1, null,"sivchuk@gmail.com", "Баварія-Динамо", "2:1",  "1239");
        Assertions.assertThatThrownBy(()->fanService.createFan(fan)).
                hasMessage("Field Name could not be empty");
    }
    @Test
    public void shouldThrowExceptionForEmptyTeams(){
        Fan fan = new Fan( 1, "Сівчук Вадим", "sivchuk@gmail.com","", "2:1",  "1239");
        Assertions.assertThatThrownBy(()->fanService.createFan(fan)).
                hasMessage("Field Teams could not be empty");
    }
    @Test
    public void shouldThrowExceptionForNullTeams(){
        Fan fan = new Fan( 1, "Сівчук Вадим", "sivchuk@gmail.com",null, "2:1",  "1239");
        Assertions.assertThatThrownBy(()->fanService.createFan(fan)).
                hasMessage("Field Teams could not be empty");
    }

    @Test
    public void shouldThrowExceptionForEmptyScore(){
        Fan fan = new Fan(  1, "Сівчук Вадим","sivchuk@gmail.com", "Баварія-Динамо", "" , "1239");
        Assertions.assertThatThrownBy(()->fanService.createFan(fan)).
                hasMessage("Field MatchScore could not be empty");
        }
    @Test
    public void shouldThrowExceptionForNullScore(){
        Fan fan = new Fan(  1, "Сівчук Вадим","sivchuk@gmail.com", "Баварія-Динамо", null , "1239");
        Assertions.assertThatThrownBy(()->fanService.createFan(fan)).
                hasMessage("Field MatchScore could not be empty");
    }
    @Test
    public void shouldThrowExceptionForEmptyEmail(){
        Fan fan = new Fan(  1, "Сівчук Вадим","", "Баварія-Динамо", "2:1", null);
        Assertions.assertThatThrownBy(()->fanService.createFan(fan)).
                hasMessage("Field Email could not be empty");
    }
    @Test
    public void shouldThrowExceptionForNullEmail(){
        Fan fan = new Fan(  1, "Сівчук Вадим",null, "Баварія-Динамо", "2:1", null);
        Assertions.assertThatThrownBy(()->fanService.createFan(fan)).
                hasMessage("Field Email could not be empty");
    }
    @Test
    public void shouldThrowExceptionForEmptyNumber(){
        Fan fan = new Fan(  1, "Сівчук Вадим","sivchuk@gmail.com", "Баварія-Динамо", "2:1", "");
        Assertions.assertThatThrownBy(()->fanService.createFan(fan)).
                hasMessage("Field Number could not be empty");
    }

    @Test
    public void shouldThrowExceptionForNullNumber(){
        Fan fan = new Fan(  1, "Сівчук Вадим","sivchuk@gmail.com", "Баварія-Динамо", "2:1", null);
        Assertions.assertThatThrownBy(()->fanService.createFan(fan)).
                hasMessage("Field Number could not be empty");
    }
    @Test
    public void shouldThrowExceptionForCorrectScore(){
        Fan fan = new Fan( 1, "Сівчук Вадим","sivchuk@gmail.com", "Баварія-Динамо", "21",  "1239");
        Assertions.assertThatThrownBy(()->fanService.createFan(fan)).
                hasMessage("The score of the match is not correct");
    }
    @Test
    public void shouldThrowExceptionForCorrectEmail(){
        Fan fan = new Fan( 1, "Сівчук Вадим","sivchukgmail.com", "Баварія-Динамо", "2:1",  "1239");
        Assertions.assertThatThrownBy(()->fanService.createFan(fan)).
                hasMessage("The email is not correct");
    }

    @Test
    public void createFan(){
        when(repository.findAll()).thenReturn(List.of(new Fan(6, "Cірка Анна", "sirkaaaa@gmail.com","Шахтар-Динамо", "5:1", "1235")));
        Fan fan = new Fan( 1, "Сівчук Вадим", "sivchuk@gmail.com","Баварія-Динамо", "2:1", "1239");
        when(repository.save(any())).thenReturn(new Fan());
        Fan createdFan = fanService.createFan(fan);
        Assertions.assertThat(createdFan.getName()).isEqualTo("Сівчук Вадим");
    }
    private List<Fan> genFanList(){ return List.of(new Fan(1,"Сівчук Вадим","sivchuk@gmail.com", "Баварія-Динамо", "5:1",  "1239"));}
    private Fan genFan(){
        return new Fan(1,"Сівчук Вадим", "sivchuk@gmail.com","Баварія-Динамо", "5:1", "1239");
    }


    @Test
    public void shouldThrowExceptionForEmptyNameForUpdate(){
        Fan fan = new Fan( 1, "","sivchuk@gmail.com", "Баварія-Динамо", "2:1",  "1239");
        Assertions.assertThatThrownBy(()->fanService.updateFan(fan)).
                hasMessage("Field Name could not be empty");
    }
    @Test
    public void shouldThrowExceptionForNullNameForUpdate(){
        Fan fan = new Fan( 1, null,"sivchuk@gmail.com", "Баварія-Динамо", "2:1",  "1239");
        Assertions.assertThatThrownBy(()->fanService.updateFan(fan)).
                hasMessage("Field Name could not be empty");
    }
    @Test
    public void shouldThrowExceptionForEmptyTeamsForUpdate(){
        Fan fan = new Fan( 1, "Сівчук Вадим", "sivchuk@gmail.com","", "2:1",  "1239");
        Assertions.assertThatThrownBy(()->fanService.updateFan(fan)).
                hasMessage("Field Teams could not be empty");
    }
    @Test
    public void shouldThrowExceptionForNullTeamsForUpdate(){
        Fan fan = new Fan( 1, "Сівчук Вадим", "sivchuk@gmail.com",null, "2:1",  "1239");
        Assertions.assertThatThrownBy(()->fanService.updateFan(fan)).
                hasMessage("Field Teams could not be empty");
    }
    @Test
    public void shouldThrowExceptionForEmptyScoreForUpdate(){
        Fan fan = new Fan(  1, "Сівчук Вадим","sivchuk@gmail.com", "Баварія-Динамо", "" , "1239");
        Assertions.assertThatThrownBy(()->fanService.updateFan(fan)).
                hasMessage("Field MatchScore could not be empty");
    }
    @Test
    public void shouldThrowExceptionForNullScoreForUpdate(){
        Fan fan = new Fan(  1, "Сівчук Вадим","sivchuk@gmail.com", "Баварія-Динамо", null , "1239");
        Assertions.assertThatThrownBy(()->fanService.updateFan(fan)).
                hasMessage("Field MatchScore could not be empty");
    }
    @Test
    public void shouldThrowExceptionForEmptyEmailFotUpdate(){
        Fan fan = new Fan(  1, "Сівчук Вадим","", "Баварія-Динамо", "2:1", "");
        Assertions.assertThatThrownBy(()->fanService.updateFan(fan)).
                hasMessage("Field Email could not be empty");
    }
    @Test
    public void shouldThrowExceptionForNullEmailFotUpdate(){
        Fan fan = new Fan(  1, "Сівчук Вадим",null, "Баварія-Динамо", "2:1", null);
        Assertions.assertThatThrownBy(()->fanService.updateFan(fan)).
                hasMessage("Field Email could not be empty");
    }

    @Test
    public void shouldThrowExceptionForEmptyNumberForUpdate(){
        Fan fan = new Fan(  1, "Сівчук Вадим","sivchuk@gmail.com", "Баварія-Динамо", "2:1", "");
        Assertions.assertThatThrownBy(()->fanService.updateFan(fan)).
                hasMessage("Field Number could not be empty");

    }
    @Test
    public void shouldThrowExceptionForNullNumberForUpdate(){
        Fan fan = new Fan(  1, "Сівчук Вадим","sivchuk@gmail.com", "Баварія-Динамо", "2:1", null);
        Assertions.assertThatThrownBy(()->fanService.updateFan(fan)).
                hasMessage("Field Number could not be empty");
    }
    @Test
    public void shouldThrowExceptionForCorrectEmailForUpdate(){
        Fan fan = new Fan( 1, "Сівчук Вадим","sivchukgmail.com", "Баварія-Динамо", "2:1",  "1239");
        Assertions.assertThatThrownBy(()->fanService.updateFan(fan)).
                hasMessage("The email is not correct");
    }

    @Test
    public void shouldThrowExceptionForCorrectScoreForUpdate(){
        Fan fan = new Fan( 1, "Сівчук Вадим","sivchuk@gmail.com", "Баварія-Динамо", "21",  "1239");
        Assertions.assertThatThrownBy(()->fanService.updateFan(fan)).
                hasMessage("The score of the match is not correct");
    }




}

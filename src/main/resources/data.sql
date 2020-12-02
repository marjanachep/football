insert into TEAMS (teams_id,name_team,year_of_foundation,sity_teams) values (1, 'Атлетіко Мадрид', 1903, 'Мадрид, Іспанія');
insert into TEAMS (teams_id,name_team,year_of_foundation,sity_teams) values (2, 'Валенсія', 1919, 'Валенсія, Іспанія');
insert into TEAMS (teams_id,name_team,year_of_foundation,sity_teams) values (3, 'Реал Мадрид', 1902, 'Мадрид, Іспанія');
insert into TEAMS (teams_id,name_team,year_of_foundation,sity_teams) values (4, 'Атлетіко Мадрид', 1903, 'Мадрид, Іспанія');
insert into TEAMS (teams_id,name_team,year_of_foundation,sity_teams) values (5, 'Динамо', 1927, 'Київ, Україна');
insert into TEAMS (teams_id,name_team,year_of_foundation,sity_teams) values (6, 'Шахтар', 1936, 'Донецьк, Україна');
insert into TEAMS (teams_id,name_team,year_of_foundation,sity_teams) values (7, 'Ліверпуль', 1892, 'Ліверпуль, Англія');
insert into TEAMS (teams_id,name_team,year_of_foundation,sity_teams) values (8, 'Баварія', 1900, 'Мюнхен, Німеччина');
insert into TEAMS (teams_id,name_team,year_of_foundation,sity_teams) values (9, 'Тотенгем', 1882, 'Лондон, Велика Британія');
insert into TEAMS (teams_id,name_team,year_of_foundation,sity_teams) values (10, 'Зоря', 1923, 'Луганськ, Україна');

insert into FAN (id,name,email,teams,match_score, number_ticket) values (1,'Васильков Іван', 'vasylkov@gmail.com','Шахтар-Динамо', '3:1', '1231');
insert into FAN (id,name,email,teams,match_score, number_ticket) values (2,'Кириленко Оксана','kyrylenko@gmail.com', 'Динамо-Шахтар', '0:0', '1239');
insert into FAN (id,name,email,teams,match_score, number_ticket) values (3,'Сівчук Вадим', 'sivchuk@gmail.com','Баварія-Динамо', '5:1', '1245');
insert into FAN (id,name,email,teams,match_score, number_ticket) values (4,'Борик Олександр', 'boryyyyyyk@gmail.com','Динамо-Тотенгем', '2:2','7831');
insert into FAN (id,name,email,teams,match_score, number_ticket) values (5,'Сірко Зоряна','sirkooo@gmail.com', 'Реал Мадрид - Ліверпуль', '3:1', '1289');
insert into FAN (id,name,email,teams,match_score, number_ticket) values (6,'Василько Ірина','vasylko@gmail.com', 'Валенсія - Шахтар', '1:2', '1564');
insert into FAN (id,name,email,teams,match_score, number_ticket) values (7,'Іваненко Вікторія', 'ivannnnennnko@gmail.com','Шахтар-Баварія', '2:5', '9561');


insert into MATCHES(game_id,teams_play,data_of_game,time_play,games_sity,fields_master) values ( 1,'Динамо-Шахтар', '12 жовтня 2020', '17:00','Київ, Україна',  'Динамо' );
insert into MATCHES(game_id,teams_play,data_of_game,time_play,games_sity,fields_master) values ( 2,'Шахтар-Динамо', '22 листопада 2020','22:00', 'Львів, Україна',  'Шахтар' );
insert into MATCHES(game_id,teams_play,data_of_game,time_play,games_sity,fields_master) values ( 3,'Баварія-Динамо', '21 жовтня 2020', '18:00','Мюнхен, Німеччина',  'Баварія' );
insert into MATCHES(game_id,teams_play,data_of_game,time_play,games_sity,fields_master) values ( 4,'Динамо-Тотенгем', '30 жовтня 2020', '15:00','Київ, Україна',  'Динамо' );
insert into MATCHES(game_id,teams_play,data_of_game,time_play,games_sity,fields_master) values ( 5,'Реал Мадрид - Ліверпуль', '12 грудня 2020','20:00', 'Мадрид, Іспанія',  'Реал Мадрид' );
insert into MATCHES(game_id,teams_play,data_of_game,time_play,games_sity,fields_master) values ( 6,'Валенсія - Шахтар', '12 січня 2021', '22:00','Валенсія, Іспанія',  'Валенсія' );
insert into MATCHES(game_id,teams_play,data_of_game,time_play,games_sity,fields_master) values ( 7,'Шахтар-Баварія', '19 грудня 2020', '18:00','Київ, Україна',  'Шахтар' );
insert into MATCHES(game_id,teams_play,data_of_game,time_play,games_sity,fields_master) values ( 8,'Зоря-Динамо', '6 листопада 2020','17:00', 'Київ, Україна', 'Зоря' )


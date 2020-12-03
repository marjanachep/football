CREATE TABLE TEAMS
(
    teams_id SERIAL ,
    name_team VARCHAR (200),
    year_of_foundation INTEGER ,
    sity_teams VARCHAR (200)
);

CREATE TABLE FAN
(
    id SERIAL ,
    name VARCHAR (200) NOT NULL,
    email VARCHAR (200) NOT NULL,
    teams VARCHAR (200) NOT NULL ,
    match_score VARCHAR (200) NOT NULL,
    number_ticket VARCHAR (200) NOT NULL
);
CREATE TABLE MATCHES
(
    game_id SERIAL ,
    teams_play VARCHAR (200),
    data_of_game VARCHAR (100) ,
    time_play VARCHAR (200),
    games_sity VARCHAR (200),
    fields_master VARCHAR (200)
)

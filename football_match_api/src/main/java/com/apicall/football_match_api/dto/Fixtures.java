package com.apicall.football_match_api.dto;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;


 
//fifaworldcup   bundesliga   premierleague



@JsonIgnoreProperties(ignoreUnknown = true)
public class Fixtures {

    @JsonProperty(value="Matchday 2")
    //@JsonAlias(" Group stage: Matchday 2")
    private FixtureData[] MatchDay1;

    @JsonProperty(" Matchday 3")
    private FixtureData[] MatchDay2;

    public FixtureData[] getMatchDay1() {
        return MatchDay1;
    }

    public void setMatchDay1(FixtureData[] matchDay1) {
        MatchDay1 = matchDay1;
    }

    public FixtureData[] getMatchDay2() {
        return MatchDay2;
    }

    public void setMatchDay2(FixtureData[] matchDay2) {
        MatchDay2 = matchDay2;
    }




}

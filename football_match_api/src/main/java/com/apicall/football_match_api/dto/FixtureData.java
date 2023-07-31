package com.apicall.football_match_api.dto;



import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class FixtureData {
    
    @JsonProperty("homeTeam")
    private String home;

    @JsonProperty("awayTeam")
    private String away;

    private String Matchday;
    
    //Getter Setters 

    
    public String getHome() {
        return home;
    }

    public void setHome(String home) {
        this.home = home;
    }

    public String getAway() {
        return away;
    }

    public void setAway(String away) {
        this.away = away;
    }

    public String getMatchday() {
        return Matchday;
    }

    public void setMatchday(String matchday) {
        Matchday = matchday;
    }

    

}

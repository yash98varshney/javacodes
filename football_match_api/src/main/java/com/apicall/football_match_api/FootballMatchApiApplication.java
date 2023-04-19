package com.apicall.football_match_api;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.apicall.football_match_api.dto.FixtureData;
import com.apicall.football_match_api.dto.Fixtures;
import com.fasterxml.jackson.core.JsonParseException;

import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@SpringBootApplication
public class FootballMatchApiApplication {

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		SpringApplication.run(FootballMatchApiApplication.class, args);

		ArrayList<FixtureData[]> ans=givesFixtures();
		FixtureData[] a1=ans.get(0);
		for(FixtureData x:a1){
			System.out.println(x);
		}
		

	}

	public static ArrayList<FixtureData[]> givesFixtures() throws JsonParseException, JsonMappingException, IOException{
		ObjectMapper obj=new ObjectMapper();
		File f=new File("E:/Java_codes/football_match_api/src/main/resources/response.json");
		Fixtures[] fixx=obj.readValue(f, Fixtures[].class);
		FixtureData[] mat1=fixx[0].getMatchDay1();
		FixtureData[] mat2=fixx[0].getMatchDay2();

		ArrayList<FixtureData[]> ans=new ArrayList<>();
		ans.add(mat1);
		ans.add(mat2);
		return ans;
		
	}

}


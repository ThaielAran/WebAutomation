package com.globant.webautomation.RestAssuredPractice;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import org.junit.Before;
import org.junit.Test;
import junit.framework.TestCase;

import io.restassured.response.Response;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

public class ServicesTest extends TestCase{
	
	private Response response;
	private String url="https://swapi.dev/api/people/2";
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	@Before
	public void setUp() {
		response=RestAssured.given().get(url);
	}
	@Test
	public void testC3PO(){
		
		assertEquals(response.getStatusCode(), 200);
		
		JsonPath evaluac = response.jsonPath();
		
		String skin = evaluac.get("skin_color");
		assertEquals(skin, "gold");
		
		ArrayList<String> movies = evaluac.get("films");
		assertEquals(movies.size(), 6);
	}
	
	@Test
	public void testEpisode5() {
		JsonPath evaluac = response.jsonPath();
		ArrayList<String> movies = evaluac.get("films");
		setUrl(movies.get(1));
		response=RestAssured.given().get(url);
		evaluac = response.jsonPath();
		
		boolean flag;
		String pattern = "yyyy-MM-dd";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		try {
			Date date = simpleDateFormat.parse(evaluac.get("release_date").toString());
			flag=true;
			date.compareTo(date);
		} catch (ParseException e) {
			flag=false;
		}
		assertTrue(flag);
		
		ArrayList<String> characters = evaluac.get("characters");
		ArrayList<String> planets = evaluac.get("planets");
		ArrayList<String> starships = evaluac.get("starships");
		ArrayList<String> vehicles = evaluac.get("vehicles");
		ArrayList<String> species = evaluac.get("species");
		assertTrue(characters.size()>1);
		assertTrue(planets.size()>1);
		assertTrue(starships.size()>1);
		assertTrue(vehicles.size()>1);
		assertTrue(species.size()>1);
	}
	
	@Test
	public void testPlanet() {
		JsonPath evaluac = response.jsonPath();
		ArrayList<String> movies = evaluac.get("films");
		setUrl(movies.get(1));
		response=RestAssured.given().get(url);
		evaluac = response.jsonPath();
		ArrayList<String> planets = evaluac.get("planets");
		setUrl(planets.get(0));
		response=RestAssured.given().get(url);
		
		evaluac=response.jsonPath();
		String gravity=evaluac.get("gravity");
		String terrain=evaluac.get("terrain");
		assertEquals("tundra, ice caves, mountain ranges", terrain);
		assertEquals("1.1 standard", gravity);
	}

	@Test
	public void testSamePlanet() {
		JsonPath evaluac = response.jsonPath();
		ArrayList<String> movies = evaluac.get("films");
		setUrl(movies.get(1));
		response=RestAssured.given().get(url);
		evaluac = response.jsonPath();
		ArrayList<String> planets = evaluac.get("planets");
		setUrl(planets.get(0).toString());
		response=RestAssured.given().get(url);
		
		evaluac = response.jsonPath();
		Response response2=RestAssured.given().get(evaluac.get("url").toString());
		assertEquals(response.asPrettyString(), response2.asPrettyString());
	}
	@Test
	public void testNotFount() {
		setUrl("https://swapi.dev/api/films/7");
		response=RestAssured.given().get(url);
		assertEquals(404, response.getStatusCode());
	}
}

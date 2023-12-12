package stepDefinition;

import org.junit.jupiter.api.Assertions;

import com.globant.webautomation.RepasoAPI_Web.BaseTest;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import pages.HomePage;
import pages.ResultPage;

public class StepDefinition{
	String people="https://swapi.dev/api/people/";
	String name;
	ResultPage resul;
	
  @Given("I am on SWAPI requesting a character id {int}")
  public void i_am_on_swapi_requesting_a_character_id(Integer int1) throws Throwable {
	 Response respuesta= RestAssured.given().get(people+int1);
	 JsonPath data=respuesta.jsonPath();
	 name=data.get("name");
  }

  @When("I search the name of that character on Wikipedia")
  public void i_search_the_name_of_that_character_on_Wikipedia() throws Throwable { 
	  HomePage wiki = BaseTest.getHomePage();
	  wiki.getInput().sendKeys(name);
	  resul= wiki.clickSearch();
  }

  @Then("I get the article page for the requested character")
  public void i_get_the_article_page_for_the_requested_character() throws Throwable {
	  Assertions.assertEquals(name, resul.getTitulo().getText());
  }

}

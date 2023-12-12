package testingAPI;

import org.asynchttpclient.Response;

public class ServiceTest {

	private Response response;
	private JasonPath jp;
	private PeoplePOJO person;
	
	@BeforeClass
	public void getPerson() {
		response= RestAssured.get("https://swapi.dev/people/2");
		jp=response.jsonPath();
		person= new PeoplePOJO();
		
	}
	
	@Test
	public void getPerson2() {
		AssertEquals(response.getStatusCode(), 200);
		
	}
}

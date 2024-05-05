package test.testApp;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

/**
 * Hello world!
 *
 */
public class TestApp {
	
	public static void GetBooksDetails() { 
		// Specify the base URL to the RESTful web service 
		RestAssured.baseURI = "http://localhost:9090/app/exec"; 
		// Get the RequestSpecification of the request to be sent to the server. 
		RequestSpecification httpRequest = RestAssured.given(); 
		// specify the method type (GET) and the parameters if any. 
		//In this case the request does not take any parameters 
		Response response = httpRequest.request(Method.POST, "");
		// Print the status and message body of the response received from the server 
		System.out.println("Status received => " + response.getStatusLine()); 
		System.out.println("Response=>" + response.prettyPrint());
		Assert.assertEquals("Message display", response.prettyPrint());	
	}
	

    
	
}

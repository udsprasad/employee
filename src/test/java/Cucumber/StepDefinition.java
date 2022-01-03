package Cucumber;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.jupiter.api.Assertions;


import java.util.Arrays;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;


public class StepDefinition {

    private Response response;
    private String BaseUrl ="http://localhost:8081";
    private String body="{\"departmentId\": 1,\"departmentName\": \"Ecom\"} ";

    @When("users upload Department data details on a project")
    public void users_upload_department_data_details_on_a_project() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
        response = given().contentType(ContentType.JSON).body(body).post(BaseUrl+"/employee/getEmployeesByDepartment").
                then().extract().response();
    }

    @Then("the server should handle it and return a success status")
    public void the_server_should_handle_it_and_return_a_success_status() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
        Assertions.assertEquals(Arrays.asList("Raju","rani"),response.jsonPath().get("name"));
        Assertions.assertEquals(200,response.getStatusCode());
    }

    @When("users want to get Employee information with EmployeeId")
    public void users_want_to_get_employee_information_with_employee_id() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
        response = when().get(BaseUrl+"/employee/1").
                then().extract().response();
    }

    @Then("the requested data is returned")
    public void the_requested_data_is_returned() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
        Assertions.assertEquals("Raju",response.jsonPath().get("name"));
        Assertions.assertEquals("Developer",response.jsonPath().get("designation"));

    }



}

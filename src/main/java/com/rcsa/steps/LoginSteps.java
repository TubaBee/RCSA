package com.rcsa.steps;

import com.rcsa.utils.CommonMethods;
import com.rcsa.utils.ConfigsReader;
import io.cucumber.java.en.*;
import org.junit.Assert;

public class LoginSteps extends CommonMethods {

    @Given("I login to RCSAConnect")
    public void i_login_to_RCSAConnect() {

        sendText(login.username, ConfigsReader.getProperty("username"));
        sendText(login.password, ConfigsReader.getProperty("password"));
        jsClick(login.loginBtn);
    }

    @And("I navigate to Demo Course page")
    public void i_navigate_to_Demo_Course_page() {
        jsClick(login.course);
    }

    @When("I enter  valid username and invalid password")
    public void i_enter_valid_username_and_invalid_password() {
        sendText(login.username, "ionbasi");
        sendText(login.password, "jdes43w");
        jsClick(login.loginBtn);
    }

    @Then("I see error message")
    public void i_see_error_message() {
        boolean error = login.errorMsg.isDisplayed();
        String actual = login.errorMsg.getText();
        System.out.println(actual);
        Assert.assertTrue(error);
    }


    @Given("I navigate to RCSA login page")
    public void iNavigateToRCSALoginPage() {

        driver.get("https://rcsaiconnect.org/login/index.php");


    }
}
package com.rcsa.steps;

import com.rcsa.utils.CommonMethods;
import com.rcsa.utils.ConfigsReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

import java.util.List;

public class AssigmentSteps extends CommonMethods {

    @Then("I click on the course page and turn the editing on")
    public void i_click_on_the_course_page_and_turn_the_editing_on() throws InterruptedException {
        jsClick(dashBoard.viewcourse);

        if (AssigmentActivity.editSettingOn.isDisplayed()) {
            jsClick(AssigmentActivity.editSettingOn);
        } else {
            jsClick(AssigmentActivity.editSettingOff);
        }

        try {
            AssigmentActivity.turnEditOn.isDisplayed();
            jsClick(AssigmentActivity.turnEditOn);
        } catch (NoSuchElementException e) {
            System.out.println("Turn edit on bulunamadi");
        }
    }


    @Given("I choose the of {string} for assignment and navigate to assignment page")
    public void i_choose_the_of_for_assignment_and_navigate_to_assignment_page(String week) {

        WebElement AddActivity = driver.findElement(By.xpath("//li[@aria-label='" + week + "']/div[2]/div/div/div/span/a/span"));
        jsClick(AddActivity);
        jsClick(AssigmentActivity.AssigmentRadiobtn);
        jsClick(AssigmentActivity.addBtn);


    }


    @Given("And I add the details of the assignment starting on {string} ending on {string}")
    public void i_add_the_details_of_the_assignment(String a, String b) throws InterruptedException {
        AddingNewA.AssgName.clear();

        sendText(AddingNewA.AssgName, ConfigsReader.getProperty("assigment"));
        jsClick(AddingNewA.Bold);
        jsClick(AddingNewA.underline);
        sendText(AddingNewA.description, "Adding two digit number and multiple two number");
        Thread.sleep(3000);
        jsClick(AddingNewA.display);
        Thread.sleep(3000);
        jsClick(AddingNewA.addImg);
        Thread.sleep(3000);
        sendText(AddingNewA.choose, ConfigsReader.getProperty("picture"));
        selectDropddownValue(AddingNewA.license, "Public domain");
        Thread.sleep(3000);
        jsClick(AddingNewA.upload);
        selectDropdownByIndex(AddingNewA.assingtype, 4);
        Thread.sleep(3000);

        String[] days = {a, b};
        for (int i = 0; i < AddingNewA.calendarXpath.length; i++) {
            driver.findElement(By.id(AddingNewA.calendarXpath[i])).click();
            List<WebElement> date = driver.findElements(By.xpath("//table[@aria-label='May 2020']/tbody/tr/td"));
            for (WebElement d : date) {
                if (d.getText().equals(days[i])) {
                    d.click();
                    break;
                }
            }
        }
        Thread.sleep(4000);

        jsClick(AddingNewA.feedback);
        jsClick(AddingNewA.grade);
        sendText(AddingNewA.point, "85");
        selectDropdownByIndex(AddingNewA.gradeCat, 2);
        Thread.sleep(4000);


    }

    @When("I click save button")
    public void i_click_save_button() {
        jsClick(AddingNewA.submitBut);
    }

    @Then("I see the assignment created")
    public void i_see_the_assignment_created() {
        String expected = ConfigsReader.getProperty("assigment");
        Assert.assertEquals(expected, AddingNewA.actual.getText());
        System.out.println("Save Successful");

    }

}

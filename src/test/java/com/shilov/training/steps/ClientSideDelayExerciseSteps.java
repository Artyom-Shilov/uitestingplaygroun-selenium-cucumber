package com.shilov.training.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import static com.shilov.training.utills.PageManager.*;

public class ClientSideDelayExerciseSteps {

    @Given("client side delay exercise page is opened")
    public void openExercisePage() {
        getHomePage().openHomePage().openClientSideDelayExercisePage();
    }

    @When("user clicks delay client side trigger button")
    public void clickClientSideDelayTriggerButton() {
       getClientSideDelayPage().clickTriggerButton();
    }

    @Then("text of appeared after client side delay element should be {string}")
    public void checkCalculatedDataText(String expectedText) {
        Assert.assertEquals(getClientSideDelayPage().getCalculatedDataText(), expectedText);
    }
}

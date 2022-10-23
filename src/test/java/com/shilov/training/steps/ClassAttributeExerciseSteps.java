package com.shilov.training.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import static com.shilov.training.utills.PageManager.*;

public class ClassAttributeExerciseSteps {

    @Given("class attribute exercise page is opened")
    public void openExercisePage() {
        getHomePage().openHomePage().openClassAttributeExercisePage();
    }
    @When("user clicks button by class attribute")
    public void clickBlueButton() {
        getClassAttributeExercisePage().clickBlueButton();
    }
    @Then("alert with text {string} appeared")
    public void checkAlertMessageAndHide(String text) {
        Assert.assertEquals(getClassAttributeExercisePage().getTextFromAlert(), text);
        getClassAttributeExercisePage().handleAlert();
    }
}

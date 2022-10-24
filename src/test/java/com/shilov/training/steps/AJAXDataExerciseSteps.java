package com.shilov.training.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import static com.shilov.training.utills.PageManager.*;

public class AJAXDataExerciseSteps {

    @Given("ajax data exercise page is opened")
    public void openExercisePage() {
        getHomePage().openHomePage().openAJAXDataExercisePage();
    }

    @When("user clicks ajax request trigger button")
    public void clickTriggerButton() {
        getAJAXDataExercisePage().clickTriggerButton();
    }

    @Then("text of appeared element should be {string}")
    public void checkTextOfAppearedElement(String text) {
        Assert.assertEquals(getAJAXDataExercisePage().getTextFromAppearedLabel(), text);
    }

}

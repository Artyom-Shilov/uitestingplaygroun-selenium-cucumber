package com.shilov.training.steps;

import com.shilov.training.utills.PageManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import static com.shilov.training.utills.PageManager.*;

public class ClickExerciseSteps {

    @Given("click exercise page is opened")
    public void openExercisePage() {
        getHomePage().openHomePage().openClickExercisePage();
    }

    @When("user clicks button that ignores DOM click event")
    public void clickButtonIgnoringClickEvent() {
        getClickExercisePage().clickButtonIgnoringDomClickEvent();
    }

    @Then("button that ignores DOM click event should change color to {string}")
    public void checkButtonColor(String expectedHexColor) {
        Assert.assertTrue(getClickExercisePage().checkButtonColorChange(expectedHexColor));
    }

}

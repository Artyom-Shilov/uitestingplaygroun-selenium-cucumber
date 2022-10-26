package com.shilov.training.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import static com.shilov.training.utills.PageManager.*;

public class MouseOverExerciseSteps {

    @Given("mouse over exercise page is opened")
    public void openExercisePage() {
        getHomePage().openHomePage().openMouseOverExercisePage();
    }

    @When("user moves mouse to link")
    public void moveMouseToLink() {
        getMouseOverExercisePage().moveMouseToLink();
    }

    @When("user clicks two times")
    public void clickTwoTimes() {
       getMouseOverExercisePage().clickInCurrentPlace().clickInCurrentPlace();
    }

    @Then("click count should be {int}")
    public void checkClickCounter(Integer expectedNumberOfClicks) {
        Assert.assertEquals(getMouseOverExercisePage().getNumberOfClicks(), expectedNumberOfClicks.toString());
    }
}

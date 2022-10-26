package com.shilov.training.steps;

import com.shilov.training.utills.PageManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static com.shilov.training.utills.PageManager.*;

public class ScrollBarsExerciseSteps {

    @Given("scrollbar exercise page is opened")
    public void openExercisePage() {
        getHomePage().openHomePage().openScrollbarsExercisePage();
    }

    @When("user scrolls to hiding button")
    public void scrollToHidingButton() {
        getScrollbarsExercisePage().scrollToHidingButton();
    }

    @Then("user clicks hiding button")
    public void clickHidingButton() {
       getScrollbarsExercisePage().clickHidingButton();
    }
}

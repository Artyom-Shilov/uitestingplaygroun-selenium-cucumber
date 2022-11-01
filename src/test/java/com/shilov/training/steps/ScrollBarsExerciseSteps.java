package com.shilov.training.steps;

import com.shilov.training.pages.ScrollbarsExercisePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static com.shilov.training.utills.PageManager.*;

public class ScrollBarsExerciseSteps extends BaseStep {

    private ScrollbarsExercisePage scrollbarsExercisePage = getScrollbarsExercisePage();

    @Given("scrollbar exercise page is opened")
    public void openExercisePage() {
        homePage.openScrollbarsExercisePage();
    }

    @When("user scrolls to hiding button")
    public void scrollToHidingButton() {
        scrollbarsExercisePage.scrollToHidingButton();
    }

    @Then("user clicks hiding button")
    public void clickHidingButton() {
       scrollbarsExercisePage.clickHidingButton();
    }
}

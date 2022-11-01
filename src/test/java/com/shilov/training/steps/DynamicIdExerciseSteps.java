package com.shilov.training.steps;

import com.shilov.training.pages.DynamicIdExercisePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import static com.shilov.training.utills.PageManager.*;

public class DynamicIdExerciseSteps extends BaseStep {

    private DynamicIdExercisePage dynamicIdExercisePage = getDynamicIdExercisePage();

    @Given("dynamic id exercise page is opened")
    public void openExercisePage() {
        homePage.openDynamicIdExercisePage();
    }

    @Then("user clicks button with dynamic id")
    public void clickButton() {
       dynamicIdExercisePage.clickButtonWithDynamicId();
    }
}

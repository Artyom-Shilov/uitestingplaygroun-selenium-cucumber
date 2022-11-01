package com.shilov.training.steps;

import com.shilov.training.pages.ClickExercisePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import static com.shilov.training.utills.PageManager.*;

public class ClickExerciseSteps extends BaseStep {

    private ClickExercisePage clickExercisePage = getClickExercisePage();

    @Given("click exercise page is opened")
    public void openExercisePage() {
       homePage.openClickExercisePage();
    }

    @When("user clicks button that ignores DOM click event")
    public void clickButtonIgnoringClickEvent() {
        clickExercisePage.clickButtonIgnoringDomClickEvent();
    }

    @Then("button that ignores DOM click event should change color to {string}")
    public void checkButtonColor(String expectedHexColor) {
        Assert.assertTrue(clickExercisePage.checkButtonColorChange(expectedHexColor));
    }

}

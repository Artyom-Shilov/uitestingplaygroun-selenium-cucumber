package com.shilov.training.steps;

import com.shilov.training.pages.MouseOverExercisePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import static com.shilov.training.utills.PageManager.*;

public class MouseOverExerciseSteps extends BaseStep {

    private MouseOverExercisePage mouseOverExercisePage = getMouseOverExercisePage();

    @Given("mouse over exercise page is opened")
    public void openExercisePage() {
        homePage.openMouseOverExercisePage();
    }

    @When("user moves mouse to link")
    public void moveMouseToLink() {
       mouseOverExercisePage.moveMouseToLink();
    }

    @When("user clicks two times")
    public void clickTwoTimes() {
       mouseOverExercisePage.clickInCurrentPlace().clickInCurrentPlace();
    }

    @Then("click count should be {int}")
    public void checkClickCounter(Integer expectedNumberOfClicks) {
        Assert.assertEquals(mouseOverExercisePage.getNumberOfClicks(), expectedNumberOfClicks.toString());
    }
}

package com.shilov.training.steps;

import com.shilov.training.pages.ProgressBarExercisePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import static com.shilov.training.utills.PageManager.*;

public class ProgressBarExerciseSteps extends BaseStep {

    private ProgressBarExercisePage progressBarExercisePage = getProgressBarExercisePage();

    @Given("progress bar exercise page is opened")
    public void openExercisePage() {
        homePage.openProgressBarExercisePage();
    }

    @When("user clicks start bar button")
    public void clickStartButton() {
        progressBarExercisePage.clickStartButton();
    }

    @When("user clicks stop button when bar reaches {string} value")
    public void clickStopButtonWhenBarReachesValue(String value) {
       progressBarExercisePage.clickStopButtonWhenProgressBarValueReachLimit(value);
    }

    @Then("result value must be positive and less than {int}")
    public void checkResultValue(Integer maximumResultValue) {
        int resultValue = Integer.parseInt(progressBarExercisePage.getResultValueAfterFinish());
        Assert.assertTrue(resultValue >= 0 && resultValue < maximumResultValue);
    }
}

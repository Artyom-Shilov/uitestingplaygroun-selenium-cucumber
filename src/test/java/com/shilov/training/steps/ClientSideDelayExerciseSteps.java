package com.shilov.training.steps;

import com.shilov.training.pages.ClientSideDelayExercisePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import static com.shilov.training.utills.PageManager.*;

public class ClientSideDelayExerciseSteps extends BaseStep {

    private ClientSideDelayExercisePage clientSideDelayExercisePage = getClientSideDelayPage();

    @Given("client side delay exercise page is opened")
    public void openExercisePage() {
       homePage.openClientSideDelayExercisePage();
    }

    @When("user clicks delay client side trigger button")
    public void clickClientSideDelayTriggerButton() {
      clientSideDelayExercisePage.clickTriggerButton();
    }

    @Then("text of appeared after client side delay element should be {string}")
    public void checkCalculatedDataText(String expectedText) {
        Assert.assertEquals(clientSideDelayExercisePage.getCalculatedDataText(), expectedText);
    }
}

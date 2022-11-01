package com.shilov.training.steps;

import com.shilov.training.pages.SampleAppExercisePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import static com.shilov.training.utills.PageManager.*;

public class SampleAppExerciseSteps extends BaseStep {

    private SampleAppExercisePage sampleAppExercisePage = getSampleAppExercisePage();

    private static final String DEFAULT_LOGIN = "test";
    private static final String DEFAULT_PASSWORD = "pwd";

    @Given("sample app exercise page is opened")
    public void openExercisePage() {
        homePage.openSampleAppExercisePage();
    }

    @When("user enters login {string}")
    public void enterLogin(String login) {
       sampleAppExercisePage.enterLogin(login);
    }

    @When("user enters password {string}")
    public void enterPassword(String password) {
       sampleAppExercisePage.enterPassword(password);
    }

    @When("user clicks log in button")
    public void clickLoginButton() {
       sampleAppExercisePage.clickLoginButton();
    }

    @Then("login status should be {string}")
    public void checkLoginStatus(String expectedLoginStatus) {
        Assert.assertEquals(sampleAppExercisePage.getLoginStatus(), expectedLoginStatus);
    }

    @Given("user did login")
    public void doLogin() {
      sampleAppExercisePage.enterLogin(DEFAULT_LOGIN).enterPassword(DEFAULT_PASSWORD).clickLoginButton();
    }

    @When("user clicks log out button")
    public void clickLogOutButton() {
       sampleAppExercisePage.clickLogoutButton();
    }



}

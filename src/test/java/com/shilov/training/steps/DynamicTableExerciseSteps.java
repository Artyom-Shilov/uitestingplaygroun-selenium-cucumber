package com.shilov.training.steps;

import com.shilov.training.utills.PageManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;

import static com.shilov.training.utills.PageManager.*;

public class DynamicTableExerciseSteps {

    @Given("dynamic table exercise is opened")
    public void openExercisePage() {
        getHomePage().openHomePage().openDynamicTableExercisePage();
    }

    @Then("text value of chrome CPU consumption from dynamic table cell and label must be the same")
    public void compareValuesFromTableCellAndLabel() {
        Assert.assertEquals(
                getDynamicTableExercisePage().getChromeCpuConsumptionFromTableCell(),
                getDynamicTableExercisePage().getChromeCpuConsumptionFromLabel());
    }
}

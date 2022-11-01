package com.shilov.training.steps;

import com.shilov.training.pages.DynamicTableExercisePage;
import com.shilov.training.utills.PageManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;

import static com.shilov.training.utills.PageManager.*;

public class DynamicTableExerciseSteps extends BaseStep {

    private DynamicTableExercisePage dynamicTableExercisePage = getDynamicTableExercisePage();

    @Given("dynamic table exercise is opened")
    public void openExercisePage() {
        homePage.openDynamicTableExercisePage();
    }

    @Then("text value of chrome CPU consumption from dynamic table cell and label must be the same")
    public void compareValuesFromTableCellAndLabel() {
        Assert.assertEquals(
                dynamicTableExercisePage.getChromeCpuConsumptionFromTableCell(),
                dynamicTableExercisePage.getChromeCpuConsumptionFromLabel());
    }
}

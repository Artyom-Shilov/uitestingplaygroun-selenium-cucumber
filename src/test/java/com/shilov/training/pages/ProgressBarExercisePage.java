package com.shilov.training.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ProgressBarExercisePage extends BasePage {

    private final Logger logger = LogManager.getLogger(ProgressBarExercisePage.class);

    @FindBy(id = "startButton")
    private WebElement startButton;

    @FindBy(id = "stopButton")
    private WebElement stopButton;

    @FindBy(id = "progressBar")
    private WebElement progressBar;

    @FindBy(id = "result")
    private WebElement resultElement;

    private static final String DEFAULT_RESULT_TEXT_AFTER_START = "Result: n/a, duration: n/a";

    public ProgressBarExercisePage(WebDriver driver) {
        super(driver);
    }

    public ProgressBarExercisePage clickStartButton() {
        waitForBeingClickable(10, startButton).click();
        logger.debug("start button has been clicked");
        return this;
    }

    public ProgressBarExercisePage clickStopButtonWhenProgressBarValueReachLimit(String limit) {
        new WebDriverWait(driver, Duration.ofSeconds(30))
                .pollingEvery(Duration.ofMillis(5))
                .until((ExpectedCondition<WebElement>) driver
                        -> progressBar.getText().equals(limit + "%") ? stopButton : null)
                .click();
        logger.debug("stop button has been clicked, limit is " + limit);
        return this;
    }

    public String getResultValueAfterFinish() {
        new WebDriverWait(driver, Duration.ofSeconds(2)).until((ExpectedCondition<Boolean>) driver ->
                !resultElement.getText().equals(DEFAULT_RESULT_TEXT_AFTER_START));
        return resultElement.getText().split(",")[0].split(" ")[1];
    }

}

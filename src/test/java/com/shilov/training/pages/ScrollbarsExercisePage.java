package com.shilov.training.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class ScrollbarsExercisePage extends BasePage {

    private final Logger logger = LogManager.getLogger(ScrollbarsExercisePage.class);

    @FindBy(id = "hidingButton")
    private WebElement hidingButton;

    public ScrollbarsExercisePage(WebDriver driver) {
        super(driver);
    }

    public ScrollbarsExercisePage scrollToHidingButton() {
        Actions actions = new Actions(driver);
        actions.moveToElement(hidingButton).build().perform();
        logger.debug("scroll to hiding button has been done");
        return this;
    }

    public ScrollbarsExercisePage clickHidingButton() {
        hidingButton.click();
        logger.debug("hiding button has been clicked");
        return this;
    }
}

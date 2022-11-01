package com.shilov.training.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class MouseOverExercisePage extends BasePage {

    private final Logger logger = LogManager.getLogger(MouseOverExercisePage.class);

    @FindBy(id = "clickCount")
    private WebElement clickCountElement;

    @FindBy(xpath = "//a[text() = 'Click me']")
    private WebElement linkForClick;

    private Actions actions = new Actions(driver);

    public MouseOverExercisePage(WebDriver driver) {
        super(driver);
    }

    public MouseOverExercisePage moveMouseToLink() {
        actions.moveToElement(linkForClick, 0, 0).build().perform();
        logger.debug("mouse has been moved to link");
        return this;
    }

    public MouseOverExercisePage clickInCurrentPlace() {
        actions.click().build().perform();
        logger.debug("link has been clicked");
        return this;
    }

    public String getNumberOfClicks() {
        return clickCountElement.getText();
    }
}

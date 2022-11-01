package com.shilov.training.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public abstract class BasePage {

    protected WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }

    protected WebElement waitForBeingClickable(long waitDurationInSeconds, WebElement element) {
        return new WebDriverWait(driver, Duration.ofSeconds(waitDurationInSeconds))
                .until(ExpectedConditions.elementToBeClickable(element));
    }
}

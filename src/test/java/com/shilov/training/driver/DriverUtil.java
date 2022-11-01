package com.shilov.training.driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverUtil {

    private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    private static final String DRIVER_TYPE_PROPERTY = "browser";

    private DriverUtil() {}

    public static WebDriver getDriver() {
        if (driver.get() == null) {
            switch (System.getProperty(DRIVER_TYPE_PROPERTY)) {
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver.set(new ChromeDriver());
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver.set(new FirefoxDriver());
                    break;
                case "edge":
                    WebDriverManager.edgedriver().setup();
                    driver.set(new FirefoxDriver());
                    break;
            }
        }
        driver.get().manage().window().maximize();
        return driver.get();
    }

    public static void quitDriver() {
        if (driver.get() != null) {
            driver.get().quit();
        }
        driver.remove();
    }


}

package com.shilov.training.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class DynamicTableExercisePage extends BasePage {

    @FindBy(xpath = "//div[@role = 'rowgroup'][1]//span")
    private List<WebElement> fieldsOfTable;

    @FindBy(xpath = "//div[@role = 'rowgroup'][2]//span[1]")
    private List<WebElement> firstColumnOfTable;

    @FindBy(xpath = "//p[@class = 'bg-warning']")
    private WebElement chromeCpuConsumptionLabel;

    private static final String CHROME_CPU_CELL_PATTERN = "//div[@role = 'rowgroup'][2]/div[@role = 'row'][%d]/span[%d]";
    private static final String CPU_CELL_TEXT = "CPU";
    private static final String CHROME_CELL_TEXT = "Chrome";

    public DynamicTableExercisePage(WebDriver driver) {
        super(driver);
    }

    public String getChromeCpuConsumptionFromTableCell() {
        return driver.findElement(By.xpath(String.format(
                CHROME_CPU_CELL_PATTERN, getNumberOfChromeCellInColumn(), getNumberOfCpuCellInRow()))).getText();
    }

    private int getNumberOfCpuCellInRow() {
        for (int i = 0; i < fieldsOfTable.size(); i++)  {
            if (fieldsOfTable.get(i).getText().equals(CPU_CELL_TEXT)) {
                return i + 1;
            }
        }
        return -1;
        //TODO Exception implementation
    }

    private int getNumberOfChromeCellInColumn() {
        for (int i = 0; i < firstColumnOfTable.size(); i++)  {
            if (firstColumnOfTable.get(i).getText().equals(CHROME_CELL_TEXT)) {
                return i + 1;
            }
        }
        return -1;
        //TODO Exception implementation
    }

    public String getChromeCpuConsumptionFromLabel() {
        return chromeCpuConsumptionLabel.getText().split(": ")[1];
    }

}

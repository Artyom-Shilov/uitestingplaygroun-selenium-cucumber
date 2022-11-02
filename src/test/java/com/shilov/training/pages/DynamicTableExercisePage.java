package com.shilov.training.pages;

import com.shilov.training.exceptions.DynamicTableException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class DynamicTableExercisePage extends BasePage {

    private final Logger logger = LogManager.getLogger(DynamicTableExercisePage.class);

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
        String chromeCpuConsumptionCellXpath = String.format(
                CHROME_CPU_CELL_PATTERN, getNumberOfChromeCellInColumn(), getNumberOfCpuCellInRow());
        logger.debug("chrome cpu consumption cell xpath: " + chromeCpuConsumptionCellXpath);
        return driver.findElement(By.xpath(chromeCpuConsumptionCellXpath)).getText();
    }

    private int getNumberOfCpuCellInRow() {
        for (int i = 0; i < fieldsOfTable.size(); i++)  {
            if (fieldsOfTable.get(i).getText().equals(CPU_CELL_TEXT)) {
                int cellNumber = i + 2;
                logger.debug("number of cpu cell is " + cellNumber);
                return cellNumber;
            }
        }
        throw new DynamicTableException("could not find CPU cell");
    }

    private int getNumberOfChromeCellInColumn() {
        for (int i = 0; i < firstColumnOfTable.size(); i++)  {
            if (firstColumnOfTable.get(i).getText().equals(CHROME_CELL_TEXT)) {
                int cellNumber = i + 1;
                logger.debug("number of Chrome cell in column is " + cellNumber);
                return cellNumber;
            }
        }
        throw new DynamicTableException("could not find Chrome cell");
    }

    public String getChromeCpuConsumptionFromLabel() {
        return chromeCpuConsumptionLabel.getText().split(": ")[1];
    }

}

package org.example.google;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ResultsPage {
    WebDriver driver;

    public ResultsPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy (xpath = "//div[contains(@class, 'logo')]/a")
    private WebElement logo;

    @FindBy ( xpath = "//div[contains(@id, 'result')]")
    private WebElement results;

    public String getResultsNumber(){
        String str = results.getText().replaceAll("[^0-9]", "");
        return str.substring(0, str.length()-3);
    }

    public void logoClick() {
        logo.click();
    }
}

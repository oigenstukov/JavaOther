package org.example.google;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {
    public WebDriver driver;

    public SearchPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy (xpath = "//input[contains(@role, 'combobox')]")
    private WebElement searchField;

    @FindBy (xpath = "(//input[@name='btnK'])[1]")
    private WebElement searchButton;

    public void inputQuery(String query) {
        searchField.sendKeys(query);
    }

    public void clickSearchBtn() {
        searchButton.click();
    }
}

package org.example.google;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class SearchTest {
    public static SearchPage searchPage;
    public static ResultsPage resultsPage;
    public static WebDriver driver;

    @BeforeClass
    public static void setup() {
        System.setProperty("webdriver.chrome.driver", ConfProperties.getProperty("chromedriver"));
        driver = new ChromeDriver();
        searchPage = new SearchPage(driver);
        resultsPage = new ResultsPage(driver);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(ConfProperties.getProperty("searchPage"));
    }

    @Test
    public void searchTest() {
        searchPage.inputQuery(ConfProperties.getProperty("testQuery"));
        searchPage.clickSearchBtn();
        String numOfRes = resultsPage.getResultsNumber();
        Assert.assertEquals(ConfProperties.getProperty("results"), numOfRes);
    }

    @AfterClass
    public static void tearDown() {
        resultsPage.logoClick();
        driver.close();
    }
}

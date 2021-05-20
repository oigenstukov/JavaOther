package org.example;

import org.example.pages.ResultsPage;
import org.example.pages.SearchPage;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class SearchTest {
    public static SearchPage searchPage;
    public static ResultsPage resultsPage;

    @BeforeClass
    public static void setup() {
        WebDriverSingleton.initialize("google chrome");
        WebDriverSingleton.driver.get(ConfProperties.getProperty("searchPage"));
        searchPage = new SearchPage(WebDriverSingleton.driver);
        resultsPage = new ResultsPage(WebDriverSingleton.driver);
    }

    @Test
    public void searchTest() {
        searchPage.inputQuery(org.example.ConfProperties.getProperty("testQuery"));
        searchPage.clickSearchBtn();
        String numOfRes = resultsPage.getResultsNumber();
        Assert.assertEquals(ConfProperties.getProperty("results"), numOfRes);
    }

    @AfterClass
    public static void tearDown() {
        resultsPage.logoClick();
        WebDriverSingleton.driver.close();
    }
}

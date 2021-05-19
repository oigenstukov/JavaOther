package org.example.firefox;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class WebDriverSingleton {
    public static WebDriver driver = null;

    public static void initialize() {
        if (driver == null) {
            driver = new FirefoxDriver();
            System.setProperty("webdriver.gecko.driver", ConfProperties.getProperty("firefoxDriver"));
        }

        driver.get(ConfProperties.getProperty("loginPage"));
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    public static void quit() {
        driver.quit();
        driver = null;
    }

}

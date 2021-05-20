package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class WebDriverSingleton {
    public static WebDriver driver = null;

    public static void initialize(String driverName) {
        if (driver == null) {
            if (driverName.contains("firefox") || driverName.contains("gecko")) {
                driver = new FirefoxDriver();
                System.setProperty("webdriver.gecko.driver", ConfProperties.getProperty("firefoxDriver"));
            } else if (driverName.contains("google") || driverName.contains("chrome")) {
                driver = new ChromeDriver();
                System.setProperty("webdriver.chrome.driver", org.example.ConfProperties.getProperty("chromedriver"));
            }
        }

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    public static void quit() {
        driver.quit();
        driver = null;
    }

}

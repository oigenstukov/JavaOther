package org.example.firefox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginPage {

    private static WebElement loginField = WebDriverSingleton.driver.findElement(By.id("id_login"));
    private static WebElement passwordField = WebDriverSingleton.driver.findElement(By.id("id_pwd"));
    private static WebElement singInButton = WebDriverSingleton.driver.findElement(By.xpath("//input[contains(@class, 'button')]"));


    public static void fillInLogin(String login) {
        loginField.sendKeys(login);
    }

    public static void fillInPassword(String password) {
        passwordField.sendKeys(password);
    }

    public static void singInButton() {
        singInButton.click();
    }
}

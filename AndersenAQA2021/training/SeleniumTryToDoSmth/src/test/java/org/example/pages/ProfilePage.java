package org.example.pages;

import org.example.WebDriverSingleton;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ProfilePage {

    private static WebElement welcome = WebDriverSingleton.driver.findElement(
            By.xpath("//div[contains(@id, 'div_select_move_-3')]/../preceding-sibling::div[contains(@class, 'title')]"));
    private static WebElement exitButton = WebDriverSingleton.driver.findElement(By.xpath("//div[contains(@class, 'exit')]"));

    public static String getVerifyMsg() {
        return welcome.getText();
    }

    public static void exit() {
        exitButton.click();
    }

}

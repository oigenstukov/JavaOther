package org.example.pages;

import org.example.WebDriverSingleton;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MainPage {

    public static void singInFirstStep() {
        WebElement singIn = WebDriverSingleton.driver.findElement(By.xpath("//a[contains(@href, 'page')]"));
        singIn.click();
    }

    public static void changeLang() {
        WebElement language = WebDriverSingleton.driver.findElement(By.id("id_span_select_language"));
        language.click();
        WebElement eng = WebDriverSingleton.driver.findElement(By.xpath("(//li[contains(@onclick, 'language=en')])[2]"));
        eng.click();
    }
}

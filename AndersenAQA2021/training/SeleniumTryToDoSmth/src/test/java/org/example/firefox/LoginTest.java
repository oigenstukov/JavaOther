package org.example.firefox;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class LoginTest {

    @BeforeSuite
    public static void setup(){
        WebDriverSingleton.initialize();
    }

    @Test
    public static void loginTest() {
        MainPage.changeLang();
        MainPage.singInFirstStep();
        LoginPage.fillInLogin(ConfProperties.getProperty("login"));
        LoginPage.fillInPassword((ConfProperties.getProperty("password")));
        LoginPage.singInButton();

        Assert.assertEquals(ConfProperties.getProperty("verifyMsg"), ProfilePage.getVerifyMsg());
    }

    @AfterSuite
    public static void teardown() {
        ProfilePage.exit();
        WebDriverSingleton.quit();
    }
}

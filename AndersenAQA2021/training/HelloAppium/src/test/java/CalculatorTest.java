import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.*;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class CalculatorTest {
    private AndroidDriver driver;
    
    @BeforeMethod
    public void setUp() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        // iPhone Simulator, iPad Simulator, iPhone Retina 4-inch, Android Emulator, Galaxy S4 etc.
        capabilities.setCapability("deviceName", "pixel");
        // Operating system name
        capabilities.setCapability("platformName", "Android");
        // Operating system version
        capabilities.setCapability("platformVersion", "9.0");
        // Unique Device Identifier
        capabilities.setCapability("udid", "emulator-5554");
        // Android application Java-package, witch we want to run. (APK info)
        capabilities.setCapability("appPackage", "com.android.calculator2");
        // Activity witch we want to run from package above. (APK info)
        capabilities.setCapability("appActivity", "com.android.calculator2.Calculator");
        
        driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
    }
    
    @Test
    public void testAddition() {
        MobileElement buttonTwo = (MobileElement) driver.findElementById("com.android.calculator2:id/digit_2");
        buttonTwo.click();
        
        driver.findElementById("com.android.calculator2:id/op_add").click();
        
        driver.findElementById("com.android.calculator2:id/digit_3").click();
        
        MobileElement results = (MobileElement) driver.findElementById("com.android.calculator2:id/result");
        
        Assert.assertEquals("5", results.getText(), "Result should be equals 5");
    }
    
    @AfterMethod
    public void teardown() {
        driver.quit();
    }
}

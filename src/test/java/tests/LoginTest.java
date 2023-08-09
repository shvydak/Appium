package tests;

import config.AppiumConfig;
import org.testng.Assert;
import org.testng.annotations.Test;
import screens.SplashScreen;

public class LoginTest extends AppiumConfig {
    @Test
    public void loginSuccess() {
        boolean result = new SplashScreen(driver)
                .checkCurrentVersion("Version 1.0.0")
                .fillEmail("qwe123@gmail.com")
                .fillPassword("qweQWE123!@#")
                .clickLoginButton()
                .isActivityTitleContainText("Contact list");
        Assert.assertTrue(result);
    }
}

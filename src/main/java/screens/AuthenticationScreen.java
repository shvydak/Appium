package screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.support.FindBy;

public class AuthenticationScreen extends BaseScreen {
    public AuthenticationScreen(AppiumDriver<AndroidElement> driver) {
        super(driver);
    }

    @FindBy(id = "com.sheygam.contactapp:id/inputEmail")
    AndroidElement emailField;
    @FindBy(id = "com.sheygam.contactapp:id/inputPassword")
    AndroidElement passwordField;
    @FindBy(id = "com.sheygam.contactapp:id/loginBtn")
    AndroidElement loginButton;

    public AuthenticationScreen fillEmail(String email) {
        waitUntilVisible(emailField, 10);
        type(emailField, email);
        return this;
    }

    public AuthenticationScreen fillPassword(String password) {
        type(passwordField, password);
        return this;
    }

    public ContactListScreen clickLoginButton() {
        loginButton.click();
        return new ContactListScreen(driver);
    }

}

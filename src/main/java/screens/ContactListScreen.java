package screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.support.FindBy;

public class ContactListScreen extends BaseScreen {
    public ContactListScreen(AppiumDriver<AndroidElement> driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@text='Contact list']")
    AndroidElement contactList;

    public boolean isActivityTitleContainText(String text) {
        waitUntilVisible(contactList, 10);
        return isContainText(contactList, text, 8);
    }

}

package Appium_Tutor.Appium_Tutor;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Selectors extends Base{

	public static void main(String[] args) throws MalformedURLException {
		
		AndroidDriver<AndroidElement> driver = capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// Xpath
		driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
		driver.findElementByXPath("//android.widget.TextView[@text='3. Preference dependencies']").click();
		// ID
		driver.findElementById("android:id/checkbox").click();
		driver.findElementByXPath("//android.widget.TextView[@text='WiFi settings']").click();
		// Class
		driver.findElementByClassName("android.widget.EditText").sendKeys("Hello-Appium");
		// AndroidUIAutomator
		driver.findElementByAndroidUIAutomator("text(\"OK\")").click();
		
	}

}

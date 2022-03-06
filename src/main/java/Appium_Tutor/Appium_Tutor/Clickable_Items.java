package Appium_Tutor.Appium_Tutor;

import java.net.MalformedURLException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Clickable_Items extends Base {

	public static void main(String[] args) throws MalformedURLException {

		AndroidDriver<AndroidElement> driver = capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElementByAndroidUIAutomator("text(\"Access'ibility\")").click();
		// Validate clickable feature for all items
		List<AndroidElement> i = driver.findElementsByXPath("//android.widget.TextView[@clickable='false']");
		System.out.println(i.size());

	}

}

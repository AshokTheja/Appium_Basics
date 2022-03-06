package Appium_Tutor.Appium_Tutor;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class Base {

	public static AndroidDriver<AndroidElement> capabilities() throws MalformedURLException {

		File appDir = new File("Apps");
		File app = new File(appDir, "ApiDemos-debug.apk");
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel_4a_API_30");
		caps.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
		caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
		AndroidDriver<AndroidElement> driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), caps);

		return driver;

	}

}

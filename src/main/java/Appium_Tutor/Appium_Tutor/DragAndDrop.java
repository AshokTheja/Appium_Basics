package Appium_Tutor.Appium_Tutor;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import static io.appium.java_client.touch.offset.ElementOption.element;

public class DragAndDrop extends Base {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) throws MalformedURLException, InterruptedException {

		AndroidDriver<AndroidElement> driver = capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
		driver.findElementByXPath("//android.widget.TextView[@text='Drag and Drop']").click();
		TouchAction ta = new TouchAction(driver);
		WebElement source = driver.findElementsByClassName("android.view.View").get(0);
		WebElement dest = driver.findElementsByClassName("android.view.View").get(1);

		ta.longPress(element(source)).moveTo(element(dest)).release().perform();
		boolean flag = driver.findElementByXPath("//android.widget.TextView[@text='Dropped!']").isDisplayed();
		if(flag)
			System.out.println("Drag & Drop Successful!");

	}

}

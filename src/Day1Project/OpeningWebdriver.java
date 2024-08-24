package Day1Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpeningWebdriver {

	public static void main(String[] args) {
		System.setProperty("WebDriver.chrome.driver", "./chromedriver");
		WebDriver Driver =new ChromeDriver();
		Driver.get("https://www.google.com/");
		

	}

}

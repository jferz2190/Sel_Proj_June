package launchBrowser;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome {
	
	public static void main(String[] args) throws InterruptedException {
		
		//Scanner scn = new Scanner(System.in);
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jhuma\\Desktop\\Selenium\\SeleniumProject\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		//Thread.sleep(10000);
		
		driver.close();
		driver.quit();
		
	}
}

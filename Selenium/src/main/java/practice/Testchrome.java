package practice;

import org.openqa.selenium.chrome.ChromeDriver;

public class Testchrome {
	public static void main(String[] args) {
		System.setProperty("webdriver.driver.chromedriver", "./drivers/chromedriver.exe");
		new ChromeDriver();
	}
}
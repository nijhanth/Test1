package practice;

import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/window");
		driver.findElement(By.id("multi")).click();
		Set<String> handle3 = driver.getWindowHandles();
		Iterator var4 = handle3.iterator();

		while (var4.hasNext()) {
			String handlefile = (String) var4.next();
			driver.switchTo().window(handlefile);
			String url = driver.getCurrentUrl();
			System.out.println(url);
		}

		driver.quit();
	}
}
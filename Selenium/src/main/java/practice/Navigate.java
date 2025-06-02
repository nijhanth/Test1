package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {
	public static void main(String[] args) {
		System.setProperty("webdriver.driver.chromedriver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in");
		driver.findElement(By.linkText("Work-Space")).click();
		driver.findElement(By.xpath("//a[@href='/button']")).click();
		String current = driver.getCurrentUrl();
		System.out.println(current);
		driver.findElement(By.xpath("//button[.='Goto Home']")).click();
		String update = driver.getCurrentUrl();
		System.out.println(update);
		driver.navigate().back();
		String update2 = driver.getCurrentUrl();
		System.out.println(update2);
		driver.navigate().refresh();
	}
}
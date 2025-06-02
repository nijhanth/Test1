package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {
	public static void main(String[] args) {
		System.setProperty("webdriver.driver.chromedriver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in");
		driver.findElement(By.linkText("Work-Space")).click();
		driver.findElement(By.xpath("//a[@href='/alert']")).click();
		driver.findElement(By.xpath("//button[.='Simple Alert']")).click();
		org.openqa.selenium.Alert alr = driver.switchTo().alert();
		System.out.println(alr.getText());
		alr.accept();
		driver.findElement(By.xpath("//button[.='Confirm Alert']")).click();
		driver.switchTo().alert().dismiss();
		driver.findElement(By.xpath("//button[.='Prompt Alert']")).click();
		org.openqa.selenium.Alert keys = driver.switchTo().alert();
		keys.sendKeys("User1");
		keys.accept();
		driver.quit();
	}
}
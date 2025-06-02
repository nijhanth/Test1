package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Inputs {
	public static void main(String[] args) {
		System.setProperty("webdriver.driver.chromedriver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/edit");
		driver.findElement(By.id("fullName")).sendKeys(new CharSequence[]{"Nijhanth"});
		driver.findElement(By.id("join")).sendKeys(new CharSequence[]{" person", Keys.TAB});
		String values = driver.findElement(By.id("getMe")).getAttribute("value");
		System.out.println(values);
		driver.findElement(By.id("clearMe")).clear();
		boolean isenable = driver.findElement(By.id("noEdit")).isEnabled();
		System.out.println(isenable);
		String read = driver.findElement(By.id("dontwrite")).getAttribute("readonly");
		System.out.println(read);
	}
}
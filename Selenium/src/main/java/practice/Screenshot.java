package practice;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Screenshot {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.driver.chromedriver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in");
		driver.findElement(By.linkText("Work-Space")).click();
		File source = (File) ((RemoteWebDriver) driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("./image/img1.png");
		FileHandler.copy(source, dest);
		File source2 = (File) driver.findElement(By.xpath("(//app-menu[@class='menu-card'])[19]"))
				.getScreenshotAs(OutputType.FILE);
		File dest2 = new File("./image/img2.png");
		FileHandler.copy(source2, dest2);
	}
}
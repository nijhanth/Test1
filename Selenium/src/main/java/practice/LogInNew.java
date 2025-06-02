package practice;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LogInNew {
	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in");
		driver.findElement(By.linkText("Work-Space")).click();
		driver.manage().timeouts().implicitlyWait(10L, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Page Object Model")).click();
		driver.manage().timeouts().implicitlyWait(10L, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//i[contains(@class,'user')]")).click();
		driver.manage().timeouts().implicitlyWait(10L, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@placeholder='Enter Username']")).sendKeys(new CharSequence[]{"mor_2314"});
		driver.findElement(By.xpath("//input[@placeholder='Enter Password']")).sendKeys(new CharSequence[]{"83r5^_"});
		driver.findElement(By.xpath("//button[.='Login']")).click();
		driver.quit();
	}
}
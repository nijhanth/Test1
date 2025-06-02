package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFrame {
	public static void main(String[] args) {
		System.setProperty("webdriver.driver.chromedriver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in");
		driver.findElement(By.linkText("Work-Space")).click();
		driver.findElement(By.xpath("//a[@href='/frame']")).click();
		driver.switchTo().frame("firstFr");
		driver.findElement(By.xpath("//input[@placeholder='Enter name']")).sendKeys(new CharSequence[]{"User"});
		driver.findElement(By.name("lname")).sendKeys(new CharSequence[]{"1"});
		WebElement frame1 = driver.findElement(By.xpath("//iframe[@src='innerframe']"));
		driver.switchTo().frame(frame1);
		driver.findElement(By.name("email")).sendKeys(new CharSequence[]{"user1@gmail.com"});
		driver.switchTo().defaultContent();
		WebElement res = driver.findElement(By.linkText("Watch tutorial"));
		System.out.println(res.getText());
		driver.quit();
	}
}
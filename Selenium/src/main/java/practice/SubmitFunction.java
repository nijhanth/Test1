package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SubmitFunction {
	public static void main(String[] args) {
		System.setProperty("webdriver.driver.chromedriver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/forms");
		driver.findElement(By.id("firstname")).sendKeys(new CharSequence[]{"User"});
		driver.findElement(By.id("lasttname")).sendKeys(new CharSequence[]{"123"});
		WebElement mail = driver.findElement(By.id("email"));
		mail.clear();
		mail.sendKeys(new CharSequence[]{"hello@gmail.com"});
		WebElement countrycode = driver.findElement(By.xpath("//div[@class='column is-half']/div/div/div/select[1]"));
		Select code = new Select(countrycode);
		code.selectByContainsVisibleText("India (+91)");
		driver.findElement(By.id("Phno")).sendKeys(new CharSequence[]{"1234567890"});
		driver.findElement(By.id("Addl1")).sendKeys(new CharSequence[]{"ABC"});
		driver.findElement(By.id("Addl2")).sendKeys(new CharSequence[]{"DEF"});
		driver.findElement(By.id("state")).sendKeys(new CharSequence[]{"TN"});
		driver.findElement(By.id("postalcode")).sendKeys(new CharSequence[]{"600001"});
		WebElement date = driver.findElement(By.id("Date"));
		date.sendKeys(new CharSequence[]{"12-05-2997"});
		driver.findElement(By.id("male")).click();
		driver.findElement(By.linkText("terms and conditions")).click();
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}
}
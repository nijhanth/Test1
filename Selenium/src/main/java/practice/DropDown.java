package practice;

import java.util.Iterator;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
	public static void main(String[] args) {
		System.setProperty("webdriver.driver.chromedriver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/dropdowns");
		WebElement selec = driver.findElement(By.id("fruits"));
		Select st = new Select(selec);
		st.selectByContainsVisibleText("Mango");
		WebElement multi = driver.findElement(By.id("superheros"));
		Select mul = new Select(multi);
		mul.selectByIndex(0);
		mul.selectByContainsVisibleText("The Avengers");
		WebElement country = driver.findElement(By.id("country"));
		Select slt = new Select(country);
		slt.selectByValue("India");
		WebElement ele2 = driver.findElement(By.id("lang"));
		Select lang = new Select(ele2);
		List<WebElement> allhero = lang.getOptions();
		Iterator var12 = allhero.iterator();

		while (var12.hasNext()) {
			WebElement WebElement = (WebElement) var12.next();
			System.out.println(WebElement.getText());
		}

		driver.quit();
	}
}
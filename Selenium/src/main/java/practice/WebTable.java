package practice;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/table");
		driver.manage().window().maximize();
		WebElement table = driver.findElement(By.id("simpletable"));
		List<WebElement> header = table.findElements(By.tagName("th"));
		List<WebElement> body = table.findElements(By.cssSelector("tbody tr"));
		int size = body.size();
		System.out.println(size);

		for (int i = 0; i < size; ++i) {
			List<WebElement> name = table.findElements(By.tagName("td"));
			WebElement user = (WebElement) name.get(i);
			String res = user.getText();
			System.out.println(res);
			if (res.equals("Raj")) {
				WebElement clk = ((WebElement) name.get(3)).findElement(By.tagName("input"));
				clk.click();
				break;
			}
		}

	}
}
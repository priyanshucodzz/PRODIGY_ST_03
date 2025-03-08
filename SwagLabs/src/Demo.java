import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		    WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://www.saucedemo.com/");
	        WebElement id = driver.findElement(By.id("user-name"));
	        id.sendKeys("standard_user");
	        WebElement password = driver.findElement(By.id("password"));
	        password.sendKeys("secret_sauce");
	        password.submit();
		

	}

}

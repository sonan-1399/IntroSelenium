import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SelenIntro {

	public static void main(String[] args) {
		
		//Invoking Browser
//		System.setProperty("webdriver.com.driver","C:/Users/snthadev/Documents/chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
		
		System.setProperty("webdriver.com.driver","C:/Users/snthadev/Documents/msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		
//		WebDriver driver = new FirefoxDriver();
//		System.setProperty("webdriver.com.driver","C:/Users/snthadev/Documents/geckodriver.exe");
		
		driver.get("https://rahulshettyacademy.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println("The title has been displayed");
		driver.close();
		driver.quit();
		
	}

}

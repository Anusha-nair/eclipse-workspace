import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class BrowserTest
{
	public static void main(String[]args)
	{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Anusha Nair\\ISTQB installation\\selenium\\selenium-java-3.141.59\\drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
String url = "http://newtours.demoaut.com";

      driver.get(url);
}
}

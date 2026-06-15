package selenium;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class As103 {

	public static void main(String[] args) {
		
       ChromeDriver driver =new ChromeDriver();
	   EdgeDriver driver1 =new EdgeDriver();
	   FirefoxDriver driver2 = new FirefoxDriver();
       driver.get("https://www.google.com/");
       driver1.get("https://www.google.com/");
       driver2.get("https://www.google.com/");
       
	}

}

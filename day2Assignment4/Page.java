package week2.day2Assignment4;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Page {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Link.html");		
		driver.manage().window().maximize();
		System.out.println("The title of the page is:  "+driver.getTitle());   
		System.out.println("The URL of the page is:  "+driver.getCurrentUrl()); 
		System.out.println("the source" + "is"+driver.getPageSource());
		String attribute = driver.findElement(By.linkText("Find where am supposed to go without clicking me?")).getAttribute("href");
		System.out.println("The Attribute is  "+attribute);
		driver.close();
		
	}

}
package week2.day2Assignment4;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class Image {


	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		// TODO Auto-generated method stub
		driver.get("http://leafground.com/pages/Image.html");
		driver.manage().window().maximize();
		System.out.println("The title of the page is:  "+driver.getTitle());   
		System.out.println("The URL of the page is:  "+driver.getCurrentUrl()); 
		System.out.println("the source" + "is"+driver.getPageSource());
		System.out.println( driver.findElement (By.xpath("//label[contains(@for,position)]")).getText());
	  
	}

}
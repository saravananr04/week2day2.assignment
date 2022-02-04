package week2.day2Assignment4;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Dropdown.html");
		driver.manage().window().maximize();
		System.out.println("The title of the page is:  "+driver.getTitle());   
		System.out.println("The URL of the page is:  "+driver.getCurrentUrl()); 
		System.out.println("the source" + "is"+driver.getPageSource());
		boolean selected = driver.findElement(By.id("dropdown1")).isSelected();
		System.out.println(selected);
		String tagName = driver.findElement(By.id("dropdown1")).getTagName();
		System.out.println(tagName);
	}

}
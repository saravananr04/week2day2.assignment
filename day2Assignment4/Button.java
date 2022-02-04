package week2.day2Assignment4;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Button {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Button.html");
		System.out.println("The title of the page is:  "+driver.getTitle());   
		System.out.println("The URL of the page is:  "+driver.getCurrentUrl()); 
		System.out.println("the source" + "is"+driver.getPageSource());
		String cssValue = driver.findElement(By.id("color")).getCssValue("background-color");
		System.out.println("The Background color in rgba is "+cssValue);
		System.out.println( driver.findElement(By.id("size")).getText());
        int location=driver.findElement(By.id("color")).getLocation().getX();
        System.out.println("The location of X is "+location);
        org.openqa.selenium.Dimension size = driver.findElement(By.id("size")).getSize();
    	System.out.println("The size is :"+size);
    	System.out.println( driver.findElement(By.id("color")).isDisplayed());

	}

}
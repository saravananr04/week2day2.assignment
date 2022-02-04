package week2.day2Assignment4;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Edit {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
	    driver.get("http://leafground.com/pages/Edit.html");
		driver.manage().window().maximize();
		System.out.println("the title of this page is"+driver.getTitle());
		System.out.println("the Url is: " + driver.getCurrentUrl());
		System.out.println("the source" + "is"+driver.getPageSource());
        driver.findElement(By.id("email")).sendKeys("nelson08mn@gmail.com");
        System.out.println(driver.findElement(By.name("username")).getAttribute("value"));

	}

}
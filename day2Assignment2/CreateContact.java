package week2.day2Assignment2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();

		driver.findElement(By.id("username")).sendKeys("DemoCSR");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		//driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		driver.findElement(By.xpath("//a[text()='Create Contact']")).click();
		driver.findElement(By.xpath("//input[@id='firstNameField']")).sendKeys("saran");
		driver.findElement(By.xpath("//input[@id='lastNameField']")).sendKeys("r");
		driver.findElement(By.xpath("//input[@id='createContactForm_firstNameLocal']")).sendKeys("ABC");
		driver.findElement(By.xpath("//input[@id='createContactForm_lastNameLocal']")).sendKeys("XYZ");
		//driver.findElement(By.xpath("")).sendKeys("");
		driver.findElement(By.xpath("//input[@id='createContactForm_departmentName']")).sendKeys("Automation");
		driver.findElement(By.xpath("//textarea[@id='createContactForm_description']")).sendKeys("Have a Nice Day");
		driver.findElement(By.xpath("//input[@id='createContactForm_primaryEmail']")).sendKeys("saravanan04091997@gmail.com");
		
		WebElement state = driver.findElement(By.xpath("//select[@id='createContactForm_generalStateProvinceGeoId']"));
		Select s=new Select(state);
		s.selectByVisibleText("New York");
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		//driver.findElement(By.xpath("")).sendKeys("");
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		driver.findElement(By.xpath("//textarea[@id='updateContactForm_description']")).clear();
		driver.findElement(By.xpath("//textarea[@id='updateContactForm_importantNote']")).sendKeys("Have a Great Day");
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		System.out.println("Page title is : " + driver.getTitle());
		driver.close();
		
		
	}

}

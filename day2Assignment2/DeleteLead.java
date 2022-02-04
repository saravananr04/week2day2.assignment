package week2.day2Assignment2;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("DemoCSR");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		//driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("9176313427");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(5000);
		String text = driver.findElement(By.xpath("(//a[@class='linktext'])[4]")).getText();
		driver.findElement(By.xpath("(//a[@class='linktext'])[4]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@class='subMenuButtonDangerous']")).click();
		//driver.findElement(By.xpath("//span[text()='Phone']")).click();
		System.out.println(text);
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		Thread.sleep(5000);
		//driver.findElement(By.xpath("//input[@class=' x-form-text x-form-field ']")).sendKeys(text);
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(text);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		String s=driver.findElement(By.className("x-paging-info")).getText();
				//System.out.println(s);
		if(s.equals("No records to display"))
		{
			System.out.println("Text Matched");
		}
		else
		{
			System.out.println("Text not Matched");
		}
		driver.close();
	}
		//driver.findElement(By.linkText("")).click();
}
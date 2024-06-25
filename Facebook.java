package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {
public static void main(String[] args) {
	
	//launch browser
	ChromeDriver driver = new ChromeDriver();
	
	//get url
	driver.get("https://en-gb.facebook.com/");
	
	//maximize window
	driver.manage().window().maximize();
	
	//click create account button using xpath
	driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
	
	//enter the username
	driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("keertana");
	
	//enter the surname
	driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("boopathy");
	
	//enter the phone number
	driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("8344438252");
	
	//enter password
	driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("Jyosai123");
	
	//select dropdown for birth date
	WebElement birthdateWE = driver.findElement(By.xpath("//select[@name='birthday_day']"));
	Select birthdateDD = new Select(birthdateWE);
	birthdateDD.selectByValue("27");
	
	//select the birthmonth
	WebElement birthmonthWE = driver.findElement(By.xpath("//select[@name='birthday_month']"));
	Select birthmonthDD = new Select(birthmonthWE);
	birthmonthDD.selectByVisibleText("Nov");
	
	//select the birth year
	WebElement birthyearWE = driver.findElement(By.xpath("//select[@name='birthday_year']"));
	Select birthyearDD = new Select(birthyearWE);
	birthyearDD.selectByVisibleText("1988");
	
	//click on gender
	driver.findElement(By.xpath("//input[@value='1']")).click();
	
}
}

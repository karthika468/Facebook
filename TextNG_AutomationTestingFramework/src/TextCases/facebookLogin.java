package TextCases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class facebookLogin {
	WebDriver driver;
  @Test(priority=1,description="login with valid credentials")
  public void login1() {
	  driver.findElement(By.id("email")).sendKeys("valid");
		driver.findElement(By.name("password")).sendKeys("valid");
		driver.findElement(By.name("submit")).click();
}
  @Test(priority=2,description="login with valid uname and invalid password")
  public void login2() {
	  driver.findElement(By.id("email")).sendKeys("valid");
		driver.findElement(By.name("password")).sendKeys("invalid");
		driver.findElement(By.name("submit")).click();
}
  @Test(priority=3,description="login with invalid uname and valid password")
  public void login3() {
	  driver.findElement(By.id("email")).sendKeys("invalid");
		driver.findElement(By.name("password")).sendKeys("valid");
		driver.findElement(By.name("submit")).click();
  }
  @Test(priority=4,description="login with invalid uname and invalid password")
  public void login4() {
	  driver.findElement(By.id("email")).sendKeys("invalid");
		driver.findElement(By.name("password")).sendKeys("invalid");
		driver.findElement(By.name("submit")).click();
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Hp\\eclipse-workspace\\SeleniumRogersoft\\drivers\\chromedriver.exe");
	    driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/");
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}

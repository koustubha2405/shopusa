package Testpages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import Base.Basetest;
import pages.Loginpage;

public class LogintestPage extends Basetest {
	Loginpage lp;

	@Test
	public void VerifyLoginFunction() throws IOException {
		lp = new Loginpage(driver);
		lp.gotourl();
		lp.perfromlogin();
	}

	@Test
	public void login() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://admin-demo.nopcommerce.com/login");
		WebElement user = driver.findElement(By.id("Email"));
		WebElement password = driver.findElement(By.name("Password"));
		WebElement loginbtn = driver.findElement(By.xpath("//button[@type='submit']"));
		user.clear();
		user.sendKeys("admin@yourstore.com");
		password.clear();
		password.sendKeys("admin");
		loginbtn.click();
	}
}

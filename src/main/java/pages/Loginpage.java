package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	WebDriver driver;

	public Loginpage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "Email")
	WebElement usernamefiled;

	@FindBy(name = "Password")
	WebElement passwordFiled;

	@FindBy(xpath = "//button[@type=\"submit\"]")
	WebElement loginBtn;
	
	public void gotourl() {
		driver.manage().window().maximize();
		driver.get("https://admin-demo.nopcommerce.com/login");
	}
	
	public void perfromlogin() {
		usernamefiled.clear();
		usernamefiled.sendKeys("admin@yourstore.com");
		passwordFiled.clear();
		passwordFiled.sendKeys("admin");
		loginBtn.click();
	}
	
	

}

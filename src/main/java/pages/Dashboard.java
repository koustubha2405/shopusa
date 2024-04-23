package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dashboard {
	
	public WebDriver driver;
	
	public Dashboard(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//h1[contains(text(),'Dashboard')]")
	WebElement pagetitle;
	
	@FindBy(xpath = "//i[@class=\"nav-icon fas fa-book\"]")
	WebElement cataloglink;
	
	@FindBy(xpath = "//a[@href=\"/Admin/Product/List\"]")
	WebElement productlink;

	
	public String getpageTitle() {
		return pagetitle.getText();
	}
	
	public void clickonProductlink() throws InterruptedException {
		cataloglink.click();
		Thread.sleep(2000);
		productlink.click();
	}
	
	
    }

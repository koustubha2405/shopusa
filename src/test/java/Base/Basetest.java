package Base;
	import java.io.FileInputStream;
	import java.io.IOException;
	import java.util.Properties;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.edge.EdgeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;

import pages.Loginpage;

	public class Basetest {
	   
	 public   WebDriver driver;
	   Properties p;
	        public WebDriver driverinitlization() throws IOException {
	        	FileInputStream f=new FileInputStream("C:\\eclipseworkspace\\Shopusa\\Resources\\Configure.Properties");
	        	 p=new Properties();
	        	 p.load(f);
	        	 String browsername=p.getProperty("browser");
	        	 System.out.println(browsername);
	        	 if(browsername.equals("Chrome")) {
	        		 driver=new ChromeDriver();
	        	 }else if (browsername.endsWith("firefox")) {
	        		 driver=new FirefoxDriver();
					
				}else {
					driver=new EdgeDriver();
				}
	        	 
	        	 return driver;
	        }
	        
	        @BeforeMethod
	        public void launch() throws IOException {
	        	driver=driverinitlization() ;
	        	Loginpage lp=new Loginpage(driver);
	        	
	        }
	        
	        
	     }

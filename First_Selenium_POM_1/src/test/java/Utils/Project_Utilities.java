package Utils;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Project_Utilities {
	
	private static WebDriver		driver 	;
	private static WebDriverWait	wait	;
	
	
	//Constructors 
	public Project_Utilities() {}
	
	
	/*Setting Up Driver Code*/
	public void U_Setup_Driver() {
		System.setProperty("webdriver.edge.driver", "F:\\Testing\\Automatic_testing\\WebDriver\\msedgedriver.exe");
		driver = new EdgeDriver();
		driver.manage().window().maximize();
	}
	
	
	public void U_OpenDriver_Link(String URL) {
		driver.get(URL);
	}
	
	public void U_Close_Driver() {
		if(driver != null) {
			driver.close();
		}
	}
	
	/*Interface Functions*/
	
	public WebDriverWait U_CreateWait(Duration No_OF_Seconds) {
		return (new WebDriverWait(driver, No_OF_Seconds)) ;
	}
	
	
	public	WebDriver	U_GetDriver() {
		return driver;
	}


}

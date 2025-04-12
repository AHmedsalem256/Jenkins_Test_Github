package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utils.Project_Utilities;

public class Drag_Drop {
	
	/*Constructor*/
	public Drag_Drop() {}
	
	/*
	 * Items Web Locators
	 * */
	
	private String DD_Drag_Drop_WebPage = "https://moatazeldebsy.github.io/test-automation-practices/#/drag-drop";
	private String DD_Item_1_Xpath = "//button[@data-test=\"drag-handle-Item 1\"]" ;
	private	String DD_Item_2_Xpath = "//button[@data-test=\"drag-handle-Item 2\"]" ;

	Project_Utilities	DUTS	=	new Project_Utilities();
	
	
	//Getters
	
	//Getting Item1 X_path
	public WebElement DD_Find_Item1_Xpath() {
		WebDriver driver_t = DUTS.U_GetDriver();
		return	driver_t.findElement(By.xpath(DD_Item_1_Xpath));
	}

	//Getting Item2 X_path
	public WebElement DD_Find_Item2_Xpath() {
		WebDriver driver_t = DUTS.U_GetDriver();
		return	driver_t.findElement(By.xpath(DD_Item_2_Xpath));
	}
	
	public String DD_Ret_WebPage() {
		return DD_Drag_Drop_WebPage;
	}
	
	

}

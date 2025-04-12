package Tests;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import Pages.Drag_Drop;
import Utils.Project_Utilities;


public class Drag_Drop_Test {

	Project_Utilities	UTS =	new Project_Utilities();
	Drag_Drop			DD = 	new Drag_Drop();
	 
	
	@BeforeSuite
	public void Hello() {
		UTS.U_Setup_Driver();
		UTS.U_OpenDriver_Link(DD.DD_Ret_WebPage());		
	}

	@Test
	public void Drag_Drop() {
		try {
			
			/*Initialize Actions Object 
			 * Actions Object .dragdrop (scr , destination)
			 * */
			
			Actions Act = new Actions(UTS.U_GetDriver());
			
			Act.dragAndDrop( DD.DD_Find_Item1_Xpath() , DD.DD_Find_Item2_Xpath() ).perform();

			Thread.sleep(2000);
			
			Act.dragAndDrop( DD.DD_Find_Item2_Xpath() , DD.DD_Find_Item1_Xpath() ).perform();
			
			Thread.sleep(2000);
			
		}catch(Exception e ){
			e.printStackTrace();
		}finally{
			System.out.println("Task Ended");
		}
	}
	
	@AfterSuite
	public void EndTasks() {
		UTS.U_Close_Driver();
	}
}

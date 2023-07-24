package orangehrmTest;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import OrangeHRM.Pages.Loginpage;

public class Testdata extends Loginpage {
	Testdata LP;
	  String actual_title;
	 
	  @BeforeSuite
	  public void Launch() throws Exception 
	  {
		initialization();
		LP = new Testdata();
	  }
	  @Test
	  public void Visiblity() throws InterruptedException
	  {
		  System.out.println(LP.logo_element().getText());
		  LP.IconCompany_element().click();
		  Thread.sleep(300);
//	  LP.login_valid();
	  actual_title  =driver.getTitle();
	  System.out.println(actual_title);
	  //Assert.assertEquals(actual_title, "OrangeHRM");
	  }
	 
	  @AfterSuite
	  public void Forclose()
	  {
		  LP.terminate();
	  }
  }


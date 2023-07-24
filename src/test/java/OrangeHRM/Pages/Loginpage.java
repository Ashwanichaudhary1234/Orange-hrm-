package OrangeHRM.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import OrangeHRM.Testbase.Testbase;

public   class  Loginpage  extends Testbase {
	@FindBy( xpath="//a[@class='navbar-brand nav-logo']")
	WebElement logo;
	@FindBy( xpath="//a[text()='Platform']")
	WebElement IconPlatform;
	
	@FindBy(xpath="//a[text()='Why OrangeHRM']")
	WebElement IconWhyOrange;
	@FindBy(xpath="//a[text()='Resources']")
	WebElement IconResources;
	@FindBy(xpath="//a[text()='Company']")
	WebElement IconCompany;
	
	
	@FindBy(xpath="//input[@id=\"Form_getForm_Email\"]")
	WebElement getemail;
	
	public Loginpage() 
	{
	PageFactory.initElements(driver,this);

}
	public WebElement logo_element()
	{
		return logo;
	}
	public WebElement IconPlatform_element()
	{
		return  IconPlatform;
	}
	public WebElement whyorangehrm_element()
	{
		return IconWhyOrange;
	}
	public WebElement IconResources_element()
	{
		return IconResources;
	}
	public WebElement IconCompany_element()
	{
		return IconCompany;
	}
	public WebElement getemail_element()
	{
		return getemail;
	}

	}
	

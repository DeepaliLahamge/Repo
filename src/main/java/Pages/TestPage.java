package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class TestPage extends TestBase{	
	
	@FindBy(xpath="//a[@data-group='men']")private WebElement Menlink;
	
	public TestPage()
	{
		PageFactory.initElements(driver, this);
	}
	public void verifyMenlink()
	
	{
		Menlink.click();
	}
	
	public String verifyMenlinkText()
	{
		return Menlink.getText();	
	}
}

package TestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.TestPage;
import Utility.CaptureScreenShots;

public class TestBaseTest extends TestBase {
	
	TestPage link;
	
	@BeforeMethod(groups="sanity")
	public void  setup() throws Exception
	{
	
		initialization();
		link=new TestPage();
}
	@Test(groups= {"sanity","regression"})
	public void verifyMenlinkTest()
	{
	link.verifyMenlink();	
	}
	
	@Test
	public void verifyMenlinkTextTest()
	{
		String actTitle=link.verifyMenlinkText();
		System.out.println(actTitle);
		Assert.assertEquals(actTitle, "Men");
	}
	
	@AfterMethod(groups="sanity")
	public void exit(ITestResult rs) throws IOException
	{
		if(ITestResult.FAILURE==rs.getStatus())
		{
			CaptureScreenShots.capturescreenshot(driver,rs.getName());
		}
		driver.close();
	}
}

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class MagentoTest 
{
	@Test
		public void testCase1()
		{

	WebDriver driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("http://www.magento.com");
	Home h=new Home(driver);
	h.clickOnMyacc();
	Login li = new Login(driver);
	li.typeEmail("nitinmanjunath1991@gmail.com");
	li.typePassword("Welcome123");
	li.clickOnLogin();
	Logout l2=new Logout(driver);
	l2.clickOnLogOut();
	driver.quit();
}
}

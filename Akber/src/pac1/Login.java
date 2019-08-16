package pac1;
//sadarssing
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Login {
	
	WebDriver bo;
	String bpath="http://apps.qaplanet.in/qahrm/login.php";
 
	@Test(enabled=true,priority=1,groups="login")
  public void TC2_1() {
	
		

  }

 
  
@BeforeMethod
void be(){
	System.setProperty("webdriver.gecko.driver", "D:\\SelWD\\Drvers\\geckodriver.exe");
	 bo=new FirefoxDriver();
	
	bo.get(bpath);

}

@AfterMethod
void bclose(){
	bo.close();
}
  
  
  
}

package ConfigurationWebDriver;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;


public class BaseClass {
   public static WebDriver driver;
   @BeforeClass
   public static void BeforParent(){
      driver= ConfigurationWebDriver.createDriver(WebDrivers.CHROME);

   }
   @AfterClass
   public static void afterParent() throws InterruptedException {
      Thread.sleep(3000);
      driver.quit();
   }

}

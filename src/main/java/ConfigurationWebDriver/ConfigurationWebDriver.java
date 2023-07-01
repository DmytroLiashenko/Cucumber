package ConfigurationWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class ConfigurationWebDriver {
    static WebDriver driver = null;

    static public WebDriver createDriver(WebDrivers webDrivers) {

        switch (webDrivers) {
            case CHROME:
                createChrome();
                break;
//            case CHROME_INCOGNITO:
//                createChromeIncognito();
//            break;
        }
        return driver;

    }

    private static void createChrome() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        options.addArguments("--start-maximize");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }
//    private static void createChromeIncognito() {
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--remote-allow-origins=*");
//        options.addArguments("--start-maximize");
//        options.addArguments("--incognito");
//        driver = new ChromeDriver(options);
//    }




}

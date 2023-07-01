package Steps;

import ConfigurationWebDriver.BaseClass;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;
import pages.MainPageFactory;


public class MyStepdefs extends BaseClass {
    MainPageFactory mainPageFactory= PageFactory.initElements(driver,MainPageFactory.class);


    static final String mainUrl="https://certificate.ithillel.ua/";
    static {
        if (driver==null){
            BaseClass.BeforParent();
        }
    }
@Before()
public void start(){
        if (!driver.getCurrentUrl().equals(mainUrl)){
            driver.navigate().to(mainUrl);
        }
}
    @When("open page {string}")
    public void openPage(String arg0) {
        driver.get(arg0);
    }

    @And("Enter the certificate number {string}")
    public void enterTheCertificateNumber(String certificationNumber) {
       mainPageFactory.getCertificate(certificationNumber);
    }

    @And("Click the button")
    public void clickTheButton() {
        mainPageFactory.getButton();
    }

    @Then("check the result {string}")
    public void checkTheResult(String expected) throws Exception {
        Assert.assertEquals(Boolean.valueOf(expected),mainPageFactory.checkcertifChekForm());
        Thread.sleep(10000);
        driver.quit();
    }

}

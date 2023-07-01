package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPageFactory {
    private WebDriver driver;


    @FindBy(xpath = "//input[@class='input -text certificate-check_input']")
    WebElement certificate;
    @FindBy(xpath = "//button[@class='btn btn-submit -submit certificate-check_submit']")
    WebElement Button;
    @FindBy(id = "certificateCheckForm")
    WebElement checkFormMassage;

    private boolean checkLinkCertificate() {
        return driver.getCurrentUrl().contains("view");
    }


    public MainPageFactory(WebDriver driver) {
        this.driver = driver;
    }

    public void getCertificate(String certificate) {
        this.certificate.sendKeys("45924126");
    }

    public void getButton() {
        this.Button.click();
    }

    public boolean checkcertifChekForm() throws Exception {
        System.out.println(checkFormMassage.getAttribute("class"));

        int i = 0;
        boolean result=false;
        while (true) {
            if (checkLinkCertificate()) {
                result = true;
                break;
            }
            if (checkFormMassage.getAttribute("class").contains("invalid")) {
                result = false;
                break;
            }

            try {
                Thread.sleep(1000);
                i++;
                if (i > 10) {
                    throw new Exception("Out of time wait certificate cheker");
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return result;
    }
}

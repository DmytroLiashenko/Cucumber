package ConfigurationWebDriver;

import org.junit.AfterClass;
import org.junit.BeforeClass;

public class TestBase {
    @BeforeClass
    public static void bef() {
        System.out.println("Before class parent class");
    }

    @AfterClass
    public static void after() {
        System.out.println("After class parent class");
    }
}

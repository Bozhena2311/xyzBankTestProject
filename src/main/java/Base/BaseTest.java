package Base;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.net.MalformedURLException;

public class BaseTest {

    private WebDriver driver = new ChromeDriver();

    @BeforeMethod
    public void setup() throws MalformedURLException {
        driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");
        WebDriverRunner.setWebDriver(driver);
        Configuration.timeout = 10000;
    }

    @AfterMethod
    public void close() {
        driver.close();
    }
}

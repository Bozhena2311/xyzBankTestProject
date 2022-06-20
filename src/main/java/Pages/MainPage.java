package Pages;

import com.codeborne.selenide.SelenideElement;
import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter
public class MainPage {

    @FindBy(xpath = "/html/body/div/div/div[2]/div/div[1]/strong")
    private SelenideElement welcomeText;

    @FindBy(xpath = "/html/body/div/div/div[2]/div/div[1]/strong/span")
    private SelenideElement nameCustomerText;

    @FindBy(xpath = "/html/body/div/div/div[1]/button[2]")
    private WebElement logoutButton;

}

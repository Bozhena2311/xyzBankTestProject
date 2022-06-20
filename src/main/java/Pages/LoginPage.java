package Pages;

import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter
public class LoginPage {

    @FindBy(xpath = "/html/body/div/div/div[2]/div/div[1]/div[1]/button")
    private WebElement customerLoginButton;

    @FindBy(xpath = "/html/body/div/div/div[2]/div/form/div/select")
    private WebElement changeNameCustomerDropDownField;

    @FindBy(xpath = "/html/body/div/div/div[2]/div/form/div/select/option[2]")
    private WebElement hermoineGrangerSelectionField;

    @FindBy(xpath = "/html/body/div/div/div[2]/div/form/div/select/option[3]")
    private WebElement harryPotterSelectionField;

    @FindBy(xpath = "/html/body/div/div/div[2]/div/form/button")
    private WebElement loginButton;
}

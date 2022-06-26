package Flow;

import Pages.LoginPage;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.page;

public class LoginFlow {

    @Step("Click button - Customer Login")
    public LoginFlow clickLoginLikeCustomerButton() {
        page(LoginPage.class).getCustomerLoginButton().click();
        return this;
    }

    @Step("Click dropDown customer list")
    public LoginFlow clickDropDownList() {
        page(LoginPage.class).getChangeNameCustomerDropDownField().click();
        return this;
    }

    @Step("Select customer - Germoine Granger")
    public LoginFlow selectHermoineGranger() {
        page(LoginPage.class).getHermoineGrangerSelectionField().click();
        return this;
    }

    @Step("Select customer - Harry Potter")
    public LoginFlow selectHarryPotter() {
        page(LoginPage.class).getHarryPotterSelectionField().click();
        return this;
    }

    @Step("Click button - Login")
    public LoginFlow clickLoginButton() {
        page(LoginPage.class).getLoginButton().click();
        return this;
    }

    @Step("Go to Main Flow")
    public MainFlow goToMainFlow() {
        return new MainFlow();
    }
}

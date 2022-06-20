package Flow;

import Pages.LoginPage;

import static com.codeborne.selenide.Selenide.page;

public class LoginFlow {

    public LoginFlow clickLoginLikeCustomerButton() {
        page(LoginPage.class).getCustomerLoginButton().click();
        return this;
    }

    public LoginFlow clickDropDownList() {
        page(LoginPage.class).getChangeNameCustomerDropDownField().click();
        return this;
    }

    public LoginFlow selectHermoineGranger() {
        page(LoginPage.class).getHermoineGrangerSelectionField().click();
        return this;
    }

    public LoginFlow selectHarryPotter() {
        page(LoginPage.class).getHarryPotterSelectionField().click();
        return this;
    }

    public LoginFlow clickLoginButton() {
        page(LoginPage.class).getLoginButton().click();
        return this;
    }

    public MainFlow goToMainFlow() {
        return new MainFlow();
    }
}

package Flow;

import Pages.MainPage;
import com.codeborne.selenide.Condition;

import static com.codeborne.selenide.Selenide.page;

public class MainFlow {

    public MainFlow assertWelcomeText(String welcome, String nameCustomer) {
        page(MainPage.class).getWelcomeText().shouldBe(Condition.text(welcome));
        page(MainPage.class).getNameCustomerText().shouldBe(Condition.text(nameCustomer));
        return this;
    }

    public MainFlow clickLogoutButton() {
        page(MainPage.class).getLogoutButton().click();
        return this;
    }
}

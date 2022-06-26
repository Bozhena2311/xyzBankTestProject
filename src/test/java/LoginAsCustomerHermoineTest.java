import Base.BaseTest;
import Flow.LoginFlow;
import io.qameta.allure.Owner;
import org.testng.annotations.Test;

public class LoginAsCustomerHermoineTest extends BaseTest {

    @Test(description = "TC1. Auth like customer - Hermoine Granger")
    @Owner("BalzhanovaBM")
    void loginAsHermoineGranger() {
        new LoginFlow()
                .clickLoginLikeCustomerButton()
                .clickDropDownList()
                .selectHermoineGranger()
                .clickLoginButton()
                .goToMainFlow()
                .assertWelcomeText("welcome", "Hermoine Granger")
                .clickLogoutButton();
    }
}
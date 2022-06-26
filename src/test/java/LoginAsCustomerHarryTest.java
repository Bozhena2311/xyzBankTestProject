import Base.BaseTest;
import Flow.LoginFlow;
import io.qameta.allure.Owner;
import org.testng.annotations.Test;

public class LoginAsCustomerHarryTest extends BaseTest {

    @Test(description = "TC2. Auth like customer - Harry Potter")
    @Owner("BalzhanovaBM")
    void loginAsHarryPotter() {
        new LoginFlow()
                .clickLoginLikeCustomerButton()
                .clickDropDownList()
                .selectHarryPotter()
                .clickLoginButton()
                .goToMainFlow()
                .assertWelcomeText("welcome", "Harry Potter")
                .clickLogoutButton();
    }
}

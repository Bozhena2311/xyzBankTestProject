import Base.BaseTest;
import Flow.LoginFlow;
import org.testng.annotations.Test;

public class LoginAsCustomerHarryTest extends BaseTest {

    @Test()
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

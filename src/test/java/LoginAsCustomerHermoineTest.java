import Base.BaseTest;
import Flow.LoginFlow;
import org.testng.annotations.Test;

public class LoginAsCustomerHermoineTest extends BaseTest {

    @Test
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
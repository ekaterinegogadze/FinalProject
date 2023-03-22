import StepObject.BasketPageSteps;
import StepObject.LoginPageSteps;
import Utils.ChromeRunner;
import io.qameta.allure.Allure;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.sleep;
import static org.testng.Assert.assertTrue;

public class BasketPageTest extends ChromeRunner {
    BasketPageSteps BasketPageSteps = new BasketPageSteps();

    @Test
    @Severity(SeverityLevel.CRITICAL)
    public void BasketMeTod() {
        BasketPageSteps.SrchInput();
        assertTrue(BasketPageSteps.Srchvalid.is(visible));

        BasketPageSteps.SrchBtn()
                .SelectBtn()
                .AddCartBtn()
                .CartBtn()
                .DeleteBtn();

        sleep(5000);
    }
}

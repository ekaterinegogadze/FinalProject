import StepObject.LanguagePageSteps;
import Utils.ChromeRunner;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.sleep;

public class LanguagePageTest extends ChromeRunner {
    LanguagePageSteps LanguagePageSteps = new LanguagePageSteps();


    @Test
    @Severity(SeverityLevel.NORMAL)
    public void LanguageMeTod (){
        LanguagePageSteps.LangClic()

        .LangBtn();
        Assert.assertFalse(LanguagePageSteps.LangBtn.is(Condition.visible),"ენის შეცვლა");
        sleep(5000);

    }


}

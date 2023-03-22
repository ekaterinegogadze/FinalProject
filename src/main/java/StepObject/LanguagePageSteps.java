package StepObject;

import PageObject.LanguagePage;
import io.qameta.allure.Step;

public class LanguagePageSteps extends LanguagePage {
    @Step("Click LangClic")
    public LanguagePageSteps LangClic() {
        LangClic.click();
        return this;
    }

    @Step("Click Lang Btn")
    public LanguagePageSteps LangBtn() {
        LangBtn.click();
        return this;
    }
}

package PageObject;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class LanguagePage {
    public static SelenideElement
    LangClic = $(byText("ge"));
    public SelenideElement LangBtn = $(byText("English"));
}

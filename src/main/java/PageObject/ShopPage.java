package PageObject;

import com.codeborne.selenide.SelenideElement;

import static DataObject.ShopPageData.Adress;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class ShopPage {
    public SelenideElement
            SHopClick = $(byText("მაღაზიები")),
            ShopaddresClick = $(byText(Adress));
}

package PageObject;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;

public class BasketPage {

    public SelenideElement
            SrchInput = $(byId("searchkey")),
            SrchBtn = $(byName("submit")),
            SelectBtn = $(byClassName("link")),
            AddCartBtn = $(byText("კალათაში დაამატე")),
            CartBtn = $(byClassName("bag")),
            DeleteBtn = $(byText("წაშლა")),
            Srchvalid = $(byId("searchkey"));



}

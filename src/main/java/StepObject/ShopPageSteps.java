package StepObject;

import PageObject.ShopPage;
import io.qameta.allure.Step;

public class ShopPageSteps extends ShopPage {
    @Step("Click SHopClick")
    public ShopPageSteps SHopClick() {
        SHopClick.click();
        return this;
    }

    @Step("Click ShopaddresClick")
    public ShopPageSteps ShopaddresClick() {
        ShopaddresClick.click();
        return  this;
    }

}

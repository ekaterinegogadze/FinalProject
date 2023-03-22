package StepObject;

import PageObject.BasketPage;
import io.qameta.allure.Step;

import static DataObject.BasketPageData.SerchObjeqt;

public class BasketPageSteps extends BasketPage {
    @Step("fill search infut by value: {SerchObjeqt}")
    public BasketPageSteps SrchInput() {
        SrchInput.setValue(SerchObjeqt);
        return this;
    }

    @Step("Click Srch Btn")
    public BasketPageSteps SrchBtn() {
        SrchBtn.click();
        return this;
    }

    @Step("Click Select Btn")
    public BasketPageSteps SelectBtn() {
        SelectBtn.click();
        return this;

    }

    @Step("Clik AddCaer Btn")
    public BasketPageSteps AddCartBtn() {
        AddCartBtn.click();
        return this;

    }

    @Step("Click Cart Btn")
    public BasketPageSteps CartBtn() {
        CartBtn.click();
        return this;
    }

    @Step("Click Delete Btn")
    public BasketPageSteps DeleteBtn() {
        DeleteBtn.click();
        return this;
    }
}

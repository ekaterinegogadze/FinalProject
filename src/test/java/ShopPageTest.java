import StepObject.ShopPageSteps;
import Utils.ChromeRunner;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.sleep;

public class ShopPageTest extends ChromeRunner {
    ShopPageSteps ShopPagesteps = new ShopPageSteps();
    @Test

    public void ShopMeTod () {
        ShopPagesteps.SHopClick()
                .ShopaddresClick();
        sleep(5000);


    }



}

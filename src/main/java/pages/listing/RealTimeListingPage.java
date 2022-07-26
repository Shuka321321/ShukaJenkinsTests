package pages.listing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.base.BasePage;

import static common.Config.NUMBER_OF_CARDS;

public class RealTimeListingPage extends BasePage {

    public RealTimeListingPage(WebDriver driver) {
        super(driver);
    }

    private final By card
            = By.xpath("//div[@class='listing view-format']//div[@data-mode='3']");

    public RealTimeListingPage checkCountCards() {
        waitElementVisible(driver.findElement(card));
        int countCard = driver.findElements(card).size();
        Assert.assertEquals(countCard, NUMBER_OF_CARDS);
        return this;
    }


}

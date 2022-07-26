package pages.realtHome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;

public class RealtHomePage extends BasePage {
    public RealtHomePage(WebDriver driver) {
        super(driver);
    }

    By countRoom = By.xpath("//select[@id='rooms']");
    By option2rooms = By.xpath("//select[@id='rooms']/option[@value='2']");
    By findButton = By.xpath("//div[@id='residentialInputs']//a[text()='Найти']");

    public RealtHomePage enterCountRoom() {
        driver.findElement(countRoom).click();
        driver.findElement(option2rooms).click();
        return this;
    }

    public RealtHomePage clickFindButton() {
        driver.findElement(findButton).click();
        return this;
    }
}

package test.base;

import common.CommonAction;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;
import pages.listing.RealTimeListingPage;
import pages.realtHome.RealtHomePage;

public class BaseTest {
    protected WebDriver driver = CommonAction.createWebDriver();
    protected BasePage basePage = new BasePage(driver);
    protected RealtHomePage realtHomePage = new RealtHomePage(driver);
    protected RealTimeListingPage realtListingPage = new RealTimeListingPage(driver);
}

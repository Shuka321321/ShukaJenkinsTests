package test.searchApartments;

import org.testng.annotations.Test;
import test.base.BaseTest;

public class SearchApartmentsTest extends BaseTest {

    @Test
    public void checkRedrectToListing() {
        basePage.open("https://realt.by/");
        realtHomePage
                .enterCountRoom()
                .clickFindButton();
        realtListingPage
                .checkCountCards();
    }
}

package org.florina.steps.serenity;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.florina.pages.HomePage;
import org.florina.pages.SearchResultsPage;
import org.junit.Assert;

public class SearchSteps extends ScenarioSteps {

    private HomePage homePage;
    private SearchResultsPage searchResultsPage;

    @Step
    public void doSearch(String keyword){
        homePage.setSearchField(keyword);
        homePage.clickSearchIcon();
    }
    @Step
    public void verifyProductInResults(String productName){
        Assert.assertTrue(searchResultsPage.checkFromListOfFoundProductsTheProduct(productName));
    }
    @Step
    public void selectProductFromList(String productName){
}
}
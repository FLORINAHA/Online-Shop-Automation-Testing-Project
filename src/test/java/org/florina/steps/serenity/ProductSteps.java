package org.florina.steps.serenity;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.florina.pages.SearchResultsPage;

public class ProductSteps extends ScenarioSteps {

    private SearchResultsPage searchResultsPage;


    @Step
    public void selectProductFromList(String product){
        searchResultsPage.selectProductFromList(product);


}
}
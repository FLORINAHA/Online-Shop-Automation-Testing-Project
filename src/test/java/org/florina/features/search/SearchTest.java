package org.florina.features.search;
import org.junit.Test;


public class SearchTest extends BaseTest{

    @Test
    public void searchProductTest(){
        loginSteps.doLogin("eugenia@yahoo.com","123456789");
        searchSteps.doSearch("little");
        searchSteps.selectProductFromList("Baby girl cardigan ");

    }

}
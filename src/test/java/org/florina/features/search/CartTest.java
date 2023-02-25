package org.florina.features.search;

import org.junit.Test;

public class CartTest extends BaseTest{

    @Test
    public void addProductToCart(){
        loginSteps.doLogin("eugenia@yahoo.com","123456789");
        searchSteps.doSearch("little");
        productSteps.selectProductFromList("kcardigan ");
        cartSteps.AddToCart();
    }
}
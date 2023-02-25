package org.florina.steps.serenity;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.florina.pages.CartPage;
import org.florina.pages.ProductPage;

public class CartSteps extends ScenarioSteps {

    private ProductPage productPage;
    private CartPage cartPage;

    @Step
    public void AddToCart(){
        productPage.clickAddToCartButton();
    }
    @Step
    public void successMessage(String productName){
        cartPage.verifySuccessMessage(productName);
    }

}
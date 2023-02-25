package org.florina.steps.serenity;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.florina.pages.AccountPage;
import org.florina.pages.HomePage;
import org.florina.pages.LoginPage;

public class LoginSteps extends ScenarioSteps {

    private HomePage homePage;
    private LoginPage loginPage;
    private AccountPage accountPage;

    @Step
    public void navigateToHomepage(){
        homePage.open();
    }
    @Step
    public void navigateToLogin(){
        homePage.clickAccountLink();
        homePage.clickLoginLink();
    }
    @Step
    public void setEmail(String email){
        loginPage.setEmailField(email);
    }
        @Step
        public void setPassword( String password){
            loginPage.setPasswordField(password);
    }
    @Step
    public void clickLogin(){
        loginPage.clickLoginButton();
    }
    @Step
    public void verifyUsernameMessage(String userName){
        accountPage.verifyWelcomeMessage(userName);
    }

    @Step
    public void doLogin(String email, String password){
        navigateToHomepage();
        navigateToLogin();
        setEmail(email);
        setPassword(password);
        clickLogin();
    }
}
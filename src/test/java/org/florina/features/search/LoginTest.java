package org.florina.features.search;


import org.junit.Test;

public class LoginTest extends BaseTest {


    @Test
    public void loginWithValidCredentialsTest(){
        loginSteps.navigateToHomepage();
        loginSteps.navigateToLogin();
        loginSteps.setEmail("eugenia@yahoo.com");
        loginSteps.setPassword("123456789");

}

}
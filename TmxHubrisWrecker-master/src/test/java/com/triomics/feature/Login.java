package com.triomics.feature;

import java.io.IOException;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.triomics.tests.adc.onboarding.BaseTest;
import com.triomics.tests.adc.onboarding.LoginViaPlatformTest;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import io.qameta.allure.junit5.AllureJunit5;

public class Login extends LoginViaPlatformTest{
	
	@Epic("Login Tests Epic")
	@Feature("Valid Login Features")
	public class LoginTest extends BaseTest {
	    @Test
	    @Story("User tries to login the system with valid username and valid password.")
	    @Description("Login with valid password")
	    public void invalidLoginTest_InvalidUserNameInvalidPassword() throws InterruptedException {
	       login_as_platform_admin();
	       Assert.assertTrue("Triomics", false);
	    }

}}

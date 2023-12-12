package com.globant.webautomation.AutomationPOM;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import pages.CartPage;
import pages.Checkout1Page;
import pages.Checkout2Page;
import pages.FinishPage;
import pages.HomePage;
import pages.InventoryPage;

public class FirstTest extends BaseTest{

	
	@Test
	public void testBuying(){					//test successful shop
		HomePage homePage = getHomePage();
		homePage.setUserText("standard_user");
		homePage.setPassText("secret_sauce");
		InventoryPage inventory=homePage.clickLogin();
		
		inventory.waitToBeClickable(inventory.getAddBackpack());
		inventory.addBackpack();
		CartPage cart= inventory.goToCart();
		
		cart.waitToBeClickable(cart.getCheckoutButton());
		Checkout1Page c1= cart.checkingOut();
		
		c1.waitToBeClickable(c1.getContinueB());
		c1.setNameText("Thaiel");
		c1.setSurnameText("Gallardo");
		c1.setPostText("7000");
		Checkout2Page c2=c1.clickContinue();
		
		c2.waitToBeClickable(c2.getFinishB());
		FinishPage finish=c2.finishButtonClick();
		finish.waitToBeDisplayed(finish.getHeader());
		Assertions.assertEquals("Thank you for your order!", finish.getHeader().getText());
	}
	
	@Test
	public void testRemoving() {				//test adding to and removing from cart
		HomePage homePage = getHomePage();
		homePage.setUserText("standard_user");
		homePage.setPassText("secret_sauce");
		InventoryPage inventory=homePage.clickLogin();
		
		inventory.waitToBeClickable(inventory.getAddBackpack());
		inventory.addBackpack();
		inventory.addBikeLight();
		inventory.addShirt();
		CartPage cart= inventory.goToCart();
		
		cart.waitToBeClickable(cart.getCheckoutButton());
		cart.removeBackpack();
		cart.removeBikeLight();
		cart.removeShirt();
		Checkout1Page c1= cart.checkingOut();
		
		c1.waitToBeClickable(c1.getContinueB());
		c1.setNameText("Thaiel");
		c1.setSurnameText("Gallardo");
		c1.setPostText("7000");
		Checkout2Page c2=c1.clickContinue();
		
		c2.waitToBeClickable(c2.getFinishB());
		Assertions.assertEquals("Total: $0.00", c2.getSummary().getText());
		
	}

	@Test
	public void testLogout() {					//test logging in and out
		HomePage homePage = getHomePage();
		homePage.setUserText("standard_user");
		homePage.setPassText("secret_sauce");
		InventoryPage inventory=homePage.clickLogin();
		
		inventory.waitToBeClickable(inventory.getAddBackpack());
		inventory.openMenu();
		HomePage loggedout =inventory.logout();
		Assertions.assertTrue(loggedout.elementIsDisplayed(loggedout.getLoginButton()));
		}
}

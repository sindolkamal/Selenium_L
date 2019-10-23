package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPOM {

	private WebDriver driver; 
	
	public ProductPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[contains(text(),'Products')]")
	private WebElement product; 
	
	@FindBy(xpath="//input[@id='input-name']")
	private WebElement prodname;
	
	@FindBy(xpath="//button[@id='button-filter']")
	private WebElement filter; 
	
	@FindBy(xpath="//input[@id='input-price']")
	private WebElement price;
	
	
	public void clickProduct() {
		this.product.click();
	}
	
	public void sendProdName(String prodname) {
		this.prodname.clear();
		this.prodname.sendKeys(prodname);
	}
	
	public void clickFilterbttn() {
		this.filter.click();
	}
	
	public void sendPrice(String price) {
		this.prodname.clear();
		this.price.clear();
		this.price.sendKeys(price);
	}
	
}

package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


public class RegistrationPOM {
private WebDriver driver; 
	
	public RegistrationPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="input-firstname")
	private WebElement firstname; 
	
	@FindBy(id="input-lastname")
	private WebElement lastname; 
	
	@FindBy(id="input-email")
	private WebElement email;
	
	@FindBy(id="input-telephone")
	private WebElement telephone;
	
	@FindBy(id="input-address-1")
	private WebElement address_1;
	
	@FindBy(id="input-address-2")
	private WebElement address_2;
	
	@FindBy(id="input-city")
	private WebElement city;
	
	@FindBy(id="input-postcode")
	private WebElement postcode;
	
	@FindBy(id="input-country")
	private WebElement country_id;
	
	@FindBy(id="input-zone")
	private WebElement zone_id;
	
	@FindBy(id="input-password")
	private WebElement password;
	
	@FindBy(id="input-confirm")
	private WebElement confirm;
	
	@FindBy(xpath="//label[contains(text(),'No')]")
	private WebElement newsletter;
	
	@FindBy(xpath="//input[@name='agree']")
	private WebElement agree;
	
	@FindBy(xpath="//input[@class='btn btn-primary']")
	private WebElement Continue;
	
	
	public void sendFirstName(String firstname) {
		this.firstname.clear();
		this.firstname.sendKeys(firstname);
	}

	public void sendLastName(String lastname) {
		this.lastname.clear();
		this.lastname.sendKeys(lastname);
	}

	public void sendEmail(String email) {
		this.email.clear();
		this.email.sendKeys(email);
	}

	public void sendTelephone(String telephone) {
		this.telephone.clear();
		this.telephone.sendKeys(telephone);
	}

	public void sendAddress_1(String address_1) {
		this.address_1.clear();
		this.address_1.sendKeys(address_1);
	}

	public void sendAddress_2(String address_2) {
		this.address_2.clear();
		this.address_2.sendKeys(address_2);
	}
	
	public void sendCity(String city) {
		this.city.clear();
		this.city.sendKeys(city);
	}

	public void sendPostcode(String postcode) {
		this.postcode.clear();
		this.postcode.sendKeys(postcode);
	}

	public void selectcountry(String cn) {
		
		Select country = new Select(country_id);
		country.selectByVisibleText(cn);
	}
	
	public void selectzone(String zn) {
		
		Select zone = new Select(zone_id);
		zone.selectByVisibleText(zn);
	}

	public void sendPassword(String password) {
		this.password.clear();
		this.password.sendKeys(password);
	}

	public void sendConfirm(String confirm) {
		this.confirm.clear();
		this.confirm.sendKeys(confirm);
	}

	public void clickradio() {
		this.newsletter.click();
	}

	public void clickCheck() {
		this.agree.click();
	}

	
	public void clickContinue() {
		this.Continue.click(); 
	
	}
	}

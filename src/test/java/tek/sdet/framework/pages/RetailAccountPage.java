package tek.sdet.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.framework.base.BaseSetup;

public class RetailAccountPage extends BaseSetup{
	public RetailAccountPage() {
		PageFactory.initElements(getDriver(), this);

	}

	@FindBy(id="accountLink")
	public WebElement accountOption;
	
	@FindBy(id="nameInput")
	public WebElement nameField;
	
	@FindBy(xpath="//input[@name='phoneNumber']")
	public WebElement phoneNum;
	
	@FindBy(id="personalUpdateBtn")
	public WebElement updateButton;
	@FindBy(id="ib7n3mu")
	public WebElement updated;
	@FindBy(id="previousPasswordInput")
	public WebElement previousPasswordInput;
	@FindBy(id="newPasswordInput")
	public WebElement newPasswordInput;
	@FindBy(id="confirmPasswordInput")
	public WebElement confirmPasswordInput;
	@FindBy(id="credentialsSubmitBtn")
	public WebElement changePassword;
	@FindBy(id="q694e3k")
	public WebElement confirmMessage;
	@FindBy(xpath="//div[@class='account__payments-wrapper']")
	public WebElement paymentLink;
	@FindBy(id="cardNumberInput")
	public WebElement cardNumberInput;
	
	@FindBy(id="nameOnCardInput")
	public WebElement nameOnCardInput;
	
	@FindBy(id="expirationMonthInput")
	public WebElement expirationMonthInput;
	
	@FindBy(id="expirationYearInput")
	public WebElement expirationYearInput;
	
	@FindBy(id="securityCodeInput")
	public WebElement securityCodeInput;
	
	@FindBy(id="paymentSubmitBtn")
	public WebElement addYourCardBtn;
	
	
	@FindBy(xpath="//div[@role='alert']")
	public WebElement confirmPaymentMessage;
	
	@FindBy(xpath="//button[contains(@class,'text')]")
	public WebElement editOption;
	
	@FindBy (xpath="//button[text()='Edit']")

	public WebElement editcard;



	@FindBy (xpath="//h1[@class='account__payment-new-title']")

	public WebElement editpage;
	
	@FindBy(css="p.account__payment__sub-text")
    public WebElement SelectedpaymentCard;
	
	@FindBy(id="cardNumberInput")

	public WebElement cardnum;



	@FindBy(id="nameOnCardInput")

	public WebElement cardname;



	@FindBy (id="expirationMonthInput")

	public WebElement expirationMon;



	@FindBy (id="expirationYearInput")

	public WebElement expirationyear;



	@FindBy (id="securityCodeInput")

	public WebElement codeinput;


	@FindBy(id="paymentSubmitBtn")
	public WebElement updateCard;
	
	@FindBy(xpath="//div[@role='alert']")
	public WebElement updateMessage;
	
	@FindBy (xpath="//button[text()='remove']")

	public WebElement removeButton;
	
	@FindBy (xpath="//h1[@class='account__payment-new-title']")

	public WebElement removedpage;
	
	@FindBy (xpath="//div[@class='account__address-new-wrapper']")

	public WebElement adress;



	@FindBy (id="countryDropdown")

	public WebElement country;



	@FindBy (id="fullNameInput")

	public WebElement nameInput;



	@FindBy (id= "phoneNumberInput")

	public WebElement phoneNo;



	@FindBy (id ="streetInput")

	public WebElement streetInput;



	@FindBy (id ="apartmentInput")

	public WebElement apartment;



	@FindBy (id ="cityInput")

	public WebElement city;



	@FindBy(xpath ="//select[@class='account__address-new-dropdown']")

	public WebElement state;



	@FindBy (id="zipCodeInput")

	public WebElement zipcode;



	@FindBy (id="addressBtn")

	public WebElement adressbtn;



	@FindBy (xpath="//div[@class='Toastify']")

	public WebElement messageadress;
	
	@FindBy (xpath ="//button[text()='Edit']")

	public WebElement editadress;
	
	@FindBy (xpath ="//div[@class='account__address-new-modal']")
	
	public WebElement editPage;

	@FindBy (id="countryDropdown")

	public WebElement editcountry;



	@FindBy (id="fullNameInput")

	public WebElement updateName;



	@FindBy (id="phoneNumberInput")

	public WebElement updatephone;



	@FindBy (id="streetInput")

	public WebElement updatestreet;



	@FindBy (id="apartmentInput")

	public WebElement updateapp;



	@FindBy (id="cityInput")

	public WebElement updatecity;



	@FindBy (xpath="//select[@class='account__address-new-dropdown']")

	public WebElement updatestate;





	@FindBy (id="zipCodeInput")

	public WebElement updatezip;



	@FindBy (id ="addressBtn")

	public WebElement updatebtn;



	@FindBy (xpath="//div[@class='Toastify']")

	public WebElement messageupdate;
	
	@FindBy (xpath="//button[text()='Remove']")
	
	public WebElement removeAddress;
	
	@FindBy (xpath="//button[text()='Remove']")
	
	public WebElement messageAddress;
	
	
	
}

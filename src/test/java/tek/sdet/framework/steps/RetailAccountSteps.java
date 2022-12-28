package tek.sdet.framework.steps;

import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;

public class RetailAccountSteps extends CommonUtility{
	POMFactory factory = new POMFactory();
	
	@When ("User click on Account option")
	public void userClickOnAccountOption() {
		click(factory.accountPage().accountOption);
		slowDown();
	}

	@And ("User update Name {string} and Phone {string}")
	public void userUpdateNameAndPhone(String name,String phone) {
	clearTextUsingSendKeys(factory.accountPage().nameField);	
    sendText(factory.accountPage().nameField,name);
    clearTextUsingSendKeys(factory.accountPage().phoneNum);
    sendText(factory.accountPage().phoneNum,phone);
	logger.info("user entered name " +name+ " and phone "+ phone);
	slowDown();		
	}
	
	@And ("User click on Update button")
	public void userCkickOnUpdateButton() {
	click(factory.accountPage().updateButton);
	logger.info("user clicked on update button");
	}
	
	@Then("user profile information should be updated")
	public void userProfileInformationShouldBeUpdated() {
	logger.info("users  profile information has been updated");
	}
	@And ("User enter below information")
	public void userEnterBelowInformation (DataTable data) {
	List<Map<String,String>>updatePass = data.asMaps(String.class,String.class);
	sendText(factory.accountPage().previousPasswordInput,updatePass.get(0).get("previousPassword"));
	sendText(factory.accountPage().newPasswordInput,updatePass.get(0).get("newPassword"));
	sendText(factory.accountPage().confirmPasswordInput,updatePass.get(0).get("confirmPassword"));;
	logger.info("user entered required information into sign up form");
}
	
	@And ("User click on Change Password button")
	public void userClickOnPasswordButton() {
		click(factory.accountPage().changePassword);
		logger.info("user clicked on change password button");
	}
	
	@Then ("a message should be displayed ‘Password Updated Successfully’")
	public void messageShouldBeDisplayed() {
		click(factory.accountPage().confirmMessage);
		logger.info("user clicked on change password button");
}
	@And ("User click on Add a payment method link")
	public void userClickOnAddaPaymentMethodLink() {
	click(factory.accountPage().paymentLink);
	logger.info("User clicked on add payment method link");
	
	}
	@And ("User fill Debit or credit card information")
	public void UserFillDebitOrCreditCardInformation(DataTable data) {
		List<Map<String,String>>card = data.asMaps(String.class,String.class);
		sendText(factory.accountPage().cardNumberInput,card.get(0).get("cardNumber"));
		sendText(factory.accountPage().nameOnCardInput,card.get(0).get("nameOnCard"));
		sendText(factory.accountPage().expirationMonthInput,card.get(0).get("expirationMonth"));
		sendText(factory.accountPage().expirationYearInput,card.get(0).get("expirationYear"));
		sendText(factory.accountPage().securityCodeInput,card.get(0).get("securityCode"));
		logger.info("user entered required information into sign up form");
	}	
	
	@And ("User click on Add your card button")
	public void UserClickOnAddYourCardButton() {
	click(factory.accountPage().addYourCardBtn);
	logger.info("User clicked on add your card button");
	}
	@Then ("a message should be displayed ‘Payment Method added successfully’")
	public void aPaymentmessageShouldBeDisplayed() {
		isElementDisplayed(factory.accountPage().confirmPaymentMessage);
		logger.info("user successfully added a payment method");
		slowDown();
}
	   @And("User  select the payment Card")
	    public void userSelectedThePaymentCard1() {
	      click(factory.accountPage().SelectedpaymentCard);
	        logger.info("User clicked on payment card");}
	
	@And ("User click on Edit option of card section")
	public void UserClickOnEditOptionOfCardSection() {
		click(factory.accountPage().editcard);
		logger.info("user clicked on edit option of card section");
		
	}
	
	 @And ("user edit information with below data")

	    public void userEditInformationWithBelowData(DataTable data) {

	    List<Map<String, String >> carddata = data.asMaps(String.class ,String.class);
	    sendText(factory.accountPage(). cardnum,carddata.get(0).get("cardNumber"));
	    sendText(factory.accountPage().cardname,carddata.get(0).get("nameOnCard"));
	    sendText(factory.accountPage().expirationMon,carddata.get(0).get("expirationMonth"));
	    sendText(factory.accountPage().expirationyear,carddata.get(0).get("expirationYear"));
	    sendText(factory.accountPage().codeinput,carddata.get(0).get("securityCode"));
    
	}
	@And("User select the payment Card")
    public void userSelectedThePaymentCard() {
        click(factory.accountPage().SelectedpaymentCard);
        logger.info("User selected the payment card");}
	
	@And ("user click on Update Your Card button")
	public void userClickOnUpdateYourCardButton() {
		click(factory.accountPage().updateCard);
		logger.info("user clicked on update your card button");
	}
	
	@Then ("a message should be displayed ‘Payment Method updated Successfully’")
	public void aMessageShouldBeDisplayed() {
		isElementDisplayed(factory.accountPage().updateMessage);
		logger.info("user successfully updated card information");	
	}
	
	@And ("User click on remove option of card section")
	public void UserClickOnRemoveOptionOfCardSection() {
	click(factory.accountPage().removeButton);
	}
	
	@Then ("payment details should be removed")
	public void paymentDetailsShouldBeRemoved() {
		isElementDisplayed(factory.accountPage().removedpage);

        logger.info("payment details removed");	
	}
	
	 @And ("User click on Add address option")

	    public void userClickOnAddAddressOption() {

	        click(factory.accountPage().adress);

	        logger.info("user clicked on add address option");

	    }

	    @And("user fill new address form with below information")

	    public void userFillNewAddressFormWithBelowInformation(DataTable data) {
	        List<Map<String, String >> address = data.asMaps(String.class ,String.class);
	        sendText(factory.accountPage(). country,address.get(0).get("country"));
	        sendText(factory.accountPage(). nameInput,address.get(0).get("fullName"));
	        sendText(factory.accountPage(). phoneNo,address.get(0).get("phoneNumber"));
	        sendText(factory.accountPage(). streetInput,address.get(0).get("streetAddress"));
	        sendText(factory.accountPage(). apartment,address.get(0).get("apt"));
	        sendText(factory.accountPage(). city,address.get(0).get("city"));
	        sendText(factory.accountPage(). state,address.get(0).get("state"));
	        sendText(factory.accountPage(). zipcode,address.get(0).get("zipCode"));

	    

	    }

	    @And ("User click Add Your Address button")
	    public void userClickAddYourAddressButton() {
	        click(factory.accountPage().adressbtn);
	        logger.info("user clicked add your adress button");

	    }

	    @Then ("a message should be displayed ‘Address Added Successfully")
	    public void aMessageShouldBeDisplayedAdress() {
	    isElementDisplayed(factory.accountPage().messageadress);
	        logger.info("a message displayed");

	    }

	    @And ("User click on edit address option")
	    public void userClickOnEditAddressOption() {
	       click(factory.accountPage().editadress);
	        logger.info("user clicked on edit address option");

	    }
	
	    @And ("user update new address form with below information")
	    public void userUpdateNewAddressFormWithBelowInformation(DataTable data) {
	    List<Map<String, String >> editAddress = data.asMaps(String.class ,String.class);
        sendText(factory.accountPage(). country,editAddress.get(0).get("country"));
        sendText(factory.accountPage(). nameInput,editAddress.get(0).get("fullName"));
        sendText(factory.accountPage(). phoneNo,editAddress.get(0).get("phoneNumber"));
        sendText(factory.accountPage(). streetInput,editAddress.get(0).get("streetAddress"));
        sendText(factory.accountPage(). apartment,editAddress.get(0).get("apt"));
        sendText(factory.accountPage(). city,editAddress.get(0).get("city"));
        sendText(factory.accountPage(). state,editAddress.get(0).get("state"));
        sendText(factory.accountPage(). zipcode,editAddress.get(0).get("zipCode"));
	    }
	    
	    @And ("User click update Your Address button")
	    public void userClickedUpdateYourAddressButton() {
	    click(factory.accountPage().updatebtn);
	    logger.info("user clicked update your address button");
	    }
	    
	    
	    @Then ("a message should be displayed ‘Address Updated Successfully’")
	    public void aAddressUpdateMessageShouldBeDisplayed() {
	    	isElementDisplayed(factory.accountPage().messageupdate);
	        logger.info("a message displayed");	
	    	
	    }
	    
	    @And ("User click on remove option of Address section")
	    public void UserClickOnRemoveOptionOfAddressSection() {
	    	click(factory.accountPage().removeAddress);
	    	logger.info("user clicked on remove option of address section");
	    }
	    
	    @Then ("Address details should be removed")
	    public void ThenAddressDetailsShouldBeRemoved() {
	    	isElementDisplayed(factory.accountPage().messageAddress);
	        logger.info("a message displayed");		
	    }
	    
}
	
	


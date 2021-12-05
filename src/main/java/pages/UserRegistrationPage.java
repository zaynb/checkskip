package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UserRegistrationPage extends PageBase  {

	public UserRegistrationPage(WebDriver driver) {
		super(driver);

	}

	@FindBy(id="ContentPlaceHolder1_txtUserName")
	WebElement UsernameTxtBox ; 


	@FindBy(id="iContentPlaceHolder1_txtEmail")
	WebElement emailTxtBox ; 


	@FindBy(id="ContentPlaceHolder1_txtPassword")
	WebElement passwordTxtBox ; 

	@FindBy(id="ContentPlaceHolder1_txtPassword2")
	WebElement confirmPasswordTxtBox ; 
	
	@FindBy(xpath="//*[@id='ContentPlaceHolder1_maindiv']/div[4]/div/label")
	WebElement Agreetermsandconthons ; 
	
	@FindBy(xpath="//*[@id=\"ContentPlaceHolder1_maindiv\"]/div[5]/div/label")
	WebElement AgreeNewsletter ; 
	
	@FindBy(id="ContentPlaceHolder1_btnRegister")
	WebElement CreatAccountBtn ; 



	public void userRegistration(String UserName ,  String email , 
			 String password) 
	{
		//fnTxtBox.click();
		
		WebDriverWait wait=new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOfElementLocated((By) UsernameTxtBox));
		clickButton(UsernameTxtBox);
		UsernameTxtBox.sendKeys(UserName);


		//emailTxtBox.click();
		clickButton(emailTxtBox);
		emailTxtBox.sendKeys(email);


		passwordTxtBox.click();
		passwordTxtBox.sendKeys(password);
		confirmPasswordTxtBox.click();
		confirmPasswordTxtBox.sendKeys(password);
		
		clickButton(Agreetermsandconthons);
		clickButton (AgreeNewsletter);
		clickButton(CreatAccountBtn);

	

		


	}

}

package tests;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import data.ExcellReader;
import pages.HomePage;
import pages.PageBase;
import pages.UserRegistrationPage;

public class UserRegistrationTestWithDDTAndExcel extends TestBase{

	PageBase pagebaseobj;
	HomePage homeobject;
	
	UserRegistrationPage userRegisterObj;

	
		@DataProvider(name="ExcelData")
	public Object[][] userRegisterData() throws IOException
	{
		// get data from Excel Reader class 
		ExcellReader ER = new ExcellReader();
		return ER.getExcelData();
	}

	@Test (alwaysRun=true,dataProvider="ExcelData")
	
	public void UserCanRegisterSuccessfully(String usernname ,String mail , String pass) 
	{ 

userRegisterObj = new UserRegistrationPage(driver);

userRegisterObj.userRegistration(usernname,mail, pass);
		



	}}
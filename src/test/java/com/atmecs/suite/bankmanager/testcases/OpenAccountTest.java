package com.atmecs.suite.bankmanager.testcases;

import java.util.Hashtable;

import org.testng.annotations.Test;

import com.atmecs.utilities.Constants;
import com.atmecs.utilities.DataProviders;
import com.atmecs.utilities.DataUtil;
import com.atmecs.utilities.ExcelReader;

public class OpenAccountTest {
	
	@Test(dataProviderClass=DataProviders.class,dataProvider="bankManagerDP")
	public void openAccountTest(Hashtable<String,String> data){
		
		
		ExcelReader excel = new ExcelReader(Constants.SUITE1_XL_PATH);
		DataUtil.checkExecution("BankManagerSuite", "OpenAccountTest", data.get("Runmode"), excel);
		
		
	}
	
	

}

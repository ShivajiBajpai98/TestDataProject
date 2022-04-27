package com.atmecs.suite.customer.testcases;

import java.util.Hashtable;

import org.testng.annotations.Test;

import com.atmecs.utilities.Constants;
import com.atmecs.utilities.DataProviders;
import com.atmecs.utilities.DataUtil;
import com.atmecs.utilities.ExcelReader;

public class OpenAccountTest {
	
	@Test(dataProviderClass=DataProviders.class,dataProvider="customerDP")
	public void openAccountTest(Hashtable<String,String> data){
		
		ExcelReader excel = new ExcelReader(Constants.SUITE2_XL_PATH);
		DataUtil.checkExecution("CustomerSuite", "OpenAccountTest", data.get("Runmode"), excel);
		
		
	}
	
	

}

package com.dataprovider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class DataProviders {
	
	@Test(dataProvider="data")
	public void dataprovider(String greeting, String commnunication,int id) {
		System.out.println(greeting+" "+commnunication+" "+id);
	}
	
	@DataProvider(name="data")
	public Object[][] data(){
		Object[][] dataInput = {{"hello","text",1},{"bye","message",123},{"solo","call",12}};
		return dataInput;
	}

}

package com.salesforce;

import java.util.ArrayList;

import org.testng.annotations.Test;

import com.salesforcebase.ExcelReader;
import com.salesforcebase.Keywords;

public class LoginTest {
	
@Test
	public void loginTest() {
ArrayList data = ExcelReader.getData("E://sales force test//LoginTestSuite.xlsx");
Keywords key = new Keywords ();
for(int i=0; i<data.size(); i++) {
	if(data.get(i).equals("open")) {
key.open();
}
	if(data.get(i).equals("url")) {
		String httpUrl = data.get(i+1).toString();
		key.url(httpUrl);
	
}
	if(data.get(i).equals("input")) {
		String testData = data.get(i+1).toString();
		String objectName = data.get(i+2).toString();
		key.input(testData,objectName);
}
	if(data.get(i).equals("click")) {
		String testData = data.get(i+1).toString();
		String objectName = data.get(i+2).toString();
		key.click(objectName);

}
	if(data.get(i).equals("close")) {
		key.close();

}
}
}
}

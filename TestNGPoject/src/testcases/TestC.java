package testcases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestC {
	@Test(dataProvider="getData")
	public void loginTest(String username,
						  String password,
						  String browser) {
	}	
		@DataProvider
		public Object[][] getData(){
			Object[][] data =new Object[3][3];
			//1st row
			data[0][0]="User1";
			data[0][1]="Pass1";
			data[0][2]="Mozilla";
			
			//2nd  row
			data[1][0]="User2";
			data[1][1]="Pass2";
			data[1][2]="Chrome";
			
			//3rd  row
			data[2][0]="User3";
			data[2][1]="Pass3";
			data[2][2]="IE";
		return data;
		}
	

}

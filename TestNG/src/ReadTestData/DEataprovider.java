package ReadTestData;

import org.testng.annotations.DataProvider;

public class DEataprovider {
	@DataProvider(name="SearchProvider")
	public static Object[][] ReadTestData(){
	ReadTestData d=new ReadTestData("C:\\Users\\admin\\Desktop\\testdata.xlsx");
	int totalrows=d.getrowcount(0);
	Object[][]data=new Object[totalrows][2];
	for(int i=0;i<totalrows;i++){
		data[i][0]=d.getData(0, i, 0);
		data[i][1]=d.getData(0, i,1);
		
	}
		
	return data;	
		
		
		
		
		
		
		
		
	}

}

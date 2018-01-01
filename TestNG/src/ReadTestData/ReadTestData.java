package ReadTestData;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadTestData {

	
		
		XSSFWorkbook mywb;
		XSSFSheet Sheet1;
		
		
		public ReadTestData(String ExcelPath){
			File f=new File(ExcelPath);
			FileInputStream f1;
			try{
				f1=new FileInputStream(f);
				mywb=new XSSFWorkbook(f1);
				Sheet1=mywb.getSheetAt(0);
				
				
			}catch (IOException e){
				System.out.println(e.getMessage());
			}	
				
			}
				public Object getData(int sheetnumber,int rownum, int column){
					Object data=Sheet1.getRow(rownum).getCell(column).getStringCellValue();
					return data;
					
					
				}
			public int getrowcount(int sheetnum){
				int totalrows=mywb.getSheetAt(sheetnum).getLastRowNum();
				return totalrows=totalrows+1;
			}
		}

	
			



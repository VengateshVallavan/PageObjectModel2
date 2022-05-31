package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataInputprovider {
	
	public static String[][] getdata(String sheetName)  {
		
		String[][] testData = null ;

		
		try {
			FileInputStream fis=new FileInputStream("./testData/testDatasheet.xlsx");
			XSSFWorkbook wb=new XSSFWorkbook(fis);
			
			 
			XSSFSheet sheet=wb.getSheet(sheetName);
			
			int rowcount=sheet.getLastRowNum();
			
			int columncount=sheet.getRow(0).getLastCellNum();
			
			System.out.println("row count "+rowcount);
			
			System.out.println("column count "+columncount);
			
			testData=new String[rowcount][columncount];
			
			for(int i=1;  i<=rowcount;  i++) {
				
				XSSFRow row=sheet.getRow(i);
				
				for(int j=0; j<columncount; j++) {
					
					String celldata=row.getCell(j).getStringCellValue();
					
					System.out.println("the value of the row "+(i-1)+"and the column "+j+" is :"+celldata);
					
					testData[i-1][j]=celldata;
							
				}
			}
			 
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return testData;
		
		
			
	}

}

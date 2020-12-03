package week6.day1;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataFromExcel {

	public String[][]readExcel(String fileName) throws IOException{
		// TODO Auto-generated method stub
XSSFWorkbook wb = new XSSFWorkbook("./datafolder/"+fileName+".xlsx");
XSSFSheet ws = wb.getSheet("Sheet1");
int rowCount = ws.getLastRowNum();
System.out.println(rowCount);

//to get cell count

int cellCount = ws.getRow(0).getLastCellNum();
System.out.println(cellCount);

//declare 2D array to save data from excel

String[][]data = new String[rowCount][cellCount];
for(int i =1; i <= rowCount; i++){
	for(int j=0; j<cellCount; j++) {
	String Cellvalue = ws.getRow(i).getCell(j).getStringCellValue();
	data[i-1][j] = Cellvalue;
	
}
	
wb.close();
}
return data;}
}


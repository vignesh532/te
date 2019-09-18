package org.greens.tec.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {

	public static WebDriver driver;

	public static WebDriver getDriver() {
		System.setProperty("webdriver.chrome.driver",
				"E:\\Selenium Project\\WorkSpace\\LoginFb\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		return driver;
	}

	public static void enterUrl(String url) {
		driver.get(url);

	}

	public static void closebrowser() {

		driver.close();

	}

	public static void currenturl() {
		String hm = driver.getCurrentUrl();
		System.out.println(hm);

	}

	public static void printTitle() {
		String title = driver.getTitle();
		System.out.println(title);

	}

	public static void enterText(WebElement element, String name) {

		element.sendKeys(name);
	}

	public static void buttonClick(WebElement element) {
		element.click();
	}

	public static String[][] getData() throws IOException {

		File f = new File("E:\\Selenium Project\\WorkSpace\\Test\\Excel\\Adacitin.xlsx");
		{

			FileInputStream stre = new FileInputStream(f);

			Workbook w = new XSSFWorkbook(stre);

			Sheet s = w.getSheet("Sheet1");
			
			String name = null;
			
			String[][] data = new String [s.getPhysicalNumberOfRows()-1][s.getRow(0).getPhysicalNumberOfCells()];
			for (int i = 1; i < s.getPhysicalNumberOfRows(); i++) {
				Row r = s.getRow(i);
				for (int j = 0;j< r.getPhysicalNumberOfCells(); j++) {
					
					Cell c = r.getCell(j);	

			       int ce = c.getCellType();

			        if (ce == 1) {
				    name = c.getStringCellValue();
			}
			if (ce == 0) {
				if (DateUtil.isCellDateFormatted(c)) {
					name = new SimpleDateFormat("dd-MMM-yy").format(c.getDateCellValue());

				} else {
					name = String.valueOf((long) c.getNumericCellValue());
					
					data [i-1][j]=name;

				}
				
				return data;
				
			}
			
		}
			}
		}
		return null;
	}

	public static void writeCell(int rowNo, int cellNo, String name) throws IOException {

		File f = new File("E:\\Selenium Project\\WorkSpace\\Test\\Excel\\Adacitin.xlsx");

		FileInputStream stre = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(stre);
		Sheet s = w.getSheet("Sheet1");
		Row r = s.getRow(rowNo);
		Cell c = r.createCell(cellNo);
		c.setCellValue(name);
		FileOutputStream output = new FileOutputStream(f);
		w.write(output);
	}

	public static void selectByindex(WebElement element, int num) {
		Select s = new Select(element);
		s.selectByIndex(num);

	}

	public static void selectByValue(WebElement element, String name) {
		Select s = new Select(element);
		s.selectByValue(name);
	}

	public static void selectByVisibleText(WebElement element, String name) {
		Select s = new Select(element);
		s.selectByValue(name);

	}

	public static void GetAttribute(WebElement e, String m) {
		e.getAttribute("value");
		m = e.getText();
		System.out.println(m);
	}
}

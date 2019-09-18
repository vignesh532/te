package org.greens.tec.Test;

import java.io.IOException;
import java.util.Date;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Adactin extends BaseClass {
	
	
	@BeforeClass
	
    public void beforeClass() {
	getDriver();
	enterUrl("http://www.adactin.com/HotelApp/index.php");
	}
	
	@AfterClass
	
	public void afterClass() {
		
		closebrowser();
	}
	
	@BeforeMethod
	
	public void execuStartTime() {
	Date d =new Date();
	System.out.println(d);

	
	}
	
	@AfterMethod
	
	public void execuStopTime() {
	Date d =new Date();
	System.out.println(d);
	
	}
	
	@Test(dataProvider="Excel")
	public void logic(String user, String pass, String d,String hotel, String room, String rtype, 
String aroom, String croom, String fname, String lname, String add, String cardno, String ctype, String expmo, 
String expyear,String cvv)throws InterruptedException, IOException {

	HotelLogin page = new HotelLogin();
	enterText(page.getTextUserName(),user);
	enterText(page.getTextpass(),pass);
	buttonClick(page.getBtnlogin());

	
	SearchHotel p = new SearchHotel();
	selectByValue(p.getDropLocation(),d);
	selectByValue(p.getDropHotel(),hotel);
	selectByValue(p.getDropRoomType(),room);
	selectByValue(p.getDropROomTypes(),rtype);
	selectByValue(p.getDropAdultRoom(), aroom);
	enterText(p.getDropChildRoom(), croom);
	buttonClick(p.getClikSubmit());
	
	buttonClick(p.getSeleRadioButton());
	buttonClick(p.getSelContinue());
	
	//Assert.assertTrue(true);
	
	
	BookHotel bo = new BookHotel();
	
	enterText(bo.getTextFirstName(),fname);
	enterText(bo.getTextLastName(), lname);
	enterText(bo.getTextAddress(), add);
	enterText(bo.getTextccnum(),cardno);
	selectByValue(bo.getDropCcType(), ctype);
	selectByValue(bo.getDropExpMonth(), expmo);
	selectByValue(bo.getDropExpYear(),expyear);
	enterText(bo.getTextCvvNum(), cvv);
	buttonClick(bo.getClikButton());
	//Assert.assertTrue(true);
	
	
	
	Thread.sleep(9000);
	
	//writeCell(1,7,bo.getGetOrderNo().getAttribute("value"));

}


@DataProvider(name= "Excel")
public Object [][] data() throws IOException {
	return getData();
}
}
	
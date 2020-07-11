package testscript2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class testscipt {
	
	@Test(priority=1)
	public void stockentry() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Java\\chromedriver.exe");		
		WebDriver driver = new ChromeDriver();
									
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://18.140.214.202:9000/login");
		
		driver.manage().window().maximize();
	    				
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Thread.sleep(5000);
						
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		System.out.println("checked");
		
		driver.findElement(By.name("username")).sendKeys("posistentp_outlet1");
		
		driver.findElement(By.name("password")).sendKeys("Outlet1@");
		Thread.sleep(10000);
		
		driver.findElement(By.xpath("//strong[@title='Close the keyboard']")).click();
		
		driver.findElement(By.xpath("//button[@type='submit']")).submit();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		Thread.sleep(10000);
		driver.findElement(By.xpath("//button[@data-bb-handler='cancel']")).click();
		System.out.println("working login");
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		Thread.sleep(6000);
		driver.findElement(By.xpath("//a[@class='dropdown-toggle ng-binding']")).click();
	    Thread.sleep(5000);
	     driver.findElement(By.xpath("//a[@ng-href='/eStock']")).click();
	     System.out.println("enter into the stock");
	     Thread.sleep(5000);
	     driver.findElement(By.xpath("//a[@ui-sref='.entries']")).click();
	     System.out.println("clicked on stock enrty");
	     Thread.sleep(5000);
	     driver.findElement(By.xpath("//div[@ng-click='performStockEntry()']")).click();			     
	     System.out.println("select store");
	     Thread.sleep(5000);
	     WebElement store_drpdown= driver.findElement(By.name("store"));
	     Select sel1= new Select(store_drpdown);
	     sel1.selectByVisibleText("Main Store");
	     WebElement vendor_drpdown= driver.findElement(By.name("vendor"));
	     Select sel2= new Select(vendor_drpdown);
	     sel2.selectByVisibleText("Chatvinder");
	     System.out.println("vendor selected");
	     Thread.sleep(5000);
         driver.findElement(By.id("0")).click();
		 Thread.sleep(5000);
		 driver.findElement(By.name("quantity")).sendKeys("10");
		 Thread.sleep(5000);
		 driver.findElement(By.xpath("//a[@class='btn btn-primary ng-binding ng-scope']")).click();	
		 System.out.println("stock entry done");	
	     Thread.sleep(5000);
	     driver.findElement(By.xpath("//div[@class='modal-footer ng-scope']/a[1]")).click();
		 Thread.sleep(5000);				 
		 driver.findElement(By.xpath("//div[@class='modal-footer ng-scope']/a[1]")).click();
		 System.out.println("stock over");
	}
	
	
	@Test(priority=8)
	public void semiprocessed() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Java\\chromedriver.exe");		
		WebDriver driver = new ChromeDriver();
									
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://18.140.214.202:9000/login");
		
		driver.manage().window().maximize();
	    				
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Thread.sleep(5000);
						
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		System.out.println("checked");
		
		driver.findElement(By.name("username")).sendKeys("posistentp_outlet1");
		
		driver.findElement(By.name("password")).sendKeys("Outlet1@");
		Thread.sleep(10000);
		
		driver.findElement(By.xpath("//strong[@title='Close the keyboard']")).click();
		
		driver.findElement(By.xpath("//button[@type='submit']")).submit();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		Thread.sleep(12000);
		driver.findElement(By.xpath("//button[@data-bb-handler='cancel']")).click();
		System.out.println("working login");
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		Thread.sleep(6000);
		driver.findElement(By.xpath("//a[@class='dropdown-toggle ng-binding']")).click();
	    Thread.sleep(6000);
	     driver.findElement(By.xpath("//a[@ng-href='/eStock']")).click();
	     System.out.println("enter into the stock");
	     Thread.sleep(4000);
	     driver.findElement(By.xpath("//a[@ui-sref='.entries']")).click();
	     System.out.println("clicked on entries");
	     Thread.sleep(4000);
	     driver.findElement(By.xpath("//li[@ng-click='resetSemiProcessedFoodEntryTab()']/a[@ng-click='select()']")).click();
	     Thread.sleep(4000);
	     driver.findElement(By.xpath("//div[@ng-click='performSemiProcessedFoodEntry()']")).click();
	     driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	     Thread.sleep(4000);
	     WebElement dropdown= driver.findElement(By.xpath("(//select[@name='store'])[5]"));
	     Select sel1= new Select(dropdown);
	     sel1.selectByVisibleText("Rtkitchen");				     
	     System.out.println("kitchen selected");
	     Thread.sleep(5000);
	     driver.findElement(By.id("0")).click();
	     System.out.println("category  selected");
	     Thread.sleep(5000);
	     driver.findElement(By.name("quantity")).sendKeys("10");
	     Thread.sleep(5000);
	     driver.findElement(By.xpath("//a[@class='btn btn-primary ng-binding ng-scope']")).click();
	     //driver.findElement(By.xpath("//button[@class='btn btn-warning ng-hide']")).click();
	     driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	     Thread.sleep(5000);
	     driver.findElement(By.xpath("//div[@class='modal-footer ng-scope']/a[@ng-click='submit(true)']")).click();
	     System.out.println("qty checked");
	     Thread.sleep(5000);
	    // driver.findElement(By.xpath("//div[@class='modal-footer ng-scope']/a[@ng-click='submit(true)']")).click();
	     System.out.println("semiprocessed entry done");	
			
	}
	
	@Test(priority=7)
	public void processed() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Java\\chromedriver.exe");		
		WebDriver driver = new ChromeDriver();
									
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://18.140.214.202:9000/login");
		
		driver.manage().window().maximize();
	    				
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Thread.sleep(5000);
					
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		System.out.println("checked");
		
		driver.findElement(By.name("username")).sendKeys("posistentp_outlet1");
		
		driver.findElement(By.name("password")).sendKeys("Outlet1@");
		Thread.sleep(10000);
		
		driver.findElement(By.xpath("//strong[@title='Close the keyboard']")).click();
		
		driver.findElement(By.xpath("//button[@type='submit']")).submit();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		Thread.sleep(12000);
		driver.findElement(By.xpath("//button[@data-bb-handler='cancel']")).click();
		System.out.println("working login");
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		Thread.sleep(6000);
		driver.findElement(By.xpath("//a[@class='dropdown-toggle ng-binding']")).click();
	    Thread.sleep(6000);
	     driver.findElement(By.xpath("//a[@ng-href='/eStock']")).click();
	     System.out.println("enter into the stock");
	     Thread.sleep(4000);
	     driver.findElement(By.xpath("//a[@ui-sref='.entries']")).click();
	     System.out.println("clicked on entries");
	     Thread.sleep(4000);
	     driver.findElement(By.xpath("(//a[@ng-click='select()'])[7]")).click();
	     Thread.sleep(4000);
	     driver.findElement(By.xpath("//div[@ng-click='performProcessedFoodEntry()']")).click();
	     System.out.println("enter details");
	     Thread.sleep(5000);
	     WebElement dropdown= driver.findElement(By.xpath("(//select[@name='store'])[4]"));
	     Select sel1= new Select(dropdown);
	     sel1.selectByVisibleText("Rtkitchen");				     
	     System.out.println("kitchen selected");
	     Thread.sleep(5000);
	     driver.findElement(By.id("6")).click();
	     System.out.println("category  selected");
	     Thread.sleep(5000);
	     driver.findElement(By.name("quantity")).sendKeys("10");
	     Thread.sleep(5000);
	   //driver.findElement(By.xpath("//a[@class='btn btn-primary ng-binding ng-scope']")).click();
	     driver.findElement(By.xpath("//button [@class='btn btn-primary']")).click();
	     driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	     Thread.sleep(5000);
	     //driver.findElement(By.xpath("//div[@class='modal-footer ng-scope']/a[@ng-click='submit(true)']")).click();
	     System.out.println("qty checked");
	     Thread.sleep(5000);
	    // driver.findElement(By.xpath("//div[@class='modal-footer ng-scope']/a[@ng-click='submit(true)']")).click();
	     System.out.println("processedfood entry done");

	}
	
	@Test(priority=3)
	public void physicalstock() throws InterruptedException
	
	{
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Java\\chromedriver.exe");		
		WebDriver driver = new ChromeDriver();
									
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://18.140.214.202:9000/login");
		
		driver.manage().window().maximize();
	    				
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Thread.sleep(5000);
						
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		System.out.println("checked");
		
		driver.findElement(By.name("username")).sendKeys("posistentp_outlet1");
		
		driver.findElement(By.name("password")).sendKeys("Outlet1@");
		Thread.sleep(10000);
		
		driver.findElement(By.xpath("//strong[@title='Close the keyboard']")).click();
		
		driver.findElement(By.xpath("//button[@type='submit']")).submit();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		Thread.sleep(12000);
		driver.findElement(By.xpath("//button[@data-bb-handler='cancel']")).click();
		System.out.println("working login");
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		Thread.sleep(6000);
		driver.findElement(By.xpath("//a[@class='dropdown-toggle ng-binding']")).click();
	    Thread.sleep(6000);
	     driver.findElement(By.xpath("//a[@ng-href='/eStock']")).click();
	     System.out.println("enter into the stock");
	     Thread.sleep(4000);
	     driver.findElement(By.xpath("//a[@ui-sref='.entries']")).click();
	     System.out.println("clicked on entries");
	     Thread.sleep(4000);
	     driver.findElement(By.xpath("//li[@ng-click='resetPhysicalStockTab()']/a[@ng-click='select()']")).click();
	     Thread.sleep(4000);
	     driver.findElement(By.xpath("//div[@ng-click='performPhysicalStock()']")).click();
	     driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	     Thread.sleep(4000);
	     WebElement dropdown= driver.findElement(By.xpath("(//select[@name='store'])[3]"));
	     Select sel1= new Select(dropdown);
	     sel1.selectByVisibleText("Main Store");				     
	     System.out.println("store selected");
	     Thread.sleep(5000);
	     driver.findElement(By.id("7")).click();
	     Thread.sleep(5000);
	     driver.findElement(By.name("quantity")).sendKeys("10");
	     driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
	     driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	     Thread.sleep(5000);
	     driver.findElement(By.xpath("//div[@class='modal-footer ng-scope']/a[@ng-click='submit(true)']")).click();
	     System.out.println("qty checked");
	     Thread.sleep(5000);
	    driver.findElement(By.xpath("//div[@class='modal-footer ng-scope']/a[@ng-click='submit(true)']")).click();
	     System.out.println("physical entry done");
	     
	     
	     
	}

	@Test(priority=6)
	public void openingstock() throws InterruptedException
	
	{
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Java\\chromedriver.exe");		
		WebDriver driver = new ChromeDriver();
									
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://18.140.214.202:9000/login");
		
		driver.manage().window().maximize();
	    				
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Thread.sleep(5000);
						
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		System.out.println("checked");
		
		driver.findElement(By.name("username")).sendKeys("posistentp_outlet1");
		
		driver.findElement(By.name("password")).sendKeys("Outlet1@");
		Thread.sleep(10000);
		
		driver.findElement(By.xpath("//strong[@title='Close the keyboard']")).click();
		
		driver.findElement(By.xpath("//button[@type='submit']")).submit();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		Thread.sleep(12000);
		driver.findElement(By.xpath("//button[@data-bb-handler='cancel']")).click();
		System.out.println("working login");
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		Thread.sleep(6000);
		driver.findElement(By.xpath("//a[@class='dropdown-toggle ng-binding']")).click();
	    Thread.sleep(6000);
	    driver.findElement(By.xpath("//a[@ng-href='/eStock']")).click();
	    System.out.println("enter into the stock");
	    Thread.sleep(4000);
	    driver.findElement(By.xpath("//a[@ui-sref='.entries']")).click();
	    System.out.println("clicked on entries");
	    Thread.sleep(4000);
	    driver.findElement(By.xpath("//li[@ng-click='resetOpeningStockTab()']/a[@ng-click='select()']")).click();
	     Thread.sleep(4000);
	     driver.findElement(By.xpath("//div[@ng-click='performOpeningStock()']")).click();
	     driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	     Thread.sleep(4000);
	     WebElement dropdown= driver.findElement(By.xpath("(//select[@name='storeKitchen'])[3]"));
	     Select sel1= new Select(dropdown);
	     sel1.selectByVisibleText("Main Store");				     
	     System.out.println("store selected");
	     Thread.sleep(5000);
	     driver.findElement(By.id("7")).click();
	     Thread.sleep(5000);
	     driver.findElement(By.name("quantity")).sendKeys("10");
	     Thread.sleep(5000);
	     driver.findElement(By.name("unitPrice")).sendKeys("10");
	     driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
	     driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	     Thread.sleep(5000);
	     driver.findElement(By.xpath("//div[@class='modal-footer ng-scope']/a[@ng-click='submit(true)']")).click();
	     System.out.println("qty checked");
	     Thread.sleep(5000);
	   // driver.findElement(By.xpath("//div[@class='modal-footer ng-scope']/a[@ng-click='submit(true)']")).click();
	     System.out.println("opening stock entry done");

	}
	
	@Test(priority=5)
	public void stocktransfer() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Java\\chromedriver.exe");		
		 WebDriver driver = new ChromeDriver();
									
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 driver.get("http://18.140.214.202:9000/login");
		
		 driver.manage().window().maximize();
	    				
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 Thread.sleep(5000);
						
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		 System.out.println("checked");
		
		 driver.findElement(By.name("username")).sendKeys("posistentp_outlet1");
		
		 driver.findElement(By.name("password")).sendKeys("Outlet1@");
		 Thread.sleep(10000);
		 driver.findElement(By.xpath("//strong[@title='Close the keyboard']")).click();
		 driver.findElement(By.xpath("//button[@type='submit']")).submit();
		 driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		 Thread.sleep(12000);
		 driver.findElement(By.xpath("//button[@data-bb-handler='cancel']")).click();
		 System.out.println("working login");
		 driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		 Thread.sleep(6000);
		 driver.findElement(By.xpath("//a[@class='dropdown-toggle ng-binding']")).click();
	     Thread.sleep(6000);
	     driver.findElement(By.xpath("//a[@ng-href='/eStock']")).click();
	     System.out.println("enter into the stock");
	     Thread.sleep(4000);
	     driver.findElement(By.xpath("//a[@ui-sref='.entries']")).click();
	     System.out.println("clicked on entries");
	     Thread.sleep(4000);
	     driver.findElement(By.xpath("//li [@ng-click='resetStockTransferTab()']/a[@ng-click='select()']")).click();
	     Thread.sleep(5000);
	     driver.findElement(By.xpath("//div[@ng-click='performStockTransfer()']")).click();
	     System.out.println("enter stock transfer qty");
	     Thread.sleep(5000);
	     Select sel1= new Select(driver.findElement(By.xpath("(//Select[@name='storeKitchen'])[2]")));
	     Thread.sleep(5000);
	     sel1.selectByVisibleText("Main Store");
	     System.out.println("store selected");
	     Thread.sleep(5000);
	     Select sel2= new Select(driver.findElement(By.xpath("//Select[@name='toStore']")));
	     Thread.sleep(5000);
	     sel2.selectByVisibleText("Rtkitchen");
	     System.out.println("kitchen selected");
	     Thread.sleep(5000);
	     driver.findElement(By.id("7")).click();
	     Thread.sleep(5000);
	     driver.findElement(By.name("quantity")).sendKeys("10");
	     System.out.println("quantity entered");
	     driver.findElement(By.xpath("//button[@class='btn btn-primary']/span[@class='ng-binding']")).click();
	     System.out.println("submitted");
	     Thread.sleep(5000);
	     driver.findElement(By.xpath("//div[@class='modal-footer ng-scope']/a[@ng-click='submit(true)']")).click();
	     Thread.sleep(5000);
	     driver.findElement(By.xpath("//div[@class='modal-footer ng-scope']/a[@ng-click='submit(true)']")).click();
	     System.out.println("stock transfer done");

	}
	
	@Test(priority=4)
	public void wastage() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Java\\chromedriver.exe");		
		 WebDriver driver = new ChromeDriver();
									
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 driver.get("http://18.140.214.202:9000/login");
		
		 driver.manage().window().maximize();
	    				
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 Thread.sleep(5000);
						
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		 System.out.println("checked");
		
		 driver.findElement(By.name("username")).sendKeys("posistentp_outlet1");
		
		 driver.findElement(By.name("password")).sendKeys("Outlet1@");
		 Thread.sleep(10000);
		
		 driver.findElement(By.xpath("//strong[@title='Close the keyboard']")).click();
		
		 driver.findElement(By.xpath("//button[@type='submit']")).submit();
		 driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		 Thread.sleep(12000);
		 driver.findElement(By.xpath("//button[@data-bb-handler='cancel']")).click();
		 System.out.println("working login");
		 driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		 Thread.sleep(6000);
		 driver.findElement(By.xpath("//a[@class='dropdown-toggle ng-binding']")).click();
	     Thread.sleep(6000);
	     driver.findElement(By.xpath("//a[@ng-href='/eStock']")).click();
	     System.out.println("enter into the stock");
	     Thread.sleep(4000);
	     driver.findElement(By.xpath("//a[@ui-sref='.entries']")).click();
	     System.out.println("clicked on entries");
	     Thread.sleep(4000);
	     driver.findElement(By.xpath("//li [@ng-click='resetWastageTab()']/a[@ng-click='select()']")).click();
	     Thread.sleep(5000);
	     driver.findElement(By.xpath("//div[@ng-click='performWastage()']")).click();
	     System.out.println("enter wastage qty");
	     Thread.sleep(5000);
	     Select sel1 = new Select(driver.findElement(By.xpath("(//select[@name='storeKitchen'])[1]")));
	     sel1.selectByVisibleText("Main Store");
	     System.out.println("store selected");
	     Thread.sleep(5000);
	     Select sel2= new Select(driver.findElement(By.xpath("//select[@name='wastageType']")));
	     sel2.selectByVisibleText("Wastage");
	     System.out.println("wastage type selected");
	     Thread.sleep(5000);
	     driver.findElement(By.id("7")).click();
	     Thread.sleep(5000);
	     driver.findElement(By.name("quantity")).sendKeys("10");
	     Thread.sleep(5000);
	     driver.findElement(By.xpath("//button[@class='btn btn-primary']/span[@class='ng-binding']")).click();
	     System.out.println("submitted");
	     Thread.sleep(5000);
	     driver.findElement(By.xpath("//div[@class='modal-footer ng-scope']/a[@ng-click='submit(true)']")).click();
	     Thread.sleep(5000);
	//     driver.findElement(By.xpath("//div[@class='modal-footer ng-scope']/a[@ng-click='submit(true)']")).click();
	     System.out.println("wastage qty entered");

	}
	
	@Test(priority=2)
	public void stocksale() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Java\\chromedriver.exe");		
		WebDriver driver = new ChromeDriver();
									
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://18.140.214.202:9000/login");
		
		driver.manage().window().maximize();
	    				
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Thread.sleep(5000);
						
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		System.out.println("checked");
		
		driver.findElement(By.name("username")).sendKeys("posistentp_outlet1");
		
		driver.findElement(By.name("password")).sendKeys("Outlet1@");
		Thread.sleep(10000);
		
		driver.findElement(By.xpath("//strong[@title='Close the keyboard']")).click();
		
		driver.findElement(By.xpath("//button[@type='submit']")).submit();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		Thread.sleep(11000);
		driver.findElement(By.xpath("//button[@data-bb-handler='cancel']")).click();
		System.out.println("working login");
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		Thread.sleep(6000);
		driver.findElement(By.xpath("//a[@class='dropdown-toggle ng-binding']")).click();
	    Thread.sleep(5000);
	     driver.findElement(By.xpath("//a[@ng-href='/eStock']")).click();
	     System.out.println("enter into the stock");
	     Thread.sleep(9000);
	     driver.findElement(By.xpath("//a[@ui-sref='.entries']")).click();
	     System.out.println("clicked on  enrtries");
	     Thread.sleep(9000);
	     driver.findElement(By.xpath("//li[@ng-click='resetStockSaleTab()']/a[@ng-click='select()']")).click();
	     System.out.println("clicked on stock sale");
	     Thread.sleep(5000);
	     driver.findElement(By.xpath("//div[@ng-click='performStockSale()']")).click();	
	     WebElement store_drpdown= driver.findElement(By.xpath("(//select[@name='store'])[2]"));  
	     driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	     Thread.sleep(5000);
	     Select sel1= new Select(store_drpdown);
	     sel1.selectByVisibleText("Main Store");
	     System.out.println("store selected");
	     WebElement vendor_drpdown= driver.findElement(By.name("receiver"));
	     Select sel2= new Select(vendor_drpdown);
	     sel2.selectByVisibleText("Mr Rectest");
	     System.out.println("vendor selected");
	 	 Thread.sleep(5000);
		 driver.findElement(By.id("1")).click();
		 Thread.sleep(5000);
		 driver.findElement(By.name("quantity")).sendKeys("10");
		 Thread.sleep(5000);
		 driver.findElement(By.name("unitPrice")).sendKeys("10");
		 driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		 //driver.findElement(By.xpath("//a[@class='btn btn-primary ng-binding ng-scope']")).click();	
		 System.out.println("stock sale done");	
	     Thread.sleep(5000);
	     driver.findElement(By.xpath("//div[@class='modal-footer ng-scope']/a[1]")).click();
	     System.out.println("invoice no. not fill up");
		 Thread.sleep(5000);
		 driver.findElement(By.xpath("//div[@class='modal-footer ng-scope']/a[@ng-click='submit(true)']")).click();
		 System.out.println("qty checked");
		 Thread.sleep(5000);
		 driver.findElement(By.xpath("//div[@class='modal-footer ng-scope']/a[@ng-click='submit(true)']")).click();
		 System.out.println("stock over");
		}
	
		 @Test(priority=9)
		 public void purchaseentry() throws InterruptedException
		 {
		 System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Java\\chromedriver.exe");		
			WebDriver driver = new ChromeDriver();
										
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.get("http://18.140.214.202:9000/login");
			
			driver.manage().window().maximize();
		    				
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			Thread.sleep(5000);
							
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
			System.out.println("checked");
			
			driver.findElement(By.name("username")).sendKeys("posistentp_outlet1");
			
			driver.findElement(By.name("password")).sendKeys("Outlet1@");
			Thread.sleep(10000);
			
			driver.findElement(By.xpath("//strong[@title='Close the keyboard']")).click();
			
			driver.findElement(By.xpath("//button[@type='submit']")).submit();
			driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@data-bb-handler='cancel']")).click();
			System.out.println("working login");
			driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
			Thread.sleep(6000);
			driver.findElement(By.xpath("//a[@class='dropdown-toggle ng-binding']")).click();
		    Thread.sleep(5000);
		     driver.findElement(By.xpath("//a[@ng-href='/eStock']")).click();
		     System.out.println("enter into the stock");
		     Thread.sleep(5000);
		     driver.findElement(By.xpath("//a[@ui-sref='.purchaseOrder']")).click();
		     System.out.println("clicked on stock enrty");
		     Thread.sleep(5000);
		    WebElement drp_down=driver.findElement(By.name("vendor"));
		    Select s1= new Select(drp_down);
		    s1.selectByVisibleText("Chatvinder");
		    System.out.println("vendor selected");
		    Thread.sleep(2000);
		    driver.findElement(By.xpath("//input[@datepicker-popup='dd-MM-yyyy']")).click();
		    String exp_month="August 2020";
		    String exp_date="15";   	
		    while(true) 
		    {
		    	String curr_month= driver.findElement(By.xpath("(//strong[@class='ng-binding'])[1]")).getText();
		    	if(curr_month.equals(exp_month)) 
		    	{
		    	 break;
		    	}
		    	else
		    	{
		    		 driver.findElement(By.xpath("(//button[@class='btn btn-default btn-sm pull-right'])[1]")).click();	
		    			    		
		    	}
	    
		    }
		    Thread.sleep(2000);
		    driver.findElement(By.xpath("(//td[@role='gridcell']/button/span[text()='05'])[1]")).click();
		    System.out.println("ordering for date selected");
		    Thread.sleep(2000);
		    driver.findElement(By.id("5d907d8b28b05f7e2805e795")).click();
		    Thread.sleep(2000);
		    driver.findElement(By.name("qty_5dadaa4c5bf0228fe4694d7d")).sendKeys("10");
		    Thread.sleep(2000);
		    System.out.println("qty entered");
		    driver.findElement(By.xpath("//button[@class='btn btn-success ng-binding']")).click();
		    Thread.sleep(2000);
		    Alert alt=driver.switchTo().alert();
		    alt.accept();
		    Thread.sleep(2000);
		    Alert alt2=driver.switchTo().alert();
		    alt2.accept();
		    System.out.println("purchase order entry done");

	 
		 }
		 
	 @Test(priority=10)
     public void indent() throws InterruptedException

        {

		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Java\\chromedriver.exe");		
	    WebDriver driver = new ChromeDriver();
								
    	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    driver.get("http://18.140.214.202:9000/login");
	
	    driver.manage().window().maximize();
    				
	   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	   Thread.sleep(5000);
					
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	  System.out.println("checked");
	
	  driver.findElement(By.name("username")).sendKeys("posistentp_outlet1");
	
	  driver.findElement(By.name("password")).sendKeys("Outlet1@");
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//strong[@title='Close the keyboard']")).click();
	
	driver.findElement(By.xpath("//button[@type='submit']")).submit();
	driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@data-bb-handler='cancel']")).click();
	System.out.println("working login");
	driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[@class='dropdown-toggle ng-binding']")).click();
    Thread.sleep(2000);
     driver.findElement(By.xpath("//a[@ng-href='/eStock']")).click();
     System.out.println("enter into the stock");
     Thread.sleep(2000);
     driver.findElement(By.xpath("//a[@ui-sref='.indent']")).click();
     System.out.println("clicked on indent");
     Thread.sleep(2000);
     WebElement drp_down= driver.findElement(By.name("baseKitchen"));
     Select sel1= new Select(drp_down);
     sel1.selectByVisibleText("bk1");
     Thread.sleep(2000);
     driver.findElement(By.xpath("//input[@datepicker-popup='dd-MM-yyyy']")).click();
	    String exp_month="August 2020";
	    String exp_date="15";   	
	    while(true) 
	    {
	    	String curr_month= driver.findElement(By.xpath("(//strong[@class='ng-binding'])[1]")).getText();
	    	if(curr_month.equals(exp_month)) 
	    	{
	    	 break;
	    	}
	    	else
	    	{
	    		driver.findElement(By.xpath("(//button[@class='btn btn-default btn-sm pull-right'])[1]")).click();	
	    			    		
	    	}
    
	    }
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("(//td[@role='gridcell']/button/span[text()='05'])[1]")).click();
	    System.out.println("ordering for date selected");
	    Thread.sleep(2000);
	    driver.findElement(By.id("5d907d8b28b05f7e2805e795")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.name("qty5daac2faf4d1ae535694898f")).sendKeys("10");
	    System.out.println("qty entered");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//a[@class='btn btn-success ng-binding ng-scope']")).click();
	    System.out.println("submitted");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//a[@class='btn btn-primary pull-right']")).click();
	    System.out.println("btn clicked");
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//a[@class='btn btn-primary pull-right']")).click();
	    System.out.println("2nd btn clicked");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//a[@class='btn btn-success ng-binding ng-scope']")).click();
	    System.out.println("indent generated");    
    
        }
	 	
	 	@Test(priority=11)
	 	public void internalindent() throws InterruptedException
	 	{
	 	System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Java\\chromedriver.exe");		
		WebDriver driver = new ChromeDriver();
									
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://18.140.214.202:9000/login");
		
		driver.manage().window().maximize();
	    				
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Thread.sleep(5000);
						
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		System.out.println("checked");
		
		driver.findElement(By.name("username")).sendKeys("posistentp_outlet1");
		
		driver.findElement(By.name("password")).sendKeys("Outlet1@");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//strong[@title='Close the keyboard']")).click();
		
		driver.findElement(By.xpath("//button[@type='submit']")).submit();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@data-bb-handler='cancel']")).click();
		System.out.println("working login");
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS); 
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='dropdown-toggle ng-binding']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//a[@ng-href='/eStock']")).click();
	    System.out.println("enter into the stock");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//a[@ui-sref='.internalIndenting']")).click();
	    System.out.println("clicked on internal indent");
	    Thread.sleep(2000);
	    WebElement drp_down= driver.findElement(By.name("toStoreKitchen"));
	    Select sel1= new Select(drp_down);
	    sel1.selectByVisibleText("Rtkitchen");
	    System.out.println("store selected");
	    Thread.sleep(2000);
	    WebElement drp_down2= driver.findElement(By.name("storeKitchen"));
	    Select sel2= new Select(drp_down2);
	    sel2.selectByVisibleText("Main Store");
	    System.out.println("store from selected");
	    Thread.sleep(2000);
	    driver.findElement(By.id("5d907d8b28b05f7e2805e795")).click();
	    System.out.println("category selected");
	    driver.findElement(By.name("qty5daac300f4d1ae53569489b7")).sendKeys("10");;
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//button[@class='btn btn-success ng-scope']")).click();
	    Alert alt= driver.switchTo().alert();
	    alt.accept();
	    Alert alt2= driver.switchTo().alert();
	    alt.accept();
	    driver.findElement(By.xpath("//button[@class='btn btn-success ng-scope']")).click();
	    System.out.println("internal indent generated");
	}
	 	@Test(priority=12)
	 	public void salesorder() throws InterruptedException
	 	{
	 	System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Java\\chromedriver.exe");		
		WebDriver driver = new ChromeDriver();
									
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://18.140.214.202:9000/login");
		
		driver.manage().window().maximize();
	    				
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Thread.sleep(2000);
						
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		System.out.println("checked");
		
		driver.findElement(By.name("username")).sendKeys("posistentp_outlet1");
		
		driver.findElement(By.name("password")).sendKeys("Outlet1@");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//strong[@title='Close the keyboard']")).click();
		
		driver.findElement(By.xpath("//button[@type='submit']")).submit();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@data-bb-handler='cancel']")).click();
		System.out.println("working login");
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='dropdown-toggle ng-binding']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//a[@ng-href='/eStock']")).click();
	    System.out.println("enter into the stock");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//a[@ui-sref='.salesOrder']")).click();
	    Thread.sleep(2000);
	    WebElement drp_down= driver.findElement(By.name("receiver"));
	    Select sel1= new Select(drp_down);
	    sel1.selectByVisibleText("Mr Rectest");
	    System.out.println("vendor selected");
	    Thread.sleep(2000);
	    driver.findElement(By.id("5d907d8b28b05f7e2805e795")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.name("qty_5daac300f4d1ae53569489b7")).sendKeys("10");
	    System.out.println("qty entered");
	    driver.findElement(By.xpath("//button[@class='btn btn-success']")).click();
	    Alert alt= driver.switchTo().alert();
	    alt.accept();
	    Thread.sleep(2000);
	    Alert alt1= driver.switchTo().alert();
	    alt1.accept();
	    System.out.println("sales order entry done");
	}	

}





	

	
	
	



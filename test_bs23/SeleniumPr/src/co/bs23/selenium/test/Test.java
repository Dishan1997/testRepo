package co.bs23.selenium.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\Program Files\\Program 3\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
        driver.get("http://automationpractice.com/index.php");
        driver.manage().window().maximize();
        
        //*********account creation -1 **************************
        driver.findElement(By.className("login")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("email_create")).sendKeys("refatcseaust@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.name("SubmitCreate")).click();
        Thread.sleep(2000);
        
        driver.findElement(By.id("id_gender2")).click();
        //Thread.sleep(2000);
        driver.findElement(By.id("customer_firstname")).sendKeys("Refat");
        //Thread.sleep(2000);
        driver.findElement(By.id("customer_lastname")).sendKeys("E Ferdous");
        //Thread.sleep(2000);
        driver.findElement(By.id("passwd")).sendKeys("12345D@d");
        //Thread.sleep(2000);
        driver.findElement(By.id("days")).sendKeys("1");
        //Thread.sleep(2000);
        driver.findElement(By.id("months")).sendKeys("April");
        //Thread.sleep(2000);
        driver.findElement(By.id("years")).sendKeys("1997");
        Thread.sleep(2000);
        driver.findElement(By.id("uniform-newsletter")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("optin")).click();
        Thread.sleep(2000);
        
        driver.findElement(By.id("firstname")).sendKeys("Refat");
        //Thread.sleep(2000);
        driver.findElement(By.id("lastname")).sendKeys("E Ferdous");
        //Thread.sleep(2000);
        driver.findElement(By.id("company")).sendKeys("Brain Station23");
        //Thread.sleep(2000);
        driver.findElement(By.id("address1")).sendKeys("386 Park Ave S Ste 600, USA");
        //Thread.sleep(2000);
        driver.findElement(By.id("address2")).sendKeys("386 Park Ave S Ste 600, USA");
        //Thread.sleep(2000);
        driver.findElement(By.id("city")).sendKeys("Alabama");
        //Thread.sleep(2000);
        driver.findElement(By.id("id_state")).sendKeys("Alabama");
        //Thread.sleep(2000);
        driver.findElement(By.id("postcode")).sendKeys("35242");
        //Thread.sleep(2000);
        driver.findElement(By.id("id_country")).sendKeys("United States");
        //Thread.sleep(2000);
        driver.findElement(By.id("other")).sendKeys("+1 256 34563");
        //Thread.sleep(2000);
        driver.findElement(By.id("phone")).sendKeys("+1 256 34563");
        //Thread.sleep(2000);
        driver.findElement(By.id("phone_mobile")).sendKeys("+1 256 34563");
        //Thread.sleep(2000);
        driver.findElement(By.id("alias")).sendKeys(": 2140 S Dixie Hwy Ste 301 Miami, Florida");
        Thread.sleep(2000);
        
        driver.findElement(By.className("submitAccount")).click();
        Thread.sleep(2000);
        
        /////////************logout from 1st account***************
        
        driver.findElement(By.linkText("Sign out")).click();
        Thread.sleep(2000);
        
        //////***********Account Creation -2 ********************
        
        driver.findElement(By.className("login")).click();
        driver.findElement(By.id("email_create")).sendKeys("dishan0917@gmail.com");
        //Thread.sleep(2000);
        driver.findElement(By.name("SubmitCreate")).click();
        Thread.sleep(2000);
        
        driver.findElement(By.id("id_gender2")).click();
        //Thread.sleep(2000);
        driver.findElement(By.id("customer_firstname")).sendKeys("Dishan");
        //Thread.sleep(2000);
        driver.findElement(By.id("customer_lastname")).sendKeys("Islam");
        //Thread.sleep(2000);
        driver.findElement(By.id("passwd")).sendKeys("54321d@D");
        //Thread.sleep(2000);
        driver.findElement(By.id("days")).sendKeys("2");
        //Thread.sleep(2000);
        driver.findElement(By.id("months")).sendKeys("May");
        //Thread.sleep(2000);
        driver.findElement(By.id("years")).sendKeys("1997");
        Thread.sleep(2000);
        driver.findElement(By.id("uniform-newsletter")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("optin")).click();
        Thread.sleep(2000);
        
        driver.findElement(By.id("firstname")).sendKeys("Dishan");
        //Thread.sleep(2000);
        driver.findElement(By.id("lastname")).sendKeys("Islam");
        //Thread.sleep(2000);
        driver.findElement(By.id("company")).sendKeys("Brain Station23");
        //Thread.sleep(2000);
        driver.findElement(By.id("address1")).sendKeys("386 Park Ave S Ste 600, USA");
        //Thread.sleep(2000);
        driver.findElement(By.id("address2")).sendKeys("386 Park Ave S Ste 600, USA");
        //Thread.sleep(2000);
        driver.findElement(By.id("city")).sendKeys("Arizona");
        //Thread.sleep(2000);
        driver.findElement(By.id("id_state")).sendKeys("Arizona");
        //Thread.sleep(2000);
        driver.findElement(By.id("postcode")).sendKeys("85003");
        //Thread.sleep(2000);
        driver.findElement(By.id("id_country")).sendKeys("United States");
        //Thread.sleep(2000);
        driver.findElement(By.id("other")).sendKeys("+1 855 2785080");
        //Thread.sleep(2000);
        driver.findElement(By.id("phone")).sendKeys("+1 855 2785080");
        //Thread.sleep(2000);
        driver.findElement(By.id("phone_mobile")).sendKeys("+1 855 2785080");
        //Thread.sleep(2000);
        driver.findElement(By.id("alias")).sendKeys(": Tempe, Arizona 85281");
        Thread.sleep(2000);
        
        driver.findElement(By.id("submitAccount")).click();
        Thread.sleep(2000);
        
        //////***********account login -2*********************
        driver.findElement(By.className("login")).click();
        driver.findElement(By.id("email")).sendKeys("dishan0917@gmail.com");
        driver.findElement(By.id("passwd")).sendKeys("54321d@D");
        driver.findElement(By.id("SubmitLogin")).click();
        
        ///////***casual dress section***********************************
        
        driver.findElement(By.linkText("DRESSES")).click();
        driver.findElement(By.linkText("CASUAL DRESSES")).click(); 
        driver.findElement(By.xpath("//body/div[@id='page']/div[2]/div[1]/div[3]/div[2]/ul[1]/li[1]/div[1]/div[2]/h5[1]/a[1]")).click();
        driver.findElement(By.xpath("//span[contains(text(),'Add to cart')]")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("//div[@id='layer_cart']"));
        driver.findElement(By.xpath("//body[1]/div[1]/div[1]/header[1]/div[3]/div[1]/div[1]/div[4]/div[1]/div[2]/div[4]/span[1]/span[1]")).click();
      
        ///////***************** T-Shirt Section*************************
        
        driver.findElement(By.linkText("T-SHIRTS")).click();
        driver.findElement(By.name("layered_id_attribute_group_14")).click();
        driver.findElement(By.xpath("//a[contains(text(),'Faded Short Sleeve T-shirts')]")).click();
        driver.findElement(By.xpath("//span[contains(text(),'Add to cart')]")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("//body[1]/div[1]/div[1]/header[1]/div[3]/div[1]/div[1]/div[4]/div[1]/div[2]/div[4]/a[1]/span[1]")).click();
        driver.findElement(By.xpath("//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/p[2]/a[1]/span[1]")).click();
        driver.findElement(By.xpath("//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/form[1]/p[1]/button[1]/span[1]")).click();
        driver.findElement(By.id("cgv")).click();
        driver.findElement(By.xpath("//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/form[1]/p[1]/button[1]/span[1]")).click();
        driver.findElement(By.xpath("//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/div[1]/div[3]/div[2]/div[1]/p[1]/a[1]")).click();
        driver.findElement(By.xpath("//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/form[1]/p[1]/button[1]/span[1]")).click();     
        Thread.sleep(2000);
      
        /////////////***********logout from 2nd account****************
        
        driver.findElement(By.linkText("Sign out")).click();
        Thread.sleep(2000);
        
        //////***********account login -1*********************
        driver.findElement(By.linkText("Sign in")).click();
        driver.findElement(By.id("email")).sendKeys("refatcseaust@gmail.com");
        driver.findElement(By.id("passwd")).sendKeys("12345D@d");
        driver.findElement(By.id("SubmitLogin")).click();
        
        ///////***casual dress section***********************************
        
        driver.findElement(By.linkText("DRESSES")).click();
        driver.findElement(By.linkText("CASUAL DRESSES")).click(); 
        driver.findElement(By.xpath("//body/div[@id='page']/div[2]/div[1]/div[3]/div[2]/ul[1]/li[1]/div[1]/div[2]/h5[1]/a[1]")).click();
        driver.findElement(By.xpath("//span[contains(text(),'Add to cart')]")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("//div[@id='layer_cart']"));
        driver.findElement(By.xpath("//body[1]/div[1]/div[1]/header[1]/div[3]/div[1]/div[1]/div[4]/div[1]/div[2]/div[4]/span[1]/span[1]")).click();
      
        ///////***************** T-Shirt Section*************************
        
        driver.findElement(By.linkText("T-SHIRTS")).click();
        driver.findElement(By.name("layered_id_attribute_group_14")).click();
        driver.findElement(By.xpath("//a[contains(text(),'Faded Short Sleeve T-shirts')]")).click();
        driver.findElement(By.xpath("//span[contains(text(),'Add to cart')]")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("//body[1]/div[1]/div[1]/header[1]/div[3]/div[1]/div[1]/div[4]/div[1]/div[2]/div[4]/a[1]/span[1]")).click();
        driver.findElement(By.xpath("//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/p[2]/a[1]/span[1]")).click();
        driver.findElement(By.xpath("//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/form[1]/p[1]/button[1]/span[1]")).click();
        driver.findElement(By.id("cgv")).click();
        driver.findElement(By.xpath("//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/form[1]/p[1]/button[1]/span[1]")).click();
        driver.findElement(By.xpath("//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/div[1]/div[3]/div[2]/div[1]/p[1]/a[1]")).click();
        driver.findElement(By.xpath("//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/form[1]/p[1]/button[1]/span[1]")).click();     
        
        Thread.sleep(20000);
        driver.close();
          
	}

}

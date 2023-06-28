package Selenium;

import java.time.Duration;
import java.util.*;

import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.*;




public class Selenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user2\\Documents\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		driver.get("https://porter.in/?landing_page=nw&utm_content=nw");
		driver.findElement(By.cssSelector("div.Home_home-wrapper__GZo2V div.ServicesCategory_service-category-container__NwtCG:nth-child(2) div.ServicesCategory_service-category-wrapper__ZT5yc div.CitySelector_city-selector-wrapper__wQGHB > div.CitySelector_city-selector-button__Wbmkb")).click();
		driver.findElement(By.xpath("//div[@class='ReactModalPortal']//div[6]")).click();
		driver.findElement(By.className("CategoryCard_category-card__8nPpK")).click();
		
		//driver.findElement(By.xpath("//input[@id='custom-autocomplete-pickup-address-0.7350298829657056']")).sendKeys("Hyderabad, Telangana, India");
				//to
		//driver.findElement(By.xpath("//input[@id='custom-autocomplete-pickup-address-0.42642867055499667']")).sendKeys("N");
				//phone no
		driver.findElement(By.xpath("//input[@placeholder='Enter contact details']")).sendKeys("8826766031");
				//name
		driver.findElement(By.xpath("//input[@placeholder='Enter your name']")).sendKeys("Ayush Srivastava");
		driver.findElement(By.xpath("(//div[normalize-space()='Botanical Garden Metro, Dadri Main Road, Arun Vihar, Sector 38, Noida, Uttar Pradesh, India'])[1]")).click();
		//driver.findElement(By.xpath("//button[@class='FormInput_submit__icI8k FormInput_submit-enabled__qOriP VehicleFareEstimateForm_submit-container__nsP72']")).click();
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
	      System.out.println("The number of links is " + links.size());
	      // do for image links as well
		//driver.findElement(By.cssSelector("div.Home_home-wrapper__GZo2V div.ServicesCateg ory_service-category-container__NwtCG:nth-child(2) div.ServicesCategory_service-category-wrapper__ZT5yc div.ServicesCategory_service-cards-container__ibfQ3 div.ServicesCategory_service-cards-wrapper__HrXD0 > div.CategoryCard_category-card__8nPpK:nth-child(1)")).click();
		//driver.findElement(By.cssSelector("div.TwoWheelers_page-container__yiQaI div.TwoWheelersDetails_details-container__Vcp1M:nth-child(4) div.TwoWheelersDetails_details-desktop__J_K1Y div.TwoWheelersDetailsCard_details-card-container__VtJum div.TwoWheelersDetailsCard_details-card-content__yo3el div.TwoWheelersDetailsCard_details-card-know-more-container__YZsbl > p.TwoWheelersDetailsCard_details-card-know-more__OBUge")).click();
		
		//driver.quit();
		// System.setProperty("webdriver.gecko.driver","/Users/rahulshetty/Documents/geckodriver");
		// WebDriver driver = new FirefoxDriver();
		// System.setProperty("webdriver.edge.driver","/User/rahulshetty/Documents/msedgedriver");
		// WebDriver driver
		
		
		//driver.get("https://groww.in");
		//System.out.println(driver.getTitle());
		//System.out.println(driver.getCurrentUrl());
		//driver.close();
		//driver.quit();
		
	}
}

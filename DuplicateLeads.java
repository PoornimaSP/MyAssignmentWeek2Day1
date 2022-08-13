package week2.day1assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLeads {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();		
	    ChromeDriver driver=new ChromeDriver();
	
     	//Launch URL
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		
		//Enter value to username text box using ID locator
		WebElement userName = driver.findElement(By.id("username"));
		userName.sendKeys("Demosalesmanager");
		
		//Enter value to password text box using ID locator
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("crmsfa");
		
		//Click on Login Button using Class Locator
		WebElement loginButton = driver.findElement(By.className("decorativeSubmit"));
		loginButton.click();
		
		//Click on CRM/SFA Link
		WebElement clickLink = driver.findElement(By.linkText("CRM/SFA"));
		clickLink.click();
		
		//Click on Leads Button
		WebElement clickLeads = driver.findElement(By.linkText("Leads"));
		clickLeads.click();
		
		//Click on Create Lead
		WebElement createLeads = driver.findElement(By.linkText("Create Lead"));
		createLeads.click();
		
		//Enter CompnayName field value using id locator
		WebElement cmpName = driver.findElement(By.id("createLeadForm_companyName"));
		cmpName.sendKeys("ABC Company");
		
		//Enter FirstName field value using id locator
		WebElement firstName = driver.findElement(By.id("createLeadForm_firstName"));
		firstName.sendKeys("John");
		
		//Enter LastName field value using id locator
		WebElement lastName = driver.findElement(By.id("createLeadForm_lastName"));
		lastName.sendKeys("Smith");		
		
		//Enter FirstName(local) field value using id locator
		WebElement firstNameLoc = driver.findElement(By.id("createLeadForm_firstNameLocal"));
		firstNameLoc.sendKeys("Jane");	
		
		//Enter Department field value using desired locator
		WebElement dpt = driver.findElement(By.id("createLeadForm_departmentName"));
		dpt.sendKeys("Research");	
		
		//Enter Description field value using desired locator
		WebElement desc = driver.findElement(By.id("createLeadForm_description"));
		desc.sendKeys("The purpose of the field is to capture description of the new Leads that has been created");	
		
		//Enter email in Email address field using desired locator
		WebElement email = driver.findElement(By.id("createLeadForm_primaryEmail"));
		email.sendKeys("test@gmail.com");	
		
		//Select State/Province as NewYork using Visible text
		WebElement state = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select stpr=new Select(state);
		stpr.selectByVisibleText("New York");
		
		//Click on CreateButton
		WebElement createLeadsButton = driver.findElement(By.className("smallSubmit"));
		createLeadsButton.click();
		
		//Get the Title of resulting Page using driver.getTitle()
		System.out.println("The title displayed in browser post Lead creation action is "+driver.getTitle());
		
		
		
		//Click on Duplicate button
		WebElement dupButton = driver.findElement(By.className("subMenuButton"));
		dupButton.click();
		
		//Clear the CompanyName field using clear() and Enter new CompanyName
		WebElement dupcmptName = driver.findElement(By.id("createLeadForm_companyName"));
		dupcmptName.clear();
		dupcmptName.sendKeys("XYZ Company");
		
		//Clear the FirstName field using clear() and Enter new FirstName
		WebElement dupfirstName = driver.findElement(By.id("createLeadForm_firstName"));
		dupfirstName.clear();
		dupfirstName.sendKeys("Meagel");
		
		//Click on Create Lead Button
		WebElement dupCreateLeadsButton = driver.findElement(By.name("submitButton"));
		dupCreateLeadsButton.click();
		
		//Get the Title of resulting Page using driver.getTitle()
		System.out.println("The title displayed in browser post correcting Lead creation action is "+driver.getTitle());
		
		driver.close();
	}
	

}

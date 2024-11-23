package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class thirdPage {
	
	WebDriver driver;
	
	public thirdPage(WebDriver driver) {
		this.driver = driver;
	}
	
   
    By titleJob = By.xpath("//div[@id='JobAdContent']/div/div/div/div/div/div/div/article/div/div/div/div/h1");
    By salary = By.xpath("//div[@id='JobAdContent']/div/div/div/div/div/div/div/article/div/div/div/div[2]/div/ul/li[5]/span/span[2]");
    By city = By.xpath("//div[@id='JobAdContent']/div/div/div/div/div/div/div/article/div/div[2]/div/div/button");
    By apply = By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Apply'])[1]/following::*[name()='svg'][1]");
    By email = By.id("stepstone-form-element-19-label");
    
    
    //assertEquals Title in the job
    public void assertEqualsTitleJob(){
        String getheadertext=driver.findElement(titleJob).getText();
        Assert.assertEquals("Senior QA Automation Engineer - Hybrid", getheadertext);
}
    //assertEquals Title in the salary
    public void assertEqualsSalary(){
        String getheadertext=driver.findElement(salary).getText();
        Assert.assertEquals("€60,000 - €70,000 per annum", getheadertext);
}
    //assertEquals Title in the city
    public void assertEqualscity(){
        String getheadertext=driver.findElement(city).getText();
        Assert.assertEquals("County Dublin", getheadertext);
}
    //assertEquals Title in the apply
      public void clickApply(){
          driver.findElement(apply).click();
  }
    //assertEquals in the email
    public void assertEqualsapply(){
        String getheadertext=driver.findElement(email).getText();
        Assert.assertEquals("Email address", getheadertext);
}
    

  //This POM method will be exposed in test case to Description
    public void ThirdtoDescription()
    {
        this.assertEqualsTitleJob();
        this.assertEqualsSalary();
        this.assertEqualscity();
        this.clickApply();
        this.assertEqualsapply();
    
    }

}

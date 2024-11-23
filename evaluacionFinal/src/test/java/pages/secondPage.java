package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class secondPage {

	WebDriver driver;
	
	public secondPage(WebDriver driver) {
		this.driver = driver;
	}
	
	By Relevancia = By.cssSelector("span.res-1pv1io1 > svg > path");
	By SalatyHigh = By.cssSelector("a#salary_desc  .res-1jrodeh");
	By tituloPlaza = By.xpath("//*[contains(text(), 'Senior QA Automation Engineer - Hybrid')]");
 
	public WebElement getRelevancia() {
		return driver.findElement(Relevancia);
	}
	public WebElement SalatyHigh() {
		return driver.findElement(SalatyHigh);
	}
	public WebElement TituloPlaza() {
		return driver.findElement(tituloPlaza);
	}

 
	
	public void assertEqualsTitleJob2() {
		//getRelevancia().click();
		//SalatyHigh().click();
		String subString = "Senior QA Automation Engineer - Hybrid";
        String getheadertext = driver.findElement(tituloPlaza).getText();
        Assert.assertEquals(getheadertext, subString);
        driver.findElement(tituloPlaza).click();
    }
	
	
	
}

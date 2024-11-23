package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class principalPage {

	WebDriver driver;
	
	public principalPage(WebDriver driver) {
		this.driver = driver;
	}
	
	By searchJob = By.cssSelector("#stepstone-autocomplete-150");
	By searchCountry = By.cssSelector("#stepstone-autocomplete-155");
	By btnSearch = By.xpath("//span[contains(text(),'Search')]");
	
	
	public WebElement getsearchJob() {
		driver.findElement(searchJob).clear();
		return driver.findElement(searchJob);
	}
	
	public WebElement getsearchCountry() {
		driver.findElement(searchCountry).clear();
		return driver.findElement(searchCountry);
	}
	
	public WebElement getbtnSearch() {
		return driver.findElement(btnSearch);
	}
	
	public WebElement checkBoxFiltro() {
		return driver.findElement(By.xpath("//label[@id='stepstone-form-element-229-label']"));	
	}	
	
	public void assertResult() {
		WebElement resultado = driver.findElement(By.xpath("//body/div[4]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/h1[1]"));
		Assert.assertTrue(resultado.getText().contains("21 Permanent QA Automation jobs in County Dublin"), "Resultado de busqueda");
	}

}

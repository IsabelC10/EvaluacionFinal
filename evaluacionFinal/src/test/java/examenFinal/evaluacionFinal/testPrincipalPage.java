package examenFinal.evaluacionFinal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

import pages.principalPage;
import pages.secondPage;
import pages.thirdPage;

public class testPrincipalPage {

	WebDriver driver;
	
	@Test
	public void ValidarEvaluacion() throws InterruptedException {
		// Llamar pagina de IrishJob
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\JC52261\\Desktop\\JOB BC\\Información de Aprendizaje\\Programa Futuros Lideres - QA Automatizado\\Dependencias\\chromedriver-win64\\chromedriver.exe");// Llamar al ChromeDriver

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.irishjobs.ie/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("ccmgt_explicit_accept")).click();
		
		Thread.sleep(1000);
		//Llama clase de POM		
		principalPage pagina1 = new principalPage(driver);
		secondPage pagina2 = new secondPage(driver);
		thirdPage pagina3 = new thirdPage(driver);
		
		//Pagina 1
		pagina1.getsearchJob().sendKeys("QA automation");
		pagina1.getsearchCountry().sendKeys("Dublin");
		pagina1.checkBoxFiltro().click();
		pagina1.getbtnSearch().click();
		
		Thread.sleep(3000);
		
		//Pagina 2
		pagina2.assertEqualsTitleJob2();
		
		//Pagina 3
		pagina3.assertEqualsTitleJob();
		pagina3.assertEqualsSalary();
		pagina3.clickApply();
		pagina3.assertEqualsapply();

	}

}

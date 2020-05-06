package test.functional;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.List;
import org.openqa.selenium.WebDriver;


import static org.junit.Assert.*;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;



public class FunctionalTest {

	private WebDriver driver;

    @Before
    public void setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver","/Library/Java/JUNIT/chromedriver");
		driver = new ChromeDriver();
	    	// Seems no more working in last Chrome versions
		// driver.manage().window().maximize();
  		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
     }

    // Test de la Story #1-homepage (https://trello.com/c/WKTneu9o/1-homepage)
	@Test
    public void testHomepage() throws Exception {
        driver.get("https://www.tesla.com/fr_FR/");
		assertEquals(driver.getTitle(), "Voitures électriques, panneaux solaires et stockage d'énergie propre | Tesla");
        Thread.sleep(5000);
        assertEquals(driver.findElement(By.cssSelector("#item1-heading > h1")).getText(), "Model 3");
        assertEquals(driver.findElement(By.cssSelector("#item0-heading > h1")).getText(), "Model S");
        assertEquals(driver.findElement(By.cssSelector("#tesla-hero-showcase-storage > div > div.hero-regions > div > div.hero-region--center-top > header > h1 > span.header-lower")).getText(), "Découvrir Tesla");
        assertEquals(driver.findElement(By.cssSelector("#tesla-hero-showcase-storage--2 > div > div.hero-regions > div > div.hero-region--center-top > header > h1 > span.header-lower")).getText(), "Une alimentation pour tous vos objets");
        assertEquals(driver.findElement(By.cssSelector("#tesla-hero-showcase-storage--3 > div > div.hero-regions > div > div.hero-region--center-top > header > h1 > span.header-lower")).getText(), "Accessoires");
        //assertEquals(driver.findElements(By.cssSelector("h1.top-caption")).get(0).getText(), "Model S");
        //WebElement firstName = driver.findElement(By.cssSelector('meta[name="description"]'));
        //assertEquals(firstName, "Tesla accélère la transition mondiale vers un schéma énergétique durable en proposant des véhicules électriques, des panneaux solaires et des solutions intégrées d'énergie renouvelable pour les particuliers et les entreprises.");
        //assertEquals(driver.findElements(By.cssSelector("meta[name[content='Tesla accélère la transition mondiale vers un schéma énergétique durable en proposant des véhicules électriques, des panneaux solaires et des solutions intégrées d'énergie renouvelable pour les particuliers et les entreprises.']]")));
		// TODO
		// To Be Completed By Coders From Coding Factory
        //assertEquals(driver.findElements(By.cssSelector("meta[name='description']")), "toto"

        // Get search box element from webElement 'q' using Find Element
        //String name[] = {"Model 3", "Découvrir Tesla", "Une alimentation pour tous vos objets", "Accessoires", "Model Y"};
        //for (i=0; i<name.length; i++) {
            //assertEquals(driver.findElement(By.name("h1")).sendKeys(name[i]));
        //}
        //assertEquals(driver.findElement(By.cssSelector("h1.top-caption")).get(0).getText(), "Model 3");
        //driver.findElement(By.cssSelector("h1[class='header--white'] span[class='header-lower']));
            
        //assertEquals(driver.findElement(By.cssSelector("h1.top-caption:nth(0)")).getText(), "Model 3");
        //assertEquals(driver.findElement(By.class("#top-caption")), "Model 3");
        //driver.findElement(By.name("h1")).sendKeys(name[0]);

        //assertEquals(driver.findElement(By.cssSelector("meta[name='description']")).getAttribute("content"), "Tesla accélère la transition mondiale vers un schéma énergétique durable en proposant des véhicules électriques, des panneaux solaires et des solutions intégrées d'énergie renouvelable pour les particuliers et les entreprises.");
        //assertEquals(driver.findElement(By.cssSelector("meta[name='description']")).getAttribute("content").getText("Tesla accélère la transition mondiale vers un schéma énergétique durable en proposant des véhicules électriques, des panneaux solaires et des solutions intégrées d'énergie renouvelable pour les particuliers et les entreprises."));
       // assertEquals(driver.findElement(By.cssSelector("h1")), "model 3", "découvrir Tesla", "Une alimentation pour tous vos objets", "Accessoires", "Model Y");
        //assertEquals(driver.findElement(By.cssSelector("span[h1='header-lower']").getAttribute "model 3", "découvrir Tesla", "Une alimentation pour tous vos objets", "Accessoires", "Model Y"));

        

    }

    // Test de la Story n ...
    // TODO
    // To Be Completed By Coders From Coding Factory

    @After
    public void tearDown() throws Exception {
        driver.quit();
    }

}

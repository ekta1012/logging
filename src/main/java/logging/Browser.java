package logging;


//import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser {

    public static void main(String args[])
    {
       System.setProperty("webdriver.firefox.marionette","C:\\geckodriver.exe");
 /*
 BasicConfigurator.configure(); it print logs onto the console by using Pattern Layout
  */

        DOMConfigurator.configure("log4j.xml");
/*
   DOm Configurator :Use this class to initialize the log4j environment using a DOM tree.

 */
        Logger log1= LogManager.getLogger("Logger1");
        log1.info("Firefox initilization");
        WebDriver driver= new FirefoxDriver();
        String baseUrl ="http://franciscanecare.co.in/marksmanager";
        driver.get(baseUrl);
        log1.debug("passing parameters");
        driver.findElement(By.id("Txtusrid")).sendKeys("admin");
        driver.findElement(By.id("txtpass")).sendKeys("admin@123");
        log1.warn("closing the session");
        driver.quit();
    }
}

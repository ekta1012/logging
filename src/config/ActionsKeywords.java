package config;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ActionsKeywords
{

      public static  WebDriver driver;

        public static void initiate_Browser()
        {
            System.setProperty("webdriver.firefox.marionette","C:\\geckodriver.exe");
             driver= new FirefoxDriver();


        }

        public static void open_URL()
        {
            String baseUrl ="http://franciscanecare.co.in/marksmanager";
            driver.get(baseUrl);

        }

        public static void input_username()
        {
            driver.findElement(By.id("Txtusrid")).sendKeys("admin");
        }


        public static void input_pwd()
        {
            driver.findElement(By.id("txtpass")).sendKeys("admin@123");
        }

        public static void  click_Button() {

            driver.findElement(By.id("Button1")).click();
        }
        public static void close()
        {
            driver.quit();
        }


}


// Создайте, пожалуйста, новый тестовый класс, где вы будете открывать страничку сайта

package com.ait.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class Homework01 {

  WebDriver driver;

  //before - setUp
  @BeforeMethod
  public void setUp() {
    driver = new ChromeDriver();
    driver.get("https://demowebshop.tricentis.com/");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
  }

  // tests
  @Test
  public void findElementsByCssSelector() {
    System.out.println("Demo Web Shop Site is opened");


    WebElement element1 = driver.findElement(By.cssSelector("a.ico-login"));


    WebElement element2 = driver.findElement(By.cssSelector(".cart-label"));


    WebElement element3 = driver.findElement(By.cssSelector("a[href='/books']"));


    WebElement element4 = driver.findElement(By.cssSelector("a[href='/jewelry']"));


    WebElement element5 = driver.findElement(By.cssSelector("#newsletter-email"));


    WebElement element6 = driver.findElement(By.cssSelector("input[value='Subscribe']"));


    WebElement element7 = driver.findElement(By.cssSelector("#pollanswers-1"));


    WebElement element8 = driver.findElement(By.cssSelector("#vote-poll-1"));


    WebElement element9 = driver.findElement(By.cssSelector("a[href='/tricentis']"));


    WebElement element10 = driver.findElement(By.cssSelector("a[href='/contactus']"));

    System.out.println(element1.getText());
    System.out.println(element2.getText());
    System.out.println(element3.getText());
    System.out.println(element4.getText());
    System.out.println(element5.getText());
    System.out.println(element6.getText());
    System.out.println(element7.getText());
    System.out.println(element8.getText());
    System.out.println(element9.getText());
    System.out.println(element10.getText());


  }

  //after - tearDown (close Browser)
  @AfterMethod(enabled = true)
  public void tearDown() {
    driver.quit();  // close browser with all open tabs
  }
}

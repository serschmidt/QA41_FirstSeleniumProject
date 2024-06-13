//  В домашнем тестовом классе создайте, пожалуйста, тестовый метод,
//  где вы будете искать те же 10 элементов на странице, используя стратегию By.xpath

package com.ait.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class Homework03 {


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

    WebElement element1 = driver.findElement(By.xpath("//a[@class='ico-login']"));

    WebElement element2 = driver.findElement(By.xpath("//*[@class='cart-label']"));

    WebElement element3 = driver.findElement(By.xpath("//a[@href='/books']"));

    WebElement element4 = driver.findElement(By.xpath("//a[@href='/jewelry']"));

    WebElement element5 = driver.findElement(By.xpath("//*[@id='newsletter-email']"));

    WebElement element6 = driver.findElement(By.xpath("//input[@value='Subscribe']"));

    WebElement element7 = driver.findElement(By.xpath("//*[@id='pollanswers-1']"));

    WebElement element8 = driver.findElement(By.xpath("//*[@id='vote-poll-1']"));

    WebElement element9 = driver.findElement(By.xpath("//a[@href='/tricentis']"));

    WebElement element10 = driver.findElement(By.xpath("//a[@href='/contactus']"));

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

  @AfterMethod(enabled = true)
  public void tearDown() {
    driver.quit();
  }
}


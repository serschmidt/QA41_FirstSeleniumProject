// Создайте, пожалуйста, новый тестовый класс, где вы будете открывать страничку сайта

package com.ait.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Homework01 {

  WebDriver driver;

  //before - setUp
  @BeforeMethod
  public void setUp() {
    driver = new ChromeDriver();
    driver.get("https://demowebshop.tricentis.com/");
  }

  // tests
  @Test
  public void openGoogle() {
    System.out.println("Demo Web Shop Site is opened");
  }

  //after - tearDown (close Browser)
  @AfterMethod(enabled = true)
  public void tearDown() {
    driver.quit();  // close browser with all open tabs
  }
}

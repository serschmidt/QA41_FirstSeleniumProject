package com.ait.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import javax.swing.*;
import java.time.Duration;
import java.util.List;

public class FindElementsTests {

  WebDriver driver;

  @BeforeMethod
  public void setUp() {
    driver = new ChromeDriver();
    driver.get("https://ilcarro.web.app");
    // we want to maximize browser to full window size
    driver.manage().window().maximize();
    //  wait for loading of all elements, before start the tests
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
  }

  @Test
  public void findElementsByTagName() {

    //find Element by tag
    WebElement element = driver.findElement(By.tagName("h1"));
    System.out.println(element.getText());

    WebElement element1 = driver.findElement(By.tagName("a"));
    System.out.println(element1.getText());

    //  find elements by tag:
    List<WebElement> elements = driver.findElements(By.tagName("a"));
    System.out.println(elements.size());

  }

  @Test
  public void findElementById(){
    //  by id;
    driver.findElement(By.id("city"));

    //  by class
    WebElement phone = driver.findElement(By.className("telephone"));
    System.out.println(phone.getText());

    //  by link text
    WebElement linkText = driver.findElement(By.linkText("Let the car work"));
    System.out.println(linkText.getText());

    // partial link Text
    WebElement partialLinkText = driver.findElement(By.partialLinkText("Let the car "));
    System.out.println(partialLinkText.getText());

  }

  @Test
  public void findElementsByCssSelector() {
    // tag name -> tag
//    driver.findElement(By.tagName("h1"));
    driver.findElement(By.cssSelector("h1"));

    //  id -> #id
    driver.findElement(By.id("city"));
    WebElement city = driver.findElement(By.cssSelector("#city"));
    System.out.println(city.getText());

    //  class -> .class
//    driver.findElement(By.className("telephone"));
    WebElement telephone = driver.findElement(By.cssSelector(".telephone"));
    System.out.println(telephone.getText());

    //[attr="value"]
    WebElement cssSelector = driver.findElement(By.cssSelector("[ng-reflect-name='city']"));
    System.out.println(cssSelector.getAttribute("type"));

    // contains -> *
    WebElement elementContains = driver.findElement(By.cssSelector("[ng-reflect-router-link*='car']"));
    System.out.println(elementContains.getText());

    // start -> ^
    WebElement elementStart = driver.findElement(By.cssSelector("[ng-reflect-router-link^='let']"));
    System.out.println(elementStart.getText());

    //end -> $
    WebElement elementEnds = driver.findElement(By.cssSelector("[ng-reflect-router-link$='work']"));
    System.out.println(elementEnds.getText());

  }

  @Test
  public void findElementByXpath(){
    //  //*[@attr='value']

    // tag name -> //tag
    // driver.findElement(By.cssSelector("h1"));
    driver.findElement(By.xpath("//h1"));

    //id -> //*[@id='value']
//    driver.findElement(By.cssSelector("#city"));
    driver.findElement(By.xpath("//*[@id='city']"));

    //  class -> //*[@class='value']
//    driver.findElement(By.className("telephone"));
    //driver.findElement(By.cssSelector(".telephone"));
    driver.findElement(By.xpath("//*[@class='telephone']"));

    //h2[text()='Type your data and hit Yalla!']
    //text = //tag[text()='Text']
    driver.findElement(By.xpath("//h2[text()='Type your data and hit Yalla!']"));
    driver.findElement(By.xpath("//h2[.='Type your data and hit Yalla!']"));

    //  contains -> //tag[contains(.,'Text')]

    driver.findElement(By.xpath("//h2[contains(.,'Yalla!')]"));

    // contains value -> //tag[contains(@attr,'partialValue')]
    driver.findElement(By.xpath("//input[contains(@class,'target')]"));

    //start -> //tag[starts-with(@attr,'startOfValue')]
    driver.findElement(By.xpath("//input[starts-with(@class,'ng-untouched')]"));
  }

  @AfterMethod(enabled = true)
  public void tearDown() {
    driver.quit();
  }

}

// kill a process in cmd
//taskkill /F /IM chromedriver.exe /T
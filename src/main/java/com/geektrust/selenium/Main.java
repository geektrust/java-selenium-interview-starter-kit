package com.geektrust.selenium;


import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;


@Component
public class Main {
  /***
   * PLEASE DO NOT CHANGE ANY OF THIS CODE BELOW.
   * THIS CODE INJECTS A REMOTE SELENIUM WEB DRIVER FOR YOU TO USE FOR THE TEST
   */
  @Autowired
  private RemoteSeleniumWebDriverAspect aspect;

  @RemoteSeleniumWebDriver(
    testName = "${SELENIUM_TEST_NAME:defaultTest}",
    userEmail = "${USER_EMAIL:defaultEmail}"
  )
  public WebDriver webDriver() {
    return aspect.getRemoteWebDriver();
  }

  public static void main(String[] args)  {
    ApplicationContext context = new AnnotationConfigApplicationContext(
      RemoteWebDriverConfig.class
    );
    Main app = context.getBean(
      Main.class
    );
    WebDriver driver = app.webDriver();

    /**
     * START YOUR SELENIUM SCRIPTING CODE AFTER THIS
     */

    if (driver != null) {
      driver.quit();
    }
  }
}

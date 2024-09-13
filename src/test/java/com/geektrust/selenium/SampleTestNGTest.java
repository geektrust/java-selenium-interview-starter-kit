//package com.geektrust.selenium;
//
//
//import org.openqa.selenium.WebDriver;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.stereotype.Component;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.Test;
//
//@Component
//public class SampleTestNGTest {
//
//    @Autowired
//    private RemoteSeleniumWebDriverAspect aspect;
//
//    private WebDriver driver;
//
//    @RemoteSeleniumWebDriver(
//            testName = "${SELENIUM_TEST_NAME:defaultTest}",
//            userEmail = "${USER_EMAIL:defaultEmail}"
//    )
//    public WebDriver webDriver() {
//        return aspect.getRemoteWebDriver();
//    }
//
//    @BeforeMethod
//    public void setUp() {
//        ApplicationContext context = new AnnotationConfigApplicationContext(RemoteWebDriverConfig.class);
//        SampleTestNGTest app = context.getBean(SampleTestNGTest.class);
//        this.driver = app.webDriver();
//    }
//
//    @Test
//    public void testYourCode() {
//        /**
//         * USE the variable this.driver to start writing your test case
//         */
//    }
//
//    @AfterMethod
//    public void tearDown() {
//        if (driver != null) {
//            driver.quit();
//        }
//    }
//}

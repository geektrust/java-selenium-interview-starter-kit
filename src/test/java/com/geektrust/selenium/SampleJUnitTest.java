//package com.geektrust.selenium;
//
//
//import org.junit.jupiter.api.*;
//import org.openqa.selenium.WebDriver;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.stereotype.Component;
//
//@Component
//@TestInstance(TestInstance.Lifecycle.PER_CLASS)
//@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
//public class SampleJUnitTest {
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
//
//    public WebDriver webDriver() {
//        return this.aspect.getRemoteWebDriver();
//    }
//
//    @BeforeEach
//    public void setUp() {
//        ApplicationContext context = new AnnotationConfigApplicationContext(
//                RemoteWebDriverConfig.class
//        );
//        SampleJUnitTest app = context.getBean(
//                SampleJUnitTest.class
//        );
//        this.driver = app.webDriver();
//    }
//
//    @Test
//    public void testYourCode() {
//        /**
//         * USE the variable this.driver to start writing your test case
//         */
//
//    }
//
//    @AfterEach
//    public void tearDown() {
//        if (driver != null) {
//            driver.quit();
//        }
//    }
//}

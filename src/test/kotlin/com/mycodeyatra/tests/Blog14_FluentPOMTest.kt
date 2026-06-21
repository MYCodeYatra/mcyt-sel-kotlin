package com.mycodeyatra.tests

import com.mycodeyatra.pages.Blog14_FluentLoginPage
import io.kotest.core.spec.style.StringSpec
import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.chrome.ChromeOptions
import java.time.Duration

class Blog14_FluentPOMTest : StringSpec({
    lateinit var driver: WebDriver
    lateinit var loginPage: Blog14_FluentLoginPage

    beforeTest {
        val options = ChromeOptions().apply {
            addArguments("--headless=new")
            addArguments("--disable-gpu")
            addArguments("--window-size=1920,1080")
        }
        driver = ChromeDriver(options)
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5))
        driver.manage().window().maximize()
        
        loginPage = Blog14_FluentLoginPage(driver)
    }

    afterTest {
        driver.quit()
    }

    "Should login using Fluent Page Object Model" {
        println("[INFO] Testing Fluent POM")
        // driver.get("https://practice.mycodeyatra.com/#/login")
        
        // The beauty of Fluent POM: Method Chaining!
        loginPage.enterUsername("fluent_admin")
                 .enterPassword("fluent_pass123")
                 .clickLogin()
                 
        println("[SUCCESS] Fluent POM Login executed gracefully!")
    }
})

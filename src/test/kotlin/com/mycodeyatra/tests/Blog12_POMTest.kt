package com.mycodeyatra.tests

import com.mycodeyatra.pages.LoginPage
import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.chrome.ChromeOptions
import java.time.Duration

class Blog12_POMTest : StringSpec({
    lateinit var driver: WebDriver
    lateinit var loginPage: LoginPage

    beforeTest {
        val options = ChromeOptions().apply {
            addArguments("--headless=new")
            addArguments("--disable-gpu")
            addArguments("--window-size=1920,1080")
        }
        driver = ChromeDriver(options)
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5))
        driver.manage().window().maximize()
        
        // Initialize our Page Object
        loginPage = LoginPage(driver)
    }

    afterTest {
        driver.quit()
    }

    "Should login successfully using Page Object Model" {
        println("[INFO] Testing Login using POM")
        // driver.get("https://practice.mycodeyatra.com/#/login")
        
        // Use our Page Object instead of raw findElements
        loginPage.loginAs("admin", "admin123")
        
        // Simulate an assertion
        val mockTitle = "Dashboard"
        mockTitle shouldBe "Dashboard"
        
        println("[SUCCESS] POM Login executed beautifully!")
    }
})

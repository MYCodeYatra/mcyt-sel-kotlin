package com.mycodeyatra.tests

import com.mycodeyatra.pages.Blog13_LazyLoginPage
import io.kotest.core.spec.style.StringSpec
import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.chrome.ChromeOptions
import java.time.Duration

class Blog13_LazyLocatorTest : StringSpec({
    lateinit var driver: WebDriver
    lateinit var lazyPage: Blog13_LazyLoginPage

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
        // Notice that NO elements are searched for yet!
        lazyPage = Blog13_LazyLoginPage(driver)
    }

    afterTest {
        driver.quit()
    }

    "Should login using Kotlin Lazy Locators" {
        println("[INFO] Testing Lazy Evaluation POM")
        // driver.get("https://practice.mycodeyatra.com/#/login")
        
        // The elements are located exactly right now when the method accesses them!
        lazyPage.login("admin_lazy", "password123")
        
        println("[SUCCESS] Lazy POM Login executed successfully!")
    }
})

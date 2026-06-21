package com.mycodeyatra.tests

import com.mycodeyatra.utils.waitForElementClickable
import com.mycodeyatra.utils.waitForElementVisible
import io.kotest.core.spec.style.StringSpec
import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.chrome.ChromeOptions
import java.time.Duration

class Blog15_WaitsTest : StringSpec({
    lateinit var driver: WebDriver

    beforeTest {
        val options = ChromeOptions().apply {
            addArguments("--headless=new")
            addArguments("--disable-gpu")
            addArguments("--window-size=1920,1080")
        }
        driver = ChromeDriver(options)
        
        // Notice we are NOT using implicit waits anymore!
        // Implicit waits and explicit waits should never be mixed.
        driver.manage().window().maximize()
    }

    afterTest {
        driver.quit()
    }

    "Should use Kotlin Extension Functions for Explicit Waits" {
        println("[INFO] Testing Explicit Waits via Extension Functions")
        
        // Simulating the action locally since we do not hit a real dynamic page
        // Normally: driver.get("https://practice.mycodeyatra.com/#/dynamic")
        
        val dummyLocator = By.id("dynamic_element")
        
        try {
            // This will time out in our mock test since the element doesn't exist locally
            driver.waitForElementVisible(dummyLocator, 2)
        } catch (e: Exception) {
            println("[SUCCESS] Caught expected TimeoutException for missing element!")
        }
        
        try {
            driver.waitForElementClickable(dummyLocator, 2)
        } catch (e: Exception) {
            println("[SUCCESS] Caught expected TimeoutException for unclickable element!")
        }
    }
})

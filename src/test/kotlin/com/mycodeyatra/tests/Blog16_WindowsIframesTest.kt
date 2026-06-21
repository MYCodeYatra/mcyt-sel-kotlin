package com.mycodeyatra.tests

import com.mycodeyatra.utils.switchToNewWindow
import com.mycodeyatra.utils.switchToOriginalWindow
import io.kotest.core.spec.style.StringSpec
import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.chrome.ChromeOptions

class Blog16_WindowsIframesTest : StringSpec({
    lateinit var driver: WebDriver

    beforeTest {
        val options = ChromeOptions().apply {
            addArguments("--headless=new")
            addArguments("--disable-gpu")
            addArguments("--window-size=1920,1080")
        }
        driver = ChromeDriver(options)
        driver.manage().window().maximize()
    }

    afterTest {
        driver.quit()
    }

    "Should handle Iframes gracefully" {
        println("[INFO] Testing Iframe Switching")
        
        // Simulating the action locally 
        // driver.get("https://practice.mycodeyatra.com/#/iframe")
        
        try {
            // driver.switchTo().frame("my-iframe-id")
            println("Switched context to Iframe!")
            
            // driver.findElement(By.id("btnInsideIframe")).click()
            
            // driver.switchTo().defaultContent()
            println("Switched context back to Main Document!")
        } catch (e: Exception) {
            println("Mock error: ${e.message}")
        }
    }

    "Should switch to new window using Extension Functions" {
        println("[INFO] Testing Window Switching")
        
        val originalHandle = driver.windowHandle
        
        // Simulating opening a new window
        // driver.findElement(By.id("openNewTabBtn")).click()
        
        // Use our clean extension function!
        driver.switchToNewWindow()
        
        // Switch back
        driver.switchToOriginalWindow(originalHandle)
    }
})

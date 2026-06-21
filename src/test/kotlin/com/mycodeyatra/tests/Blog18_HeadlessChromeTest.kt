package com.mycodeyatra.tests

import com.mycodeyatra.utils.DriverManager
import io.kotest.core.spec.style.StringSpec
import org.openqa.selenium.WebDriver
import java.time.Duration

class Blog18_HeadlessChromeTest : StringSpec({
    lateinit var driver: WebDriver

    beforeTest {
        // Look how clean this is!
        driver = DriverManager.getHeadlessChromeDriver()
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5))
    }

    afterTest {
        driver.quit()
    }

    "Should execute smoothly in Headless CI mode" {
        println("[INFO] Testing Headless Execution")
        
        // driver.get("https://practice.mycodeyatra.com")
        
        println("Browser is running invisibly in the background!")
        println("Resolution is fixed to 1920x1080 to prevent responsive UI breaks.")
        
        // Let's print the User-Agent just to verify it's running
        val userAgent = (driver as org.openqa.selenium.JavascriptExecutor).executeScript("return navigator.userAgent;").toString()
        println("Headless User Agent: $userAgent")
        
        println("[SUCCESS] Headless execution passed without Sandbox restrictions!")
    }
})

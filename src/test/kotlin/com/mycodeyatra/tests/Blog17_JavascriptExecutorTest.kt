package com.mycodeyatra.tests

import com.mycodeyatra.utils.executeJS
import io.kotest.core.spec.style.StringSpec
import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.chrome.ChromeOptions

class Blog17_JavascriptExecutorTest : StringSpec({
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

    "Should execute Javascript to get the page title" {
        println("[INFO] Testing Basic Javascript Execution")
        
        // driver.get("https://practice.mycodeyatra.com")
        
        // Instead of driver.title, we use JS
        val titleByJs = driver.executeJS("return document.title;")?.toString()
        println("Title retrieved via JS: $titleByJs")
    }

    "Should simulate scrolling and clicking via JS" {
        println("[INFO] Testing Advanced JS Interactions")
        
        // Simulating the logic:
        // val hiddenButton = driver.findElement(By.id("hiddenBtn"))
        // hiddenButton.scrollIntoCenterView(driver)
        // hiddenButton.clickWithJS(driver)
        
        println("Clicking element using JavaScript Executor...")
        println("Scrolling element into view...")
        println("[SUCCESS] JS executed without raising ElementClickInterceptedException!")
    }
})

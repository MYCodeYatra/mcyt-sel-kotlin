package com.mycodeyatra.utils

import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.chrome.ChromeOptions

object DriverManager {

    fun getHeadlessChromeDriver(): WebDriver {
        println("Initializing Headless Chrome Driver for CI/CD...")
        
        val options = ChromeOptions().apply {
            // Use the new headless mode which is much more stable
            addArguments("--headless=new")
            
            // Critical arguments for running in Docker/CI environments (Jenkins/GitHub Actions)
            addArguments("--no-sandbox")
            addArguments("--disable-dev-shm-usage")
            
            // Set a standard enterprise resolution
            addArguments("--window-size=1920,1080")
            
            // Bypass bot detection mechanisms (helpful for headless scraping)
            addArguments("--disable-blink-features=AutomationControlled")
            setExperimentalOption("excludeSwitches", arrayOf("enable-automation"))
        }
        
        return ChromeDriver(options)
    }
}

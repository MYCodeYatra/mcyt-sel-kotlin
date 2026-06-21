package com.mycodeyatra.pages

import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement

class Blog13_LazyLoginPage(private val driver: WebDriver) {

    // Modern Kotlin Alternative to @FindBy
    // The element is only searched for when it is FIRST accessed!
    private val usernameField: WebElement by lazy { 
        println("Locating username field lazily...")
        driver.findElement(By.id("username")) 
    }
    
    private val passwordField: WebElement by lazy { 
        driver.findElement(By.id("password")) 
    }
    
    private val loginButton: WebElement by lazy { 
        driver.findElement(By.id("loginBtn")) 
    }

    // Dynamic getter: Searches the DOM *every time* it is accessed 
    // Useful for highly dynamic React/Angular elements that go stale!
    private val dynamicMessage: WebElement 
        get() = driver.findElement(By.id("message"))

    fun login(username: String, password: String) {
        // Elements are located exactly at this moment
        // usernameField.sendKeys(username)
        // passwordField.sendKeys(password)
        // loginButton.click()
        println("Simulating Lazy Login with: $username")
    }
}

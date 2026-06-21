package com.mycodeyatra.pages

import org.openqa.selenium.By
import org.openqa.selenium.WebDriver

// 1. We pass the WebDriver instance into the constructor
class LoginPage(private val driver: WebDriver) {

    // 2. Define Locators using Kotlin's 'val' and By
    private val usernameField = By.id("username")
    private val passwordField = By.id("password")
    private val loginButton = By.id("loginBtn")

    // 3. Define Actions
    fun enterUsername(username: String) {
        // Just simulating the action since we mock the test for now
        println("Entering username: $username")
        // driver.findElement(usernameField).sendKeys(username)
    }

    fun enterPassword(password: String) {
        println("Entering password: $password")
        // driver.findElement(passwordField).sendKeys(password)
    }

    fun clickLogin() {
        println("Clicking login button")
        // driver.findElement(loginButton).click()
    }

    // A helper method to perform full login
    fun loginAs(user: String, pass: String) {
        enterUsername(user)
        enterPassword(pass)
        clickLogin()
    }
}

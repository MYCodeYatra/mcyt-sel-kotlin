package com.mycodeyatra.pages

import org.openqa.selenium.By
import org.openqa.selenium.WebDriver

// Fluent Page Object returns 'this' or the next Page Object
class Blog14_FluentLoginPage(private val driver: WebDriver) {

    private val usernameField by lazy { driver.findElement(By.id("username")) }
    private val passwordField by lazy { driver.findElement(By.id("password")) }
    private val loginButton by lazy { driver.findElement(By.id("loginBtn")) }

    fun enterUsername(username: String): Blog14_FluentLoginPage {
        println("Entering username: $username")
        // usernameField.sendKeys(username)
        return this
    }

    fun enterPassword(password: String): Blog14_FluentLoginPage {
        println("Entering password: $password")
        // passwordField.sendKeys(password)
        return this
    }

    // In a real app, clicking login would return a DashboardPage!
    fun clickLogin(): Blog14_FluentLoginPage {
        println("Clicking login button")
        // loginButton.click()
        return this
    }
}

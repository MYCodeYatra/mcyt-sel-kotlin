package com.mycodeyatra.utils

import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.ui.ExpectedConditions
import org.openqa.selenium.support.ui.WebDriverWait
import java.time.Duration

// Kotlin Extension Function on WebDriver
fun WebDriver.waitForElementVisible(locator: By, timeoutSeconds: Long = 10): WebElement {
    println("Waiting up to $timeoutSeconds seconds for element: $locator")
    val wait = WebDriverWait(this, Duration.ofSeconds(timeoutSeconds))
    return wait.until(ExpectedConditions.visibilityOfElementLocated(locator))
}

fun WebDriver.waitForElementClickable(locator: By, timeoutSeconds: Long = 10): WebElement {
    println("Waiting up to $timeoutSeconds seconds for element to be clickable: $locator")
    val wait = WebDriverWait(this, Duration.ofSeconds(timeoutSeconds))
    return wait.until(ExpectedConditions.elementToBeClickable(locator))
}

package com.mycodeyatra.utils

import org.openqa.selenium.JavascriptExecutor
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement

// Extension function to cast WebDriver to JavascriptExecutor and execute script
fun WebDriver.executeJS(script: String, vararg args: Any): Any? {
    val jsExecutor = this as JavascriptExecutor
    return jsExecutor.executeScript(script, *args)
}

// Extension function on WebElement to forcefully click using JS
// Highly useful when elements are obscured by overlays!
fun WebElement.clickWithJS(driver: WebDriver) {
    println("Clicking element using JavaScript Executor...")
    driver.executeJS("arguments[0].click();", this)
}

// Extension function to scroll an element into the center of the viewport
fun WebElement.scrollIntoCenterView(driver: WebDriver) {
    println("Scrolling element into view...")
    driver.executeJS("arguments[0].scrollIntoView({block: 'center'});", this)
}

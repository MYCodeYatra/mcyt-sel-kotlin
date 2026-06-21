package com.mycodeyatra.extensions

import org.openqa.selenium.By
import org.openqa.selenium.JavascriptExecutor
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.ui.ExpectedConditions
import org.openqa.selenium.support.ui.WebDriverWait
import java.time.Duration

fun WebDriver.findById(id: String): WebElement = this.findElement(By.id(id))
fun WebDriver.findByName(name: String): WebElement = this.findElement(By.name(name))
fun WebDriver.findByXPath(xpath: String): WebElement = this.findElement(By.xpath(xpath))
fun WebDriver.findByCss(css: String): WebElement = this.findElement(By.cssSelector(css))

fun WebElement.clearAndType(text: String) {
    this.clear()
    this.sendKeys(text)
}

fun WebDriver.waitForElementVisible(locator: By, timeoutInSeconds: Long = 10): WebElement {
    val wait = WebDriverWait(this, Duration.ofSeconds(timeoutInSeconds))
    return wait.until(ExpectedConditions.visibilityOfElementLocated(locator))
}

fun WebDriver.waitForElementClickable(locator: By, timeoutInSeconds: Long = 10): WebElement {
    val wait = WebDriverWait(this, Duration.ofSeconds(timeoutInSeconds))
    return wait.until(ExpectedConditions.elementToBeClickable(locator))
}

fun WebDriver.executeJs(script: String, vararg args: Any): Any? {
    return (this as JavascriptExecutor).executeScript(script, *args)
}

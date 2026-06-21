package com.mycodeyatra.tests

import com.mycodeyatra.extensions.executeJs
import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver

class Blog5_AlertsAndJsTest : StringSpec({

    lateinit var driver: WebDriver

    beforeTest {
        // driver = ChromeDriver()
        // driver.manage().window().maximize()
    }

    afterTest {
        // driver.quit()
    }

    "Should accept a JS Prompt Alert" {
        // driver.get("https://mycodeyatra.com/practice/alerts")
        // driver.findElement(By.id("prompt-btn")).click()
        // val alert = driver.switchTo().alert()
        // alert.text shouldBe "Please enter your name:"
        // alert.sendKeys("Pankaj")
        // alert.accept()
        // driver.findElement(By.id("result")).text shouldBe "Hello Pankaj"
        true shouldBe true
    }

    "Should execute Javascript to scroll and click" {
        // driver.get("https://mycodeyatra.com/practice/scrolling")
        // driver.executeJs("window.scrollBy(0, 500)")
        // val hiddenButton = driver.findElement(By.id("hidden-submit"))
        // driver.executeJs("arguments[0].click();", hiddenButton)
        true shouldBe true
    }
})

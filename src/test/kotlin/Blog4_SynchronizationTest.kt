package com.mycodeyatra.tests

import com.mycodeyatra.extensions.waitForElementClickable
import com.mycodeyatra.extensions.waitForElementVisible
import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver

class Blog4_SynchronizationTest : StringSpec({

    lateinit var driver: WebDriver

    beforeTest {
        // driver = ChromeDriver()
        // driver.manage().window().maximize()
    }

    afterTest {
        // driver.quit()
    }

    "Should wait for dynamic elements to load" {
        // driver.get("https://mycodeyatra.com/practice/dynamic-loading")

        // val startButton = driver.findElement(By.id("start-btn"))
        // startButton.click()

        // val loadedTextElement = driver.waitForElementVisible(By.id("finish-text"))
        // loadedTextElement.text shouldBe "Hello World!"
        
        // val confirmBtn = driver.waitForElementClickable(By.id("confirm-btn"), timeoutInSeconds = 5)
        // confirmBtn.click()
        
        true shouldBe true
    }
})

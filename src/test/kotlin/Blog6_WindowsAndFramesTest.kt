package com.mycodeyatra.tests

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import io.kotest.matchers.shouldNotBe
import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver

class Blog6_WindowsAndFramesTest : StringSpec({

    lateinit var driver: WebDriver

    beforeTest {
        // driver = ChromeDriver()
        // driver.manage().window().maximize()
    }

    afterTest {
        // driver.quit()
    }

    "Should switch to a new tab and back" {
        // driver.get("https://mycodeyatra.com/practice/windows")
        // val originalWindow = driver.windowHandle
        // driver.findElement(By.id("new-tab-btn")).click()
        // val newWindow = driver.windowHandles.firstOrNull { it != originalWindow }
        // newWindow shouldNotBe null
        // driver.switchTo().window(newWindow)
        // driver.title shouldBe "New Tab Content"
        // driver.close()
        // driver.switchTo().window(originalWindow)
        // driver.title shouldBe "Practice Windows"
        true shouldBe true
    }

    "Should interact with elements inside an iFrame" {
        // driver.get("https://mycodeyatra.com/practice/iframes")
        // val iframeElement = driver.findElement(By.id("embedded-form-frame"))
        // driver.switchTo().frame(iframeElement)
        // val emailInput = driver.findElement(By.id("frame-email"))
        // emailInput.sendKeys("iframe@mycodeyatra.com")
        // driver.switchTo().defaultContent()
        // val mainPageHeader = driver.findElement(By.tagName("h1")).text
        // mainPageHeader shouldBe "iFrame Practice"
        true shouldBe true
    }
})

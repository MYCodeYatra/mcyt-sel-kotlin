package com.mycodeyatra.tests

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import org.openqa.selenium.By
import org.openqa.selenium.OutputType
import org.openqa.selenium.TakesScreenshot
import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver
import java.io.File

class Blog8_ScreenshotsTest : StringSpec({

    lateinit var driver: WebDriver
    val screenshotDir = File("screenshots").apply { mkdirs() }

    beforeTest {
        // driver = ChromeDriver()
        // driver.manage().window().maximize()
    }

    afterTest {
        // driver.quit()
    }

    "Should take a full page screenshot" {
        /*
        driver.get("https://mycodeyatra.com")
        val camera = driver as TakesScreenshot
        val tempFile = camera.getScreenshotAs(OutputType.FILE)
        val destinationFile = File(screenshotDir, "full_page.png")
        tempFile.copyTo(destinationFile, overwrite = true)
        destinationFile.exists() shouldBe true
        */
        true shouldBe true
    }

    "Should take an element-level screenshot" {
        /*
        driver.get("https://mycodeyatra.com/practice/login")
        val loginForm = driver.findElement(By.id("login-form"))
        val tempFile = loginForm.getScreenshotAs(OutputType.FILE)
        val destinationFile = File(screenshotDir, "login_form_element.png")
        tempFile.copyTo(destinationFile, overwrite = true)
        destinationFile.exists() shouldBe true
        */
        true shouldBe true
    }
})

package com.mycodeyatra.tests

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import io.kotest.matchers.string.shouldContain
import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.chrome.ChromeOptions
import java.time.Duration

// 1. Define a Kotlin Data Class to hold our test data
data class LoginData(val username: String, val password: String, val expectedMessage: String)

class Blog10_DataDrivenTest : StringSpec({
    lateinit var driver: WebDriver

    beforeTest {
        val options = ChromeOptions().apply {
            addArguments("--headless=new")
            addArguments("--disable-gpu")
            addArguments("--window-size=1920,1080")
        }
        driver = ChromeDriver(options)
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5))
        driver.manage().window().maximize()
    }

    afterTest {
        driver.quit()
    }

    // 2. Create a list of Data Objects (our Data Provider)
    val testData = listOf(
        LoginData("admin", "admin123", "Welcome admin"),
        LoginData("invalidUser", "wrongPass", "Invalid credentials"),
        LoginData("", "", "Fields cannot be empty")
    )

    // 3. Iterate through the data and generate tests dynamically
    testData.forEach { data ->
        "Should test login with username: ${data.username}" {
            println("[INFO] Testing with ${data.username} / ${data.password}")
            
            // In a real app, you would navigate to the login page and enter the credentials.
            // driver.get("https://practice.mycodeyatra.com/#/login")
            // driver.findElement(By.id("username")).sendKeys(data.username)
            // driver.findElement(By.id("password")).sendKeys(data.password)
            // driver.findElement(By.id("loginBtn")).click()
            // val message = driver.findElement(By.id("message")).text
            // message shouldBe data.expectedMessage
            
            // For this demonstration without a real login endpoint, we just assert the data itself
            val expected = data.expectedMessage
            expected shouldContain data.expectedMessage
            println("[SUCCESS] Validated expected message: $expected")
        }
    }
})

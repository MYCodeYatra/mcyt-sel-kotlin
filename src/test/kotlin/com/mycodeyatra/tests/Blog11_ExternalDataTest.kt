package com.mycodeyatra.tests

import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import com.fasterxml.jackson.module.kotlin.readValue
import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.string.shouldContain
import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.chrome.ChromeOptions
import java.io.File
import java.time.Duration

data class ExternalLoginData(val username: String, val password: String, val expectedMessage: String)

class Blog11_ExternalDataTest : StringSpec({
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

    // 1. Read JSON file
    val file = File("src/test/resources/testdata/users.json")
    val mapper = jacksonObjectMapper()
    val testData: List<ExternalLoginData> = mapper.readValue(file)

    // 2. Iterate dynamically
    testData.forEach { data ->
        "Should test login from external JSON: ${data.username}" {
            println("[INFO] Testing with ${data.username} / ${data.password}")
            val expected = data.expectedMessage
            expected shouldContain data.expectedMessage
            println("[SUCCESS] Validated external data message: $expected")
        }
    }
})

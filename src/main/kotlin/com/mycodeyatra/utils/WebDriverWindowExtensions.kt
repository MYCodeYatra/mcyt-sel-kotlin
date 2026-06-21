package com.mycodeyatra.utils

import org.openqa.selenium.WebDriver

// Extension function to switch to a new window automatically
fun WebDriver.switchToNewWindow() {
    val originalWindow = this.windowHandle
    val allWindows = this.windowHandles
    
    for (windowHandle in allWindows) {
        if (windowHandle != originalWindow) {
            this.switchTo().window(windowHandle)
            println("Switched to new window: ${this.title}")
            break
        }
    }
}

// Extension function to switch back to the original window
fun WebDriver.switchToOriginalWindow(originalWindowHandle: String) {
    this.switchTo().window(originalWindowHandle)
    println("Switched back to original window.")
}

package webFunction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utilities.baseClass;

public class loginModule extends baseClass {

    WebDriver webDriver;

    public loginModule(WebDriver remoteDriver) {
        webDriver = remoteDriver;
    }

    public void login() throws InterruptedException {
        WebElement container = webDriver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]"));
        String text = container.getText();
        // Split the text into words
        String[] words = text.split("\\s+");
        // Search for the username within the words
        String username = null;
        for (String word : words) {
            if (word.equals("problem_user")) {
                username = word;
                break; // Stop searching once the username is found
            }
        }
        // Check if the username was found
        if (username != null) {
            System.out.println("Username found in the container: " + username);
            WebElement usernameField = webDriver.findElement(By.id("user-name")); // Assuming the username field has id 'username'
            usernameField.sendKeys(username);
        } else {
            System.out.println("Username not found in the container.");
        }
        Thread.sleep(1000);
        pass();
    }

    public void pass() throws InterruptedException {
        WebElement container = webDriver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[2]")); // Adjust the XPath to target the correct element
        String ptext = container.getText();
        // Search for the password within the text
        String password = null;
        String[] words = ptext.split("\\s+");
        for (String word : words) {
            if (word.equals("secret_sauce")) {
                password = word;
                break; // Stop searching once the password is found
            }
        }
        // Check if the password was found
        if (password != null) {
            System.out.println("Password found in the container: " + password);
            WebElement passwordField = webDriver.findElement(By.id("password")); // Adjust to the correct locator for the password field
            passwordField.sendKeys(password.trim()); // Trim to remove leading or trailing whitespace
        } else {
            System.out.println("Password not found in the container.");
        }
        webDriver.findElement(By.id("login-button")).click();
        Thread.sleep(2000);
    }
}

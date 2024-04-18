# swaglabs
Get the username &amp; password from the container

In this login module, I have used,
1. String text = container.getText();: This line retrieves the text content of the container element found in the previous step and assigns it to the variable text.
2. String[] words = text.split("\\s+");: Here, the text is split into an array of words using whitespace as the delimiter. This will allow us to search for specific words within the text.
3. The following block iterates through each word in the words array to search for a specific username, in this case, "standard_user". If the username is found, it assigns it to the username variable and exits the loop using break.
4. If the username is found (username != null), it prints a message indicating that the username is found in the container and attempts to find an input field on the webpage with the id "username" using webDriver.findElement(By.id("username")). If found, it populates this input field with the username using sendKeys(username).
5. If the username is not found in the container, it prints a message indicating that the username was not found.
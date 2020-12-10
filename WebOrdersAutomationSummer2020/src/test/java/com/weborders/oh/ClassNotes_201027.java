package com.weborders.oh;
/*
Office hour:
	What is the most confusing topic in test automation so far?
waits()
***************
 First of all, selenium is infamous for synchronization issues.
 webdriver -----> where is the element ?
 if it cannot find element based on your locator, it will throw NoSuchElementException
 Solution?
 before findElement() method call we can put Thread.sleep(3000)
- last hope, but we shouldn’t use it much coz it affects on the performance.
Use selenium waits:
Implicit, Explicit, Fluent
Implicit wait - wait for element to be present within some period of time. It works automatically once you call findElement() method.
1. We set implicit wait only once and only in the beginning
2. It doesn’t work for findElements() method.
3. Implicit wait doesn’t allow you to define wait criteria. It’s always “wait for presence of element”.
4. If wait time is over, webdriver throws NoSuchElementException.
5. Default implicit wait time is 0.
6. Implicit wait applies to all elements once enabled
driver.manage().timeouts().imlictlyWait(10, TimeUnit.SECONDS);
What if, just waiting for presence of element is not enough? What is we need to wait for visibility/invisibility of element?
Explicit wait
is way more flexible than implicit wait
1. We apply explicit against specific element with a specific condition. Basically it’s a conditional wait.
2. To use explicit wait we need to create an object of WebDriverWait class.
WebDriverWait wait = new WebDriverWait(Driver.get(), 20);
selenium will wait UP TO 20 Seconds, and every 0.5 second it will check if condition is true.
1st parameter - webdriver driver object
2nd parameter - timeout (maximum allowed wait time)
every 500 milliseconds, webdriver is checking if your condition has met. If, it will continue execution.
WebDriverWait wait = new WebDriverWait(Driver.get(), 20);
WebElement button = driver.findElement(By.id(“btn”));
button = wait.until(ExpectedContions.visibilityOf(button));
WebElement checkbox = wait.until(ExpectedContions.presenceOfElement(By.id(“box”)));
waits that I mostly used: element to clickable, visibility and presence of element.
visibility - until element is visible
clickable - until webdriver can click on element
presence - until element is in the DOM.
org.openqa.selenium.ElementNotInteractableException: element not intractable
element is present but not visible.
basically, in case of StaleElementReferenceException we need to find element again. It became obsolete (old).
stalenessOf()
To handle this issue, I was using loops:
public static void waitForStaleenessOfElement(By by){
	int counter = 0;
	//keep trying up to 10 times
	while(counter++ <= 10){
		try{
			Driver.getDriver().findElement(by); // if it doesn’t throw exception
			break; // creak from the loop
		}catch(WebDriverException e){ // otherwise
			Thread.sleep(1000); // wait 1 second and try to find element again.
		}
	}
}
 */
public class ClassNotes_201027 {
}


# Toaster Message

A simple library to show toaster messages.

[![](https://jitpack.io/v/Vikram2921/ToasterMessage.svg)](https://jitpack.io/#Vikram2921/ToasterMessage)

### Installation
Add it in your root build.gradle at the end of repositories:
        

    allprojects {
        		repositories {
        			...
        			maven { url 'https://jitpack.io' }
        		}
        	}


Add the dependency

```css
dependencies {
	        implementation 'com.github.Vikram2921:ToasterMessage:1.0.01'
	}
```
**How to use :** 

Step 1 : In **onCreate** method of your activity.

    ToasterMessage toasterMessage = new ToasterMessage(<your application context>);
Step 2 : No if you want to show message for long time then 

    toasterMessage.showMessageForLong(<Your Message>);

Step 3 : No if you want to show message for short time then 

    toasterMessage.showMessageForShort(<Your Message>);


***That's it.***

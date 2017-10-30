# zalando

Test automation project

## Maven

This project use Maven as dependency manager.


## Requirements 

The WebDriver 'chromedriver' should be installed.
See https://sites.google.com/a/chromium.org/chromedriver/

## Install and run

```
git clone https://github.com/clovisolivier/zalando.git
cd zalando
mvn clean install
```

## Comments

* On the product detail page, I did not succeed to interact with the drop down selector used for the size selection. 
I have only used one size product for the testing.

* The cucumber steps can be updated to be more reusable.

* For this project, I don't have used the data driven approach, even if the file TestData-seleniumframework.xlsx is loaded.



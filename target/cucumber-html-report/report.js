$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/ShoppingBasket.feature");
formatter.feature({
  "line": 1,
  "name": "Add products in the shopping basket",
  "description": "",
  "id": "add-products-in-the-shopping-basket",
  "keyword": "Feature"
});
formatter.before({
  "duration": 5504743530,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Add two products to the shopping basket",
  "description": "",
  "id": "add-products-in-the-shopping-basket;add-two-products-to-the-shopping-basket",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "I open zalando website",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "I search shoes for men by navigation",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "I select a product in the list",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I add this product to the shopping basket",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I search for a dress by research",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "I select a product in the list",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I add this product to the shopping basket",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I go in my shopping basket",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "I check that I have 2 products in my shopping basket",
  "keyword": "And "
});
formatter.match({
  "location": "ProductSelectionSteps.i_open_zalando_website()"
});
formatter.result({
  "duration": 4190676557,
  "status": "passed"
});
formatter.match({
  "location": "ProductSelectionSteps.i_search_shoes_for_men_by_navigation()"
});
formatter.result({
  "duration": 5782736228,
  "status": "passed"
});
formatter.match({
  "location": "ProductSelectionSteps.i_select_a_product_in_the_list()"
});
formatter.result({
  "duration": 2525615744,
  "status": "passed"
});
formatter.match({
  "location": "ProductSelectionSteps.i_add_this_product_to_the_shopping_basket()"
});
formatter.result({
  "duration": 201389982,
  "error_message": "org.openqa.selenium.WebDriverException: unknown error: Element \u003cbutton class\u003d\"z-rich-button z-rich-button--primary\"\u003e...\u003c/button\u003e is not clickable at point (820, 604). Other element would receive the click: \u003cdiv class\u003d\"zvui-size-select-dropdown-option is-focused is-disabled-clickable zvui-size-picker-option\" role\u003d\"option\" id\u003d\"zvui-size-select-dropdown-49312-option-0\"\u003e...\u003c/div\u003e\n  (Session info: chrome\u003d61.0.3163.100)\n  (Driver info: chromedriver\u003d2.33.506106 (8a06c39c4582fbfbab6966dbb1c38a9173bfb1a2),platform\u003dMac OS X 10.12.6 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 40 milliseconds\nBuild info: version: \u00272.44.0\u0027, revision: \u002776d78cf323ce037c5f92db6c1bba601c2ac43ad8\u0027, time: \u00272014-10-23 13:11:40\u0027\nSystem info: host: \u0027iMac-de-Emilie.home\u0027, ip: \u0027192.168.1.85\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.12.6\u0027, java.version: \u00279\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities [{applicationCacheEnabled\u003dfalse, rotatable\u003dfalse, mobileEmulationEnabled\u003dfalse, networkConnectionEnabled\u003dfalse, chrome\u003d{chromedriverVersion\u003d2.33.506106 (8a06c39c4582fbfbab6966dbb1c38a9173bfb1a2), userDataDir\u003d/var/folders/0y/djnk0gld2cj3tzqj9nvmf7z00000gp/T/.org.chromium.Chromium.jirpUJ}, takesHeapSnapshot\u003dtrue, pageLoadStrategy\u003dnormal, databaseEnabled\u003dfalse, handlesAlerts\u003dtrue, hasTouchScreen\u003dfalse, version\u003d61.0.3163.100, platform\u003dMAC, browserConnectionEnabled\u003dfalse, nativeEvents\u003dtrue, acceptSslCerts\u003dtrue, locationContextEnabled\u003dtrue, webStorageEnabled\u003dtrue, browserName\u003dchrome, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue, setWindowRect\u003dtrue, unexpectedAlertBehaviour\u003d}]\nSession ID: 35704b4a909380b9923ce2b145598ebf\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:488)\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:204)\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:156)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:599)\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:268)\n\tat org.openqa.selenium.remote.RemoteWebElement.click(RemoteWebElement.java:79)\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\n\tat java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\n\tat java.base/java.lang.reflect.Method.invoke(Method.java:564)\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:50)\n\tat com.sun.proxy.$Proxy19.click(Unknown Source)\n\tat modules.AddProductToShoppingBacket.Execute(AddProductToShoppingBacket.java:28)\n\tat step_definitions.ProductSelectionSteps.i_add_this_product_to_the_shopping_basket(ProductSelectionSteps.java:65)\n\tat ✽.And I add this product to the shopping basket(features/ShoppingBasket.feature:7)\n",
  "status": "failed"
});
formatter.match({
  "location": "ProductSelectionSteps.i_search_for_a_dress_by_research()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ProductSelectionSteps.i_select_a_product_in_the_list()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ProductSelectionSteps.i_add_this_product_to_the_shopping_basket()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ShoppingBacketSteps.i_go_in_my_shopping_basket()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 20
    }
  ],
  "location": "ShoppingBacketSteps.i_check_that_I_have_products_in_my_shopping_basket(int)"
});
formatter.result({
  "status": "skipped"
});
formatter.write("Current Page URL is https://www.zalando.es/nike-sportswear-classic-cortez-zapatillas-ni112b0cu-c11.html");
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "duration": 2050297621,
  "status": "passed"
});
});
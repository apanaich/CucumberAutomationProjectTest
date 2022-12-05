$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("SearchTrivago.feature");
formatter.feature({
  "line": 1,
  "name": "Trivago Website Testing",
  "description": "",
  "id": "trivago-website-testing",
  "keyword": "Feature"
});
formatter.background({
  "line": 3,
  "name": "User is at Trivago Room5 website",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.scenario({
  "line": 6,
  "name": "Search for a location on Room5 using search bar",
  "description": "",
  "id": "trivago-website-testing;search-for-a-location-on-room5-using-search-bar",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 5,
      "name": "@Test1"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "Open Browser and input the URL",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "correct link is open by the browser",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "Click on search menu",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "Enter the location \"England\" to search hotels",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefHelper.openBrowserAndEnterTheURL()"
});
formatter.result({
  "duration": 4328977100,
  "status": "passed"
});
formatter.match({
  "location": "stepDefHelper.verifyIfCorrectLinkIsOpenByTheBrowser()"
});
formatter.result({
  "duration": 70082300,
  "status": "passed"
});
formatter.match({
  "location": "stepDefHelper.clickOnSearchMenu()"
});
formatter.result({
  "duration": 5155014100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "England",
      "offset": 20
    }
  ],
  "location": "stepDefHelper.enterTheLocationToSearchHotels(String)"
});
formatter.result({
  "duration": 5304818200,
  "status": "passed"
});
formatter.after({
  "duration": 876800,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "User is at Trivago Room5 website",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.scenario({
  "line": 13,
  "name": "Fill in the contact form and sent it",
  "description": "",
  "id": "trivago-website-testing;fill-in-the-contact-form-and-sent-it",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 12,
      "name": "@Test2"
    }
  ]
});
formatter.step({
  "line": 14,
  "name": "Open Browser and input the URL",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "User click on the Contact web link",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "Input your message",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "Input your Full Name",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "Input your Email Address",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "Tick the confirmation",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "Submit the button",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefHelper.openBrowserAndEnterTheURL()"
});
formatter.result({
  "duration": 2950288400,
  "status": "passed"
});
formatter.match({
  "location": "stepDefHelper.userClickOnTheContactWebLink()"
});
formatter.result({
  "duration": 403475400,
  "status": "passed"
});
formatter.match({
  "location": "stepDefHelper.inputYourMessage()"
});
formatter.result({
  "duration": 6080361500,
  "status": "passed"
});
formatter.match({
  "location": "stepDefHelper.inputYourFullName()"
});
formatter.result({
  "duration": 57500,
  "status": "passed"
});
formatter.match({
  "location": "stepDefHelper.inputYourEmailAddress()"
});
formatter.result({
  "duration": 40500,
  "status": "passed"
});
formatter.match({
  "location": "stepDefHelper.tickTheConfirmation()"
});
formatter.result({
  "duration": 52900,
  "status": "passed"
});
formatter.match({
  "location": "stepDefHelper.submitTheButton()"
});
formatter.result({
  "duration": 41300,
  "status": "passed"
});
formatter.after({
  "duration": 627700,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "User is at Trivago Room5 website",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.scenario({
  "line": 23,
  "name": "Subscribe to the Newsletter",
  "description": "",
  "id": "trivago-website-testing;subscribe-to-the-newsletter",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 22,
      "name": "@Test3"
    }
  ]
});
formatter.step({
  "line": 24,
  "name": "Open Browser and input the URL",
  "keyword": "Given "
});
formatter.step({
  "line": 25,
  "name": "User search for newsletter option",
  "keyword": "When "
});
formatter.step({
  "line": 26,
  "name": "input email address",
  "keyword": "Then "
});
formatter.step({
  "line": 27,
  "name": "Submit the consent to receive newsletter",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefHelper.openBrowserAndEnterTheURL()"
});
formatter.result({
  "duration": 5364778300,
  "status": "passed"
});
formatter.match({
  "location": "stepDefHelper.userSearchForNewsletterOption()"
});
formatter.result({
  "duration": 15896000,
  "status": "passed"
});
formatter.match({
  "location": "stepDefHelper.inputEmailAddress()"
});
formatter.result({
  "duration": 195945000,
  "status": "passed"
});
formatter.match({
  "location": "stepDefHelper.submitTheConsentToReceiveNewsletter()"
});
formatter.result({
  "duration": 5250207900,
  "status": "passed"
});
formatter.after({
  "duration": 727800,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "User is at Trivago Room5 website",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.scenario({
  "line": 31,
  "name": "Navigate to the destination through the menu on the top left",
  "description": "",
  "id": "trivago-website-testing;navigate-to-the-destination-through-the-menu-on-the-top-left",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 30,
      "name": "@Test4"
    }
  ]
});
formatter.step({
  "line": 32,
  "name": "Open Browser and input the URL",
  "keyword": "Given "
});
formatter.step({
  "line": 33,
  "name": "User clicks on the menu button",
  "keyword": "When "
});
formatter.step({
  "line": 34,
  "name": "Select a destination \"Midwest\"",
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "Verify he is navigated to correct destination",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefHelper.openBrowserAndEnterTheURL()"
});
formatter.result({
  "duration": 3204446600,
  "status": "passed"
});
formatter.match({
  "location": "stepDefHelper.userClicksOnTheMenuButton()"
});
formatter.result({
  "duration": 250251700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Midwest",
      "offset": 22
    }
  ],
  "location": "stepDefHelper.selectADestination(String)"
});
formatter.result({
  "duration": 42357600,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//div[text()\u003d\u0027Midwest\u0027]\"}\n  (Session info: chrome\u003d108.0.5359.71)\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.5.3\u0027, revision: \u0027a88d25fe6b\u0027, time: \u00272017-08-29T12:42:44.417Z\u0027\nSystem info: host: \u0027LCAMON-AKAUR\u0027, ip: \u0027192.168.3.93\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_202\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities [{networkConnectionEnabled\u003dfalse, chrome\u003d{chromedriverVersion\u003d107.0.5304.62 (1eec40d3a5764881c92085aaee66d25075c159aa-refs/branch-heads/5304@{#942}), userDataDir\u003dC:\\Users\\akaur\\AppData\\Local\\Temp\\scoped_dir9152_597328996}, timeouts\u003d{implicit\u003d0, pageLoad\u003d300000, script\u003d30000}, pageLoadStrategy\u003dnormal, unhandledPromptBehavior\u003ddismiss and notify, strictFileInteractability\u003dfalse, platform\u003dXP, proxy\u003dProxy(), goog:chromeOptions\u003d{debuggerAddress\u003dlocalhost:61149}, webauthn:extension:credBlob\u003dtrue, acceptInsecureCerts\u003dfalse, browserVersion\u003d108.0.5359.71, browserName\u003dchrome, javascriptEnabled\u003dtrue, platformName\u003dXP, setWindowRect\u003dtrue, webauthn:extension:largeBlob\u003dtrue, webauthn:virtualAuthenticators\u003dtrue}]\nSession ID: 3e3aee4ec1a9c0ddd83de748a476bd28\n*** Element info: {Using\u003dxpath, value\u003d//div[text()\u003d\u0027Midwest\u0027]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:185)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:120)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:164)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:82)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:646)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:416)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:518)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:361)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:408)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy20.click(Unknown Source)\r\n\tat com.pages.SearchPage.click_midwest_destn(SearchPage.java:168)\r\n\tat StepDefinition.stepDefHelper.selectADestination(stepDefHelper.java:166)\r\n\tat ✽.And Select a destination \"Midwest\"(SearchTrivago.feature:34)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "stepDefHelper.verifyHeIsNavigatedToCorrectDestination()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 5764169200,
  "status": "passed"
});
});
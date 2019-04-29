$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/Resources/FeatureFiles/triggerreport.feature");
formatter.feature({
  "line": 2,
  "name": "user should be able to add new trigger reports",
  "description": "",
  "id": "user-should-be-able-to-add-new-trigger-reports",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@trigger"
    }
  ]
});
formatter.before({
  "duration": 5546375800,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "user is bale to add new trigger reports",
  "description": "",
  "id": "user-should-be-able-to-add-new-trigger-reports;user-is-bale-to-add-new-trigger-reports",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "user is on the home page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user  enter valid username and password click on login button",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user hover to  Setup page and select Trigger Reports",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user enter Report name",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "select real time Email notification and select Page data",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Select Report Recipients",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "select Filter",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "select auto assign,auto categories,auto creat leads,auto purchase contacts",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "click on save reports",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "user will see trigger report created sucessfully message",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepdefs.userIsOnTheHomePage()"
});
formatter.result({
  "duration": 86213300,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.userEnterValidUsernameAndPasswordClickOnLoginButton()"
});
formatter.result({
  "duration": 5016594500,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.userHoverToSetupPageAndSelectTriggerReports()"
});
formatter.result({
  "duration": 1854544600,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.userEnterReportName()"
});
formatter.result({
  "duration": 123026300,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.selectRealTimeEmailNotificationAndSelectPageData()"
});
formatter.result({
  "duration": 253224900,
  "error_message": "org.openqa.selenium.WebDriverException: unknown error: Element \u003cspan\u003e...\u003c/span\u003e is not clickable at point (510, 425). Other element would receive the click: \u003cdiv class\u003d\"k-loading-image\"\u003e\u003c/div\u003e\n  (Session info: chrome\u003d73.0.3683.103)\n  (Driver info: chromedriver\u003d2.45.615291 (ec3682e3c9061c10f26ea9e5cdcf3c53f3f74387),platform\u003dWindows NT 10.0.17763 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027LF-POR-0365\u0027, ip: \u002710.2.1.20\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_201\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, acceptSslCerts: false, applicationCacheEnabled: false, browserConnectionEnabled: false, browserName: chrome, chrome: {chromedriverVersion: 2.45.615291 (ec3682e3c9061c..., userDataDir: C:\\Users\\patelt\\AppData\\Loc...}, cssSelectorsEnabled: true, databaseEnabled: false, goog:chromeOptions: {debuggerAddress: localhost:62156}, handlesAlerts: true, hasTouchScreen: false, javascriptEnabled: true, locationContextEnabled: true, mobileEmulationEnabled: false, nativeEvents: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: XP, platformName: XP, proxy: Proxy(), rotatable: false, setWindowRect: true, strictFileInteractability: false, takesHeapSnapshot: true, takesScreenshot: true, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unexpectedAlertBehaviour: ignore, unhandledPromptBehavior: ignore, version: 73.0.3683.103, webStorageEnabled: true}\nSession ID: 29801d5888b8844fc5c3ddaff6d1a0f0\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:166)\r\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:80)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:44)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:285)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.click(RemoteWebElement.java:84)\r\n\tat lf.Utils.waitAndClick(Utils.java:77)\r\n\tat lf.Setup.reportType(Setup.java:34)\r\n\tat lf.MyStepdefs.selectRealTimeEmailNotificationAndSelectPageData(MyStepdefs.java:95)\r\n\tat ✽.And select real time Email notification and select Page data(src/test/Resources/FeatureFiles/triggerreport.feature:8)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "MyStepdefs.selectReportRecipients()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MyStepdefs.selectFilter()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MyStepdefs.selectAutoAssignAutoCategoriesAutoCreatLeadsAutoPurchaseContacts()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MyStepdefs.clickOnSaveReports()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MyStepdefs.userWillSeeTriggerReportCreatedSucessfullyMessage()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 593512300,
  "status": "passed"
});
});
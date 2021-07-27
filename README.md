# wallet-hub-selenium

This framework is based on Page object model design pattern. Basic components are as follows -

 1. Test suite xml = testSuite_testng.xml

 2. Test Class name = ValidateReviewInWalletHub.java
 
 3. Test Data file = Config.xml
 
 4. BaseTest class - with bootstrapping of browser configuration and teardown

 5. Controller page - which initiates all the pages of the framework at the same time.
 
 6. WebDriverClient Class -  writing application customised functions for performing actions on elements.
 
 7. To run the project give command 'mvn test' from cli.

Feature: Login

  Scenario: Successful Login with Valid Credentials
    Given user launch chrome browser
    When user opens url "https://www.opencart.com/index.php?route=account/login"
    And user enters email as "sokoeurnc@gmail.com" and password as "xyz123"
    And click login
    Then page title should be "OpenCart - Your Account"
    When user clicks logout link
    Then page title should be "OpenCart - Open Source Shopping Cart Solution"
    And close browser

  Scenario Outline: Login Data Driven
    Given user launch chrome browser
    When user opens url "https://www.opencart.com/index.php?route=account/login"
    And user enters email as "<email>" and password as "<password>"
    And click login
    Then page title should be "OpenCart - Your Account"
    When user clicks logout link
    Then page title should be "OpenCart - Open Source Shopping Cart Solution"
    And close browser
    
    Examples:
    | email | password |
    | sokoeurnc@gmail.com | xyz123 |
    | admin@gmail.com | abc123 |

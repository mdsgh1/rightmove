Feature: Test HomePage functionality

  Scenario Outline: Check that the input box is visible and editable on homepage with valid postcode or cityname
    Given browser is open
    And user is on homepage
    And input box is visible and editable
    When user enters <address>
    And the address is valid in UK
    And user clicks on For Sale
    Then user is navigated to Buy page

    Examples:
      | address  |
      | SL1 5DB  |
      | Slough   |
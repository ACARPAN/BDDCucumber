Feature: Verify login Pages
  I want to use this template for my feature file

  Scenario Outline: Validate Login credentials
    Given I landed in Ecommerce Page
    When Logged with valid username and password
    Then Dashboard logo is displayed

    Examples: 
      | name  | value | status  |
      | name1 |     5 | success |
      | name2 |     7 | Fail    |

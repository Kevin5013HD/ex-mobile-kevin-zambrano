@LoginTheApp
  Feature: SwagLabs Login and Product Validation

    Scenario: User logs in and validates products
      Given the user is on the login screen
      Then the user logs in successfully
      And the title "PRODUCTS" is displayed and at least one item exists

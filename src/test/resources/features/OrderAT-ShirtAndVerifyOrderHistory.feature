Feature: Order a T-Shirt and Verify in Order History
  As a Shopper
  I need to be able to order a T-shirt and verify history
  So that I have a record of my successful purchase


  Scenario: Order a T-Shirt and Verify Order History
    Given Nancy searches for a "t-shirt" in the online store
    When Nancy makes the selection of a "Faded Short Sleeve T-shirts"
    And Nancy confirms the order
    And Nancy verifies the order summary
    And Nancy signs in as a registered user
    And Nancy verifies the billing and shipping addresses
    And Nancy chooses a delivery option and accepts terms of service
    And Nancy chooses to pay by bank wire
    And Nancy navigates to order history page
    Then Nancy can see her order in the history page





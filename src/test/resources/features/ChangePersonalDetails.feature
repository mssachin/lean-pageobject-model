Feature: Change Personal Details
  As a user
  I should be able to change my personal details
  To keep an accurate personal information

  Scenario: Change First Name
    Given Nancy chooses to sign in from header
    And  Nancy signs in as a registered user
    When Nancy changes the first name
    Then Nancy can view the update and logout

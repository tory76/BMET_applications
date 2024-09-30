Feature: Test For BMET Registration Functionality
  Background:
    Given user has logged into the portal


  @bmetR
  Scenario: Verify BMET Registration Functionality
    When user clicks on BMET button
    And user upload passport
    And user inputs passport number
    And user inputs mobile number
    And user inputs passport information
    And user inputs full name
    And user select gender
#    And user inputs otp and clicks on confirm button
#    And success message should appear
#    And user should be able to login using new password
#    Then user will change password again
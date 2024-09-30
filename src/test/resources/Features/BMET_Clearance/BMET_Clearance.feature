Feature: Test For New BMET Clearance Functionality
  Background:
    Given user has logged into the portal

  @bmetCl
  Scenario: Open New Clearance Application
    When user clicks on New Clearance Application button
    And user clicks on Start new BMET Clearance Application
    And user select country
    And user select clearance type
    And user clicks on continue button
    And user clicks Pull from posted jobs
    And user select jobs
    And user click Add Candidate
    And user gives passport number
    And user gives Visa info
    And user click submit candidate
#    And user click Add Bulk candidate
  #  And user search specific passport number
   # And user can view candidate
   # And user click update button
    And user click next button
    And user click next button two
    And user click checkbox for payment
    And user click Proceed to Payment button
    And user click SBL button
    And user click Account button
    And user click Confirm button
    And user gives Account info



#    And user click Add Job
#    And user clicks on close button



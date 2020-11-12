#Login feature for the Subsidy Control Transparency DB - Admin portal
#Created By : Vimalnath N
#Creation Date: 30-Oct-2020

Feature: User provides details for a successful login
  Scenario Outline: Valid user credentials provided
     Given I enter a valid emailID "<emailID>" and password "<password>"
     When I click on SignIn
     Then I will be able to login successfully
     Examples:
        | emailID | password |
        | Vimalnath.N@cognizant.com | ABCD12345 |
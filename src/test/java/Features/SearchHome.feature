@smokeTest
Feature: Search feature for "zoopla.co.uk"

@Search
Scenario Outline: Search scenario
  Given User is on homepage
  When User Enters location as "<location>"
  And Clicks Search button
  Then Print prices of results in console
  When user clicks 5th result
  Then user redirected to result page
  When user clicks agency link
  Then user redirected to agency page
  And verify agency name printed

  Examples:
  | location  |
  | London    |
  #  | Edgware   |
  #  | Oxford    |
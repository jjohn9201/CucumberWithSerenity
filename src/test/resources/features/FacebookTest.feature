@FBSmokeTest
  Feature: Facebook Test

    Scenario: Facebook Signup
      Given User is able to Navigate to facebook site
      And User creates a new FB Account with following data
        | firstName | surname  |email_mobile              | password    | dob         | gender   |
        | Kevin     | Rodriguez|Kevin.Rodriguez@gmail.com | May05@2019  | 1/May/2002  |  M       |
        | Ashly     | John     |9898982398                | June05@2019 | 22/Apr/1990 |  F       |
        | Jeswin    | John     |Jeswin.John@gmail.com     | June05@2019 | 2/Dec/1990  |  M       |

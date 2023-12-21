@SauceDemo
  Feature: Sauce Demo Test Cases

    @AllEmpty
    Scenario Outline: Empty Username and Password
      Given User at Home Page
      When Click login button
      Then Check "<error>" message about username
      Examples:
        | error                |
        | Username is required |



    @EmptyPassword
    Scenario Outline: Empty Password
      Given User at Home Page
      When write "<username>" for username field
      When Click login button
      Then Check "<error>" message about password
      Examples:
        | username  | error                |
        | furkan123 | Password is required |

    @EmptyUsername
    Scenario Outline: Empty Username
      Given User at Home Page
      When write "<password>" for password field
      When Click login button
      Then Check "<error>" message about username
      Examples:
        | password | error                |
        | pass123  | Username is required |




    @FalseLoginPassword
    Scenario Outline: Correct Username and False Password
      Given User at Home Page
      When write Correct "<username>" for username field
      When write "<password>" for password field
      When Click login button
      Then Check "<error>" message about dont match
      Examples:
        | username      | error                                                                     | password |
        | standard_user | Epic sadface: Username and password do not match any user in this service | pass123  |


    @FalseLoginUsername
    Scenario Outline: Correct Password and False Username
      Given User at Home Page
      When write "<username>" for username field
      When write Correct "<password>" for password field
      When Click login button
      Then Check "<error>" message about dont match
      Examples:
        | username  | error                                                                     | password     |
        | furkan123 | Epic sadface: Username and password do not match any user in this service | secret_sauce |



    @SuccessfulLogin
    Scenario Outline: Correct Password and Username
      Given User at Home Page
      When write Correct "<username>" for username field
      When write Correct "<password>" for password field
      When Click login button
      Then Check Succesfull login
      Examples:
        | username      | password     |
        | standard_user | secret_sauce |





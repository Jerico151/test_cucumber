Feature: Login user


  Scenario: Login user
    Then Click "Log In" button
    Then Input login
    Then Input Password
    Then Click "Log in" button span
    Then Content with "Courses you might be interested in" visible

    
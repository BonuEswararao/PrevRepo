Feature: Home Page Validation

  @homePage
  Scenario Outline: Home Page Login Form Validation
    Given the user launches the application
    When user enters name "<name>"
    And user enters email "<email>"
    And user enters password "<password>"
    And user selects gender "<gender>"
    And user selects employment Status "<employmentStatus>"
    And user enters dob "<dob>"
    And user clicks on submit button
    Then mesage should be displayed as "<message>"

    Examples: 
      | name   | email                    | password | gender | employmentStatus | dob        | message                                             |
      | Eswar  | eswararao.bonu@gmail.com | Eswar    | Male   | Student          | 01-11-1992 | Success! The Form has been submitted successfully!. |
      | Rajesh | eswararao.bonu@gmail.com | Rajesh   | FeMale | Employed         | 18-12-1996 | Success! The Form has been submitted successfully!. |
      | Chinna | eswararao.bonu@gmail.com | Chinna   | Male   | Employed         | 18-08-1998 | Success! The Form has been submitted successfully!. |
      | Suresh | eswararao.bonu@gmail.com | Suresh   | FeMale | Employed         | 10-05-2004 | Success! The Form has been submitted successfully!. |
      | Random | eswararao.bonu@gmail.com | Random   | Male   | Student          | 16-06-2002 | Success! The Form has been submitted successfully!. |

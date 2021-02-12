Feature: Verify the Adacitin login page

  Scenario Outline: Verify the Adacitin login page with valid cedentials
    Given User is on Adacitin login page
    When User enters the valid "<UserName>" and "<PassWord>"
    Then User should click on login button
    When User is on Search hotel page enter the "<Location>","<Hotels>","<Number of rooms>","<Check in date>","<Check out date>","<Adults per room>"
    Then User should click on Search button
    Then user should click on First button and Continue button
    When User is on Book a hotel page enter the "<First name>","<Last name>","<Billing address>","<Credit card number>","<Credit card type>","<Expiry date>","<Expiry year>","<cvv number>"
    Then User Should note the Order no

    Examples: 
      | UserName  | PassWord  | Location | Hotels       | Number of rooms | Check in date | Check out date | Adults per room | First name | Last name  | Billing address | Credit card number | Credit card type | Expiry date | Expiry year | cvv number |
      | krishna25 | krish2510 | Sydney   | Hotel Hervey | 1 - One         | 01/01/2021    | 02/01/2021     | 1 - One         | Krishnan   | Srinivasan | Chennai         |   1564239856421356 | VISA             | February    |        2022 |        555 |

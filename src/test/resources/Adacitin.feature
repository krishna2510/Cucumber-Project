Feature: Verify the Adacitin login page

  Scenario: Verify the Adacitin login page with valid cedentials
    Given User is on Adacitin login page
    When User enters the valid UserName and PassWord
    |krishna25|krish2510|
    Then User should click on login button
    When User is on Search hotel page enter the Location,Hotels,Number of rooms,Check in date,Check out date,Adults per room
    |Sydney| Hotel Hervey|1 - One |01/01/2021 | 02/01/2021|1 - One  |
    Then User should click on Search button
    Then user should click on First button and Continue button
    When User is on Book a hotel page enter the First name,Last name,Billing address,Credit card number,Credit card type,Expiry date,Expiry year,cvv number
    |Krishnan|Srinivasan|Chennai|1564239856421356|VISA|February|2022|555|
    Then User Should note the Order no

    
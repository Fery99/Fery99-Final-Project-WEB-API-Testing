Feature: Test Automation Rest API

  #THIS CODE FOR EXAMPLE TEST.
#  @web
#  Scenario: Test web login normal
#    Given user go to login page
#    And user input username "Admin"
#    And user input pwd "admin123"
#    And user click button login
#    Then validation users can show side nav


  @web
  Scenario: User will create an  account
    Given user is on page
    When user click Sign Up  button
    And user input username with "Joni13"
    And user input password with "Secret99"
    When user clear register  & click SignUp  button
    Then user is on homepage

  @web
  Scenario: Login using valid email and password
    Given user is on page
    When user click Sign In Button
    And user input Login username with "Joni13"
    And user input Login  password with "Secret99"
    And  user click login button
    Then user is on homepage

  @web
  Scenario: user can contact customer service
    Given user is on page
    When user click Sign In Button
    And user input Login username with "Joni13"
    And user input Login  password with "Secret99"
    And  user click login button
    And user is on homepage
    And User Click contact
    And user input Email "ferysadewaa@gmail.com"
    And User input Contact  Name "Fery Sadewa"
    And User Input Message "Hello Can U Help Me Please?"
    Then User Click Send Message

  @web
  Scenario: User view list category of laptop
    Given user is on page
    When user click Sign In Button
    And user input Login username with "Joni13"
    And user input Login  password with "Secret99"
    And  user click login button
    And user is on homepage
    And user click category of laptop
    Then user can see list of laptop

  @web
  Scenario: User view list category of All Phone
    Given user is on page
    When user click Sign In Button
    And user input Login username with "Joni13"
    And user input Login  password with "Secret99"
    And  user click login button
    And user is on homepage
    And user click category of Phone
    Then user can see list of All Phone

  @web
  Scenario: User can see more detail of item selection
    Given user is on page
    When user click Sign In Button
    And user input Login username with "Joni13"
    And user input Login  password with "Secret99"
    And  user click login button
    And user is on homepage
    And user click item selection
    Then User can get more information from item selection

  @web
  Scenario: User can add item to chart
    Given user is on page
    When user click Sign In Button
    And user input Login username with "Joni13"
    And user input Login  password with "Secret99"
    And  user click login button
    And user is on homepage
    And user click item selection
    And User can get more information from item selection
    And user add item selection to chart
    And User click chart
    Then user can see add item selection on chart page


  @web
  Scenario: User buying item selection and clear Payment
    Given user is on page
    When user click Sign In Button
    And user input Login username with "Joni13"
    And user input Login  password with "Secret99"
    And  user click login button
    And user is on homepage
    And user click item selection
    And User can get more information from item selection
    And user add item selection to chart
    And User click chart
    And user can see add item selection on chart page
    And user click Place Order for clear register of  payment
    And user input name  with "Fery"
    And user input country with "Indonesia"
    And user input city  with "Jakarta"
    And user input Credit Card  with "2306888"
    And user input Month with "11"
    And user input Year with "2023"
    And User click Purchase
    Then user clear payment
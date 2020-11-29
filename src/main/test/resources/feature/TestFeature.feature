Feature: This is a demo feature

#TODO
# Add tests with data tables

  Scenario: Click Sign-up Link
    Given I am on homepage
    When I click on signin link
    Then I should be taken to signin page

  Scenario: User logs in successfully
    Given I am on homepage
    When I click on signin link
    And I fill email address field with my email "pubz87+1@gmail.com"
    And I fill password field with my password "pubz87"
    And I click login button
    Then I should be logged in

    #Fill Textbox
    #Click Button
  Scenario: User performs a search on home page by filling search text box
    Given I am on homepage
    When I fill search field with "t shirt"
    And I click search button
    Then a search result should be displayed

    #Click Link
  Scenario: User clicks on Women menu link
    Given I am on homepage
    When I click Women menu link
    Then I should be taken to Women category

    #Click Image
  Scenario: User clicks on an image
    Given  I am on homepage
    When I click on three days sale image
    Then I should be taken to external site

    #Text area
    #Check boxes
    #Multiselect menu
    #Button
    #TextBox
    #Link
  Scenario: User logs in and places an order from shopping cart
    Given I am on homepage
    And I am logged in
    When I click on T shirts menu link
    And I click on first item
    And I select item size
    And I select item colour
    And I click on Add to Cart Button
    And I click on Proceed to Checkout button from popup
    And I click on Proceed to Checkout button on Cart Summary Page
    And I fill text area with "some lengthy description here to fill text area"
    And I click on Proceed to Checkout button on Cart Address Page
    And I select Terms and service checkbox
    And I click on Proceed to Checkout button on step on Shipping Page
    And I click Bank Wire option
    And I click order confirmation button
    Then I should be taken to Order confirmation page
    And I should see order confirmation text

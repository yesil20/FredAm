@wip
Feature: Basket Functionality

  Scenario: Verify that user should be able to add a correct book to basket
    Given I am on the main page
    When I type "Glasgow A History" on search input and click on search button
    And I click "Glasgow A History" title
    And I click add to basket button
    Then "Glasgow A History" should be displayed on basket

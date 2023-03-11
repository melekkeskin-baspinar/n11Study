@test
Feature: First Question

  Scenario: Go Random Store Page
    Given User Open Stores Page
    When User Click All Stores
    When User Go Filter Stores Start "S" Letter
    Then User Should See to Opened Page Url Same Random Store Href
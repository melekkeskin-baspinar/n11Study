@test
Feature:Second Question

  Scenario: Search iPhone
    Given User Open Home Page
    Given User Search "iPhone"
    When User add first item
    When User add last item
    Then User Should See to Added Products In Basket
    When User Go to Checkout Page
    Then User Should See Check Out Products Same The Added Products
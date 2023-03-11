@test
Feature:Third Question

  Scenario: Search Telefon
    Given User Open Home Page
    Given User Search "telefon"
    When User Filter Search Result By Second Brand Name
    When User Sort Search Result By "Yorum sayısı"

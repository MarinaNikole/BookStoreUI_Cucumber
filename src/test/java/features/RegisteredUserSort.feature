@register_bookStoreSort
Feature: Sort

  Background: I`m in BookStore page
    Given I open Book Store
    When I follow Login Link
    And I input "Ronny" to userName field
    And I input "123Ron321&" to password field
    And I click the Login button
    Then I am on the Profile page

  @titleSort_A_Z
  Scenario: Sort books by title
    When I follow the Book Store Link
    Then I am on the Book Store Page
    When I click the Title Header
    Then I see the books sorted in A_Z order

  @titleSort_Z_A
  Scenario: Sort books by title
    When I follow the Book Store Link
    Then I am on the Book Store Page
    When I double click the Title Header
    Then I see the books sorted in Z_A order

  @authorSort_A_Z
  Scenario: Sort books by title
    When I follow the Book Store Link
    Then I am on the Book Store Page
    When I click the Author Header
    Then I see the books sorted by author in A_Z order

  @authorSort_Z_A
  Scenario: Sort books by title
    When I follow the Book Store Link
    Then I am on the Book Store Page
    When I double click the Author Header
    Then I see the books sorted by author in Z_A order

  @publisherSort_A_Z
  Scenario: Sort books by title
    When I follow the Book Store Link
    Then I am on the Book Store Page
    When I click the Publisher Header
    Then I see the books sorted by publisher in A_Z order

  @publisherSort_Z_A
  Scenario: Sort books by title
    When I follow the Book Store Link
    Then I am on the Book Store Page
    When I double click the Publisher Header
    Then I see the books sorted by publisher in Z_A order
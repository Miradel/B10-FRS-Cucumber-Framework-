@smoke

Feature: Smoke Tests

  Scenario:Verify that 'Inventory' tab is visible
    Given manager is on the landing page
    When manager clicks on BriteErpDemo button
    When the manager enters vaild email address
    And the manager enters vaild password
    And the manager cilicks Login button
    Then the mamnager should see Inventory tab on navigation bar

  @wi
  Scenario: Verify that sections under Inventory page is visible
    Given manager is on the landing page
    When manager clicks on BriteErpDemo button
    When the manager enters vaild email address
    And the manager enters vaild password
    And the manager cilicks Login button
    And the manager clicks Inventory tab on the navigation tab
    Then the manager should see following sections on the left nav bar:
      | Dashboard     |
      | Operations    |
      | Master Data   |
      | Reporting     |
      | Configuration |



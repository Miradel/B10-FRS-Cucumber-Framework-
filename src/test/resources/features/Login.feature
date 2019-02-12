@login
Feature: Login

  Scenario: Postive login test - Manager
    Given manager is on the landing page
    When manager clicks on BriteErpDemo button
    Then title should be Login Website localhost
    And the database should be "BriteErpDemo"
    When the manager enters vaild email address
    And the manager enters vaild password
    And the manager cilicks Login button
    Then the title should be Odoo


  @wip

  Scenario: Posstitive log in test -user
  Given user is on the landing page
  When user clicks on BritErpDemo button
  Then title should be "Odoo"
  And the database should be "BriteErpDemo"
  When the user enters vaild email address
  And the user enters vaild password
  And the user clicks log in button
  Then the title should be Odoo




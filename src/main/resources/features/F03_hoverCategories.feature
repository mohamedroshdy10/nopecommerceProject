Feature: user login could hover and choice multiple categories
Scenario: user hover categories and choose one of them
 When  Find the required element i.e. ‘Electronics ’ object in our sample
  And  Now move the mouse on ‘Electronics ’ option which will display the submenu list
  And  Find the required element i.e. ‘Cell phones ’ object in the sub menu list
  When Move mouse on ‘Cell phones ’ option which will display one more submenu list
  And  Find the required element i.e. ‘Nokia Lumia 1020’ object in submenu list
  Then Click on ‘Nokia Lumia 1020’

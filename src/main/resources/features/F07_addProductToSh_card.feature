Feature: user login can add product to shopping card
  Background: user login website
#    Given user go to login url
#    When user login with valid email and password
#    Then user click on the login button
  Scenario: logged user  click on the wishList element "HTC One M8 Android L 5.0 Lollipop"
    When user click wishlist and choose product"HTC One M8 Android L 5.0 Lollipop"
    Then user add item open page for the item and found details

  Scenario: logged user  click on the wishList element "Apple MacBook Pro 13-inch"
    When user click wishlist and choose product"Apple MacBook Pro 13-inch"
    Then user add item open page for the item and found details"Apple MacBook Pro 13-inch"url page
#    Then the item  selected successfully

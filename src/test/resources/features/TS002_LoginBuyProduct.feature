Feature: TS002 Login & Buy Product Functionality

  Scenario: TC001 Open the Site and Navigate to Login Page
    Given go to "BaseURL"
    When click Sign In link
    And type login "username" into email box
    And type login "password" into password box
    And click login button
    Then welcome message must be displayed

  Scenario: TC002 Navigate Menu and Select a Product Category
    When go to Women option
    And go to Tops option
    And click Jackets option
    Then page URL must contain "PartialProductURL"

  Scenario: TC003 Select Product
    When click Size option
    And select size M
    And select the first product

  Scenario: TC004 Add the Product to Cart
    When choose size M
    And choose color Blue
    And add product to cart
    And wait for 3 seconds
    Then the cart must contain 1 product

  Scenario: TC005 Go to Cart
    When click to Cart
    And click Proceed to Checkout button
    Then page URL must contain "PartialCheckoutURL"

  Scenario: TC006 Enter Shipping Details
    When type "addressStreet" into Street Address box
    And type "addressCity" into City Address box
    And select "addressCountry" as country
    And type "addressPostalCode" into Postal Code Address box
    And type "addressPhone" into Phone Address box
    And select "addressState" as state
    And wait for 3 seconds
    And click Next button
    Then page URL must contain "PartialPaymentURL"

  Scenario: TC007 Check Details and Place Order
    When wait for 3 seconds
    And click Place Order button
    Then page URL must contain "PartialSuccessURL"

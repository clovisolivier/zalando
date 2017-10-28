Feature: Add products in the shopping basket

 
 
Scenario: Add two products to the shopping backet
    When I open zalando website
	Then I go in my shopping backet 
 
Scenario: Add two products to the shopping backet
    When I open zalando website
	And I search shoes for men by navigation
	And I select a product in the list
	And I add this product to the shopping backet
	Then I go in my shopping backet
	And I check that I have 2 products in my shopping backet
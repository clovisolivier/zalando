Feature: Add products in the shopping basket

  Scenario: Add two products to the shopping basket
    When I open zalando website
	And I search shoes for men by navigation
	And I select a product in the list
	And I add this product to the shopping basket
	Then I search for a dress by research
	And I select a product in the list
	And I add this product to the shopping basket
	Then I go in my shopping basket
	And I check that I have 2 products in my shopping basket
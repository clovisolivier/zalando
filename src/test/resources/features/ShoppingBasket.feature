Feature: Add products in the shopping basket
		
Scenario: Add two distincts products to the shopping backet
    When I open zalando website
    And I search sunglass for men by navigation
	And I select a product in the list
	And I add this product to the shopping backet
	Then I go in my shopping backet
	And I check that I have 1 products in my shopping backet
	And I search a complement for men by navigation
	And I select a product in the list
	And I add this product to the shopping backet
	Then I go in my shopping backet
	And I check that I have 2 products in my shopping backet
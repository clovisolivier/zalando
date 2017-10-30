Feature: Add products in the shopping basket
		
		
			
Scenario: Add product twice to the shopping backet
    When I open zalando website
	And I search bag for women by research
	And I select a product in the list
	And I add this product to the shopping backet
	Then I go in my shopping backet
	And I check that I have all products in my shopping backet
	And I search bag for women by research
	And I select a product in the list
	And I add this product to the shopping backet
	Then I go in my shopping backet
	And I check that I have all products in my shopping backet
	
	Scenario: Add two distincts products to the shopping backet
    When I open zalando website
	And I search a complement for men by navigation
	And I select a product in the list
	And I add this product to the shopping backet
	Then I go in my shopping backet
	And I check that I have all products in my shopping backet
	And I search bag for women by research
	And I select a product in the list
	And I add this product to the shopping backet
	Then I go in my shopping backet
	And I check that I have all products in my shopping backet

	
	
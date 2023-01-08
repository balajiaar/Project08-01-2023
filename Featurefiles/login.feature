@Before
Feature: verify the adaction login functionality
Scenario Outline: check the login
Given user should be in adactin page
When user should enter the valid "<userName>" and "<passWord>"
And user should press the login button
Then user should receive the login sucess message"Hello Naveenaso!"
@positive
Examples:
|userName | passWord|
|Naveenaso| Naveenmech1!|
|balaji|bal123|

@Negative
Examples:
|userName | passWord|
|balaji|123|
|balaji1|456|


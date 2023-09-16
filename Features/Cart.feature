Feature: Cart Functionality

@Cart
Scenario: A user must be able to perform in the Cart

Given a user is in the LandingPage on Firstcry
When he login
And he search for Watches
And he clicks on first result
And he clicks on Add to Cart option
And he clicks on Cart option
And he click on Remove option
Then he must be able to see empty cart
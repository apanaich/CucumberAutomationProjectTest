Feature: Trivago Website Testing

 Background: User is at Trivago Room5 website

  @Test1
  Scenario: Search for a location on Room5 using search bar
     Given Open Browser and input the URL
    When correct link is open by the browser
    Then Click on search menu
    And Enter the location "England" to search hotels
    
   @Test2
   Scenario: Fill in the contact form and sent it
      Given Open Browser and input the URL
      When User click on the Contact web link
      Then Input your message
      And Input your Full Name
      And Input your Email Address
      And Tick the confirmation
      And Submit the button
      
   @Test3
   Scenario: Subscribe to the Newsletter
      Given Open Browser and input the URL
      When User search for newsletter option
      Then input email address
      And Submit the consent to receive newsletter


    @Test4
    Scenario: Navigate to the destination through the menu on the top left
        Given Open Browser and input the URL
        When User clicks on the menu button
        And Select a destination "Midwest"
        Then Verify he is navigated to correct destination
    
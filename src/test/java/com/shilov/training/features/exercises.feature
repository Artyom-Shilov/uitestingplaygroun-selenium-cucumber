Feature: implementation of exercises from uitestingplayground.com

  @DynamicId
  Scenario: click button with dynamic id
    Given dynamic id exercise page is opened
    Then user clicks button with dynamic id

  @ClassAttribute
  Scenario: click button by class attribute
    Given class attribute exercise page is opened
    When user clicks button by class attribute
    Then alert with text "Primary button pressed" appeared

  @HiddenLayer
  Scenario: click button on hidden layer
    Given hidden layer exercise page is opened
    When user clicks green button
    Then user clicks overlapping button

  @LoadDelay
  Scenario: click button after load delay
    Given load delay exercise page is opened
    Then user clicks button appearing after delay

Feature: implementation of exercises from uitestingplayground.com

  @DynamicId
  Scenario: Dynamic id exercise - click button with dynamic id
    Given dynamic id exercise page is opened
    Then user clicks button with dynamic id

  @ClassAttribute
  Scenario: Class attribute exercise - click button by class attribute
    Given class attribute exercise page is opened
    When user clicks button by class attribute
    Then alert with text "Primary button pressed" appeared

  @HiddenLayer
  Scenario: Hidden layer exercise - click button on hidden layer
    Given hidden layer exercise page is opened
    When user clicks green button
    Then user clicks overlapping button

  @LoadDelay
  Scenario: Load delay exercise - click button after load delay
    Given load delay exercise page is opened
    Then user clicks button appearing after delay

  @AJAXData
  Scenario: AJAX data exercise - get text from element appeared after ajax request
    Given ajax data exercise page is opened
    When user clicks ajax request trigger button
    Then text of appeared element should be "Data loaded with AJAX get request."

  @ClientSideDelay
  Scenario: Client side delay exercise - get text from element appeared after side delay
    Given client side delay exercise page is opened
    When user clicks delay client side trigger button
    Then text of appeared after client side delay element should be "Data calculated on the client side."

  @Click
  Scenario: Click exercise - click on button that ignores DOM click event
    Given click exercise page is opened
    When user clicks button that ignores DOM click event
    Then button that ignores DOM click event should change color to "#218838"


  @TextInput
  Scenario Outline: Text input exercise - input new name of button and apply it
    Given text input exercise page is opened
    When user enters new button name "<button name>"
    And user applies name
    Then button name should be changed to "<button name>"

    Examples:
    |button name|
    |test       |
    |new name   |


  @ProgressBar
  Scenario Outline: Progress bar exercise - start progress bar and stop it when it reaches certain value
    Given progress bar exercise page is opened
    When user clicks start bar button
    And user clicks stop button when bar reaches "<bar value>" value
    Then result value must be positive and less than 5

    Examples:
    |bar value|
    |75       |
    |76       |

  @DynamicTable
  Scenario: Dynamic table exercise -get text value of chrome CPU consumption from dynamic table
    Given dynamic table exercise is opened
    Then text value of chrome CPU consumption from dynamic table cell and label must be the same

  @Scrollbars
  Scenario: Scroll bars exercise -scroll to button and click it
    Given scrollbar exercise page is opened
    When user scrolls to hiding button
    Then user clicks hiding button

  @Visibility
  Scenario: Visibility exercise - using of different kinds of hiding and checking if buttons displayed or not
    Given visibility exercise page is opened
    When user clicks hide button
    Then display statuses of other buttons should be
    |opacity0Button        |false|
    |removedButton         |false|
    |visibilityHiddenButton|false|
    |zeroWidthButton       |false|
    |displayNoneButton     |false|
    |overlappedButton      |true|
    |offscreenButton       |false|


  @MouseOver
  Scenario: Mouse over exercise -Placing mouse over link and click it
    Given mouse over exercise page is opened
    When user moves mouse to link
    And user clicks two times
    Then click count should be 2


  @SampleAppLoginPositive
  @SampleApp
  Scenario: Sample app exercise - do login
    Given sample app exercise page is opened
    When user enters login "test user"
    And user enters password "pwd"
    And user clicks log in button
    Then login status should be "Welcome, test user!"

  @SampleAppLoginWithoutLogin
  @SampleApp
  Scenario: Sample app exercise - try to login without login input
    Given sample app exercise page is opened
    When user enters password "pwd"
    And user clicks log in button
    Then login status should be "Invalid username/password"

  @SampleAppLoginWithoutPassword
  @SampleApp
  Scenario: Sample app exercise - try to login without password input
    Given sample app exercise page is opened
    When user enters login "test-user"
    And user clicks log in button
    Then login status should be "Invalid username/password"

  @SampleAppLogout
  @SampleApp
  Scenario: Sample app exercise - do to logout
    Given sample app exercise page is opened
    And user did login
    When user clicks log out button
    Then login status should be "User logged out."



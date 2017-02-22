Feature: CurrencyRateInformer

  Scenario: Getting usage text
    When I execute app with params ""
    Then I see usage text

  Scenario: Getting currency providers list
    Given internet connection is ok
    When I execute app with params "--providers"
    Then I see currency list

  Scenario: Getting currency list of default provider fixer.io
    Given internet connection is ok
    When I execute app with params "--list"
    Then I see currency list

  Scenario: Getting currency rate
    Given internet connection is ok
    When I execute app with params "--from USD --to RUB"
    Then I see currency rate information

  Scenario: Getting currency rate from cache
    When I execute app with params "--from USD --to RUB"
    Then I see currency rate information
    And I see message "from cache"

  Scenario: Getting wrong params error message
    Given internet connection is ok
    When I execute app with params "--unknown-param"
    Then I see error message "unrecognized params"

  Scenario: Getting unknown currency error message
    Given internet connection is ok
    When I execute app with params "--from USD --to XXX"
    Then I see error message "unknown currency"
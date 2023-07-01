Feature: Empty first run

  @Run
  Scenario: Certificate
    When open page "https://certificate.ithillel.ua/"
    And Enter the certificate number "45924126"
    And Click the button
    Then check the result "true"
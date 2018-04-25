Feature:  This tests are created for weather testing

  Scenario: Testing coordinates
    When we are requesting weather
    Then LON should be -0.13
    And LAT should be 51.51



  Scenario: We are requesting main weather parameters
    When we are requesting main parameters
    Then TEMP should be 280.32
    And PRESSURE should be 1012
    And HUMIDITY should be 81
    And TEMP_MIN should be 279.15
    And TEMP_MAX should be 281.15



  Scenario: We are requesting wind parameters
    When we are requesting wind parameters
    Then SPEED should be 4.1
    And DEG should be 80



  Scenario: We are requesting cloud parameters
    When we are requesting cloud parameters
    Then ALL should be 90



  Scenario: We are requesting sys parameters
    When we are requesting sys parameters
    Then TYPE should be 1
    And ID should be 5091
    And MESSAGE should be 0.0103
    And COUNTRY should be GB
    And SUNRISE should be 1485762037
    And SUNSET should be 1485794875

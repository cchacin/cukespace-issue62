Feature:

  Scenario:
    When I make a GET call to "/test-app/ping" endpoint
    Then response status code should be 200
    And response content type should be "text/plain"
    And response should be json:
    """
    {
      "id": "${json-unit.ignore}",
      "created": "${json-unit.ignore}",
      "modified": "${json-unit.ignore}",
      "password": "",
      "fullname": ""
    }
    """

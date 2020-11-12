
Feature: POST request using /searchresult API

  Scenario Outline: Send a valid POST Request with empty Payload
     Given a POST "<Endpoint>" endpoint
    # When I send a request with JSON body from "<PayloadPath>"
    When I send a request with Empty JSON body
     Then I will be getting the successful <StatusCode> for POST searchResult
    Examples:
      | Endpoint | PayloadPath | StatusCode |
      | searchResults | /payloads/valid-search-criteria.json | 200 |

  Scenario Outline: Send a valid POST Request
    Given a POST "<Endpoint>" endpoint
    #When I send a request with JSON body from "<PayloadPath>"
    When I send a request with JSON body
    Then I will be getting the successful <StatusCode> for POST searchResult
    Examples:
      | Endpoint | PayloadPath | StatusCode |
      | searchResults | /payloads/valid-search-criteria.json | 404 |


Feature: Validating CRUD operation for User

  Scenario Outline: Verify a user is being added using CreateUserAPI
    Given Create user payload with "<id>" "<username>" "<firstName>" "<lastName>" "<email>" "<password>" "<phone>" "<userStatus>"
    When  Call "USER_RESOURCE" with "POST" request
    Then API call is success with status code 200
    And "id" in response body is "10"
    And "username" in response body is "testUserName"
    And "firstName" in response body is "testFirstName"
    And "lastName" in response body is "testLastName"
    And "email" in response body is "test@email.com"
    And "password" in response body is "testPassword"
    And "phone" in response body is "12345678"
    And "userStatus" in response body is "1"
    Examples:
    | id  | username       | firstName      | lastName        | email           | password      | phone           | userStatus |
    | 10  | testUserName   | testFirstName  | testLastName    | test@email.com  | testPassword  | 12345678        | 1          |


  Scenario: Get the user details using GetUserAPI
    Given "testUserName" is the path parameter
    When Call "USER_RESOURCE" with "GET" request
    Then API call is success with status code 200
    And "id" in response body is "10"
    And "username" in response body is "testUserName"
    And "firstName" in response body is "testFirstName"
    And "lastName" in response body is "testLastName"
    And "email" in response body is "test@email.com"
    And "password" in response body is "testPassword"
    And "phone" in response body is "12345678"
    And "userStatus" in response body is "1"

    @UpdateUser
  Scenario Outline: Verify a user is being updated using UpdateUserAPI
    Given Create user payload with "<id>" "<username>" "<firstName>" "<lastName>" "<email>" "<password>" "<phone>" "<userStatus>"
    When "testUserName" is the path parameter
    When  Call "USER_RESOURCE" with "PUT" request
    Then API call is success with status code 200
    And "id" in response body is "10"
    And "username" in response body is "testUserNameUpdated"
    And "firstName" in response body is "testFirstNameUpdated"
    And "lastName" in response body is "testLastNameUpdated"
    And "email" in response body is "testUpdated@email.com"
    And "password" in response body is "testPasswordUpdated"
    And "phone" in response body is "12345678"
    And "userStatus" in response body is "1"
    Examples:
      | id  | username              | firstName             | lastName               | email                  | password             | phone           | userStatus |
      | 10  | testUserNameUpdated   | testFirstNameUpdated  | testLastNameUpdated    | testUpdated@email.com  | testPasswordUpdated  | 12345678        | 1          |

  Scenario: Get the user details using GetUserAPI
    Given "testUserNameUpdated" is the path parameter
    When Call "USER_RESOURCE" with "GET" request
    Then API call is success with status code 200
    And "id" in response body is "10"
    And "username" in response body is "testUserNameUpdated"
    And "firstName" in response body is "testFirstNameUpdated"
    And "lastName" in response body is "testLastNameUpdated"
    And "email" in response body is "testUpdated@email.com"
    And "password" in response body is "testPasswordUpdated"
    And "phone" in response body is "12345678"
    And "userStatus" in response body is "1"

  Scenario: Delete the created user using DeleteUserAPI
    Given "testUserName" is the path parameter
    When Call "USER_RESOURCE" with "DELETE" request
    Then API call is success with status code 200


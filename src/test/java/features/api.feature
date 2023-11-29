Feature: Test Automation Rest API

  @api
  Scenario: Test get list user normal
    Given prepare url for "GET_LIST_USER"
    And hit api get list users
    Then validation status code is equals 200
    Then validation response body get list users
    Then validation response json with JSONSchema "get_list_users_normal.json"

 @api
  Scenario: Test create new user normal
    Given prepare url for "CREATE_NEW_USER"
    And hit api post create new users
    Then validation status code is equals 200
    Then validation response body post create new user
    Then validation response json with JSONSchema "post_create_user_normal.json"


  @api
  Scenario: Test delete user normal
    Given prepare url for "CREATE_NEW_USER"
    And hit api post create new users
    Then validation status code is equals 200
    Then validation response body post create new user
    Given prepare url for "DELETE_USER"
    And hit api delete new
    Then validation status code is equals 200

  @api
  Scenario: Test put user normal
    Given prepare url for "CREATE_NEW_USER"
    And hit api post create new users
    And validation status code is equals 200
    And validation response body post create new user
    Given prepare url for "PUT_USER"
    And hit api put
    And validation status code is equals 200
    When validation response body put edit  user
    Then validation response json with JSONSchema "put_edit_user_normal.json"

  @api
  Scenario: Test get tag user normal
    Given prepare url for "TAG_USER"
    And hit api get tag users
    Then validation status code is equals 200
    Then validation response json with JSONSchema "get_tag_users_normal.json"
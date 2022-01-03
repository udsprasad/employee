Feature: Testing a REST API
  Users should be able to submit GET and POST requests to a web service

  Scenario: Using Post request get the Employees Details By Department
    When users upload Department data details on a project
    Then the server should handle it and return a success status

  Scenario: Using Get request get The Employee details By EmployeeId
    When users want to get Employee information with EmployeeId
    Then the requested data is returned

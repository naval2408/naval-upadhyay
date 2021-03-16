# Readme
A simple framework built on top of RestAssured for testing  the Users controller in Use the Swagger Petstore Sample training tool.</br>

## Setting up the Swagger Petstore Sample training tool
Set up your environment as explained in the [readme](https://github.com/swagger-api/swagger-petstore).

## How to run the test cases
The tests can be run via a maven command : 

 - mvn test verify

After the run, a HTML report is generated in the target folder at path :

 - target/cucumber-html-reports/overview-features.html

## Project Structure

 - Using the APIs, the CRUD flows have been automated for Users controller. They are present at the path : src/test/java/features/crudTests.feature
 - The framework is written in a BDD approach using Cucumber. The aim here was to increase the readability of tests.
 - Code is modular and configuration driven.
 - JUnit is used as test runner as it can be easily integrated with Cucumber.
 - HTML reporting is implemented using maven-cucumber-reporting plugin.
 - Request/Responses are logged in logs.txt file.

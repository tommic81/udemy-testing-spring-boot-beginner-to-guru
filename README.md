# Testing SpringBoot Beginner to Guru

#### Introduction to Testing Software

##### Common Testing frameworks

- JUnit
  - The most popular testing framework for Java.
  - Currently JUnit 4 is widely used in the
    industry
  - JUnit 5 was released in September of 2017
  - Rapidly gaining popularity
  - JUnit 5 will be the primary focus in this
    course
  - Section for migrating from JUnit 4 to 5

- TestNG
  - Created by Cédric Beust in 2004 as an
    alternative to JUnit
  - Cédric wished to address deficiencies in JUnit
  - Functionality of TestNG and JUnit have
    evolved to be very close.
  - Still popular, but much smaller base
  - Currently not covered in this course

- Spock
  - Testing Framework in Groovy for testing Java
  - Does require knowledge of Groovy
  - Follows BDD approach
  - Includes own Mocking framework
  - Subject of my 2013 Talk at Spring One
  - Very popular where Groovy is used

- Cucumber
  - BDD Testing Framework
  - Available for Java, Javascript, and Ruby
  - Very popular in Ruby community
  - Gaining popularity in Java community
  - Uses Gherkin syntax
  - Natural English like syntax
  - Describe the what, not the how
- Mockito
  - Mocking framework for testing
  - Only does mocks
  - Need to use with testing framework such
    as JUnit or TestNG
  - Top 10 Java Library
  - Very popular for testing Spring applications
  - Will be covered in this course
- Spring MVC Test
  - Testing module found in the Spring
    Framework
  - Very versatile for testing Spring MVC
    Controllers
  - Provides mock Servlet environment
  - Used in conjunction with a testing
    framework such as JUnit, TestNG, or Spock

- REST Assured
  - Java framework for testing RESTful web
    services
  - Provides very powerful DSL for testing
    Restful interfaces
  - Can be used with Spring Mock MVC
  - Tests follow a BDD Syntax

- Selenium
  - Web Browser Automation
  - Allows you to write functional tests against
    web applications
  - Only Web Browser Automation
  - Need to use a Testing Framework such as
    JUnit, TestNG, or Spock

- GEB
  - Groovy Browser Automation
  - Uses Selenium under the covers
  - Has JQuery-ish page element selectors
  - Needs to be used with a Test Framework
  - Very popular to use with Spock

- Test Containers
  - Allows you to launch Docker containers from
    JUnit Tests
  - Allows you to start databases, message
    brokers, etc for integration and functional
    tests.
  - Can be combined with Selenium for testing
    web applications

##### Beyond Testing with CI / CD

###### CI - Continuous Integration

**Continuous Integration (CI)** is a development practice that requires developers to integrate
code into a shared repository several times a day. Each check-in is then verified by an automated build, allowing teams to detect problems early.

###### CI Practices

- CI Practices per Martin Fowler:
  - Maintain a Single Source Repository
  - Automate Build
  - Make Your Build Self-Testing
  - Every Commit Should Build on Integration
    Machine
  - Fix Broken Builds Immediately
  - Keep the build fast
  - Test in a Clone of the Production
    Environment
  - Make it Easy for Anyone to get the Latest
    Executable Version
  - Everyone Can See What is Happening

###### Common CI Build Servers

- Self-Hosted:
  - Jenkins, Bamboo, TeamCity, Hudson

- Cloud Based:
  - CircleCI, TravisCI, Codeship, GitLab CI, AWS CodeBuild
  - And many, many more

###### CD - Continuous Deployment

- Continuous Deployment will automatically deploy build artifacts after all CI tests have run.
- Should Happen with every Commit
- Completely Automated
- May Include a Staging Area from which Additional Automated Tests are run
- Easily Confused with Continuous Delivery
- Example: AWS CodePipeline

###### CD - Continuous Delivery

- Process to Automatically Deliver code changes directly to the Production Environment
- Involves a High Degree of Automation in Testing and Deployment
- Must have a *VERY* Mature Process
- Can be Difficult in Some Industries due to Regulatory Requirements
- This area is evolving.

#### TDD By Example

##### Multi Currency Money

###### TO-DO List

- $5 + 10 CHF = $10 (with rate of 2:1)
- $5 * 2 = $10
- Make “amount” private
- Dollar side effects?
- Money Rounding?

###### Technical Requirements For Report

- Need to be able to add amounts in two different currencies and convert result given a set of exchange rates
- Need to be able to multiply an amount by a number (number of shares) and receive an amount

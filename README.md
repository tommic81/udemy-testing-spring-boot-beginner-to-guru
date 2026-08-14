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

## Test Driven Development By Example
### TDD By Example

#### Multi Currency Money

##### TO-DO List

- $5 + 10 CHF = $10 (with rate of 2:1)
- **$5 * 2 = $10**
- Make “amount” private
- Dollar side effects?
- Money Rounding?

##### Technical Requirements For Report

- Need to be able to add amounts in two different currencies and convert result given a set of exchange rates
- Need to be able to multiply an amount by a number (number of shares) and receive an amount

##### Steps of TDD
1. Made List of Test we needed - To-Do List
2.  Told a story about how we wanted to view one operation (in test)
3.  Ignored details of JUnit
4.  Made test compile with stubs (minimal code)
5.  Made test run with awful AWFUL code
6. Gradually updated working code - replacing constants with variables


#### Degenerate Objects

##### TO-DO List
- $5 + 10 CHF = $10 (with rate of 2:1)
- ~~$5 * 2 = $10~~
- Make “amount” private
- **Dollar side effects?**
- Money Rounding

#### Equality for All
##### TO-DO List
- $5 + 10 CHF = $10 (with rate of 2:1)
- ~~$5 * 2 = $10~~
- Make “amount” private
- ~~Dollar side effects?~~
- Money Rounding?
- **equals()**
- hashCode()
- Equal Null


#### Privacy
##### TO-DO List
- 5 + 10 CHF = $10 (with rate of 2:1)
- ~~$5 * 2 = $10~~
- **Make “amount” private**
- ~~Dollar side effects?~~
- Money Rounding?
- equals()
- ~~hashCode()~~
- Equal Null

#### Frank
##### TO-DO List
- $5 + 10 CHF = $10 (with rate of 2:1)
- ~~$5 * 2 = $10~~
- ~~Make “amount” private~~
- ~~Dollar side effects?~~
- Money Rounding?
- ~~equals()~~
- hashCode()
- Equal Null
- Equal Object
- **5 CHF * 2 = 10 CHF**

#### Equality for All - refactor
##### TO-DO List
- $5 + 10 CHF = $10 (with rate of 2:1)
- ~~$5 * 2 = $10~~
- ~~Make “amount” private~~
- ~~Dollar side effects?~~
- Money Rounding?
- ~~equals()~~
- hashCode()
- Equal Null
- Equal Object
- ~~5 CHF * 2 = 10 CHF~~
- Dollar/Franc Duplication
- **Common equals()**
- Common times()

#### Apples and Oranges
##### TO-DO List
- $5 + 10 CHF = $10 (with rate of 2:1)
- ~~$5 * 2 = $10~~
- ~~Make “amount” private~~
- ~~Dollar side effects?~~
- Money Rounding?
- ~~equals()~~
- hashCode()
- Equal Null
- Equal Object
- ~~5 CHF * 2 = 10 CHF~~
- Dollar/Franc Duplication
- ~~Common equals()~~
- Common times()
- **Compare Francs With Dollars**

#### Making Objects
##### TO-DO List
- $5 + 10 CHF = $10 (with rate of 2:1)
- ~~$5 * 2 = $10~~
- ~~Make “amount” private~~
- ~~Dollar side effects?~~
- Money Rounding?
- ~~equals()~~
- hashCode()
- Equal Null
- Equal Object
- ~~5 CHF * 2 = 10 CHF~~
- **Dollar/Franc Duplication**
- ~~Common equals()~~
- Common times()
- ~~Compare Francs With Dollars~~
- Currency

#### Times We’re Livin’ In
##### TO-DO List
- $5 + 10 CHF = $10 (with rate of 2:1)
- ~~$5 * 2 = $10~~
- ~~Make “amount” private~~
- ~~Dollar side effects?~~
- Money Rounding?
- ~~equals()~~
- hashCode()
- Equal Null
- Equal Object
- ~~5 CHF * 2 = 10 CHF~~
- ~~Dollar/Franc Duplication~~
- ~~Common equals()~~
- Common times()
- ~~Compare Francs With Dollars~~
- **Currency**
- Delete testFrancMultiplication?

#### Interesting Times
##### TO-DO List
- $5 + 10 CHF = $10 (with rate of 2:1)
- ~~$5 * 2 = $10~~
- ~~Make “amount” private~~
- ~~Dollar side effects?~~
- Money Rounding?
- ~~equals()~~
- hashCode()
- Equal Null
- Equal Object
- ~~5 CHF * 2 = 10 CHF~~
- Dollar/Franc Duplication
- ~~Common equals()~~
- **Common times()**
- ~~Compare Francs With Dollars~~
- ~~Currency~~
- Delete testFrancMultiplication?
- 
#### The Root of All Evil
##### TO-DO List
- $5 + 10 CHF = $10 (with rate of 2:1)
- ~~$5 * 2 = $10~~
- ~~Make “amount” private~~
- ~~Dollar side effects?~~
- Money Rounding?
- ~~equals()~~
- hashCode()
- Equal Null
- Equal Object
- ~~5 CHF * 2 = 10 CHF~~
- **Dollar/Franc Duplication**
- ~~Common equals()~~
- ~~Common times()~~
- ~~Compare Francs With Dollars~~
- ~~Currency~~
- ~~Delete testFrancMultiplication?~~

#### Addition, Finally
- Starting with a simpler example of $5 + $5 = $10
- Solution needs to allow for multiple exchange rates
- Operations will result in “expressions”
- Expressions get reduced to a value
- Introducing the concept of a ‘Bank’ - which sets exchange rates
- Our ‘Bank’ will perform the reduction operation
- In this section we will only setup our object model and initial tests

##### TO-DO List
- **$5 + 10 CHF = $10 (with rate of 2:1)**
- ~~$5 * 2 = $10~~
- ~~Make “amount” private~~
- ~~Dollar side effects?~~
- Money Rounding?
- ~~equals()~~
- hashCode()
- Equal Null
- Equal Object
- ~~5 CHF * 2 = 10 CHF~~
- ~~Dollar/Franc Duplication~~
- ~~Common equals()~~
- ~~Common times()~~
- ~~Compare Francs With Dollars~~
- ~~Currency~~
- ~~Delete testFrancMultiplication?~~

#### Make It
- Remove fake implementation
- Long term Return a Money object from plus operation
- Terms:
  - Augend - First value in an addition operation. The ‘3’ in 3 + 6.
  - Addend - Second value in an addition operation. The ‘6’ in 3 + 6.
- Introduce Sum object - implementation of Expression
  - Will have two properties - a Money Augend, and a Money Addend
- Implement reduce operation on Bank (currently fake)
  - Create initial implementation
  - Refactor to make implementation cleaner
##### TO-DO List
- $5 + 10 CHF = $10 (with rate of 2:1)
- $5 + $5 = $10
- Return Money from $5 + $5
- **Bank.reduce(Money)**
- ~~$5 * 2 = $10~~
- ~~Make “amount” private~~
- ~~Dollar side effects?~~
- Money Rounding?
- ~~equals()~~
- hashCode()
- Equal Null Equal Object
- ~~5 CHF * 2 = 10 CHF~~
- ~~Dollar/Franc Duplication~~
- ~~Common equals()~~
- ~~Common times()~~
- ~~Compare Francs With Dollars~~
- ~~Currency~~
- ~~Delete testFrancMultiplication?~~

#### Change
- Create object ‘Pair’ to represent currency pairs
  - Will need Equals and Hashcode since object will be used as key
- Add rate to Bank - From Currency, To Currency, conversion rate
  - Examples in book use HashTable - circa Java 1.2
  - We will implement using HashMap (Threadsafety not needed in our example)
    - If Threadsafety was needed, we could use ConcurrentHashMap
  - Need method to return rate for given from / to currency codes
  - Need Add rate method
- Change Expression.reduce method to accept bank
  - Change Money / Sum reduce methods to accept Bank parameter in reduce method
  - Change Money to use rate in reduce method
##### TO-DO List
- $5 + 10 CHF = $10 (with rate of 2:1)
- ~~$5 + $5 = $10~~
- Return Money from $5 + $5
- ~~Reduce Money with Conversion~~
- ~~Bank.reduce(Money)~~
- ~~$5 * 2 = $10~~
- ~~Make “amount” private~~
- ~~Dollar side effects?~~
- Money Rounding?
- equals()
- hashCode()
- Equal Null Equal Object
- ~~5 CHF * 2 = 10 CHF~~
- ~~Dollar/Franc Duplication~~
- ~~Common equals()~~
- ~~Common times()~~
- ~~Compare Francs With Dollars~~
- ~~Currency~~
- ~~Delete testFrancMultiplication?~~
#### Mixed Currencies
- Sum needs to use Bank.reduce
  - Money Objects can be Expressions
  - Money in Sum can be Expressions
  - Money Plus can accept Expression
  - Expression should have plus() and times()
  
##### TO-DO List
- ~~$5 + 10 CHF = $10 (with rate of 2:1)~~
- ~~$5 + $5 = $10~~
- Return Money from $5 + $5
- Sum.plus
- Expression.times
- ~~Reduce Money with Conversion~~
- ~~Bank.reduce(Money)~~
- ~~$5 * 2 = $10~~
- ~~Make “amount” private~~
- ~~Dollar side effects?~~
- Money Rounding?
- equals()
- hashCode()
- Equal Null Equal Object
- ~~5 CHF * 2 = 10 CHF~~
- ~~Dollar/Franc Duplication~~
- ~~Common equals()~~
- ~~Common times()~~
- ~~Compare Francs With Dollars~~
- ~~Currency~~
- ~~Delete testFrancMultiplication?~~

#### Abstraction, Finally
- Implement Plus on Sum
- Add times to Expression
- Implement times on Sum
- ##### TO-DO List
- ~~$5 + 10 CHF = $10 (with rate of 2:1)~~
- ~~$5 + $5 = $10~~
- ~~Return Money from $5 + $5~~
- ~~Sum.plus~~
- ~~Expression.times~~
- ~~Reduce Money with Conversion~~
- ~~Bank.reduce(Money)~~
- ~~$5 * 2 = $10~~
- ~~Make “amount” private~~
- ~~Dollar side effects?~~
- Money Rounding?
- equals()
- hashCode()
- Equal Null Equal Object
- ~~5 CHF * 2 = 10 CHF~~
- ~~Dollar/Franc Duplication~~
- ~~Common equals()~~
- ~~Common times()~~
- ~~Compare Francs With Dollars~~
- ~~Currency~~
- ~~Delete testFrancMultiplication?~~

## Getting Started with JUnit5
### Introduction to JUnit5
- Goals of JUnit 5
  - Leverage features of Java 8
  - Lambda expressions
  - Streams
  - Java 8 or higher is required
  - Redesigned for better integration and extensibility
- JUnit 5 Modules
  - JUnit Platform - The foundation for launching testing frameworks on the JVM. Allows tests to be run from a Console Launcher, or build tools such as Maven and Gradle
  - JUnit Jupiter - Programming model for writing tests and extensions to JUnit
  - JUnit Vintage - Provides a test engine for running JUnit 3 and JUnit 4 tests
- JUnit Annotations

|Annotation|Description|
|----------|-----------|
|@Test|Marks a method as a test method|
|@ParameterizedTest|Marks method as a parameterized test|
|@RepeatedTest|Repeat test N times|
|@TestFactory|Test Factory method for dynamic tests|
|@TestInstance|Used to configure test instance lifecycle|
|@TestTemplate|Creates a template to be used by multiple test cases|
|@DisplayName|Human friendly name for test|
|@BeforeEach|Method to run before each test case|
|@AfterEach|Method to run after each test case|
|@BeforeAll|Static method to run before all test cases in current class|
|@AfterAll|Static method to run after all test cases in current class|
|@Nested|Creates a nested test class|
|@Tag|Declare ‘tags’ for filtering tests|
|@Disabled|Disable test or test class|
|@ExtendWith|Used to register extensions|

## Testing Java with JUnit 5
### JUnit Grouped Assertions
- `assertAll()` - groups assertions
```java
    @Test
    void groupedAssertions(){
        //given
        Person person = new Person(1l, "Joe", "Buck");

        //then
        assertAll("Test Props Set",
                () -> assertEquals( "Joe", person.getFirstName()),
                () -> assertEquals( "Buck", person.getLastName()));
    }

    @Test
    void groupedAssertionsMsgs(){
        //given
        Person person = new Person(1l, "Joe", "Buck");

        //then
        assertAll("Test Props Set",
                () -> assertEquals("Joe", person.getFirstName(),  "First Name Failed"),
                () -> assertEquals("Buck", person.getLastName(),  "Last Name Failed"));
    }
```
### JUnit Dependent Assertions
```
    assertAll("Properties Test",
                () -> assertAll("Person Properties",
                        () -> assertEquals("Joe", owner.getFirstName(), "First Name Did not Match"),
                        () -> assertEquals("Buck", owner.getLastName())),
                () -> assertAll("Owner Properties",
                        () -> assertEquals("Key West", owner.getCity(), "City Did Not Match"),
                        () -> assertEquals("1231231234", owner.getTelephone())
                ));
```
### Skipping JUnit Tests
- ` @Disabled` annotation switches off a test method or the whole class

### JUnit Test Display Names
- ` @DisplayName("Test Proper View name is returned for index page")` -rename a test's method in the results

### Testing expected exceptions
```java
   assertThrows(ValueNotFoundException.class, () -> {
            controller.oopsHandler();
        });
```
### Testing Timeouts
```java
     assertTimeout(Duration.ofMillis(100), () -> {
            Thread.sleep(5000);

            System.out.println("I got here");
        });
```
### Junit Assumptions
- Throws `org.opentest4j.TestAbortedException` instead of failing a test

```
   @Test
    void testAssumptionTrue() {
        assumeTrue("GURU".equalsIgnoreCase(System.getenv("GURU_RUNTIME")));
    }
```
### Conditional JUnit Test Execution
```java
 @EnabledOnOs(OS.MAC)
    @Test
    void testMeOnMacOS() {
    }

    @EnabledOnOs(OS.WINDOWS)
    @Test
    void testMeOnWindows() {
    }

    @EnabledOnJre(JRE.JAVA_8)
    @Test
    void testMeOnJava8() {
    }

    @EnabledOnJre(JRE.JAVA_11)
    @Test
    void testMeOnJava11() {
    }

    @EnabledIfEnvironmentVariable(named = "USER", matches = "jt")
    @Test
    void testIfUserJT() {
    }

    @EnabledIfEnvironmentVariable(named = "USER", matches = "fred")
    @Test
    void testIfUserFred() {
    }
```
### Using AssertJ with JUnit
```xml
   <dependency>
       <groupId>org.assertj</groupId>
       <artifactId>assertj-core</artifactId>
       <version>3.11.1</version>
       <scope>test</scope>
   </dependency>
```

### Using Hamcrest with JUnit
```xml
        <dependency>
            <groupId>org.hamcrest</groupId>
            <artifactId>hamcrest-library</artifactId>
            <version>1.3</version>
            <scope>test</scope>
        </dependency>
```
```java
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

 @Test
 void dependentAssertions() {
	assertThat(owner.getCity(), is("Key West"));

}
```

## Advanced JUnit Testing
### Tagging and Filtering JUnit Tests
- In run configuration we can set **Tags** for which we want to run the tests
```
@Tag("controllers")
class IndexControllerTest {
}


```
### JUnit Nested Tests
- ` @Nested` we use it when test class is nested in another test class

```
   @DisplayName("Save Owners Tests - ")
            @Nested
            class FindOwnersTests {

                @DisplayName("Find Owner")
                @Test
                void findOwner() {

                    Owner foundOwner = ownerMapService.findById(1L);

                    assertThat(foundOwner).isNotNull();
                }

                @DisplayName("Find Owner Not Found")
                @Test
                void findOwnerNotFound() {

                    Owner foundOwner = ownerMapService.findById(2L);

                    assertThat(foundOwner).isNull();
                }
            }
```

### JUnit Test Interfaces
- We can define common properties in the interfaces and than implement them by test classes

### Using JUnit Default Test Methods
```
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@Tag("controllers")
public interface ControllerTests {

    @BeforeAll
    default void beforeAll(){
        System.out.println("Lets do something here");
    }
}
```

### Repeating Tests with JUnit 5
```
  @RepeatedTest(value = 10, name = "{displayName} : {currentRepetition} - {totalRepetitions}")
    @DisplayName("My Repeated Test")
    void myRepeatedTest() {
        //todo - impl
    }
```

### JUnit Test Dependency Injection

#### Parameter Resolver
- JUnit 5 Defines a Parameter Resolver API to resolve parameters at runtime
- Allows JUnit to inject parameters into test methods
- While extensible, there are 3 built in resolvers:
  - TestInfo - Provides information about the test name, method, test class, test tags
  - RepetitionInfo - Provides Information about the test repetition
  - TestReporter - Allows you to publish runtime information for test reporting
  
```java
@RepeatedTest(5)
    void myRepeatedTestWithDI(TestInfo testInfo, RepetitionInfo repetitionInfo) {
        System.out.println(testInfo.getDisplayName() + ": " + repetitionInfo.getCurrentRepetition());
    }
```
### JUnit Parameterized Tests - Value Source
```xml
   <dependency>
  	<groupId>org.junit.jupiter</groupId>
   	<artifactId>junit-jupiter-params</artifactId>
   	<version>${junit-platform.version}</version>
   </dependency>
```

```java
@ParameterizedTest
@ValueSource(strings = {"Spring", "Framework", "Guru"})
void testValueSource(String val) {
	System.out.println(val);
}
```
### JUnit Parameterized Tests - Display Name
```java
  @DisplayName("Value Source Test")
    @ParameterizedTest(name = "{displayName} - [{index}] {arguments}")
    @ValueSource(strings = {"Spring", "Framework", "Guru"})
    void testValueSource(String val) {
        System.out.println(val);
    }
```

### JUnit Parameterized Tests - ENUM Source
- Parameters are taken from Enum
```java
  @DisplayName("Enum Source Test")
    @ParameterizedTest(name = "{displayName} - [{index}] {arguments}")
    @EnumSource(OwnerType.class)
    void enumTest(OwnerType ownerType) {
        System.out.println(ownerType);
    }
```
### JUnit Parameterized Tests - CVS Source
```java
    @DisplayName("CSV Input Test")
    @ParameterizedTest(name = "{displayName} - [{index}] {arguments}")
    @CsvSource({
            "FL, 1, 1",
            "OH, 2, 2",
            "MI, 3, 1"
    })
    void csvInputTest(String stateName, int val1, int val2) {
        System.out.println(stateName + " = " + val1 + ":" + val2);
    }
```
### JUnit Parameterized Tests - CVS File Source
```java
@DisplayName("CSV From File Test")
@ParameterizedTest(name = "{displayName} - [{index}] {arguments}")
@CsvFileSource(resources = "/input.csv", numLinesToSkip = 1)
void csvFromFileTest(String stateName, int val1, int val2) {
	System.out.println(stateName + " = " + val1 + ":" + val2);
}
```

### JUnit Parameterized Tests - Method Provider
```java
@DisplayName("Method Provider Test")
@ParameterizedTest(name = "{displayName} - [{index}] {arguments}")
@MethodSource("getargs")
void fromMethodTest(String stateName, int val1, int val2) {
	System.out.println(stateName + " = " + val1 + ":" + val2);
}

static Stream<Arguments> getargs() {
	return Stream.of(
	    Arguments.of("FL", 5, 1),
	    Arguments.of("OH", 2, 8),
	    Arguments.of("MI", 3, 5));
}
```
### JUnit Parameterized Tests - Custom Provider
- You can add a class implementing `ArgumentsProvider`

```
public class CustomArgsProvider implements ArgumentsProvider {
	@Override
	public Stream<? extends Arguments> provideArguments(ExtensionContext 	extensionContext) throws Exception {
        return Stream.of(
                Arguments.of("FL", 7, 10),
                Arguments.of("OH", 11, 42),
                Arguments.of("MI", 44, 77));
    }
}
```
```
@DisplayName("Custom Provider Test")
@ParameterizedTest(name = "{displayName} - [{index}] {arguments}")
@ArgumentsSource(CustomArgsProvider.class)
void fromCustomProviderTest(String stateName, int val1, int val2) {
	System.out.println(stateName + " = " + val1 + ":" + val2);
}
```
### Unit Tests vs Integration Tests
- We should name integration tests with **IT** suffix. They will be executed differently then unit test by Maven.

```
public class PetTypeSDJpaServiceIT {}
```

### JUnit Exentions
- definition: 
```java
public class TimingExtension implements BeforeTestExecutionCallback, AfterTestExecutionCallback {
    private static final Logger logger = Logger.getLogger(TimingExtension.class.getName());

    private static final String START_TIME = "start time";

    @Override
    public void beforeTestExecution(ExtensionContext context) throws Exception {
        getStore(context).put(START_TIME, System.currentTimeMillis());
    }

    @Override
    public void afterTestExecution(ExtensionContext context) throws Exception {
        Method testMethod = context.getRequiredTestMethod();
        long startTime = getStore(context).remove(START_TIME, long.class);
        long duration = System.currentTimeMillis() - startTime;

        logger.info(() -> String.format("Method [%s] took %s ms.", testMethod.getName(), duration));
    }

    private ExtensionContext.Store getStore(ExtensionContext context) {
        return context.getStore(ExtensionContext.Namespace.create(getClass(), context.getRequiredTestMethod()));
    }
}
```

- usage:
```
@ExtendWith(TimingExtension.class)
public class PetTypeSDJpaServiceIT {}
```

## Test Execution
### Maven Surefire Plugin
- Runs unit tests in **Test** phase

```xml
<plugin>
	<groupId>org.apache.maven.plugins</groupId>
	<artifactId>maven-surefire-plugin</artifactId>
	<version>2.22.0</version>
	<configuration>
		<argLine>
	       --illegal-access=permit
		</argLine>
	</configuration>
</plugin>
```
### Maven Failsafe Plugin
- Runs integration tests in **Verify** phase

```xml
<plugin>
	<groupId>org.apache.maven.plugins</groupId>
	<artifactId>maven-failsafe-plugin</artifactId>
	<version>2.22.0</version>
	<configuration>
		<argLine>
	        --illegal-access=permit
		</argLine>
	</configuration>
	<executions>
		<execution>
			<goals>
		 		<goal>integration-test</goal>
				<goal>verify</goal>
			</goals>
		</execution>
	</executions>
</plugin>
```
### Maven SurefireTest Reporting
- HTML report will be generated in **SITE** directory
```xml
 	<build>
  		<plugins>
            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-site-plugin</artifactId>
                <version>3.7.1</version>
            </plugin>
        </plugins>
    </build>
    <reporting>
        <plugins>
            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-surefire-report-plugin</artifactId>
                <version>2.22.0</version>
            </plugin>
        </plugins>
    </reporting>
```
### Executing JUnit Test with Tags in Maven
- [JUnit5 Tags](https://docs.junit.org/5.14.4/running-tests/tags.html)
- [Filtering by Tags](https://docs.junit.org/5.14.4/running-tests/build-support.html#maven-filter-tags)

```
  <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-compiler-plugin</artifactId>
                <version>3.8.0</version>
            </plugin>
            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-surefire-plugin</artifactId>
                <version>2.22.0</version>
                <configuration>
                    <argLine>
                        --illegal-access=permit
                    </argLine>
                    <!--<groups>model</groups>-->
                    <!--<excludedGroups>controllers</excludedGroups>-->
                </configuration>
            </plugin>
```

### Running Tests from CI Builds With Maven
- [CircleCI](https://circleci.com/integrations/github/)
- config.yml
```yml
# Java Maven CircleCI 2.0 configuration file
#
# Check https://circleci.com/docs/2.0/language-java/ for more details
#
version: 2
jobs:
    build:
        docker:
            # specify the version you desire here
            - image: circleci/openjdk:11-browsers-legacy

            # Specify service dependencies here if necessary
            # CircleCI maintains a library of pre-built images
            # documented at https://circleci.com/docs/2.0/circleci-images/
            # - image: circleci/postgres:9.4

        working_directory: ~/repo

        environment:
            # Customize the JVM maximum heap limit
            MAVEN_OPTS: -Xmx3200m

        steps:
            - checkout

            # Download and cache dependencies
            - restore_cache:
                  keys:
                      - v1-dependencies-{{ checksum "pom.xml" }}
                      # fallback to using the latest cache if no exact match is found
                      - v1-dependencies-

            - run: mvn dependency:go-offline

            - save_cache:
                  paths:
                      - ~/.m2
                  key: v1-dependencies-{{ checksum "pom.xml" }}

            # run tests!
            - run: mvn integration-test


```

### Running JUnit Tests from Gradle
- In Settings / Build Tools / Gradle - use wrapper 

```
 ./gradlew clean test
```

### Integration Tests with Gradle
- [Getting Started With Gradle: Integration Testing](https://www.petrikainulainen.net/programming/gradle/getting-started-with-gradle-integration-testing/)

### Gradle JUnit test reports
- find html report under : **/build/reports/tests/test/index.html**

## JUnit 4 to JUnit 5 Migration Guide
### JUnit 4 Example Project
- junit4-legacy-app
### Differences Between JUnit 4 and JUnit 5
- Test Annotations

|JUnit 4|JUnit 5|
|--------|-----------|
| @Before|@BeforeEach|
| @After|@AfterEach|
| @BeforeClass|@BeforeAll|
| @AfterClass|@AfterAll|
| @Ignored|@Disabled|
| @Category|@Tag|
| @RunWith(SpringJUnit4ClassRunner.class)|@ExtendWith(SpringExtension.class)|
|@Test(expected=Foo.class)|Assertions.assertThrows(FooException.class)|
|@Test(timeout = 1)|Assertions.assertTimeout(Duration...)|

- JUnit 4 Support Under JUnit 5
  - JUnit 4 tests can be run via JUnit 5
  - Helps provide easy migration path to JUnit 5
  - Add artifact ‘junit-vintage-engine’ to classpath
  - Enables support for JUnit 3 and JUnit 4 tests
    - Tests are executed using JUnit 5 engine
  - Some features not fully supported (details coming)
  - Java 1.8 or Higher is Required
  
- JUnit 4 Category Support
  - JUnit 4 Categories become ‘tags’ under JUnit 5
  - Category is exposed as fully qualified class name.
  - Example: @Category(Foo.class)
  - JUnit 5 Tag = “com.example.Foo”

- Migration Tips
  - Annotations reside in the org.junit.jupiter.api package.
  - Assertions reside in org.junit.jupiter.api.Assertions.
  - Assumptions reside in org.junit.jupiter.api.Assumptions.
  - @Rule and @ClassRule no longer exist; superseded by @ExtendWith
  - NOTE - First slide shows key annotation differences
  
- Limited Rule Support in JUnit 5 Vintage
  - JUnit 5 Jupiter does no support JUnit 4 Rules natively
  - Library junit-jupiter-migrationsupport provides limited Rule support:
    - org.junit.rules.ExternalResource (including org.junit.rules.TemporaryFolder)
    - org.junit.rules.Verifier (including org.junit.rules.ErrorCollector)
    - org.junit.rules.ExpectedException
  - NOTE - Feature is experimental, see current documentation for additional details
  
### JUnit 5 Maven Dependencies and Configuration
- `junit-vintage-engine` - an adapteer needed when JUnit 5 runs JUnit 4 tests

```xml
	<properties>
		<project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
		<project.reporting.outputEncoding>UTF-8</project.reporting.outputEncoding>
		<java.version>11</java.version>
		<jaxb.version>2.3.0</jaxb.version>
		<junit-platform.version>5.3.1</junit-platform.version>
	</properties>

	<dependencies>
		<dependency>
			<groupId>org.junit.jupiter</groupId>
			<artifactId>junit-jupiter-api</artifactId>
			<version>${junit-platform.version}</version>
			<scope>test</scope>
		</dependency>
		<dependency>
			<groupId>org.junit.jupiter</groupId>
			<artifactId>junit-jupiter-engine</artifactId>
			<version>${junit-platform.version}</version>
			<scope>test</scope>
		</dependency>
		<dependency>
			<groupId>org.junit.vintage</groupId>
			<artifactId>junit-vintage-engine</artifactId>
			<version>${junit-platform.version}</version>
		</dependency>
	</dependencies>
	<build>
		<plugins>
			<plugin>
				<groupId>org.springframework.boot</groupId>
				<artifactId>spring-boot-maven-plugin</artifactId>
			</plugin>
			<plugin>
				<groupId>org.apache.maven.plugins</groupId>
				<artifactId>maven-surefire-plugin</artifactId>
				<version>2.22.0</version>
				<configuration>
					<argLine>
						--illegal-access=permit
					</argLine>
				</configuration>
			</plugin>
			<plugin>
				<groupId>org.apache.maven.plugins</groupId>
				<artifactId>maven-failsafe-plugin</artifactId>
				<version>2.22.0</version>
				<configuration>
					<argLine>
						--illegal-access=permit
					</argLine>
				</configuration>
				<executions>
					<execution>
						<goals>
							<goal>integration-test</goal>
							<goal>verify</goal>
						</goals>
					</execution>
				</executions>
			</plugin>
		</plugins>
	</build>
```

### Converting JUnit 4 Tests to JUnit 5
- Changed imports and `@Before` to  	@BeforeEach	
```

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class CategoryTest {

    Category category;

    @BeforeEach
    public void setUp(){
        category = new Category();
    }

    @Test
    public void getId() throws Exception {
        Long idValue = 4L;

        category.setId(idValue);

        assertEquals(idValue, category.getId());
    }

    @Test
    public void getDescription() throws Exception {
    }

    @Test
    public void getRecipes() throws Exception {
    }
}

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class IndexControllerTest {

    @BeforeEach
    public void setUp() throws Exception {
    }
    @Test
    public void getIndexPage() {
    }
}
```
- Replaceing `@RunWith(SpringRunner.class)` with `@ExtendWith(SpringExtension.class)`

```
@ExtendWith(SpringExtension.class)
@SpringBootTest
public class Spring5RecipeAppApplicationTests {

    @Test
    public void contextLoads() {
    }
}
```
### Removing JUnit 4
```xml
	<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-test</artifactId>
			<exclusions>
				<exclusion>
					<groupId>junit</groupId>
					<artifactId>junit</artifactId>
				</exclusion>
			</exclusions>
			<scope>test</scope>
		</dependency>
```
- Remove **junit-vintage-engine**

```xml
		<dependency>
			<groupId>org.junit.vintage</groupId>
			<artifactId>junit-vintage-engine</artifactId>
			<version>${junit-platform.version}</version>
		</dependency>
```
## Getting Started with Mockito
### Introduction to Mockito
- Mockito is the most popular mocking framework for testing Java
-  Mocks (aka Test Doubles) are alternate implementations of objects to replace real objects in tests
- Works well with Dependency Injection
- For the class under test, injected dependencies can be mocks

#### Types of Mocks 
- Dummy - Object used just to get the code to compile
- Fake - An object that has an implementation, but not production ready
- Stub - An object with pre-defined answers to method calls
- Mock - An object with pre-defined answers to method calls, and has expectations of executions.
Can throw an exception if an unexpected invocation is detected
- Spy - In Mockito Spies are Mock like wrappers around the actual object

#### Mockito Annotations
|Annotation|Description|
|----------|-----------|
|@Mock|Used to create a mock|
|@Spy|Used to create a spy|
|@InjectMocks|Inject mocks / spys into a class under test|
|@Captor|Captures arguments to Mock|

### Maven Dependencies for Mockito

```
    <properties>
        <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
        <project.reporting.outputEncoding>UTF-8</project.reporting.outputEncoding>
        <java.version>11</java.version>
        <maven.compiler.source>${java.version}</maven.compiler.source>
        <maven.compiler.target>${java.version}</maven.compiler.target>
        <junit-platform.version>5.3.1</junit-platform.version>
        <mockito.version>2.23.0</mockito.version>
    </properties>
    
    <dependency>
    	<groupId>org.mockito</groupId>
    	<artifactId>mockito-core</artifactId>
    	<version>${mockito.version}</version>
    	<scope>test</scope>
    </dependency>
    <dependency>
    	<groupId>org.mockito</groupId>
    	<artifactId>mockito-junit-jupiter</artifactId>
    	<version>${mockito.version}</version>
    	<scope>test</scope>
    </dependency>
    
```
### Creating Mockito Mocks Inline
```java
Map mapMock = mock(Map.class);
```

### Creating Mockito Mocks with Annotations
```
public class AnnotationMocksTest {
    @Mock
    Map<String, Object> mapMock;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void testMock() {
        mapMock.put("keyvalue", "foo");
    }
}
```

### JUnit Mockito Extension

```
//init mocks
@ExtendWith(MockitoExtension.class)
public class JUnitExtensionTest {
    @Mock
    Map<String, Object> mapMock;

    @Test
    void testMock() {
        mapMock.put("keyvalue", "foo");
    }
}
```

### Injecting Mocks with Mockito
```java
@ExtendWith(MockitoExtension.class)
class SpecialitySDJpaServiceTest {
	// creates an instance and injects mocks
    @Mock
    SpecialtyRepository specialtyRepository;

    @InjectMocks
    SpecialitySDJpaService service;

    @Test
    void deleteById() {
        service.deleteById(1l);
    }

    @Test
    void testDelete() {
        service.delete(new Speciality());
    }
}
```

### Verify Interactions with Mockito Mocks
- VerificationModes: `times()`, `atLeastOnce()`, `atMost()`, `never()`

```
@ExtendWith(MockitoExtension.class)
class SpecialitySDJpaServiceTest {
    @Mock
    SpecialtyRepository specialtyRepository;

    @InjectMocks
    SpecialitySDJpaService service;

    @Test
    void deleteById() {
        service.deleteById(1l);
        service.deleteById(1l);

        verify(specialtyRepository, times(2)).deleteById(1l);
    }

    @Test
    void deleteByIdAtLeast() {
        service.deleteById(1l);
        service.deleteById(1l);

        verify(specialtyRepository, atLeastOnce()).deleteById(1l);
    }

    @Test
    void deleteByIdAtMost() {
        service.deleteById(1l);
        service.deleteById(1l);

        verify(specialtyRepository, atMost(5)).deleteById(1l);
    }

    @Test
    void deleteByIdNever() {
        service.deleteById(1l);
        service.deleteById(1l);

        verify(specialtyRepository, atLeastOnce()).deleteById(1l);

        verify(specialtyRepository, never()).deleteById(5L);
    }

    @Test
    void testDelete() {
        service.delete(new Speciality());
    }
}
```

### Returning values from Mockito mocks

```
   Speciality speciality = new Speciality();

   when(specialtyRepository.findById(1L)).thenReturn(Optional.of(speciality));
```

### Argument Matchers
```
  
    verify(specialtyRepository).delete(any(Speciality.class));
    
```

## Behavior Driven Mockito
### BDD - Behavior Driven Development
- Commonly abbreviated as BDD
- BDD started in 2004 by Dan North
- Dan North has said BDD was established to help people learn TDD
- BDD is largely a different way of looking at testing
- BDD focuses on behavior vs “tests”
- “Unit Tests” are referred to as specification - ie specifications of behaviors
- Test method names should be sentences -ie saveValidID

#### Given When Then
- BDD Tests are often written in a given-when-then context
- This approach often helps you organize your thoughts when writing the test
- Given - Setup of the text
- When - Action of the test - ie when method is called
- Then - Verification of expected results

#### Mockito and BDD
- Mockito has added BDD Support in class BDDMockito
- static method given allows you to configure mocks
- static method then allows you to verify mock interactions

### BDD Mockito
```java
   @Test
    void findByIdBddTest() {
        Speciality speciality = new Speciality();

        given(specialtyRepository.findById(1L)).willReturn(Optional.of(speciality));

        Speciality foundSpecialty = service.findById(1L);

        assertThat(foundSpecialty).isNotNull();

        verify(specialtyRepository).findById(anyLong());
    }
```
### BDD Verification in Mockito

```
    @Test
    void findByIdBddTest() {
        Speciality speciality = new Speciality();

        given(specialtyRepository.findById(1L)).willReturn(Optional.of(speciality));

        Speciality foundSpecialty = service.findById(1L);

        assertThat(foundSpecialty).isNotNull();
        
        then(specialtyRepository).should().findById(anyLong());
        then(specialtyRepository).shouldHaveNoMoreInteractions();
    }
```
## Advanced Mockito
### Throwing exceptions with Mockito

```java
    @Test
    void testDoThrow() {
        doThrow(new RuntimeException("boom")).when(specialtyRepository).delete(any());

        assertThrows(RuntimeException.class, () -> specialtyRepository.delete(new Speciality()));

        verify(specialtyRepository).delete(any());
    }

    @Test
    void testFindByIDThrows() {
        given(specialtyRepository.findById(1L)).willThrow(new RuntimeException("boom"));

        assertThrows(RuntimeException.class, () -> service.findById(1L));

        then(specialtyRepository).should().findById(1L);
    }

    @Test
    void testDeleteBDD() {
        willThrow(new RuntimeException("boom")).given(specialtyRepository).delete(any());

        assertThrows(RuntimeException.class, () -> specialtyRepository.delete(new Speciality()));

        then(specialtyRepository).should().delete(any());
    }
}
```

### Java 8 Lambda Argument Matchers
- `argThat(LAMBA_CONDITION)` - mocking on the condition 
- We have to set lenient `@Mock(lenient = true)` as junit uses a strict matching
```java

    @Mock(lenient = true)
    SpecialtyRepository specialtyRepository;

   @Test
    void testSaveLambda() {
        //given
        final String MATCH_ME = "MATCH_ME";
        Speciality speciality = new Speciality();
        speciality.setDescription(MATCH_ME);

        Speciality savedSpecialty = new Speciality();
        savedSpecialty.setId(1L);

        //need mock to only return on match MATCH_ME string
        given(specialtyRepository.save(argThat(argument -> argument.getDescription().equals(MATCH_ME)))).willReturn(savedSpecialty);

        //when
        Speciality returnedSpecialty = service.save(speciality);

        //then
        assertThat(returnedSpecialty.getId()).isEqualTo(1L);
    }
    
     @Test
    void testSaveLambdaNoMatch() {
        //given
        final String MATCH_ME = "MATCH_ME";
        Speciality speciality = new Speciality();
        speciality.setDescription("Not a match");

        Speciality savedSpecialty = new Speciality();
        savedSpecialty.setId(1L);

        //need mock to only return on match MATCH_ME string
        given(specialtyRepository.save(argThat(argument -> argument.getDescription().equals(MATCH_ME)))).willReturn(savedSpecialty);

        //when
        Speciality returnedSpecialty = service.save(speciality);

        //then
        assertNull(returnedSpecialty);
    }

```
### Mockito Argument Capture
- Standart - inline captor
```
    @Test
    void processFindFormWildcardString() {
        //given
        Owner owner = new Owner(1l, "Joe", "Buck");
        List<Owner> ownerList = new ArrayList<>();
        final ArgumentCaptor<String> captor = ArgumentCaptor.forClass(String.class);
        given(ownerService.findAllByLastNameLike(captor.capture())).willReturn(ownerList);

        //when
        String viewName = ownerController.processFindForm(owner, bindingResult, null);

        //then
        assertThat("%Buck%").isEqualToIgnoringCase(captor.getValue());
    }
```
- Annotation Captor

```
    @Captor
    ArgumentCaptor<String> stringArgumentCaptor;
    
    @Test
    void processFindFormWildcardStringAnnotation() {
    //given
    Owner owner = new Owner(1l, "Joe", "Buck");
    List<Owner> ownerList = new ArrayList<>();
    given(ownerService.findAllByLastNameLike(stringArgumentCaptor.capture())).willReturn(ownerList);

    //when
    String viewName = ownerController.processFindForm(owner, bindingResult, null);

    //then
     ssertThat("%Buck%").isEqualToIgnoringCase(stringArgumentCaptor.getValue());
    }
```

### Using Mockito Answers
- When we want to add more logic to mocking code

```java
    @BeforeEach
    void setUp() {
    given(ownerService.findAllByLastNameLike(stringArgumentCaptor.capture()))
                .willAnswer(invocation -> {
                    List<Owner> owners = new ArrayList<>();

                    String name = invocation.getArgument(0);

                    if (name.equals("%Buck%")) {
                        owners.add(new Owner(1l, "Joe", "Buck"));
                        return owners;
                    } else if (name.equals("%DontFindMe%")) {
                        return owners;
                    } else if (name.equals("%FindMe%")) {
                        owners.add(new Owner(1l, "Joe", "Buck"));
                        owners.add(new Owner(2l, "Joe2", "Buck2"));
                        return owners;
                    }

                    throw new RuntimeException("Invalid Argument");
                });
    }
```
### Verify order of Interactions
- Checks the order of interactions with mocks

```
   @Test
    void processFindFormWildcardFound() {
        //given
        Owner owner = new Owner(1l, "Joe", "FindMe");
        InOrder inOrder = inOrder(ownerService, model);

        //when
        String viewName = ownerController.processFindForm(owner, bindingResult, model);

        //then
        assertThat("%FindMe%").isEqualToIgnoringCase(stringArgumentCaptor.getValue());
        assertThat("owners/ownersList").isEqualToIgnoringCase(viewName);

        // inorder asserts
        inOrder.verify(ownerService).findAllByLastNameLike(anyString());
        inOrder.verify(model).addAttribute(anyString(), anyList());
    }
```
### Verify Interactions within Specified Time
- Check if a method has finished within a pecified time (ms)

```
then(specialtyRepository).should(timeout(100)).findById(anyLong());

then(specialtyRepository).should(timeout(100).times(2)).deleteById(1L);
```

### Verify Zero or No More Interactions with Mock
```
	verifyNoMoreInteractions(ownerService);
	verifyZeroInteractions(model);        
```

### Using Mockito Spies
- Spy acks like a wrapper
- Allows to access an underlying object

```
    @Spy
    PetMapService petService;
    
    petService.save(pet);
    petService.save(pet3);

    given(petService.findById(anyLong())).willCallRealMethod();
```

## Testing with Spring Framework
### Introduction
#### Spring Framework Testing Features
- Mock Objects
  - Environment - Mock Environment and Properties Source
  - JNDI - Mock of JNDI lookup
  - Servlet API - For testing of web environment
  - Spring Web Reactive - Testing of reactive web environment
  
#### Testing Utilities
- ReflectionTestUtils - allows use of refection to modify private fields
  - Spring can autowire private properties - (Considered a poor practice)
  - Can also be used to hook into bean lifecycle events
- AOP Utils - Helps with testing of AOP

#### Spring MVC Test
- Spring MVC Test - Robust framework for testing controller interactions
  - MockHttpServletRequest - Mock implementation of request / response
  - MockHttpSession - Mock of Http Session
  - ModleAndViewAssert - assertion utilities
- Framework allows testing of web requests without the need of a running container
- Allows true unit tests for controller
  - Tests run much faster when the web context is not started
  
#### Spring Integration Testing
- Integration testing is when the Spring Context is started to support the test
- Loading the Spring Context is considered an expensive operation
  - Can take 10 - 40 seconds to load context
  - Depending on complexity of project and hardware
- Spring will cache the context between tests to improve performance
- Dependency Injection - Spring can be used to inject beans into test classes
- Transaction Management - By default Spring will automatically rollback database transactions

#### JDBC Testing Support
- JdbcTemplate - Spring will configure an instance of JdbcTemplate for testing support
- JdbcTestUtils - Collection of utilities to assist with database testing
  - countRowsInTable
  - countRowsInTableWhere
  - deleteFromTables
  - deleteFromTablesWhere
  - dropTables
  
#### Embedded Database Support
- Spring provides support for popular in-memory Java
databases
- Very useful for testing database interactions
- Supported natively by Spring:
  - H2
  - HSQL
  - Derby
- H2 has a nice web based DB console

#### Spring Framework Testing Annotations
- @BootstrapWith - Class-level annotation to configure how the test context is bootstrapped
- @ContextConfiguration - Class-level annotation to configure the application context
- @WebAppConfigurtation - Class-level annotation to configure a web application context
- @ContextHiearchy - Class-level annotation to set multiple @ContextConfigurations
- @ActiveProfiles - Class-level annotation to set active profiles for test
- @TestPropertySource - Class-level annotation to set property sources for test
- @DirtiesContext - Class or method level annotation which tells Spring to re-load context after
test - (slows down your tests)

#### Spring Framework Testing Annotations
- @TestExecutionListeners - Used to configure test execution listeners
- @Commit - Class or method level annotation to commit action of test to database.
- @Rollback - Class or method level annotation to rollback action of test from database.
- @BeforeTransaction - run a method which returns void before a transaction is started
- @AfterTransaction - run a method which returns void after a transaction has completed
- @Sql - Used to configure SQL scripts to run before a test
- @SqlConfig - Configuration for the parsing of SQL scripts
- @SqlGroup - Configure a grouping of SQL scripts
#### JUnit 4 Testing Annotations
- @IfProvileValue - Enable test for specific environments
- @ProfileValueSourceConfiguration - Class-level annotation to configure how profile values are retrieved
- @Timed - Require test to complete within a period of time
- @Repeat - Repeat test x number of times

#### Spring JUnit 5 Testing Annotations
- @SpringJUnitConfig - Combines @ContextConfiguration with
@ExtendWith(SpringExtension.class) to configure the Spring Context for the test
- @SpringJUnitWebConfig - Combines @ContextConfiguration and @WebAppConfiguration with
@ExtendWith(SpringExtension.class) to configure the Spring Context for the test
- @EnabledIf - Conditional execution of test
- @DisabledIf - Conditional execution of test

## Spring Framework Testing Context
### JUnit 4 Laurel Test
```
@RunWith(SpringRunner.class)
@ContextConfiguration(classes = {BaseConfig.class, LaurelConfig.class})
public class HearingInterpreterTest {
    @Autowired
    HearingInterpreter hearingInterpreter;

    @Test
    public void whatIheard() {
        String word = hearingInterpreter.whatIheard();


        assertEquals("Laurel", word);
    }
}
```
### JUnit 5 Laurel Test
```
@SpringJUnitConfig(classes = {BaseConfig.class, LaurelConfig.class})
public class HearingInterpreterLaurelTest {

    @Autowired
    HearingInterpreter hearingInterpreter;

    @Test
    void whatIheard() {
        String word = hearingInterpreter.whatIheard();

        assertEquals("Laurel", word);
    }
}
```

### Using Inner Class Configuration
```
@SpringJUnitConfig(classes = HearingInterpreterInnerClassTest.TestConfig.class)
public class HearingInterpreterInnerClassTest {
    @Configuration
    static class TestConfig {

        @Bean
        HearingInterpreter hearingInterpreter() {
            return new HearingInterpreter(new LaurelWordProducer());
        }
    }

    @Autowired
    HearingInterpreter hearingInterpreter;

    @Test
    void whatIheard() {
        String word = hearingInterpreter.whatIheard();

        assertEquals("Laurel", word);
    }
```

### Using Component Scans
```
@SpringJUnitConfig(classes = HearingInterpreterComponentScanTest.TestConfig.class)
public class HearingInterpreterComponentScanTest {
    @Configuration
    @ComponentScan("org.springframework.samples.petclinic.sfg")
    static class TestConfig {

    }

    @Autowired
    HearingInterpreter hearingInterpreter;

    @Test
    void whatIheard() {
        String word = hearingInterpreter.whatIheard();

        assertEquals("Laurel", word);
    }
}
```
### Setting Active Profiles for Tests
```
@Profile("yanny")
@Primary
@Component
public class YannyWordProducer implements WordProducer{
    @Override
    public String getWord() {
        return "Yanny";
    }
}

@ActiveProfiles("yanny")
@SpringJUnitConfig(classes = HearingInterpreterActiveProfileTest.TestConfig.class)
public class HearingInterpreterActiveProfileTest {

}
```

### Spring Test Properties
- yanny.properties
```properties
say.word=YaNNy
```
- PropertiesTest.java
```
@TestPropertySource("classpath:yanny.properties")
@ActiveProfiles("externalized")
@SpringJUnitConfig(classes = PropertiesTest.TestConfig.class)
public class PropertiesTest {

    @Configuration
    @ComponentScan("org.springframework.samples.petclinic.sfg")
    static class TestConfig {

    }

    @Autowired
    HearingInterpreter hearingInterpreter;

    @Test
    void whatIheard() {
        String word = hearingInterpreter.whatIheard();

        assertEquals("YaNNy", word);
    }
}
```

## Spring MVC Test
### Overview
- Servlet API Mock objects to mock the web environment
  - **MockHttpServletRequest** - Mock of Java’s HttpServletRequest
  - **MockHttpServletResponse** - Mock of Java’s HttpServletResponse
- **DispatcherServlet** - Requests are routed through Spring MVC’s DispatcherServlet
#### Spring MVC Test Configuration Modes

- Standalone Setup
  - Very light weight - Ideal for unit tests
  - Tests one controller at a time
  - Allows for testing of controller requests and responses
- WebAppContext Setup
  - Loads larger context of Spring Configuration
  - Tests many controllers - per configuration
  - Allows for testing of application config
  
#### Static Imports
- Spring MVC Test uses a “fluent” API via several static imports
- **MockMvcRequestBuilders.*** - Builds request
- **MockMvcResultMatchers.*** - Create assertions against response
- **MockMvcBuilders.*** - Configure and build an instance of MockMvc

#### Important Differences from Container
- Spring MVC Test does not use a running Servlet container
- No network request is made (ie to port 80, or 8080)
- Key differences from running in container
- HTML is not generated, thus templates are not executed (JSP, Thymeleaf, etc)
- You can test the view (template) requested, or redirected to
  - But cannot test expected HTML to be rendered
- Spring does support testing with a running container when needed.

### Spring Mock MVC Standalone Setup 
```
@ExtendWith(MockitoExtension.class)
class VetControllerTest {
	@InjectMocks
	VetController controller;
	MockMvc mockMvc;

	@BeforeEach
	void setUp() {
	vetsList.add(new Vet());
	given(clinicService.findVets()).willReturn(vetsList);

	mockMvc = MockMvcBuilders.standaloneSetup(controller).build();
    }
    
	@Test
	void testControllerShowVetList() throws Exception
	{
        mockMvc.perform(get("/vets.html"))
                .andExpect(status().isOk())
                .andExpect(model().attributeExists("vets"))
                .andExpect(view().name("vets/vetList"));
	}
}
``` 
### Spring Web Configuration with XML
```
@SpringJUnitWebConfig(locations = {"classpath:spring/mvc-test-config.xml", "classpath:spring/mvc-core-config.xml"})
public class OwnerControllerTest {
}
```

### Using Spring MVC Test with Form Parameters
```
   @Test
    void testFindByNameNotFound() throws Exception {
        mockMvc.perform(get("/owners")
                        .param("lastName", "Dont find ME!"))
                .andExpect(status().isOk())
                .andExpect(view().name("owners/findOwners"));
    }
```
### Using Spring MVC Test for Form Post
```
    @Test
    void testNewOwnerPostValid() throws Exception {
        mockMvc.perform(post("/owners/new")
                        .param("firstName", "Jimmy")
                        .param("lastName", "Buffett")
                        .param("Address", "123 Duval St ")
                        .param("city", "Key West")
                        .param("telephone", "3151231234"))
                .andExpect(status().is3xxRedirection());
    }
```

### Using Spring MVC Test for Validation Errors
```
   @Test
    void testNewOwnerPostNotValid() throws Exception {
        mockMvc.perform(post("/owners/new")
                        .param("firstName", "Jimmy")
                        .param("lastName", "Buffett")
                        .param("city", "Key West"))
                .andExpect(status().isOk())
                .andExpect(model().attributeHasErrors("owner"))
                .andExpect(model().attributeHasFieldErrors("owner", "address"))
                .andExpect(model().attributeHasFieldErrors("owner", "telephone"))
                .andExpect(view().name("owners/createOrUpdateOwnerForm"));
    }
```

## Introduction to Testing with Spring Boot
### Overview
#### Spring Boot Testing
- Spring Boot Test features are enabled through the inclusion of the starter:
  - spring-boot-starter-test 
- This starter provides:
  - Common testing dependencies
  - Spring Boot Testing Dependencies - (ie Testing annotations and support)
  - Spring Boot Testing Auto-Configuration
#### Spring Boot Test Scope Dependencies
- The Spring Boot Test (as of version 2.1.x) starter brings in the following Testing Libraries:
  - JUnit (Spring Boot 2.1 and earlier is JUnit 4, Spring Boot 2.2 will support JUnit 5)
  - Spring Test - Spring Framework Testing features
  - AssertJ - Fluent assertions
  - Hamcrest - Matchers for testing
  - Mockito - Mocking framework
  - JSONAssert - Assertions for JSON
  - JsonPath - XPath for JSON
  
#### Spring Testing Context with Spring Boot
- @SpringBootTest - will enable Spring Context
  - If using JUnit 4 the following class level annotation is also required:
    - @RunWith(SpringRunner.class)
  - Annotation includes @ExtendWith(SpringExtension.class), thus is not needed
  - By default searches for @SpringBootConfiguration
    - Included with @SpringBootApplication
  - By default, Spring Boot will not start a web server
  
#### Web Environment
- To enable the web environment - @SpringBootTest(webEnvironment= <option>)
- Web Environment Options:
  - MOCK - Default - loads mock web environment
  - RANDOM_PORT - Provides embedded web server listening on a random port. (useful to avoid
port conflicts)
  - DEFINED_PORT - Provides embedded web server listening on a 8080 (default) or server.port
defined in application.properties
  - NONE - No Web Environment
  
#### Spring Boot Test Annotations
- @TestComponent - Stereotype for test components
- @TestConfiguration - Java Configuration for tests
- @LocalServerPort - Inject port of running server
- @MockBean - Inject Mockito Mock
- @SpyBean - Inject Mockito Spy

#### Spring Boot Test Slices
- @SpringBootTest - will by default scan your project and bring up a full context using all
available (enabled) auto configurations
  - This can be heavy and costly on more complex applications
- Spring Boot Test Slices - targeted light weight configurations which do not enable the complete
defined auto configuration
- Example: @JsonTest - Creates a Spring Boot configured JSON environment for Jackson (default)
or Gson.
- Use @. . . Test on test class instead of @SpringBootTest

### Updating Spring Boot2.x to JUnit 5
```xml
	<dependencies>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-test</artifactId>
            <scope>test</scope>
            <exclusions>
                <exclusion>
                    <groupId>junit</groupId>
                    <artifactId>junit</artifactId>
                </exclusion>
            </exclusions>
        </dependency>
        <dependency>
            <groupId>org.junit.jupiter</groupId>
            <artifactId>junit-jupiter-api</artifactId>
        </dependency>
        <dependency>
            <groupId>org.junit.jupiter</groupId>
            <artifactId>junit-jupiter-engine</artifactId>
        </dependency>
        <dependency>
            <groupId>org.mockito</groupId>
            <artifactId>mockito-junit-jupiter</artifactId>
        </dependency>
    </dependencies>
```
## Spring MVC Rest Controller Tests
### Jayway JsonPath
- **JsonPath** helps to inspects the JSON object
- [JsonPath](https://github.com/json-path/JsonPath)
### Using JsonPath in MockMVC Tests
```
    @Test
    void testGetBeerById() throws Exception {
        given(beerService.findBeerById(any())).willReturn(validBeer);

        mockMvc.perform(get("/api/v1/beer/" + validBeer.getId()))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8))
                .andExpect(jsonPath("$.id", is(validBeer.getId().toString())))
                .andExpect(jsonPath("$.beerName", is("Beer1")));

    }
```
### Using JsonPath with Lists
```
@DisplayName("List Ops - ")
    @Nested
    public class TestListOperations {

        @Captor
        ArgumentCaptor<String> beerNameCaptor;

        @Captor
        ArgumentCaptor<BeerStyleEnum> beerStyleEnumCaptor;

        @Captor
        ArgumentCaptor<PageRequest> pageRequestCaptor;

        BeerPagedList beerPagedList;

        @BeforeEach
        void setUp() {
            List<BeerDto> beers = new ArrayList<>();
            beers.add(validBeer);
            beers.add(BeerDto.builder().id(UUID.randomUUID())
                    .version(1)
                    .beerName("Beer4")
                    .upc(123123123122L)
                    .beerStyle(BeerStyleEnum.PALE_ALE)
                    .price(new BigDecimal("12.99"))
                    .quantityOnHand(66)
                    .createdDate(OffsetDateTime.now())
                    .lastModifiedDate(OffsetDateTime.now())
                    .build());

            beerPagedList = new BeerPagedList(beers, PageRequest.of(1, 1), 2L);

            given(beerService.listBeers(beerNameCaptor.capture(), beerStyleEnumCaptor.capture(),
                    pageRequestCaptor.capture())).willReturn(beerPagedList);
        }

        @DisplayName("Test list beers - no parameters")
        @Test
        void testListBeers() throws Exception {
            mockMvc.perform(get("/api/v1/beer")
                            .accept(MediaType.APPLICATION_JSON))
                    .andExpect(status().isOk())
                    .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8))
                    .andExpect(jsonPath("$.content", hasSize(2)))
                    .andExpect(jsonPath("$.content[0].id", is(validBeer.getId().toString())));
        }
    }
```
### Using Custom Message Converters with Spring MVC Test
- Configuring Timestamp mapping

```
   @BeforeEach
    void setUp() {
        validBeer = BeerDto.builder().id(UUID.randomUUID())
                .version(1)
                .beerName("Beer1")
                .beerStyle(BeerStyleEnum.PALE_ALE)
                .price(new BigDecimal("12.99"))
                .quantityOnHand(4)
                .upc(123456789012L)
                .createdDate(OffsetDateTime.now())
                .lastModifiedDate(OffsetDateTime.now())
                .build();
        
        mockMvc = MockMvcBuilders.standaloneSetup(beerController)
                .setMessageConverters(jackson2HttpMessageConverter()).build();
    }

    public MappingJackson2HttpMessageConverter jackson2HttpMessageConverter() {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
        objectMapper.configure(SerializationFeature.WRITE_DATE_TIMESTAMPS_AS_NANOSECONDS, true);
        objectMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);

        objectMapper.registerModule(new JavaTimeModule());
        return new MappingJackson2HttpMessageConverter(objectMapper);
    }

```
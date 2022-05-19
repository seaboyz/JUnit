- [What is testing?](#what-is-testing)
- [Test life cycle](#test-life-cycle)
- [Do and Don't](#do-and-dont)
  - [Small and Focus](#small-and-focus)
  - [Trustworthy](#trustworthy)
  - [Unit Test is part of the source code](#unit-test-is-part-of-the-source-code)
  - [Automated](#automated)
  - [Stateless](#stateless)
  - [Testing Kinds](#testing-kinds)
  - [State Based Testing](#state-based-testing)
  - [Integration Testing](#integration-testing)
- [Anatomy of a test](#anatomy-of-a-test)
  - [@BeforeClass <sup>4</sup> / @BeforeAll <sup>5</sup>](#beforeclass-sup4sup--beforeall-sup5sup)
  - [@AfterClass <sup>4</sup> / @AfterAll <sup>5</sup>](#afterclass-sup4sup--afterall-sup5sup)
  - [@Before <sup>4</sup> / @BeforeEach <sup>5</sup>](#before-sup4sup--beforeeach-sup5sup)
  - [@After <sup>4</sup> / @AfterEach <sup>5</sup>](#after-sup4sup--aftereach-sup5sup)
- [Insertion](#insertion)
- [Macher](#macher)
- [Other anotation](#other-anotation)
  - [@TestInstance](#testinstance)
  - [@DisplayName](#displayname)
  - [@Disabled](#disabled)
  - [@EnabledOnOs(Os.LINUX)](#enabledonososlinux)
  - [Assumptions.assumeTrue()](#assumptionsassumetrue)
- [Grouping](#grouping)
  - [assertAll()](#assertall)
  - [@Nested](#nested)
  - [@REpeatedTest(3)](#repeatedtest3)
  - [@Tag](#tag)
- [What is NOT Unit testing?](#what-is-not-unit-testing)
  - [Don't use spring to write Unit Testing](#dont-use-spring-to-write-unit-testing)
  - [Testing Controllers](#testing-controllers)

### What is testing?

![](./images/download.png)

### Test life cycle

![](./images/Screen%20Shot%202022-04-10%20at%208.08.03%20AM.png)
![](./images/Screen%20Shot%202022-04-10%20at%208.12.46%20AM.png)

### Do and Don't

#### Small and Focus
*  No if else
*  No switch case
*  No for loop
*  No while loop
*  No do while loop
*  No try catch

#### Trustworthy
*  No False Positive
* Assertion failure - somthing is wrong with the test
*  No False Negative
* Test fails to detect something something is wrong with the production code
  
#### Unit Test is part of the source code
*  readability
*  maintainability

#### Automated
*  No manual testing
*  CI/CD - Continuous Integration/Continuous Deployment

#### Stateless
* the state of the test is not stored in the test
* each test is independent of the other
* use @afterAll and @afterEach to clean up the test

#### Testing Kinds
#### State Based Testing
* Result driven Test
* Black box testing

#### Integration Testing

### Anatomy of a test
#### @BeforeClass <sup>4</sup> / @BeforeAll <sup>5</sup> 
* `public static void init()`
#### @AfterClass <sup>4</sup> / @AfterAll <sup>5</sup>
* `public static void destroy()`
#### @Before <sup>4</sup> / @BeforeEach <sup>5</sup>
* `public void setUp()`
#### @After <sup>4</sup> / @AfterEach <sup>5</sup>
* `public void tearDown()`

### Insertion
* assertEquals(expected, actual)
* assertTrue(condition)
* assertFalse(condition)
* assertNull(object)
* assertNotNull(object)
* assertSame(expected, actual)
* assertNotSame(expected, actual)
* assertArrayEquals(expected, actual)
* ...
<!-- https://mvnrepository.com/artifact/org.hamcrest/hamcrest -->
<dependency>
    <groupId>org.hamcrest</groupId>
    <artifactId>hamcrest</artifactId>
    <version>2.2</version>
    <scope>test</scope>
</dependency>


### Macher
* hamcrest
* 


### Other anotation
#### @TestInstance

![](./images/Screen%20Shot%202022-04-10%20at%208.49.16%20AM.png)

#### @DisplayName

![](./images/Screen%20Shot%202022-04-10%20at%208.59.03%20AM.png)

#### @Disabled

for the method that is not written yet, so disable the test for this method.
![](./images/Screen%20Shot%202022-04-10%20at%209.07.55%20AM.png)

#### @EnabledOnOs(Os.LINUX)

for certain operating system
![](./images/Screen%20Shot%202022-04-10%20at%209.14.01%20AM.png)
![](./images/Screen%20Shot%202022-04-10%20at%209.19.39%20AM.png)
![](./images/Screen%20Shot%202022-04-10%20at%209.20.01%20AM.png)
![](./images/Screen%20Shot%202022-04-10%20at%209.23.03%20AM.png)

#### Assumptions.assumeTrue()

### Grouping

#### assertAll()

![](./images/Screen%20Shot%202022-04-10%20at%209.44.58%20AM.png)

#### @Nested

![](./images/Screen%20Shot%202022-04-10%20at%209.44.58%20AM.png)
![](./images/Screen%20Shot%202022-04-10%20at%2010.00.36%20AM.png)

#### @REpeatedTest(3)

#### @Tag

```console
mvn test
```

for maven run certain test with the same tag name
![](./images/Screen%20Shot%202022-04-10%20at%2010.52.45%20AM.png)
![](./images/Screen%20Shot%202022-04-10%20at%2010.53.00%20AM.png)
![](./images/Screen%20Shot%202022-04-10%20at%2010.53.14%20AM.png)


### What is NOT Unit testing?
![](images/unit-testing/Screen%20Shot%202022-05-19%20at%201.37.51%20AM.png)

#### Don't use spring to write Unit Testing
![](images/unit-testing/Screen%20Shot%202022-05-19%20at%201.44.42%20AM.png)

![](images/unit-testing/Screen%20Shot%202022-05-19%20at%201.54.43%20AM.png)

#### Testing Controllers
![](images/unit-testing/Screen%20Shot%202022-05-19%20at%203.54.29%20AM.png)





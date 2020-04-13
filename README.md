# spring-spock

![logo](/doc/test.png)

study

### What is it? 

Spock is a testing and specification framework for Java and Groovy applications.

- reference : http://spockframework.org/


BDD(Behaviour-Driven Development) 프레임워크이다. 

TDD와 비슷하지만, 명세와 행위를 더 명확하게 한다. 


### Getting Started 

- https://d2.naver.com/helloworld/568425
- https://jojoldu.tistory.com/228
- https://www.baeldung.com/spring-spock-testing


## Block 

Spock에서는 given, when, then과 같은 코드를 block이라 한다. 

block은 test method에 최소한 하나는 있어야 한다. 


![block](/doc/Blocks2Phases.png)

### given / setup

테스트에 필요한 환경을 설정하는 작업 

항상 다른 블록보다 먼저 사용해야 한다. given / setup이 나오기 전에 다른 블록이 나오면 암묵적으로 given / setpup 블록으로 인식한다. 

### when 

테스트 코드를 실행 

### then 

테스트 결과 검증 

### expect 

테스트 코드 실행 및 검증 (when + then)

## Comparison to JUnit

| Spock               | JUnit                              |
| :------------------ | :--------------------------------- |
| Specification       | Test class                         |
| `setup()`           | `@Before`                          |
| `cleanup()`         | `@After`                           |
| `setupSpec()`       | `@BeforeClass`                     |
| `cleanupSpec()`     | `@AfterClass`                      |
| Feature             | Test                               |
| Feature method      | Test method                        |
| Data-driven feature | Theory                             |
| Condition           | Assertion                          |
| Exception condition | `@Test(expected=…)`                |
| Interaction         | Mock expectation (e.g. in Mockito) |


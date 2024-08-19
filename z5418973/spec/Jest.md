# Jest
In this question, you will be implementing Java classes that can be used as a testing framework. Your solution should make use of Design Patterns and constructs from the functional paradigm in a similar fashion to Lab 08: JQL.

The inspiration for this question is derived from [the JavaScript testing framework Jest](https://jestjs.io/docs/api), though no knowledge of Jest or JavaScript is required to complete this question.

You will be implementing a class `Expect` which takes in a reference object of type `E` in its construction. You will be able to use this class to create 'expressions' comparing the reference object to other objects, such as equality, less than, or greater than or equal to.

Once the expression is constructed, you will be able to "evaluate" the expression. This will result in either:
- `ExpectationFailedException` to be thrown, which is a `RuntimeException` which we have implemented for you; or
- The expectation will pass, no exception is raised and nothing else will happen.

Here is a simple example of an expectation that passes:
```java
Expect<String> e = new Expect<String>("hello"); // Construct the base expression
Expect<String> e2 = e.toEqual("hello"); // Construct the expression "hello" == "hello"
e2.evaluate() // The expression is true, no exception raised, nothing happens
```

Here is a simple example of an expectation that fails:
```java
Expect<String> e = new Expect<String>("hello"); // Construct the base expression
Expect<String> e2 = e.toEqual("world"); // Construct the expression "hello" == "world"
e2.evaluate() // The expression is false, a ExpectationFailedException is raised
```

## a) Basic Testing Operations (10 marks)
Inside `q15/Expect.java`, implement the following methods:
#### Constructor
```java
public Expect(E obj)
```
Creates a new `Expect` object and initialises values.

#### `toEqual`
```java
public Expect<E> toEqual(E other)
```
Returns a new `Expect` object with an expression testing whether the reference object is equal to the provided object.

This method does not raise any exceptions.

**Example Usage**:
```java
Expect<String> e = new Expect<String>("hello"); // Construct the base expression
Expect<String> e2 = e.toEqual("hello"); // Construct the expression "hello" == "hello"
```

#### `lessThan`
```java
public <T extends Comparable<E>> Expect<E>
    lessThan(T other)
```

Returns a new `Expect` object with an expression testing whether the reference object is less than to the provided object.

This method does not raise any exceptions.

**Example Usage**:
```java
Expect<Integer> e = new Expect<Integer>(60); // Construct the base expression
Expect<Integer> e2 = e.lessThan(50); // Construct the expression 60 < 50
```

#### `greaterThanOrEqualTo`
```java
public <T extends Comparable<E>> Expect<E> 
    greaterThanOrEqualTo(T other)
```

Returns a new `Expect` object with an expression testing whether the reference object is greater than or equal to the provided object.

This method does not raise any exceptions.

**Example Usage**:
```java
Expect<Integer> e = new Expect<Integer>(60); // Construct the base expression
Expect<Integer> e2 = e.greaterThanOrEqualTo(50); // Construct the expression 60 >= 50
```

#### `evaluate`
```java
public void evaluate()
```

Evaluates an `Expect` expression.

If the expression that is being evaluated fails, an `ExpectationFailedException` is thrown. The exception message string is up to you to define.

**Example Usage**:
```java
Expect<Integer> e = new Expect<Integer>(50); // Construct the base expression
Expect<Integer> e2 = e.lessThan(60); // Construct the expression 50 < 60
e2.evaluate() // The expression is true, no exception raised, nothing happens
```
```java
Expect<Integer> e3 = new Expect<Integer>(50); // Construct the base expression
Expect<Integer> e4 = e.greaterThanOrEqualTo(60); // Construct the expression 50 >= 60
e4.evaluate() // The expression is false, a ExpectationFailedException is raised
```

When `evaluate` is called on a base object with no constructed expression, nothing happens, i.e:
```java
Expect<Integer> e = new Expect<Integer>(1);
e.evaluate(); // Nothing happens
```

#### Other Notes
- The behaviour of "chaining" multiple basic operations together such as `toEqual`, `lessThan` or `greaterThanOrEqualTo` is undefined, and you don't have to worry about:
```java
Expect<Integer> e = new Expect<Integer>(1);
Expect<Integer> e2 = e.toEqual(1).lessThan(2).greaterThanOrEqualTo(3); // undefined
```

- **HINT**: The logic of each type of expression should be handled in the `evaluate` method.

#### Marking
A basic test for each of the above methods has been provided in `PartABasicOperationsTests` within `ExpectTest.java`. We will run further tests on this question to assess the correctness of your solution.

Any notes you wish to make regarding your design can go inside `q15.txt`.

The mark breakdown for this question is as follows:
- Correctness (6 marks)
- Design (4 marks)

## b) Decoration Operations (7 marks)
In addition to "base-level" operations, decoration operations can be performed as well.

#### `not`
```java
public Expect<E> not()
```

Negates the decorated expectation. For example, when evaluated a `toEqual` would then become a "to not equal".
```java
Expect<String> e = new Expect<String>("hello");
e.toEqual("world").not().evaluate(); // Expectation is true, no exception is raised
```

#### `skip`
```java
public Expect<E> skip()
```

Skips all of the preceding operations, when evaluated nothing is run.
```java
Expect<String> e = new Expect<String>("hello");
e.toEqual("world").skip().evaluate(); // Expectation is skipped, no exception is raised
```

#### Other Notes
- `not` and `skip` can be applied multiple times, for example:
```java
Expect<String> e = new Expect<String>("hello");
Expect<String> e2 = e.toEqual("world").not().not().not();
e2.evaluate(); // Expectation is true, no exception is raised

Expect<String> e3 = new Expect<String>("hello");
Expect<String> e4 = e.toEqual("world").not().not().skip().skip();
e4.evaluate(); // Expectation is skipped, no exception is raised
```
- No operations can be performed after a `skip`, e.g. `e.skip().toEqual("today")`, `e.skip().skip()`, `e.skip().not()` are all undefined
- A `not` operator cannot be the first expression, i.e. `e.not()` is undefined.

#### Marking
A basic test for each of the above methods has been provided in `PartBDecorationOperationsTests` within `ExpectTest.java`. We will run further tests on this question to assess the correctness of your solution.

Any notes you wish to make regarding your design can go inside `q15.txt`.

The mark breakdown for this question is as follows:
- Correctness (4 marks)
- Design (3 marks)


## c) Runnable Testing Operations (7 marks)
As well as basic functionality, good test frameworks provide the ability to assert the result of calls to runnable pieces of code.

The class inside `ExpectRunnable.java` has the following prototype:
```java
class ExpectRunnable<E extends Runnable> extends Expect<E> 
```

A `Runnable` is simply a lambda function `() -> ...` which takes in no arguments and returns nothing.

This type of expectation will wrap around a lambda and allow us to make assertions on the result of executing that lambda.

Inside `ExpectRunnable.java`, add and complete the following methods:

#### Constructors
```java
private ExpectRunnable() 
```

A private constructor with no arguments.

```java
public ExpectRunnable(E exec)
```

A public constructor with one argument, the runnable to be wrapped.

#### `toThrow`
```java
public<X extends Exception> ExpectRunnable<E> toThrow(Class<X> clz)
```

Takes in an object of type class, which is the type of exception that is expected to be thrown.

On evaluation, raises an `ExpectationFailedException` if:
- No exception is thrown by the wrapped runnable
- An exception is thrown by the wrapped runnable, but it is of a different class type to the one provided.

For example:
```java
ExpectRunnable<Runnable> exec = new ExpectRunnable<Runnable>(() -> {
    throw new RuntimeException("hello");
});

exec.toThrow(RuntimeException.class).evaluate();
```

You can think of this similarly to `assertThrows` in the JUnit framework.

#### `execute`
```java
public void execute() throws Throwable
```

Executes the inner runnable, throwing any exceptions.

#### Marking
A basic test for each of the above methods has been provided in `PartCRunnableTests` within `ExpectTest.java`. We will run further tests on this question to assess the correctness of your solution.

Any notes you wish to make regarding your design can go inside `q15.txt`.

The mark breakdown for this question is as follows:
- Correctness (4 marks)
- Design (3 marks)

## d) Parameterised Testing (6 marks) (Hard)
Parameterised testing is a type of testing that allows you to improve the quality of your test code by abstracting away values and parameterising them into variables.

In this part of the question, we will be writing an iterator that allows a user to parameterise tests.

The class inside `ExpectParameterised.java` has the following prototype:
```java
class ExpectParameterised<T, C extends Consumer<T>, L extends List<T>> 
implements Iterable<Runnable>
```

The class has the following constructor:
```java
public ExpectParameterised(C consumer, L parameters)
```

- `C consumer`, `C extends Consumer<T>` is a runnable function that takes in a value (the parameterised object) and returns nothing
- `L parameters`, `L extends List<T>` is a list of parameters to pass into the function

You will need to implement the following methods in the class:

#### `iterator`
```java
public Iterator<Runnable> iterator()
```

An iterator which iterates through a number of runnables which represent the outcome of running your test on each fo the list of parameters

#### `evaluateAll`
```java
public void evaluateAll() throws Throwable
```

A function which evaluates the provided function on all the parameters and throws an `ExpectationFailedException` if at least one of them fails.

#### Examples

To understand the usage of this class, let's have a look at the provided test:
```java
ExpectParameterised<Integer, Consumer<Integer>, List<Integer>> exp = 
    new ExpectParameterised<Integer, Consumer<Integer>, List<Integer>>(
        i -> {
            Expect<Integer> e = new Expect<Integer>(i);
            Expect<Integer> e2 = e.lessThan(10); // Create expression i < 10
            e2.evaluate();
        },
        new ArrayList<Integer>(Arrays.asList(8, 9, 10, 11)) // List of parameters
    );

Iterator<Runnable> iter = exp.iterator();
assertDoesNotThrow(() -> iter.next().run()); // 8 < 10, true
assertDoesNotThrow(() -> iter.next().run()); // 9 < 10, true
// 10 < 10, false - fails
assertThrows(ExpectationFailedException.class, () -> iter.next().run()); 
// 11 < 10, false - fails
assertThrows(ExpectationFailedException.class, () -> iter.next().run()); 

// Not all true, fails
assertThrows(ExpectationFailedException.class, () -> exp.evaluateAll()); 
```

#### Marking

A basic test for each of the above methods has been provided in `PartDParameterisedTests` within `ExpectTest.java`. We will run further tests on this question to assess the correctness of your solution.

Any notes you wish to make regarding your design can go inside `q15.txt`.

The mark breakdown for this question is as follows:
- Correctness (4 marks)
- Design (2 marks)
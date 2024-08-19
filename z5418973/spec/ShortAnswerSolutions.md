# Multiple Choice Practice Questions

- [Multiple Choice Practice Questions](#multiple-choice-practice-questions)
  - [Question 1](#question-1)
  - [Question 2 (2 marks)](#question-2-2-marks)
  - [Question 3 (2 marks)](#question-3-2-marks)
  - [Question 4 (2 marks)](#question-4-2-marks)
  - [Question 5 (2 marks)](#question-5-2-marks)
  - [Question 6](#question-6)
  - [Question 7](#question-7)
  - [Question 8](#question-8)
  - [Question 9](#question-9)
  - [Question 10](#question-10)
  - [Question 11](#question-11)
  - [Question 12](#question-12)
  - [Question 13](#question-13)
  - [Question 14](#question-14)
  - [Question 15](#question-15)

## Question 1

On a bike, there are one or more tyres.

The following relationship is an example of:

- A) **Aggregation**
- B) Composition
- C) Neither

## Question 2 (2 marks)

Consider the following lambda function which prints log. The type signature has been redacted.

`[redacted] logger = log -> System.out.println(log);`

Pick the most semantically correct type from the list below:

- A) Function<String, Boolean>
- B) **Consumer<String>**
- C) Predicate<String>
- D) Supplier<String>

## Question 3 (2 marks)

An insurance company wants to create a new way to process new home insurance claims. For an insurance claim to be processed, it needs to go through the following stages.

1. The general information of the applicant needs to be collected and processed.
2. The home/property information needs to be collected and processed.
3. Based on the level of insurance requested the quote needs to be calculated.
4. The quote is then sent to the customer.

Which design pattern would be the best for solving this problem?

- A) **Builder Pattern**
- B) Factory Pattern
- C) Template Pattern
- D) Adapter

## Question 4 (2 marks)

The following is taken from a student’s Assignment II blog.

> In Assignment II, after I completed Part 1 and refactored the code, I started work on Part 2 but found I had to go and modify everything because the design didn’t work with the new requirements.

Which SOLID principle is being violated? Select the most suitable answer.

- A) Single Responsibility Principle
- B) **Open-Closed Principle**
- C) Liskov Substitution Principle
- D) Interface Segregation Principle
- E) Dependency Inversion Principle

## Question 5 (2 marks)

Which of the following statements is correct?

- A) Overloaded methods have the same method signature, while overridden methods have a different method signature.
- B) Overloaded methods can have different access modifiers, while overridden methods must have the same access modifier.
- C) Overloaded methods are defined in different classes, while overridden methods are defined in the same class.
- D) **Overloaded methods are resolved at compile-time, while overridden methods are resolved at runtime.**

## Question 6

Suppose we have the following classes defined:

`class Shape { … }`

`class Circle extends Shape { … }`

Now suppose we have a program that contains the following objects and lists:

```java
Object o;
Shape s;
Circle c;
List<? extends Shape> l1;
List<? super Shape> l2;
```

Suppose we wanted to run the following 12 commands:

```java
l1.add(c);
l2.add(c);
l1.add(s);
l2.add(s);
l1.add(o);
l2.add(o);
c = l1.get(0);
c = l2.get(0);
s = l1.get(0);
s = l2.get(0);
o = l1.get(0);
o = l2.get(0);
```

How many of the above commands have a type error?

- A) 4
- B) 5
- C) 6
- D) **7**
- E) 8

## Question 7

Which of the following statements is untrue about method overriding?

- A) Constructors cannot be overridden
- B) If a static method in the base class, is redefined in the sub-class, the later hides the method in the base class
- C) In method overriding, run-time polymorphism ensures that instantiated, the call to any method in the base class will be resolved to the correct method, based on the run-time type of the object instantiated.
- D) **During method overriding, the overridden method in the sub-class can specify a less permissive access modifier**

## Question 8

A design pattern used to enhance a component’s functionality dynamically at run-time is:

- A) Composite Pattern
- B) **Decorator Pattern**
- C) Abstract Factory Pattern
- D) Observer Pattern

## Question 9

Which of the following exceptions must be handled by a try-catch block or declared?

- A) NullPointerException
- B) **MalformedURLException**
- C) ClassCastException
- D) ArithmeticException

## Question 10

An online camping store, sells different kinds of camping equipment. Items selected by the customer are added to a shopping cart. When a user clicks on the checkout Button, the application is required to calculate the total amount to be paid. The calculation logic for each item type varies, and we want to move all the calculation logic to one separate class, to decouple the different items from the calculation logic applied on them. As the application iterates through the disparate set of items of the shopping cart, we apply the price computation logic in the class to each item type. Which of the following patterns would be useful to design this scenario?

- A) Strategy Pattern
- B) Decorator Pattern
- C) Iterator Pattern
- D) **Visitor Patter**

## Question 11

For generic types in Java, which of the following is/are correct? Select one or more:

- A) `List<Integer>` is a subtype of `List<Number>`.
- B) **`List<? super Integer>` matches `List<Integer>` and `List<Number>`.**
- C) **The wildcard `<? extends Foo>` matches `Foo` and any subtype of `Foo`, where `Foo` is any type.**
- D) The wildcard `<? extends Foo>` matches `Foo` and any super type of `Foo`, where `Foo` is any type.

## Question 12

Consider a vending machine application that dispenses products when the proper combination of coins is deposited. Which of the following design patterns is suitable for such a vending machine application?

- A) Strategy Pattern
- B) Composite Pattern
- C) Visitor Pattern
- D) **State Pattern**

## Question 13

Consider the following code:

```java
class X {
    public void a() {}
}

class Y {
    public void b() {}
}

class Z extends X, Y {
    protected void a() {}

    public void b() {}

    public void b(String arg) {}
}
```

Now, consider the following statements about the code:

- (1) The code doesn’t compile because there is more than one class in the same file;
- (2) The code doesn’t compile because double inheritance is not possible in Java;
- (3) The code doesn’t compile because the methods a and b are not marked with @Override
- (4) The code doesn't compile because you cannot overload a method that is overriding a method in a superclass;
- (5) The code doesn’t compile because a cannot have its visibility reduced from the superclass to the subclass.
- (6) The code does compile.

Which of the following sets of statements about the code are true?

- A) (1), (2)
- B) (1), (3), (5)
- C) (2), (3), (4), (5)
- D) **(2), (5)**
- E) (2), (4), (5)
- F) (6)

## Question 14

Nick is currently working on a UNSW CSE system. Which of the following statements is most accurate about how Nick should build the system?

- A) The system should be built in Java so that Design Patterns can be used.
- B) Documentation is unimportant as the code should be written so well it is understandable.
- C) **The design should allow new engineers to easily join the project after Nick has left.**
- D) Testing the system works is a lower priority than getting it working.

## Question 15

Which of the following would be a valid use case for instanceof instead of getClass for checking the type of an object?

- A) **Checking if an object complies with an interface so that we can use a method on that interface**
- B) Implementing the equals method for an object
- C) It’s a trick question, you should never use instanceof in your code at all

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
- [Short Answer Practice Questions](#short-answer-practice-questions)
  - [Question 1](#question-1-1)
    - [Part A (2 Marks)](#part-a-2-marks)
    - [Part B (2 marks)](#part-b-2-marks)
  - [Question 2 (2 marks)](#question-2-2-marks-1)
  - [Question 3](#question-3)
  - [Question 4 (10 marks)](#question-4-10-marks)
  - [Question 5 (3 marks)](#question-5-3-marks)
  - [Question 6 (5 marks)](#question-6-5-marks)
  - [Question 7 (4 marks)](#question-7-4-marks)
  - [Question 8 (5 marks)](#question-8-5-marks)
  - [Question 9 (4 marks)](#question-9-4-marks)
  - [Question 10 (5 marks)](#question-10-5-marks)

## Question 1

On a bike, there are one or more tyres.

The following relationship is an example of:

- A) Aggregation
- B) Composition
- C) Neither

## Question 2 (2 marks)

Consider the following lambda function which prints log. The type signature has been redacted.

`[redacted] logger = log -> System.out.println(log);`

Pick the most semantically correct type from the list below:

- A) Function<String, Boolean>
- B) Consumer<String>
- C) Predicate<String>
- D) Supplier<String>

## Question 3 (2 marks)

An insurance company wants to create a new way to process new home insurance claims. For an insurance claim to be processed, it needs to go through the following stages.

1. The general information of the applicant needs to be collected and processed.
2. The home/property information needs to be collected and processed.
3. Based on the level of insurance requested the quote needs to be calculated.
4. The quote is then sent to the customer.

Which design pattern would be the best for solving this problem?

- A) Builder Pattern
- B) Factory Pattern
- C) Template Pattern
- D) Adapter

## Question 4 (2 marks)

The following is taken from a student’s Assignment II blog.

> In Assignment II, after I completed Part 1 and refactored the code, I started work on Part 2 but found I had to go and modify everything because the design didn’t work with the new requirements.

Which SOLID principle is being violated? Select the most suitable answer.

- A) Single Responsibility Principle
- B) Open-Closed Principle
- C) Liskov Substitution Principle
- D) Interface Segregation Principle
- E) Dependency Inversion Principle

## Question 5 (2 marks)

Which of the following statements is correct?

- A) Overloaded methods have the same method signature, while overridden methods have a different method signature.
- B) Overloaded methods can have different access modifiers, while overridden methods must have the same access modifier.
- C) Overloaded methods are defined in different classes, while overridden methods are defined in the same class.
- D) Overloaded methods are resolved at compile-time, while overridden methods are resolved at runtime.

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
- D) 7
- E) 8

## Question 7

Which of the following statements is untrue about method overriding?

- A) Constructors cannot be overridden
- B) If a static method in the base class, is redefined in the sub-class, the later hides the method in the base class
- C) In method overriding, run-time polymorphism ensures that instantiated, the call to any method in the base class will be resolved to the correct method, based on the run-time type of the object instantiated.
- D) During method overriding, the overridden method in the sub-class can specify a less permissive access modifier

## Question 8

A design pattern used to enhance a component’s functionality dynamically at run-time is:

- A) Composite Pattern
- B) Decorator Pattern
- C) Abstract Factory Pattern
- D) Observer Pattern

## Question 9

Which of the following exceptions must be handled by a try-catch block or declared?

- A) NullPointerException
- B) MalformedURLException
- C) ClassCastException
- D) ArithmeticException

## Question 10

An online camping store, sells different kinds of camping equipment. Items selected by the customer are added to a shopping cart. When a user clicks on the checkout Button, the application is required to calculate the total amount to be paid. The calculation logic for each item type varies, and we want to move all the calculation logic to one separate class, to decouple the different items from the calculation logic applied on them. As the application iterates through the disparate set of items of the shopping cart, we apply the price computation logic in the class to each item type. Which of the following patterns would be useful to design this scenario?

- A) Strategy Pattern
- B) Decorator Pattern
- C) Iterator Pattern
- D) Visitor Patter

## Question 11

For generic types in Java, which of the following is/are correct? Select one or more:

1. `List<Integer>` is a subtype of `List<Number>`.
2. `List<? super Integer>` matches `List<Integer>` and `List<Number>`.
3. The wildcard `<? extends Foo>` matches `Foo` and any subtype of `Foo`, where `Foo` is any type.
4. The wildcard `<? extends Foo>` matches `Foo` and any super type of `Foo`, where `Foo` is any type.

## Question 12

Consider a vending machine application that dispenses products when the proper combination of coins is deposited. Which of the following design patterns is suitable for such a vending machine application?

- A) Strategy Pattern
- B) Composite Pattern
- C) Visitor Pattern
- D) State Pattern

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
- D) (2), (5)
- E) (2), (4), (5)
- F) (6)

## Question 14

Nick is currently working on a UNSW CSE system. Which of the following statements is most accurate about how Nick should build the system?

- A) The system should be built in Java so that Design Patterns can be used.
- B) Documentation is unimportant as the code should be written so well it is understandable.
- C) The design should allow new engineers to easily join the project after Nick has left.
- D) Testing the system works is a lower priority than getting it working.

## Question 15

Which of the following would be a valid use case for instanceof instead of getClass for checking the type of an object?

- A) Checking if an object complies with an interface so that we can use a method on that interface
- B) Implementing the equals method for an object
- C) It’s a trick question, you should never use instanceof in your code at all

# Short Answer Practice Questions

> We are not providing sample answers for the following, but if you wish to get clarifications on what we might expect for each of these questions, make a post on the forum :)

## Question 1

1. Identify the logic error present (1 mark); and
2. Write a failing assertion that would catch the logic error as part of a unit test (e.g. `assertEquals(4, f(2))`) (1 mark)

### Part A (2 Marks)

```java
@Override
public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null) return false;
    if (!(obj instanceof Article)) return false;

    Article other = (Article) obj;

    return this.title.equals(other.title) && this.views.equals(other.views);
}
```

### Part B (2 marks)

```java
public List<Integer> withoutOddNumbers(List<Integer> numbers) {
    for (Integer number : numbers) {
        if (number % 2 != 0) {
            numbers.remove(number);
        }
    }

    return new ArrayList<Integer>(numbers);
}
```

#### Answer

a) The `equals` method incorrectly uses `this.views.equals(other.views)` without checking if `views` is `null`. This could potentially result in a NullPointerException. This would be caught through a test which passes an `Article` with `null` views:

```java
Article article1 = new Article("Title", null);
Article article2 = new Article("Title", 100);
assertEquals(true, article1.equals(article2)); // this will fail with the current code
```

b) The method modifies the list while iterating over it. This will lead to a `ConcurrentModificationException`. This could be fixed using `Iterator` directly.

```java
List<Integer> numbers = Arrays.asList(1,2,3,4,5);
List<Integer> result = withoutOddNumbers(numbers);
assertEquals(Arrays.asList(2,4), result); // This will fail with the exception
```

## Question 2 (2 marks)

Consider the `Angle` class versus the `MathsHelper` class from the Blackout assignment, provided in `Angle.java` and `MathsHelper.java`.

Which class do you think has better **cohesion**? Justify your answer

#### Answer

`Angle` has better cohesion, as it adheres well to the Single Responsibility Principle. `MathsHelper` attempts to cover many unrelated operations in a single class , while all of `Angle`'s operations are directly related to the use of angles.

## Question 3

In 22T3 COMP2511 is contemplating moving to Jira for students to manage their projects. There are three different types of Jira boards that can be used: Scrum, Kanban and Bug Tracking. All boards have the same flow of work, and allow for features including support for issue tracking and customisation of project-specific features. However, some elements may vary for each type of board - Scrum boards take two week sprints whereas Kanban has a series of epics that are progressed through, and bug tracking projects only have a single backlog. Once a project is created as Scrum, Kanban or Bug Tracking it cannot change its type.

Which Design Pattern could be used to model this? In answering, justify your choice by describing how the above scenario relates to the **key characteristics** of your chosen Design Pattern.

#### Answer

Since the boards represent distinct strategies for managing workloads, a Template Pattern is the best solution. This pattern allows the differences in behaviour between board types to be encapsulated without any change affecting the overall assumed workflow. Additionally, the Template pattern promotes composition over inheritance, which makes sense given that the board type cannot be changed after creation.

This would likely take the form of a `BoardType` interface, and then a `ScrumBoard`, `KanbanBoard`, and `BugTrackingBoard` class, each of which implements the `BoardType` interface. This also ensures the extensibility of the system in the case that a new kind of board is added.

## Question 4 (10 marks)

Consider the following Java code:

```java
class Foo {
    public ArrayList<String> bar() {
        return new ArrayList<String>();
    }
}

class Foo2 extends Foo {
    @Override
    public List<String> bar() {
        return new ArrayList<String>();
    }
}
```

The code currently does not compile and has the following error message (on `List<String> bar` in `Foo2`):

> The return type is incompatible with `Foo.bar()`

- a) Explain the difference between **covariance** and **contravariance**. (2 marks)
- b) Does the above code fail to compile because it breaks **covariance** or **contravariance**? (1 mark)
- c) With reference to Design by Contract, explain how the above code constitutes invalid inheritance and **violates the Liskov Substitution Principle**. (4 marks)
- d) The above error is a compile-time error. Many errors due to LSP we have studied are logic errors. Explain why the above compilation error is more desirable than allowing the code to compile, with reference to concepts surrounding **risk engineering**. (3 marks)

#### Answer

**I am skipping a, b, and d since [we were told in the revision lecture](https://www.youtube.com/watch?v=KvnXzfRiaak) that these would not be tested.**

c) `Foo2` overrides `Foo::bar` with a supertype of the original return type (`ArrayList` extends `List`). According to LSP, `Foo2` should always be able to replace `Foo`. This means that `Foo2` may only have return types and post-conditions that are within the constraints of their counterparts in `Foo`. However, since `Foo2::bar` returns a supertype of what would be expected from `Foo::bar`, it violates LSP. Weakening the implicit post-condition (i.e. the return type) breaks LSP/substitutability, and is therefore a violation of the Design By Contract principle.


## Question 5 (3 marks)

Carl, Amanda and Alvin are working on the Assignment II codebase to add some new features for 23T3. They come across a note from the previous engineering team:

> We were trying to make the way Logical Switches are implemented more extensible through refactoring in a few different classes. However, we found that when we tried to make these changes, the Conductor class would always break.

State what design smell is present in the above description, and explain how the smell present is different from Shotgun Surgery.

#### Answer

The above code would be considered rigid/fragile, (i.e. difficult to change without breaking other parts of the codebase). This is likely in the form of Inappropriate Intimacy in the codebase. Unlike in Shotgun Surgery, where many classes would need to be changed to fix the issue, only `Conductor` needs to be changed in this case.

## Question 6 (5 marks)

Consider the following student's Assignment I code:

```java
for (Entity entity2 : entList) {
    if (entity.canCommunicate(entity2)) {
        if (entity2 instanceof RelaySatellite) {
            for (Entity entity3 : entList) {
                if (entity instanceof StandardSatellite && !(entity3 instanceof DesktopDevice)) {
                    if (entity2.canCommunicate(entity3)) {
                        canCommunicate.add(entity3.getId());
                    }
                } else if (!(entity instanceof StandardSatellite) && entity2.canCommunicate(entity3)) {
                    canCommunicate.add(entity3.getId());
                }
            }
        }
        canCommunicate.add(entity2.getId());
    }
}
```

- a) State two code smells present in the above code. (2 marks)
- b) In your own words, explain what you think is the underlying design problem causing this code smell and what should be done to improve the design. (3 marks)

#### Answer

Long method and duplicated code are both present in this code.

The underlying design problem is rigidity. This code would be extremely difficult to add new types of entity. This is therefore a violation of the Open-Closed principle, as this code is very tightly coupled with the classes used.

Polymorphism could be used to resolve this, using a method such as `Entity::communicateWith`, where each item directly handles which other classes it can communicate with.

**This is very much dummy code, it's definitely wrong but should give the vibes**
```java
public class Entity {
    //blah blah existing stuff goes here

    public void communicateWith(Entity entity) {
        if (this.canCommunicate(entity) && entity.canCommunicate(this)) {
            canCommunicate.add(entity.getId());
        }
    }
}
```

## Question 7 (4 marks)

You’ve been asked to develop a web-based system for selling tickets to Taylor Swift’s 2025 concert tour. Because of the prevalence of “Swifties” (fans of Taylor Swift), as soon as tickets are made available the system will be immediately flooded with people booking tickets. This may result in tickets being sold that don’t exist, corrupting data and/or causing other logic errors.

With reference to multithreading, how would you design your web server to avoid this issue?

#### Answer

The use of a Singleton pattern and `synchronized` would ensure that only 1 thread can operate a database operation at a time. An atomic operation (check available and modify if it is) would also prevent race conditions. "Pessimistic locking", where the code locks a ticket/seat as soon as a transaction is commenced (i.e. as soon as someone clicks on the seat), would guarantee consistency (although it may also lead to a reduction in concurrency).

## Question 8 (5 marks)

Large companies with many projects need a way to allow people to keep track of multiple projects at the same time. A system called “Team Central” allows a project manager to create a ticket for their project. They can then add a series of stakeholders to the ticket who are interested in how the project is progressing.

Every week, the project manager posts an update on the Team Central ticket with information about how the project is progressing, and whether it is On Track, Off Track, At Risk or Complete. The stakeholders are notified via email when this update is posted. It its possible for new stakeholders to be added to the list, and for stakeholders to be removed from the list while the project is ongoing.

What Design Pattern could be used to model this? In answering, justify your choice by describing how the above scenario relates to the key characteristics of your chosen Design Pattern.

#### Answer

An observer pattern could be used to model this process, since the stakeholders need to receive updates on the state change of the projects. New stakeholders could be added as a new observer.

## Question 9 (4 marks)

With reference to Design by Contract and the Liskov Substitution Principle, explain whether or not the following inheritance relationship is valid. Justify your answer.

```java
class StandardUNSWLatePenalty {
    /**
     * @postconditions: The late penalty will be at most
     * the number of days late * 5
     */
    public int calculateLatePenalty(LocalDateTime dueDate, LocalDateTime submittedDate) {
        // ...
    }
}

class COMP2511AssignmentIILatePenalty extends StandardUNSWLatePenalty {
    /**
     * @postconditions: The late penalty is the number of days late * 2
     */
    public int calculateLatePenalty(LocalDateTime dueDate, LocalDateTime submittedDate) {
        // ...
    }
}
```

#### Answer

There are no changes to the pre-conditions in the subclass, and the post-conditions of the subclass are within the constraints of the superclass. Therefore, LSP and DbC are both upheld, and the relationship is valid.

## Question 10 (5 marks)

Suppose that Assignment II contained an additional component, Task 4.

In this task, students had to adapt to another evolution in the requirements that introduced the concept of “power ups”.

At any tick in the game, there is a random chance of the player being given a potion in their inventory which they can consume at any time and will regenerate their health instantly. This probability is specified in the configuration file.

Tina and her group have the following design to test this functionality:

> We are going to write a test that loads the player into the dungeon, and then runs for 1000 ticks of the game. If the power up potion hasn’t been added into the player’s inventory after 1000 ticks, then the test will fail.

What are the issues with this approach to test design? What techniques could Tina and her team use to ensure a more robust test?

#### Answer

Randomness is extremely difficult to test for. Since each tick is independent of the one before it, assuming a 50/50 chance of the potion being given, there is a $0.5^{1000}$ chance that the potion is not given despite the code working correctly. Additionally, the brute force approach is extremely inefficient, and tests that rely on compliance from randomness are likely to take up a significant amount of test time. This reduces the efficiency of development for the assignment (and clogs up GitLab's runners).

A better approach would be the use of pseudo-random generation, where tests are fed a known seed. This allows the developers to test against known outputs, making the tests reliable. In the actual gameplay, a "true" randomness source could be used to generate the initial seed, reducing the predictability of the player's experience.

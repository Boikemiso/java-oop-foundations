# 🗺️ Java OOP Foundations - Learning Roadmap

This document outlines the **8-module learning path** through Object-Oriented Programming. Each module builds on the previous one, creating a complete understanding of OOP principles.

## 📊 Module Overview

```
┌─────────────────────────────────────────────────────────────────┐
│                  JAVA OOP FOUNDATIONS ROADMAP                   │
├─────────────────────────────────────────────────────────────────┤
│                                                                 │
│  Module 1: Classes & Objects  ........................ 2 hours   │
│  ├─ Basic class design                                         │
│  ├─ Object instantiation                                       │
│  └─ State and behavior                                         │
│        ↓                                                        │
│  Module 2: Encapsulation  ............................. 2 hours  │
│  ├─ Access modifiers (public, private, protected)            │
│  ├─ Getters and setters                                       │
│  └─ Information hiding                                         │
│        ↓                                                        │
│  Module 3: Inheritance  ............................... 2 hours  │
│  ├─ Class hierarchies                                         │
│  ├─ Reusing code through extends                             │
│  └─ Method overriding                                         │
│        ↓                                                        │
│  Module 4: Polymorphism  .............................. 2 hours  │
│  ├─ Dynamic dispatch                                          │
│  ├─ Polymorphic collections                                  │
│  └─ Runtime behavior variation                               │
│        ↓                                                        │
│  Module 5: Interfaces  ................................ 2 hours  │
│  ├─ Defining contracts                                        │
│  ├─ Multiple implementation                                   │
│  └─ Interface hierarchies                                     │
│        ↓                                                        │
│  Module 6: Abstract Classes  .......................... 2 hours  │
│  ├─ Template patterns                                         │
│  ├─ Partial implementation                                    │
│  └─ Abstract methods                                          │
│        ↓                                                        │
│  Module 7: Design Patterns  ........................... 2 hours  │
│  ├─ Singleton, Factory, Builder               │
│  ├─ Strategy pattern                                          │
│  └─ When to use each pattern                                  │
│        ↓                                                        │
│  Module 8: Integration Project  ...................... 2 hours  │
│  ├─ Real-world OOP application                               │
│  ├─ Combining all concepts                                    │
│  └─ Best practices synthesis                                  │
│                                                                 │
└─────────────────────────────────────────────────────────────────┘

           Total: 14-18 hours spread over 2-3 weeks
```

---

## Module 1: Classes & Objects

### 🎯 Objectives
- Understand what a class is and why we need them
- Learn how to design a class with fields and methods
- Know how to instantiate objects and access their members
- Recognize the relationship between classes and objects

### 📚 Key Concepts
- **Class declaration** - `public class ClassName { }`
- **Fields** - Data members that store state
- **Constructors** - Special methods that initialize objects
- **Methods** - Behavior and operations on objects
- **Objects** - Instances of a class

### 🔗 Prerequisites
From [java-fundamentals](https://github.com/Bongani-Xhentsa/java-fundamentals):
- ✅ Primitive data types (Module 1)
- ✅ String handling (Module 3)
- ✅ Method signatures (Module 6)

### 💻 Exercises
1. **Person** - Basic class with fields and getters
2. **BankAccount** - Methods that modify state
3. **Car** - Accumulated state across method calls
4. **Student** - toString() override
5. **Product** - Constructor overloading
6. **Circle** - Mathematical calculations on objects
7. **StringBuffer** - Method chaining pattern

### ⏱️ Estimated Time: 2 hours

### ✅ Success Criteria
- All 7 exercise classes implemented
- All unit tests passing (green ✅)
- toString() methods showing correct object representation
- Constructors properly initializing fields

---

## Module 2: Encapsulation

### 🎯 Objectives
- Understand information hiding and access control
- Learn when to use public, private, and protected
- Master getter and setter patterns
- Design immutable objects

### 📚 Key Concepts
- **Access modifiers** - `public`, `private`, `protected`
- **Getters** - Controlled read access to fields
- **Setters** - Controlled write access to fields
- **Immutability** - Objects that can't be changed after creation
- **Invariants** - Guarantees about object state

### 🔗 Prerequisites
- ✅ Module 1: Classes & Objects
- ✅ java-fundamentals Module 5: Final keyword

### 💻 Exercises
- BankAccount with validation in setters
- Immutable Person class
- Utility class with static methods
- Builder pattern introduction

### ⏱️ Estimated Time: 2 hours

### ✅ Success Criteria
- Proper use of access modifiers
- Setters validate input before storing
- No direct access to private fields
- Immutable objects properly designed

---

## Module 3: Inheritance

### 🎯 Objectives
- Understand class hierarchies and the `extends` keyword
- Learn how to reuse code through inheritance
- Master method overriding
- Know when inheritance is appropriate

### 📚 Key Concepts
- **Inheritance** - `extends` keyword for hierarchy
- **Parent/Child** - Superclass and subclass relationships
- **super()** - Calling parent class constructor
- **Method overriding** - Child class provides different implementation
- **is-a relationship** - Semantic meaning of inheritance

### 🔗 Prerequisites
- ✅ Module 1: Classes & Objects
- ✅ Module 2: Encapsulation

### 💻 Exercises
- Shape hierarchy (Circle, Rectangle, Triangle)
- Employee hierarchy (Employee, Manager, Developer)
- Vehicle hierarchy with polymorphic behavior

### ⏱️ Estimated Time: 2 hours

### ✅ Success Criteria
- Proper use of `extends` keyword
- super() calls parent constructor
- Overridden methods have correct signatures
- Subclasses inherit fields and methods from parent

---

## Module 4: Polymorphism

### 🎯 Objectives
- Understand dynamic dispatch and runtime method resolution
- Write code that works with objects of multiple types
- Design flexible collections using polymorphism
- Recognize polymorphic behavior in action

### 📚 Key Concepts
- **Dynamic dispatch** - JVM determines which method to call at runtime
- **Upcasting** - Treating subclass as superclass
- **Polymorphic collections** - List<Shape> containing different shapes
- **Liskov Substitution** - Subclass can replace superclass
- **Type safety** - Knowing when polymorphism is safe

### 🔗 Prerequisites
- ✅ Module 1: Classes & Objects
- ✅ Module 3: Inheritance
- ✅ java-fundamentals Module 2: Type casting

### 💻 Exercises
- Polymorphic Shape collection
- Payment processor with multiple payment methods
- Animal hierarchy with polymorphic behavior

### ⏱️ Estimated Time: 2 hours

### ✅ Success Criteria
- Polymorphic methods called correctly at runtime
- Collections work with multiple subclass types
- Method overriding enabled correct polymorphic behavior
- Type casting used appropriately

---

## Module 5: Interfaces

### 🎯 Objectives
- Understand interfaces as contracts
- Design systems using interface-based programming
- Implement multiple interfaces in one class
- Build flexible, decoupled architectures

### 📚 Key Concepts
- **Interface** - Contract that classes must fulfill
- **Implements** - Class agrees to follow interface contract
- **Multiple implementation** - Classes can implement multiple interfaces
- **Interface hierarchy** - Interfaces extending other interfaces
- **Separation of concerns** - Defining what without specifying how

### 🔗 Prerequisites
- ✅ Module 1: Classes & Objects
- ✅ Module 3: Inheritance
- ✅ Module 4: Polymorphism

### 💻 Exercises
- Comparable interface with custom sorting
- Multiple interfaces (Drawable, Resizable)
- Repository pattern with interfaces
- Duck typing with interfaces

### ⏱️ Estimated Time: 2 hours

### ✅ Success Criteria
- Interfaces properly define contracts
- Classes correctly implement all interface methods
- Multiple interfaces implemented without conflict
- Interface-based code is decoupled and flexible

---

## Module 6: Abstract Classes

### 🎯 Objectives
- Understand abstract classes as templates
- Learn when to use abstract classes vs interfaces
- Design class hierarchies using partial implementation
- Apply the template method pattern

### 📚 Key Concepts
- **Abstract class** - Cannot be instantiated directly
- **Abstract method** - Must be implemented by subclass
- **Template method** - Abstract class defines algorithm structure
- **Concrete methods** - Partial implementation provided
- **Abstract vs Interface** - Choosing the right tool

### 🔗 Prerequisites
- ✅ Module 1: Classes & Objects
- ✅ Module 3: Inheritance
- ✅ Module 5: Interfaces

### 💻 Exercises
- Document hierarchy with abstract Document class
- Handler pattern with abstract base class
- Template method for data processing

### ⏱️ Estimated Time: 2 hours

### ✅ Success Criteria
- Abstract classes correctly prevent instantiation
- Abstract methods must be implemented by subclasses
- Template method pattern properly implemented
- Code reuse achieved through partial implementation

---

## Module 7: Design Patterns

### 🎯 Objectives
- Learn proven solutions to common programming problems
- Recognize when to apply specific patterns
- Implement patterns correctly
- Balance pattern use with simplicity

### 📚 Key Concepts
- **Singleton** - Only one instance of a class
- **Factory** - Creating objects without specifying exact classes
- **Builder** - Constructing complex objects step by step
- **Strategy** - Selecting algorithm at runtime
- **Observer** - Objects notifying subscribers of changes

### 🔗 Prerequisites
- ✅ Module 1-6: All previous modules

### 💻 Exercises
- Singleton database connection
- Factory for creating different payment processors
- Builder for complex object construction
- Strategy for sorting and filtering

### ⏱️ Estimated Time: 2 hours

### ✅ Success Criteria
- Patterns implemented correctly
- Pattern selection appropriate for use case
- Code benefits from pattern's structure
- Not over-engineering with unnecessary patterns

---

## Module 8: Integration Project

### 🎯 Objectives
- Combine all OOP concepts into a real application
- Practice design thinking and architectural decisions
- Build something meaningful and useful
- Demonstrate mastery of OOP principles

### 📚 Key Concepts
- **System design** - Planning architecture before coding
- **Multiple classes** - Working with interconnected classes
- **Design patterns** - Applying patterns where beneficial
- **Best practices** - Clean code, SOLID principles
- **Testing** - Ensuring correctness of complex systems

### 🔗 Prerequisites
- ✅ Module 1-7: All previous modules

### 💻 Project Ideas
- **Online Library System**
  - Books, Members, Borrowing system
  - Uses: Encapsulation, Inheritance, Polymorphism, Interfaces

- **E-commerce Shopping Cart**
  - Products, Cart, Orders, Payments
  - Uses: Encapsulation, Factory, Strategy patterns

- **Game Character System**
  - Characters, Abilities, Equipment, Leveling
  - Uses: Inheritance, Polymorphism, Builder pattern

### ⏱️ Estimated Time: 2 hours (planning + implementation)

### ✅ Success Criteria
- System demonstrates all OOP concepts
- Code is well-organized and maintainable
- Design patterns applied appropriately
- All unit tests passing
- Clear separation of concerns

---

## 📈 Learning Progression

### Week 1: Foundation (Modules 1-2)
- Days 1-2: Module 1 (Classes & Objects)
- Days 3-4: Module 2 (Encapsulation)
- Review and reflect on fundamentals

### Week 2: Hierarchy (Modules 3-5)
- Days 5-6: Module 3 (Inheritance)
- Days 7-8: Module 4 (Polymorphism)
- Days 9-10: Module 5 (Interfaces)
- Consolidate understanding of OOP relationships

### Week 3: Mastery (Modules 6-8)
- Days 11-12: Module 6 (Abstract Classes)
- Days 13-14: Module 7 (Design Patterns)
- Days 15-16: Module 8 (Integration Project)
- Demonstrate comprehensive OOP knowledge

---

## 🎓 How to Use This Roadmap

1. **Follow the order** - Each module builds on previous ones
2. **Complete all exercises** - Don't skip any exercises
3. **Run tests frequently** - Validate your implementation
4. **Understand, don't memorize** - Focus on the why, not just the how
5. **Reference java-fundamentals** - See how fundamentals enable OOP
6. **Take breaks** - Don't try to complete all modules in one day
7. **Reflect** - After each module, think about when you'd use it

---

## 🤝 Connecting to java-fundamentals

Each module references concepts from [java-fundamentals](https://github.com/Bongani-Xhentsa/java-fundamentals):

| OOP Module | java-fundamentals Reference |
|------------|-----------------------------|
| Classes & Objects | Primitive types, Strings, Method signatures |
| Encapsulation | Final keyword, Variable scope |
| Inheritance | Reference types, Type casting |
| Polymorphism | Type casting, Exception handling |
| Interfaces | Method signatures, Type casting |
| Abstract Classes | Type casting, Scope |
| Design Patterns | All fundamentals |
| Integration | All fundamentals + OOP concepts |

See how these concepts interconnect!

---

## 🏆 After Completing This Course

You'll be able to:
- ✅ Design classes that model real-world entities
- ✅ Build class hierarchies that promote code reuse
- ✅ Write polymorphic code that's flexible and maintainable
- ✅ Use design patterns to solve common problems
- ✅ Build scalable, professional Java applications
- ✅ Understand and review other people's OOP code
- ✅ Make good design decisions about inheritance vs composition
- ✅ Apply SOLID principles to your code

---

**Ready to start?** Begin with [Module 1: Classes & Objects](README.md#-exercise-modules). 🚀

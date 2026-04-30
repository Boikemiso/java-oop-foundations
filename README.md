# 📚 Java OOP Foundations Homework

Welcome! This repository contains a **comprehensive OOP learning roadmap** designed to help you master Object-Oriented Programming in Java. It builds directly on the solid fundamentals you've established in the **[java-fundamentals](https://github.com/Bongani-Xhentsa/java-fundamentals)** repository.

## 🎓 Building on Java Fundamentals

As we explored in [java-fundamentals](https://github.com/Bongani-Xhentsa/java-fundamentals), you've mastered:
- ✅ Primitive data types and type casting
- ✅ String handling and immutability
- ✅ Variable scope and the `final` keyword
- ✅ Method signatures and exception handling

Now it's time to leverage those fundamentals to build **robust, reusable, maintainable code through Object-Oriented Programming**.

## 📖 Why This Matters

Here's the thing—Object-Oriented Programming isn't just a syntax change. It's a **mindset shift** from thinking about code as a sequence of steps to thinking about it as a collection of interacting objects.

Think of it this way: 
- In java-fundamentals, you built the **individual LEGO bricks** (primitive types, methods, basic logic)
- In java-oop-foundations, you'll learn how to **design and compose those bricks into elegant structures** (classes, inheritance, polymorphism)
- Together, these skills let you build **enterprise-scale applications**

Don't rush through these exercises—understanding OOP deeply now means you'll write better code for the rest of your career.

## 🎯 Learning Objectives

After completing this homework, you will:

- ✅ **Classes & Objects** - Design and instantiate classes that model real-world entities
- ✅ **Encapsulation** - Hide internal details and expose clean public interfaces
- ✅ **Inheritance** - Build class hierarchies that promote code reuse
- ✅ **Polymorphism** - Write flexible code that works with objects of multiple types
- ✅ **Interfaces** - Design contracts that multiple classes can implement
- ✅ **Abstract Classes** - Create templates that guide subclass implementation
- ✅ **Design Patterns** - Apply proven solutions to common programming problems
- ✅ **Integration** - Combine all OOP concepts into a real-world application

## 📋 Exercise Modules

This homework consists of **8 progressive modules**:

| Module | Topic | Key Concepts | Estimated Time |
|--------|-------|--------------|----------------|
| 1 | **Classes & Objects** | Classes, constructors, object instantiation | 2 hours |
| 2 | **Encapsulation** | Access modifiers, getters/setters, immutability | 2 hours |
| 3 | **Inheritance** | extends, super(), method overriding | 2 hours |
| 4 | **Polymorphism** | Dynamic dispatch, polymorphic collections | 2 hours |
| 5 | **Interfaces** | Contracts, multiple implementation | 2 hours |
| 6 | **Abstract Classes** | Templates, partial implementation | 2 hours |
| 7 | **Design Patterns** | Singleton, Factory, Builder, Strategy | 2 hours |
| 8 | **Integration Project** | Real-world OOP application | 2 hours |

**Estimated Total Time**: 14-18 hours spread over 2-3 weeks

## 🚀 Getting Started

### Step 1: Fork This Repository
1. Click **Fork** at the top-right of this page
2. Click **Create fork**

### Step 2: Clone Your Fork
```bash
git clone https://github.com/YOUR-USERNAME/java-oop-foundations.git
cd java-oop-foundations
```

### Step 3: Set Up Environment
Follow [SETUP.md](SETUP.md) for JDK and Maven installation (same as java-fundamentals).

Verify:
```bash
java -version
mvn --version
```

## 💻 How to Complete Exercises

1. **Pick a module** (start with Module 1)
2. **Open the exercise file** (e.g., `src/main/java/com/oop/module1/ClassesExercises.java`)
3. **Read the TODO comments** - they explain what to implement and why
4. **Write the code** to complete each exercise
5. **Run the tests**: `mvn test`
6. **Fix failures** based on test output
7. **Move to next module** once all tests pass

## 🧪 Running Tests

```bash
# Run all tests
mvn test

# Run specific module tests
mvn test -Dtest=ClassesExercisesTest

# Run single test method
mvn test -Dtest=ClassesExercisesTest#testPersonClass
```

**Green ✅ = Correct implementation**  
**Red ❌ = Needs fixing**

## 📖 Understanding the Connection to java-fundamentals

Each exercise builds on concepts from java-fundamentals:

**Module 1 (Classes & Objects)** references:
- Primitive types from java-fundamentals Module 1
- Type casting from Module 2
- String immutability from Module 3

**Module 2 (Encapsulation)** references:
- The `final` keyword from java-fundamentals Module 5
- Variable scope from Module 4

**Module 3 (Inheritance)** references:
- Reference types from java-fundamentals Module 1
- Type casting from Module 2

And so on... This is by design! You'll see how fundamentals enable OOP.

## 📬 Submission Workflow

### Step 1: Commit Your Work
```bash
git add .
git commit -m "Complete OOP Foundations homework - Bongani-Xhentsa"
```

### Step 2: Push to Your Fork
```bash
git push origin main
```

### Step 3: Create Pull Request
1. Go to your fork on GitHub
2. Click **Contribute** → **Open pull request**
3. Title: `Java OOP Foundations Homework - Bongani-Xhentsa`
4. Description:
   ```
   # Homework Submission
   **Name:** Bongani-Xhentsa
   **Date:** 2026-04-30
   
   ## Modules Completed
   - [x] Module 1: Classes & Objects
   - [x] Module 2: Encapsulation
   - [ ] Module 3: Inheritance
   
   ## Test Results
   All tests passing: ✅
   
   (Paste: mvn test output)
   ```
5. Click **Create pull request**

## 📊 Grading Rubric

| Criteria | Points |
|----------|--------|
| **Correctness** | 50% |
| **Code Quality** | 25% |
| **Completeness** | 15% |
| **Understanding** | 10% |

**Pass**: 70% (56 points)

## ❓ FAQ

**Can I use an IDE?**  
Yes! VSCode or IntelliJ recommended. See SETUP.md.

**Do I need to complete all 8 modules?**  
Start with Module 1. Modules 2-8 are scaffolded—complete what you can. Each module builds on previous ones.

**What if I'm stuck?**  
Read the TODO comments carefully—they explain the "why". Check the test file for clues. Reference java-fundamentals when you see links.

**Can I look at online solutions?**  
Use documentation and tutorials for learning, but write your own code. Copying solutions defeats the learning.

**How long will this take?**  
14-18 hours spread over 2-3 weeks. Don't rush—understanding beats speed.

**What if I haven't completed java-fundamentals?**  
You should complete [java-fundamentals](https://github.com/Bongani-Xhentsa/java-fundamentals) first. That repository builds the foundation needed here.

**Can I modify the test files?**  
No—test files are read-only. They define the contract you must fulfill.

## 🔨 Troubleshooting

**"Maven command not found"**
- Reinstall Maven and add to PATH (see SETUP.md)

**"Cannot find symbol"**
- Check your package names match: `com.oop.module1`
- Verify class names exactly match test imports
- Run: `mvn clean` then `mvn test`

**"Tests won't compile"**
- Check method signatures match test expectations
- Verify all required methods are implemented
- Look at error messages—they tell you what's missing

**"Class not found"**
- Ensure file is in correct directory: `src/main/java/com/oop/moduleX/`
- Check package declaration at top of file
- Rebuild: `mvn clean compile`

## 📖 Resources

- [Java Documentation](https://docs.oracle.com/en/java/)
- [Classes and Objects](https://docs.oracle.com/javase/tutorial/java/concepts/)
- [Inheritance](https://docs.oracle.com/javase/tutorial/java/IandI/)
- [Polymorphism](https://docs.oracle.com/javase/tutorial/java/IandI/polymorphism.html)
- [Interfaces](https://docs.oracle.com/javase/tutorial/java/IandI/createinterface.html)
- [Abstract Classes](https://docs.oracle.com/javase/tutorial/java/IandI/abstract.html)
- [Design Patterns](https://refactoring.guru/design-patterns/java)
- [java-fundamentals Repository](https://github.com/Bongani-Xhentsa/java-fundamentals) - Your prerequisite course

## 🎉 Final Thoughts

OOP is the foundation of professional Java development. This homework teaches not just syntax, but the **philosophy and design thinking** behind object-oriented code.

When you finish, you'll be able to:
- Recognize when to create a new class
- Design class hierarchies that make sense
- Write polymorphic code that's flexible and maintainable
- Apply design patterns to solve common problems
- Build applications that scale

Don't rush—understanding beats speed. The time you invest now in mastering these concepts will pay dividends for years.

---

**Ready?** Fork the repo and start with [Module 1](ROADMAP.md#module-1-classes--objects)! 🚀  
**Questions?** Review the TODO comments in exercise files first, then check the test file for hints.  
**Need a refresher?** Reference the [java-fundamentals](https://github.com/Bongani-Xhentsa/java-fundamentals) repository.

Happy coding! 💻

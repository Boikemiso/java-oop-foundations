# 🔧 Setup Guide - Java OOP Foundations

This guide walks you through setting up everything you need to complete the OOP homework. It's identical to the [java-fundamentals SETUP.md](https://github.com/Bongani-Xhentsa/java-fundamentals/blob/main/SETUP.md)—you likely have this configured already!

## What You Need

1. **Java Development Kit (JDK 17+)** - To write and run Java code
2. **Maven** - To manage the project and run tests
3. **Git** - For version control
4. **(Optional) An IDE** - VSCode or IntelliJ for easier coding

## 🖥️ Installation by Operating System

### Windows

#### 1. Installing Java (JDK)

1. Go to [Oracle Java Downloads](https://www.oracle.com/java/technologies/downloads/)
2. Download **JDK 17** (LTS version) - Windows installer
3. Run the installer and follow the prompts
4. Use default installation location
5. Restart your computer

**Verify:**
```bash
java -version
javac -version
```

#### 2. Installing Maven

1. Go to [Apache Maven Download](https://maven.apache.org/download.cgi)
2. Download the binary zip archive
3. Extract to `C:\maven` or `C:\tools\maven`
4. Add to PATH:
   - Right-click **This PC** → **Properties**
   - Click **Advanced system settings**
   - Click **Environment Variables**
   - Under **System variables**, click **New**
   - Variable name: `MAVEN_HOME`
   - Variable value: `C:\maven\apache-maven-3.x.x`
   - Click **OK**
   - Edit `Path` variable, click **New**, add: `%MAVEN_HOME%\bin`
   - Click **OK** and restart terminal

**Verify:**
```bash
mvn --version
```

#### 3. Installing Git

1. Go to [Git Downloads](https://git-scm.com/download/win)
2. Download and run the installer
3. Use all default settings

---

### macOS

#### 1. Installing Java (JDK)

**Using Homebrew (easier):**
```bash
brew install openjdk@17
```

**Or manual:**
1. Go to [Oracle Java Downloads](https://www.oracle.com/java/technologies/downloads/)
2. Download macOS installer
3. Run and follow prompts

**Verify:**
```bash
java -version
```

#### 2. Installing Maven

```bash
brew install maven
```

**Verify:**
```bash
mvn --version
```

#### 3. Installing Git

```bash
brew install git
```

---

### Linux (Ubuntu/Debian)

#### 1. Installing Java (JDK)

```bash
sudo apt update
sudo apt install openjdk-17-jdk
```

#### 2. Installing Maven

```bash
sudo apt install maven
```

#### 3. Installing Git

```bash
sudo apt install git
```

---

## ✅ Verify Installation

Run this command to confirm everything is installed:

```bash
java -version
javac -version
mvn --version
git --version
```

All four should show version numbers without errors.

---

## 🚀 Clone and Set Up the Project

```bash
# Clone your fork
git clone https://github.com/YOUR-USERNAME/java-oop-foundations.git

# Navigate to project
cd java-oop-foundations

# Download dependencies
mvn clean install

# Run tests to verify setup
mvn test
```

You should see test output. Some tests may fail (that's normal—you haven't done the exercises yet!), but Maven should run without errors.

---

## 💡 IDE Setup (Optional)

### Visual Studio Code

1. Download from [code.visualstudio.com](https://code.visualstudio.com)
2. Install **Extension Pack for Java** by Microsoft (search in Extensions)
3. Open the `java-oop-foundations` folder
4. Start coding!

### IntelliJ IDEA (Community Edition - Free)

1. Download from [jetbrains.com/idea](https://www.jetbrains.com/idea/)
2. Install and open
3. Click **Open Project** → Select `java-oop-foundations` folder
4. Click **Trust Project** if prompted
5. Start coding!

---

## 🔨 Troubleshooting

### "java: command not found"

**Windows:**
- Check `C:\Program Files\Java` folder exists
- Restart command prompt
- Verify PATH environment variable

**Mac/Linux:**
```bash
# Check if Java exists
which java

# If not found, reinstall
brew install openjdk@17  # macOS
sudo apt install openjdk-17-jdk  # Linux
```

### "mvn: command not found"

**Windows:**
- Restart command prompt
- Check `MAVEN_HOME` environment variable is set
- Verify `%MAVEN_HOME%\bin` is in PATH

**Mac/Linux:**
```bash
# Check if Maven exists
which mvn

# If not found, reinstall
brew install maven  # macOS
sudo apt install maven  # Linux
```

### "BUILD FAILURE" errors

Try this:
```bash
mvn clean
mvn test
```

This clears cached files and rebuilds.

### Can't clone repository

**Solution:**
```bash
# Make sure you use YOUR username
git clone https://github.com/YOUR-USERNAME/java-oop-foundations.git

# If it's your fork, the URL should have YOUR-USERNAME
```

---

## 📁 Project Structure

```
java-oop-foundations/
├── README.md
├── SETUP.md
├── ROADMAP.md
├── pom.xml
└── src/
    ├── main/java/com/oop/
    │   ├── module1/ClassesExercises.java
    │   ├── module2/EncapsulationExercises.java
    │   ├── module3/InheritanceExercises.java
    │   ├── module4/PolymorphismExercises.java
    │   ├── module5/InterfacesExercises.java
    │   ├── module6/AbstractClassesExercises.java
    │   ├── module7/DesignPatternsExercises.java
    │   └── module8/IntegrationProject.java
    └── test/java/com/oop/
        ├── module1/ClassesExercisesTest.java
        ├── module2/EncapsulationExercisesTest.java
        ├── module3/InheritanceExercisesTest.java
        ├── module4/PolymorphismExercisesTest.java
        ├── module5/InterfacesExercisesTest.java
        ├── module6/AbstractClassesExercisesTest.java
        ├── module7/DesignPatternsExercisesTest.java
        └── module8/IntegrationProjectTest.java
```

- `src/main/java` - Your exercise code goes here
- `src/test/java` - Test files (don't modify these!)
- `pom.xml` - Maven configuration

---

## 🎯 Next Steps

1. ✅ Complete the setup above
2. ✅ Run `mvn test` successfully
3. ✅ Go to README.md and review the modules
4. ✅ Start with [Module 1: Classes & Objects](ROADMAP.md#module-1-classes--objects)

---

**Need help?** Reference the [java-fundamentals SETUP.md](https://github.com/Bongani-Xhentsa/java-fundamentals/blob/main/SETUP.md). You've got this! 💪

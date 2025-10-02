

## 📄Description - Exercise Statement

### Exercise 1

Create a class named "**Entrada**" (Input). This class should be used to control the different exceptions that may appear in Java when introducing data via the keyboard using the **Scanner** class.

The first step is to instantiate an object of the **Scanner** class, and then create **static methods** to read the different data types from the keyboard.

**Important**

It is important that if an exception occurs in any method, we **handle it** and ask the user for the data again until it has been correctly entered. For example: If the user enters a `float` with a period instead of a comma, it must display "**Error de format**" (Format Error). The method must continue asking for the data until the user enters a correctly formatted `float`.

All methods receive a **String** with the message to be displayed to the user, for example: "Introdueix la teva edat" (Enter your age), and return the appropriate data entered by the user in each method, for example: a `byte` with the user's age.

Methods to implement, capturing the exception of the class "**InputMismatchException**":

```java
public static byte llegirByte(String missatge);
public static int llegirInt(String missatge);
public static float llegirFloat(String missatge);
public static double llegirDouble(String missatge);
```

Methods to implement, capturing a **custom exception** of the class **Exception**:

```java
public static char llegirChar(String missatge);
public static String llegirString(String missatge);
public static boolean llegirSiNo(String missatge), // if the user enters "s", it returns "true", if the user enters "n", it returns "false".
```

-----

## 💻Used Technologies

**Java**: 24 (OpenJDK)

-----

## 📋Requirements

- Operating System: Windows/macOS/Linux.

- **Java Development Kit (JDK):** Version 24.0.1 (or higher). It is recommended to use an **OpenJDK** distribution.

- Example: JDK 21 or higher.

- Integrated Development Environment (IDE): IntelliJ IDEA.

-----

## 🛠️Installation

- Clone the Repository:


```bash
git clone https://github.com/Rafadicandia/Tasca-S1.02.-Exceptions-Nivell2.git
```

- IDE Configuration:

Open the file as a Java project.

-----

## ▶️Execution

- Execute from the IDE
  - Open the main file (the one containing the `main` method).

  - Right-click and select "Run 'Main'".

-----

## 🤝Contributions

### Contributions are welcome. Please report any bugs by opening an issue or suggest improvements via a clear and concise Pull Request.
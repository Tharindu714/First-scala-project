# The Scala Programming Language 🚀

Welcome to the repository for **The Scala Programming Language**!  
This project demonstrates Scala’s powerful blend of object-oriented and functional programming. Enjoy an elegant, concise, and type-safe approach to coding in Scala.

---

## 📜 Overview

Scala (short for *Scalable Language*) was designed to integrate seamlessly with Java, while promoting a modern multi-paradigm programming style. In this repository, you’ll find:
- **Fundamental Concepts:** Variables, data types, control flow, and object definitions.
- **Advanced Techniques:** Higher-order functions, closures, currying, and more.
- **Collections Mastery:** Arrays, Lists, Sets, Maps, Tuples, Options, and various operations (map, filter, reduce, fold, and scan).

---

## 📦 Project Setup

### Installing Scala, SBT, and Setting Up Your Environment

1. **Install JDK and SBT:**
   - **JDK Requirement:**  
     For normal compilation, JDK 8 works fine. However, for an optimal experience—especially when using the Scala plugin with Visual Studio Code—you **cannot use JDK 11**. Instead, install **JDK 17** to meet the compatibility and performance requirements.
   - **Download & Install:**
     - [Download JDK 17](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html) and configure the `JAVA_HOME` environment variable.
     - Download Scala from [scala-lang.org](https://www.scala-lang.org).
     - Install SBT (Scala Build Tool) from the [official SBT website](https://www.scala-sbt.org).

2. **Setting Up Visual Studio Code for Scala:**
   - **Step-by-Step Guide:**
     1. **Download & Install VS Code:** Get it from [Visual Studio Code](https://code.visualstudio.com/).
     2. **Install Scala Extension:**  
        Open VS Code, go to the Extensions Marketplace, and install the **Scala (Metals) extension**.
     3. **Configure the JDK:**  
        Make sure VS Code is configured to use JDK 17. (Reminder: JDK 11 is not supported for this setup.)
     4. **Create/Clone Your Scala Project:**  
        Open or clone your Scala project folder.
     5. **Launch SBT:**  
        Open a terminal within VS Code, navigate to your project directory, and run `sbt`. This will download the necessary dependencies and open the Scala REPL for testing code.
     6. **Start Coding:**  
        Create new Scala objects or classes, and utilize VS Code’s integrated tools for a smooth development experience.
---

## 🚀 Getting Started

Follow these steps to set up the project on your local machine.

### 1. Prerequisites

- **Java Development Kit (JDK):**  
  Install **JDK 17** to ensure full compatibility with the Scala tools. Note that **JDK 11 is not supported** for this project.
  - [Download JDK 17](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html)
  
- **Scala:**  
  Download Scala from the [official Scala website](https://www.scala-lang.org).

- **SBT (Scala Build Tool):**  
  Download and install SBT from [scala-sbt.org](https://www.scala-sbt.org).

- **Visual Studio Code (Optional):**  
  For a smooth development experience, install VS Code along with the **Scala (Metals)** extension.
  - [Download Visual Studio Code](https://code.visualstudio.com)
  - [Scala (Metals) Extension](https://marketplace.visualstudio.com/items?itemName=scalameta.metals)

### 2. Setting Up Your Environment

1. **Clone the Repository:**
    ```bash
    git clone https://github.com/Tharindu714/First-scala-project.git
    cd YourRepo
    ```

2. **Configure JDK 17:**  
   Ensure your environment variables point to your JDK 17 installation:
   - **On Windows:** Set the `JAVA_HOME` variable to your JDK 17 path.
   - **On Unix-like systems:** Add `export JAVA_HOME=/path/to/jdk-17` to your shell profile.

3. **Open the Project in VS Code:**
   - Launch VS Code and open the cloned repository folder.
   - Verify that the Scala (Metals) extension is installed and configured to use JDK 17.
   - Open the integrated terminal in VS Code and run SBT to download dependencies:
      ```bash
      sbt
      ```

4. **Run the Project:**
   - After SBT finishes setting up, you can run the project with the following command inside the SBT shell:
      ```bash
      run
      ```
   - Alternatively, use the IDE’s run/debug features for a smoother experience.

> **Note:** The choice of JDK 17 instead of JDK 11 is crucial. JDK 11 may lead to compatibility issues, especially when using the Scala plugin with VS Code.

> **How to Run:** Open your project in Visual Studio Code and Navigate ./src folder There you can Find .scala Files double click on file and open text editor to edit and Simply press F5 and run the code

---

### Final Tips

- **Be Clear and Concise:**  
  Write each step with enough detail so that even someone new to Scala can follow along.

- **Use Code Blocks for Commands:**  
  Keep shell commands or code snippets in triple backticks (\`\`\`) for easy readability.

- **Add Links Where Possible:**  
  Direct links help users quickly download or verify resources.

- **Highlight Key Points:**  
  Use bold or emoji markers to draw attention to important notes (like why JDK 11 is not supported).

---

## 🔧 Code Summary

While the full source code is available on GitHub, here’s a brief summary of the code fragments covered:

- **Basic Syntax & Hello World:**  
  - Creating Scala objects and the `main` method.
  - Printing output using `println`.

- **Variables & Data Types:**  
  - Using `var` (mutable) and `val` (immutable) for variable declaration.
  
- **Control Flow:**  
  - Conditional statements using `if/else` and pattern matching via `match`.
  - Loop constructs: `while`, `do-while`, and various `for` loops with ranges and guards.

- **Functions & Higher-Order Functions:**  
  - Standard functions, function literals, and anonymous functions.
  - Closures and currying techniques.

- **Collections & Operations:**  
  - Working with Arrays, Lists, Sets, Maps, and Tuples.
  - Collection operations: mapping, filtering, reducing, folding, and scanning.

- **Advanced Topics:**  
  - Options for safe handling of nullable values.
  - Advanced operations on Maps and Filters.

_For full details and to explore more code examples, check out the complete source code on GitHub below._

👉 **GitHub Repository:** [https://github.com/Tharindu714/First-scala-project.git](https://github.com/Tharindu714/First-scala-project.git)

---

## 💻 Running the Code

To run the project locally, follow these steps:

1. **Clone the Repository:**
    ```bash
    git clone https://github.com/Tharindu714/First-scala-project.git
    ```

2. **Navigate into the Project:**
    ```bash
    cd YourRepo
    ```

3. **Launch SBT:**
    ```bash
    sbt
    ```
    This will start the Scala interactive shell (REPL) and compile the project.

4. **Start Coding:**  
   Use your favorite IDE (like VS Code) configured with JDK 17 and the Scala (Metals) extension to work on the project.
---

## 🔗 Additional Resources

- [Scala Official Website](https://www.scala-lang.org)
- [SBT Documentation](https://www.scala-sbt.org)
- [Visual Studio Code](https://code.visualstudio.com)
- [VS Code Scala (Metals) Extension](https://marketplace.visualstudio.com/items?itemName=scalameta.metals)

---

Happy Coding! 😎✨

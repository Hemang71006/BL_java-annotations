Here is the complete, single-block `README.md` formatted to match the exact structure and layout of your reference project:

```markdown
# Java Core - Annotations & Reflection

## Overview
The Java Core Annotations project is a Java-based application that demonstrates custom annotation creation, meta-annotation configuration, and runtime annotation processing using the Java Reflection API.
The application defines a custom method-level annotation (`@MethodInfo`), applies it to methods alongside standard built-in annotations (`@Override`, `@Deprecated`), and extracts metadata at runtime using reflection.
The project covers the use cases specified in the Bridgelabz Java Core Annotations assignment.

## Objectives
- Understand the structure and definition of Java annotations.
- Implement custom annotations with required and default properties.
- Configure meta-annotations (`@Target`, `@Retention`, `@Documented`, `@Inherited`).
- Use Java Reflection (`java.lang.reflect.Method`) to inspect and parse annotations at runtime.
- Follow the Git branching and merging workflow (`main`, `develop`, and `feature/*` branches).
- Implement and verify each use case before merging it into the `develop` branch.

## Technologies Used
- Java (Core Java & Reflection API)
- Java Annotations & Meta-Annotations
- Git & GitHub
- IntelliJ IDEA

## Use Cases Covered
| Use Case | Description | Requirement |
| :--- | :--- | :--- |
| **UC 1** | Custom Annotation Creation | Create `@MethodInfo` custom annotation containing `author`, `date`, `revision`, and `comments` attributes. Configure meta-annotations (`@Documented`, `@Target`, `@Inherited`, `@Retention`). |
| **UC 2** | Reflection Parser & Runtime Testing | Apply `@MethodInfo` to methods in `AnnotationExample` class. Use Java Reflection to parse method annotations at runtime and check attributes like `revision`. |

## Project Structure
The project follows a standard Java directory layout:

```text
BL_java-annotations/
├── README.md
├── .gitignore
└── src/
    └── main/
        └── java/
            └── annotation/
                ├── AnnotationExample.java
                └── MethodInfo.java

```

## Implementation Details

### UC 1: Custom Annotation (`feature/custom-annotation`)

* **Class:** `MethodInfo.java`
* **Package:** `annotation`
* **Attributes:**
* `author()` (String, default: `"Narayan"`)
* `date()` (String, required)
* `revision()` (int, default: `1`)
* `comments()` (String, required)


* **Meta-Annotations:**
* `@Documented`: Includes annotation in generated JavaDocs.
* `@Target(ElementType.METHOD)`: Restricts target to methods only.
* `@Inherited`: Enables automatic inheritance in subclasses.
* `@Retention(RetentionPolicy.RUNTIME)`: Retains annotation metadata at runtime for reflection.



### UC 2: Reflection Parser (`feature/annotation-reflection`)

* **Class:** `AnnotationExample.java`
* **Package:** `annotation`
* **Operations:**
* Applies `@MethodInfo` along with `@Override` and `@Deprecated`.
* Uses `AnnotationExample.class.getMethods()` to inspect all methods.
* Checks annotation presence using `method.isAnnotationPresent(MethodInfo.class)`.
* Parses metadata and filters methods based on attribute criteria (`revision == 1`).



## Git Workflow Strategy

* **`main`**: Stores final project documentation (`README.md`).
* **`develop`**: Central integration branch for complete application code.
* **`feature/custom-annotation`**: Feature branch for UC 1.
* **`feature/annotation-reflection`**: Feature branch for UC 2.

### Commit Message Format

`[Hemang]: <short description>`

## How to Run & Execution Details

1. **Open Project:** Open `BL_java-annotations` in IntelliJ IDEA.
2. **Set Sources Root:** Right-click `src/main/java` -> **Mark Directory as > Sources Root**.
3. **Run Application:** Right-click `AnnotationExample.java` and select **Run 'AnnotationExample.main()'** (or press `Ctrl + Shift + F10`).

## Author

* **Developer:** Hemang


```

```
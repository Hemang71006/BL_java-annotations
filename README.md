# Java Core Annotations

## Overview
The Java Core Annotations project is a Java-based application that demonstrates custom annotation creation, meta-annotation configuration, and runtime annotation processing using the Java Reflection API.
The application defines a custom method-level annotation (`@MethodInfo`), applies it to methods alongside standard built-in annotations (`@Override`, `@Deprecated`), and extracts metadata at runtime using reflection.
The project covers the use cases specified in the Bridgelabz Java Core Annotations assignment.

## Objectives
- Understand the structure and definition of Java annotations.
- Implement custom annotations with required and default properties.
- Configure meta-annotations (`@Target`, `@Retention`, `@Documented`, `@Inherited`).
- Use Java Reflection (`java.lang.reflect.Method`) to inspect and parse annotations at runtime.
- Follow the Git branching and merging workflow.
- Implement and verify each use case before merging it into the develop branch.

## Technologies Used
- Java (Core Java & Reflection API)
- Java Annotations & Meta-Annotations
- Git and GitHub
- IntelliJ IDEA

## Use Cases Covered
| Use Case | Description | Requirement |
| --- | --- | --- |
| UC 1 | Custom Annotation Creation | Create `@MethodInfo` custom annotation containing `author`, `date`, `revision`, and `comments` attributes. Configure meta-annotations (`@Documented`, `@Target`, `@Inherited`, `@Retention`). |
| UC 2 | Reflection Parser & Runtime Testing | Apply `@MethodInfo` to methods in `AnnotationExample` class. Use Java Reflection to parse method annotations at runtime and check attributes like `revision`. |

## Project Structure
The project follows a standard Java directory layout.

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
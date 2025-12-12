# Java Compatibility Check

This directory contains a simple Java project to verify that the repository's ruleset works correctly with supported Java versions.

## Purpose

Verifies compatibility with:
- Java 8 (LTS - Long Term Support)
- Java 25 (Latest version)

## Structure

```
java-compat-check/
├── pom.xml                           # Maven build configuration
└── src/main/java/com/mergington/
    └── CompatibilityCheck.java       # Simple Java class with Java 8 features
```

## Testing

The compatibility check is automated via GitHub Actions workflow (`.github/workflows/java-compatibility.yml`).

### Manual Testing

To test locally with Maven:

```bash
cd java-compat-check

# Compile the code
mvn clean compile

# Run the compatibility check
mvn exec:java
```

## What It Checks

1. **Compilation**: Verifies the code compiles with both Java 8 and Java 25
2. **Execution**: Runs the compiled code to ensure runtime compatibility
3. **Java 8 Features**: Uses lambda expressions and streams to confirm Java 8+ compatibility

## Requirements

- Java 8 or later
- Maven 3.6+

## GitHub Actions

The workflow automatically runs on every push and pull request, testing both Java versions in parallel.

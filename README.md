# Java Thread Programming Assignment

## Overview

This project demonstrates different ways to create and use threads in Java. It showcases four thread implementation methods:

- Extending the `Thread` class
- Implementing the `Runnable` interface
- Using anonymous inner classes
- Using lambda expressions with the `Runnable` interface

---

## 🗂️ Files in the Project

- `JavaThreadsDemo.java`: Main class that demonstrates all thread creation techniques.
- `MyThread1.java`: Thread implementation by extending the `Thread` class.
- `MyThread2.java`: Thread implementation by implementing the `Runnable` interface.
- `README.md`: This documentation file.

---

## 🧵 Thread Implementation Methods

### 1. Extending Thread Class

`MyThread1` extends the `Thread` class and overrides the `run()` method to print numbers 1 through 5, with a 500ms delay between each number.

### 2. Implementing Runnable Interface

`MyThread2` implements the `Runnable` interface and overrides the `run()` method to print characters A through E, with a 500ms delay.

### 3. Anonymous Thread Class

An anonymous inner class is created by extending `Thread`. It prints numbers 6 through 10 with a 400ms delay between each number.

### 4. Lambda Expression with Runnable

A lambda expression implementing `Runnable` is used to print the squares of numbers 1 through 5, with a 400ms delay.

---

## ▶️ How to Compile and Run

1. Open a terminal and navigate to the project directory.

2. **Compile all Java files**:
   ```bash
   javac *.java
   ```
3. ** Run the main class**:
  ```
java JavaThreadsDemo
```
   
---
## 🎯 Learning Objectives

  - Understand multiple ways to implement and start threads in Java.
  - Work with Thread.sleep() and handle interruptions.
  - Experience real-time concurrent execution and interleaving output behavior.

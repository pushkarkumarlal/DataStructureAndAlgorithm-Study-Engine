# Concepts/Understanding for Stack

> # Stacks in Java

## Introduction

A stack is an abstract data type that follows the Last-In-First-Out (LIFO) principle. It represents a collection of elements with two main operations: push, which adds an element to the top of the stack, and pop, which removes the topmost element from the stack. Stacks can be implemented using various data structures, such as arrays or linked lists.

## Usage

Stacks have various uses and are commonly employed in programming. Some of the common usages of stacks include:

1. Function call stack: Stacks are used by programming languages to manage function calls and store local variables and return addresses.

2. Undo/Redo functionality: Stacks can be used to implement undo and redo operations by keeping track of previous states or actions.

3. Expression evaluation: Stacks are used to evaluate arithmetic expressions, parse infix expressions into postfix (or prefix) notation, and perform calculations.

4. Backtracking: Stacks can be used in algorithms that require backtracking, such as depth-first search and solving mazes.

## Advantages

1. Simple and efficient: Stacks have a straightforward and intuitive structure, making them easy to implement and understand. The push and pop operations have a time complexity of O(1) in most implementations, providing efficient performance.

2. Managed ordering: Stacks enforce a specific ordering of elements, allowing for controlled access and retrieval of elements based on the LIFO principle.

3. Memory management: Stack-based memory allocation allows for efficient management of local variables and function calls, minimizing memory usage and improving performance.

4. Recursion: Stacks play a vital role in implementing recursion by storing function calls and their corresponding states.

## Disadvantages

1. Limited access: Stacks only provide access to the topmost element. Retrieving or modifying elements at other positions within the stack requires additional operations or data structures.

2. Fixed size (in array-based implementations): Arrays used to implement stacks have a fixed size, which can limit the number of elements that can be stored. Resizing the array may involve creating a new array and copying the elements, resulting in additional overhead.

3. Stack overflow: If the stack size exceeds the available memory, a stack overflow error can occur, leading to program termination.

## Implementation in Java

In Java, you can implement a stack using the built-in `java.util.Stack` class or by creating a custom stack using arrays or linked lists. Here's an example of a stack implementation using arrays:

```java
public class ArrayStack {
    private int maxSize;
    private int[] stackArray;
    private int top;

    public ArrayStack(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
    }

    public void push(int element) {
        if (top == maxSize - 1) {
            System.out.println("Stack overflow");
            return;
        }
        stackArray[++top] = element;
    }

    public int pop() {
        if (top == -1) {
            System.out.println("Stack underflow");
            return -1;
        }
        return stackArray[top--];
    }

    public int peek() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return -1;
        }
        return stackArray[top];
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public int size() {
        return top + 1;
    }
}



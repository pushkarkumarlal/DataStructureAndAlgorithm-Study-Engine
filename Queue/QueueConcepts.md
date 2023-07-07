> # Queue in Java

A queue is a linear data structure that follows the First-In-First-Out (FIFO) principle. It is similar to a real-life queue, where the first person who joins the queue is the first to leave. In Java, the `Queue` interface is available in the `java.util` package and provides methods for adding, removing, and examining elements in the queue.

## Uses of a Queue

Queues are commonly used in scenarios that involve handling processes or tasks in a specific order. Some common use cases of queues include:

1. **Breadth-First Search**: Queues are used to traverse a tree or graph in a breadth-first manner, visiting all the neighbors of a node before moving to the next level.

2. **Resource Sharing**: Queues can be used to manage resources in a multi-threaded environment, ensuring that multiple threads access resources in a synchronized manner.

3. **Scheduling**: Queues are used in scheduling algorithms to manage the order of execution for various tasks or processes.

## Advantages of a Queue

- Provides a reliable and efficient way to manage elements in a specific order.
- Offers a simple interface with well-defined methods for adding and removing elements.
- Supports various implementations based on specific requirements, such as `LinkedList` or `ArrayDeque`.

## Disadvantages of a Queue

- The main disadvantage of a queue is that it has a fixed capacity in most implementations, which means it can potentially overflow if more elements are added than it can hold. However, some implementations offer dynamic resizing to mitigate this limitation.

- Another limitation is that accessing or removing elements from the middle of the queue is not efficient. If such operations are required frequently, alternative data structures like lists or linked lists might be more suitable.

## Implementation of Queue in Java



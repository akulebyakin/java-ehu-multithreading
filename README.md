# java-ehu-multithreading

## Tasks

### 1. Creating a Thread

Write a program that creates a thread using default attributes.  
Both the parent and the newly created thread should print **N lines of text**.

---

### 2. Thread @ Runnable

- Create a class `T1Thread` extending `Thread` with an implementation of the `run()` method.
- Create another class that implements `Runnable` with its own `run()` method.
- Create a thread object of class `T1Thread` and initialize its constructor with the object of the class based on `Runnable`.
- Start the thread and explain the result.

---

### 3. The `join` Method

Modify the program from Task 1 so that the output of the parent thread is displayed only **after** the created thread finishes.

---

### 4. Thread Parameters

Develop a program that creates **N threads**, where `4 <= N <= 6`.  
All threads must execute the same method, which prints a sequence of text lines passed as a parameter.  
Each thread should print a **different sequence** of lines.

---

### 5. `InterruptedException`

Create a scenario in which an `InterruptedException` is thrown.  
Explain the cause of its generation.

---

### 6. Thread Priority

Evaluate the speed difference in execution between threads with different priorities.  
For example:

```java
    Thread walkMin = new Thread(new WalkThread(), "Min");
    Thread talkMax = new Thread(new TalkThread(), "Max");
    
    walkMin.setPriority(Thread.MIN_PRIORITY);
    talkMax.setPriority(Thread.MAX_PRIORITY);
    
    walkMin.start();
    talkMax.start();
```

---

### 7. The yield() Method

Evaluate the speed difference between two threads, where one uses the `yield()` method.

String s1 = "JAVA";
String s2 = "JAVA";

synchronized (s1) {
  synchronized (s2) {
      System.out.println("Hello");
   }
}
👉 Questions:

How many objects are used as locks?

Is this code thread-safe?

Is this a potential deadlock scenario or not?

answer:

Correct answer: ONE object
Why?

String literals are stored in the String Constant Pool

"JAVA" appears only once in memory

Both s1 and s2 reference the same object

2) answer
   Answer: Yes, but dangerous

Technically, synchronization works

But synchronizing on String literals is BAD practice

Why dangerous?

String literals can be shared across classes and libraries

Another thread somewhere else may also synchronize on "JAVA"

This can cause unexpected blocking or deadlocks

3) answer
   Why?

Only one lock object is involved

Same thread re-acquires the same lock

Java locks are reentrant

🔑 Reentrant means:

A thread holding a lock can acquire it again without blocking.




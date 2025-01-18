# Groovy eachWithIndex NullPointerException

This repository demonstrates a NullPointerException that can occur when using Groovy's `eachWithIndex` method with a list containing null values.  The `eachWithIndex` method iterates over a list, providing both the element and its index. If a null value is encountered, a `NullPointerException` is thrown during the iteration. 

The `bug.groovy` file contains the buggy code, and `bugSolution.groovy` provides a solution to handle the null values gracefully.

## Bug
The bug is caused by directly accessing a potentially null element in the list within the `eachWithIndex` closure.  If a null element exists, the attempt to perform any operation on it will throw a `NullPointerException`.

## Solution
The solution involves adding a null check before accessing each element within the `eachWithIndex` closure. This ensures that the code handles null values appropriately, preventing the `NullPointerException`.
```groovy
def myMethod(list) {
  list.eachWithIndex { item, index ->
    if (item != null) {
      println "Item at index $index: $item"
    } else {
      println "Null value encountered at index $index"
      // Or handle the null value as needed, e.g., skip it, use a default value, etc.
    }
  }
}

myMethod(["a", "b", null, "d"])
```
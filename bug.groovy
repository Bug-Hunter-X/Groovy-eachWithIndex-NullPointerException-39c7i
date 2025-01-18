```groovy
def myMethod(list) {
  list.eachWithIndex { item, index ->
    println "Item at index $index: $item"
    if (item == null) {
      throw new NullPointerException("List element cannot be null")
    }
  }
}

myMethod(["a", "b", null, "d"])
```
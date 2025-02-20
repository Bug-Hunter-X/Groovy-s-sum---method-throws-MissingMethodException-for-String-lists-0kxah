def list = [1, 2, 3, 4, 5]

println list.sum() // Output: 15

list = ["a","b","c"]

//This will throw an exception:
//println list.sum()

// Solution 1: Custom sum method for strings (concatenation)
def stringSum(list) {
  list.join()
}

println stringSum(list) // Output: abc

//Solution 2: Check the list type and handle appropriately
def sumList(list) {
  if (list.every { it instanceof Number }) {
    return list.sum()
  } else if (list.every { it instanceof String }) {
    return list.join()
  } else {
    throw new Exception("List contains mixed types")
  }
}

println sumList([1, 2, 3]) // Output: 6
println sumList(["a", "b", "c"]) // Output: abc
// println sumList([1, "a"]) // throws exception
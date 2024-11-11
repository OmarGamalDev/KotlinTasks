 fun main() {
     //Set
        val numSet = mutableSetOf(1, 2, 3, 4, 5)
        numSet.add(6)
        numSet.remove(3)
        println("set: $numSet")
        println("######################")
     //Map
     val numMap = mutableMapOf("one" to 1, "two" to 2, "three" to 3)
     numMap["four"] = 4
     numMap.remove("two")
     println("map: $numMap")
     //iterate Set&&Map

     println("Iterating over the set:")
     for (number in numSet) {
         println(number)
     }
     println("Iterating over the map:")
     for ((key, value) in numMap) {
         println("$key -> $value")
     }
    }
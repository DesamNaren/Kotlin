fun main() {
    val things = arrayOf("Kotlin", "Programming", "Language")
    println(things)
    println(things.size)
    println(things[0])
    println(things.get(0))

    things.forEach { thing -> // lambda expression.
        // If you have a function and it is only having parameter as another function
        println(thing)
    }

    things.forEachIndexed { index, thing ->
        println("$index $thing")
    }


    val thingsList = listOf("Kotlin", "Programming", "Learning")
    thingsList.forEach {
        println(it)
    }

    thingsList.forEachIndexed { index, thing ->
        println("$index $thing")
    }


    val map = mapOf(1 to "a", 2 to "b", 3 to "c")
    map.forEach { (key, value) -> println("$key -> $value") }

    sayHi("Hey", thingsList)
}

fun sayHi(greeting: String, things: List<String>) {
    things.forEach { thing ->
        println("$greeting $thing")
    }
}
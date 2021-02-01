var greeting: String? = null

fun main() {
    // If Condition
    if (greeting != null) {
        println(greeting)
    }

    // When Cond
    when (greeting) {
        null -> println("Null Greeting")
        else -> println(greeting)
    }

    sayHello()
    sayHello("Naren")
    sayHello("Naren", "Welcome")
}

fun sayHello(){// Return type is Unit
    println("Hello Unit Function")
}

fun sayHello(name: String){
    println("Hello  $name") //  String Templates
}


fun sayHello(name: String, greeting:String){
    println("$name  $greeting") //  String Templates
}

// Above all are top-order functions that means they are enclosed in any class,
// they are free from class level dependency
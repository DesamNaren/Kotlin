interface PersonInfoProvider {
//    val info: String = "Default"
// Property initializers are not allowed default values in interfaces

    val info: String

    fun defaultMethod(person: Person) { // You can define
        // default implementation logic for a method in interface.
        println(person.firstName)
    }

    fun implMethod()
}

interface SessionInfoProvider {
    fun implSession(): String
}

class PersonClass : PersonInfoProvider, SessionInfoProvider {
    override fun implMethod() { // You must override the functions that are not the default ones
        println("printPersonWithOutBody")
    }

    override fun defaultMethod(person: Person) { // If you want change
        // the default functionality of interface method
        println(person.lastName)

    }

    override val info: String
        get() = "Property Initializer"

    override fun implSession(): String {
        return "Session"
    }

}

fun main() {
    val personObj = PersonClass()
    personObj.defaultMethod(Person("Naren", "Reddy"))
    personObj.implSession()

    typeCheck(personObj)
}


fun typeCheck(personInfoProvider: PersonInfoProvider) {
    if (personInfoProvider !is SessionInfoProvider) {
        println("is not a session info provider")
    } else {
        println("is a session info provider")
        (personInfoProvider as  SessionInfoProvider).implSession()
        personInfoProvider.implSession() // Type Caste dose not require Compiler will do smart cast
    }
}
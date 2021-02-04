fun main() {

    // If you do not have any properties or any arguments defined in primary constructor
    // then you can omit the primary constructor
//    val person = Person() // This will call primary constructor
    val person = Person("Naren", "Reddy") // This will call primary constructor


    // We are not using any getters here. This is called Property Access Syntax
    person.firstName
    person.lastName
//    person.nickName = "Nani"
//    person.nickName = "Naren"
//    person.nickName = "Nani"
//    person.nickName

    person.printInfo()
}

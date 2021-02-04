class Person(val firstName: String, val lastName: String) {// Primary Constructor

    var nickName: String? = null
        set(value) {
            field = value
            println("the new nickname is $field")
        }
        get() {
            println("the returned value is $field")
            return field
        }

    fun printInfo() {
        val nickNameToPrint = nickName ?: "no nickname"
        println("$firstName ($nickNameToPrint) $lastName")
    }
}

//If the property is val compiler will generate getter method automatically
//If the property is var compiler will generate both getter&setter method automatically


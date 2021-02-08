//class ChildProvider : ParentProvider {
// }

//You have to inherit a class by defining constructor otherwise the below error will appear

// This type has a constructor, and thus must be initialized here


//class ChildProvider : ParentProvider() { // This type is final, so it cannot be inherited from
//}

//You have to provide parent class available to child classes otherwise below error appear
// This type has a constructor, and thus must be initialized here

class ChildClass : ParentClass() { // Now parent class is with open access
    override val printParentVal: String
        get() = "Child"

    fun printVal() {
        println(printParentVal)
    }


}
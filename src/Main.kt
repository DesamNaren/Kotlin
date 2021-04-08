fun fib() { //adding consequent two numbers
    var a = 0
    var b = 1
    var c: Int
    println("$a")
    println("$b")

    var n = 0
    while (n < 5) {
        c = a.plus(b)
        println("$c")
        a = b
        b = c
        n++
    }

}

fun prime() { // A prime number is a number divided by only two numbers i.e 1 and itself
    val num = 19
    var flag = false

    for (i in 2..num / 2) {
        if (num % i == 0) {
            flag = false
            break
        } else {
            flag = true
        }
    }

    if (!flag) {
        println("$num is not prime")
    } else {
        println("$num is prime")
    }
}

fun poly() { // If we reverse given number then both equals its poly
    var num = 141
    val temp = num
    var rem = 0
    var sum = 0

    while (num > 0) {
        rem = num % 10
        sum = (sum * 10) + rem
        num /= 10
    }

    if (temp == sum) {
        println("$temp is poly")
    } else {
        println("$temp is not poly")
    }
}


fun fact() { // Multiply all its descenders from given number exclude 0
    var num = 6
    val temp = num
    var fact = 1
    for (i in 1..num) {
        fact *= num
        num--
    }

    println("Factorial of $temp is $fact")
}


fun arm() { // the sum of square of 3 in each number will be equal to given number
    var num = 370
    val temp = num

    var rem: Int
    var sum=0

    while (num>0){
        rem = num%10
        sum += (rem * rem * rem)
        num/=10
    }

    if(temp==sum){
        println("$temp is armstrong")
    }
    else{
        println("$temp is not armstrong")
    }

}

fun main() {
    arm()
}

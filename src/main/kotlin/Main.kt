import javax.management.Query.and
import javax.management.Query.or

fun main() {
        println("Enter your age, please")

        var input_age = readln()
        var age: Int = input_age.toInt()
        if (age in 1..200)
            if (age % 10 == 1) {
                println("Мне $age год")
            } else if (age % 10 == 2) {
                println("Мне $age года")
            } else if (age % 10 == 3) {
                println("Мне $age года")
            } else if (age % 10 == 4) {
                println("Мне $age года")
            } else {
                println("Мне $age лет")
            }
        else {
            println("Your age should be 1-200 years")
        }
}



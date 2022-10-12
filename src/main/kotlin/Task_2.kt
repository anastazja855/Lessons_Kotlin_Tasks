
fun main (args: Array<String>){
        println("Input your number")
        var input_number = readLine()
var number: Int = input_number!!.toInt()
        var i: Int
        for (i in 2..9){
            if (number % i==0)
                println("Минимальный делитель, превышающий 1 = $i")
            break
        }
    }

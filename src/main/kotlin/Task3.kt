fun main (args: Array<String>) {
    var min1: Int
    var min2: Int
    println("Введите размеры кирпича")
    println("Введите длину кирпича")
    var input_a = readLine()
    var a: Int = input_a!!.toInt()
    println("Введите ширину кирпича")
    var input_b = readLine()
    var b: Int = input_b!!.toInt()
    println("Введите высоту кирпича")
    var input_c = readLine()
    var c: Int = input_c!!.toInt()
    println("Введите размеры отверстия")
    println("Введите высоту отверстия")
    var input_r = readLine()
    var r: Int = input_r!!.toInt()
    println("Введите ширину отверстия")
    var input_s = readLine()
    var s: Int = input_s!!.toInt()
    println("Кирпич размером $a  x $b x $c пройдёт в отверстие $r x $s")
    findminBrickSize()
    compareSizes ()


/*
fun findmaxHoleSize(Int r, Int s)
{
    if (r>s){
        var maxHoleSize=r
    }
    else {
        var maxHoleSize=s
    }
}
*/
fun findminBrickSize(Int a, Int b, Int c): Int {

var max1: Int
    if (a<b)  {
     min1=a
     max1=b
}
    else {
        min1=b
        max1=a
    }
    if (max1<c){
        min2=max1
    }
    else {
        min2=c
    }
    return min1
    return min2
}
compareSizes (min1, min2, r, s){
    if ((min1<r)
}
}
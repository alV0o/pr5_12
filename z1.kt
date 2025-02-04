fun main(){
    var a: Double
    a = readLine()!!.toDouble()
    var b: Double
    b = readLine()!!.toDouble()
    when {
        (a>b) -> a += 1
        (b>a) -> b += 1
        (a == b) -> a = a*a*a
    }
    println(a)
    println(b)
}

// URI 1001 | Area of a Circle | BEGINNER | LEVEL 4 |  + 4.9 POINTS

fun main(args: Array<String>) {
    val pi = 3.14159

    val r: Double = readLine()?.toDoubleOrNull() ?: 0.0;

    println("A=%.4f".format((pi * r * r)))
}
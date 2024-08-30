package KotlinLesson2

fun main () {
    val a = 5
    val b = 7
    val d = 10.0
    val L_cm = 250.0
    val A = 50
    val B = 7

    val P_square = 4 * a
    val S_square = a * a
    val S_rectangle = a * b
    val P_rectangle = 2 * (a + b)
    val π = 3.14
    val L_circle = π * d
    val meters = L_cm / 100
    val segments = A / B

    println("P (периметр квадрата) = $P_square")
    println("S (площадь квадрата) = $S_square")
    println("S (площадь прямоугольника) = $S_rectangle")
    println("P (периметр прямоугольника) = $P_rectangle")
    println("L (длина окружности) = $L_circle")
    println("расстояние = $meters")
    println("кол-во отрезков B на отрезке А) = $segments")
}

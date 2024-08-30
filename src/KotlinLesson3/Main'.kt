package KotlinLesson3

fun main () {
    val number = -3
    val result = if (number > 0) number + 1 else number
    println("результат: $result")

    val numbers = listOf(4, 45, -2, 8)
    val positiveCount = numbers.count { it > 0 }
    println("кол-во положительных чисел: $positiveCount")

    val num1 = 10
    val num2 = 20
    val maxNumber = if (num1 > num2) num1 else num2
    println("Большее число: $maxNumber")

    val dayNumber = 5
    val dayName = when (dayNumber) {
        1 -> "понедельник"
        2 -> "вторник"
        3 -> "среда"
        4 -> "четверг"
        5 -> "пятница"
        6 -> "суббота"
        7 -> "воскресенье"
        else -> "ошибка"
    }
    println("Название дня недели: $dayName")


    val grade = 3
    val gradeDescription = when (grade) {
        1 -> "ужасно"
        2 -> "плохо"
        3 -> "удовлетворительно"
        4 -> "хорошо"
        5 -> "отлично"
        else -> "ошибка"
    }
    println("Оценка: $gradeDescription")

    val operation = 3
    val numA = 5.0
    val numB = 3.0
    val operationResult = when (operation) {
        1 -> numA + numB
        2 -> numA - numB
        3 -> numA * numB
        4 -> numA / numB
        else -> "ошибка"
    }
    println("Результат арифметического действия: $operationResult")
}
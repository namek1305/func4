fun main() {
    // Практическая работа №1: Рисование числами
    for (i in 1..5) {
        println(("$i").repeat(i))
    }

    // Практическая работа №2: Простая игра
    val random = (1..9).random()
    var guess = 0
    while (guess != random) {
        print("Угадайте число от 1 до 9: ")
        guess = readln().toInt()
    }
    println("Поздравляю! Вы угадали число $random!")

    // Практическая работа №3: Делители числа
    print("Введите число: ")
    val number = readln().toInt()
    val divisors = mutableListOf<Int>()
    for (i in 1..number) {
        if (number % i == 0) divisors.add(i)
    }
    println("Делители: ${divisors.joinToString(", ")}")

    // Практическая работа №4: Четные и нечетные цифры числа
    print("Введите число: ")
    val input = readln().toInt()
    var even = 0
    var odd = 0
    var temp = input
    while (temp > 0) {
        val digit = temp % 10
        if (digit % 2 == 0) even++ else odd++
        temp /= 10
    }
    println("Четных: $even, Нечетных: $odd")

    // Практическая работа №5: Сумма чисел кратных 4
    var sum = 0
    for (i in 1..100) {
        if (i % 4 == 0) sum += i
    }
    println("Сумма чисел: $sum")

    // Практическая работа №6: Нахождение суммы с исключениями
    var total = 0
    var current = 5
    val exclude = setOf(34, 46, 52)
    while (current <= 57) {
        if (!exclude.contains(current)) total += current
        current++
    }
    println("Итоговая сумма: $total")
}
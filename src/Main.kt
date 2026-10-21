fun main() {
    //Задание 1
    val amount = 1000.0

    // Считаем комиссию 0.75%. В коде это 0.0075
    var commission = amount * 0.0075

    // Если комиссия получилась меньше 35 рублей, то делаем её 35
    if (commission < 35.0) {
        commission = 35.0
    }

    println("Сумма перевода: $amount рублей")
    println("Комиссия за перевод: $commission рублей")


    //Задание 2
    val likes = 61

    // Переменная для правильного слова. По умолчанию ставим "людям"
    var slovo = "людям"

    // Проверяем: если заканчивается на 1, но не на 11
    if (likes % 10 == 1 && likes % 100 != 11) {
        slovo = "человеку"
    }

    // Выводим результат
    println("Понравилось $likes $slovo")

    //Задание 3
    val summa = 5000.0

    // Постоянный ли покупатель (true - да, false - нет)
    // В задании подсказка использовать Boolean
    val postoyannik = true

    var skidka = 0.0
    var itogovayaCena = summa

    // 1. Считаем базовую скидку по условиям акции
    if (summa <= 1000) {
        skidka = 0.0
    } else if (summa > 1000 && summa <= 10000) {
        skidka = 100.0
    } else if (summa > 10000) {
        skidka = summa * 0.05 // 5% от суммы
    }

    // Вычитаем скидку из начальной суммы
    itogovayaCena = summa - skidka

    // 2. Применяем скидку для постоянного покупателя (1% сверху)
    if (postoyannik == true) {
        // Скидка 1% применяется к уже скинутой цене (умножаем на 0.99)
        itogovayaCena = itogovayaCena * 0.99
    }

    println("Сумма покупки: $summa руб.")
    println("Скидка по акции: $skidka руб.")
    println("Итоговая цена: $itogovayaCena руб.")
}
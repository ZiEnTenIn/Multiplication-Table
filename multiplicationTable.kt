fun table(str1: Int, str2: Int, str3: Int, str4: Int, str5: Int) {
    var raz1 = str1 - 1
    var param2 = str5 + raz1
    if(param2 > str2) {
        param2 = str2
    }
    for (n in str3..str4) {
        for (j in str1..param2) {
            print("$j * $n = ${n * j} \t\t")
        }
        println("")
    }
    if(!(str2 - param2 <= 0)) {
        print("\r\n\r\n")
        return table(param2+1, str2, str3, str4, str5)
    }
    else {return}
}
public fun main() {
    val scan = java.util.Scanner(System.`in`)
    val warning = "\r\nВВЕДИТЕ ЦЕЛОЕ ЧИСЛО!!!"
    println("Введите целое число диапозона, начиная с которого необходимо выводить таблицу:")

    fun columns(beforeInput1: Int, beforeInput2: Int, beforeInput3: Int, beforeInput4: Int) {
        var firstInput1 = beforeInput1
        var secondInput1 = beforeInput2
        var firstInput2 = beforeInput3
        var secondInput2 = beforeInput4
        var column = scan.next()
        if(column.toIntOrNull() != null) {
            println("\r\nСекунду...\r\n")
            println("\r\nВаша таблица умножения готова:\r\n\r\n")
            return table(firstInput1.toInt(), secondInput1.toInt(), firstInput2.toInt(), secondInput2.toInt(), column.toInt())
        }
        else {
            println(warning)
            return columns(firstInput1.toInt(), secondInput1.toInt(), firstInput2.toInt(), secondInput2.toInt())
        }
    }
    fun input4(beforeInput1: Int, beforeInput2: Int, beforeInput3: Int) {
        var firstInput1 = beforeInput1
        var secondInput1 = beforeInput2
        var firstInput2 = beforeInput3
        var secondInput2 = scan.next()
        if(secondInput2.toIntOrNull() != null) {
            println("\r\nВведите целое число столбцов, которое вы желаете видеть в 1 строке:")
            return columns(firstInput1.toInt(), secondInput1.toInt(), firstInput2.toInt(), secondInput2.toInt())
        }
        else {
            println(warning)
            return input4(firstInput1.toInt(), secondInput1.toInt(), firstInput2.toInt())
        }

    }
    fun input3(beforeInput1: Int, beforeInput2: Int) {
        var firstInput1 = beforeInput1
        var secondInput1 = beforeInput2
        var firstInput2 = scan.next()
        if(firstInput2.toIntOrNull() != null) {
            println("\r\nВведите целое число диапозона, которым необходимо заканчивать умножать ранее вводимые числа:")
            return input4(firstInput1.toInt(), secondInput1.toInt(), firstInput2.toInt())
        }
        else {
            println(warning)
            return input3(firstInput1.toInt(), secondInput1.toInt())
        }
    }
    fun input2(beforeInput1: Int) {
        var firstInput1 = beforeInput1
        var secondInput1 = scan.next()
        if(secondInput1.toIntOrNull() != null) {
            println("\r\nВведите целое число диапозона, начиная с которого необходимо начинать умножать ранее вводимые числа:")
            return input3(firstInput1.toInt(), secondInput1.toInt())
        }
        else {
            println(warning)
            return input2(firstInput1.toInt())
        }
    }
    fun input1() {
        var firstInput1 = scan.next()
        if(firstInput1.toIntOrNull() != null) {
            println("\r\nВведите целое число диапозона, до которого необходимо вывести таблицу:")
            return input2(firstInput1.toInt())
        }
        else {
            println(warning)
            input1()
            return
        }
    }

    input1()
}
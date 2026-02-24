fun main()
{
    var airplane = Array(3) {i -> Самолёт(_brend = "", _departure = "", _destination = "",
        _date = "", _timeDeparture =  "", _travelTime = 0.0)}
    for (i in 0..2)
    {
        println("Это грузовой самолёт? (да/нет):")
        var answer = readln()
        if (answer == "да") {
            // Создаем грузовой самолет и заполняем
            val g = ГрузовойСамолёт("", "", "",
                "", "", 0.0, 0.0, "")
            g.FillInfo()
            airplane[i] = g
        } else {
            // Обычный самолет
            airplane[i].FillInfo()
        }
        println()
    }

    println("Список самолётов:")
    for (i in 0..2)
    {
        airplane[i].PrintInfo() // у грузового всё выведется

        if (airplane[i] !is ГрузовойСамолёт) {
            println("Дальний рейс: ${airplane[i].dalniyReyse()}")
        }
    }

    val reysy = Array(2) { Рейс() }
    for (i in 0..1) {
        println("Рейс ${i + 1}")
        reysy[i].FillInfo()
    }
    println("ВСЕ РЕЙСЫ")
    for (i in 0..1) {
        println("${i + 1}")
        reysy[i].PrintInfo()
    }
    println("СРАВНЕНИЕ РЕЙСОВ С САМОЛЕТАМИ")
    for (i in 0..1) {
        println("\nСравниваем рейс ${i + 1} с самолетом ${i + 1}:")
        println(reysy[i].sravnenieSSamoletom(airplane[i]))
    }
}
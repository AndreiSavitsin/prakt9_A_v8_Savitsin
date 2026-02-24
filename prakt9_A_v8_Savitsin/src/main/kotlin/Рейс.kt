class Рейс
{
    // Свойства (как у самолета, но с другими названиями)
    var Number: String = "" //номер рейса
    var Otkuda: String = "" //Пункт отправления
    var Kuda: String = "" //Пункт назначения
    var Data: String = "" //Дата отправления
    var Vremya: String = "" //Время отправления
    var Dlitelnost: Double = 0.0 //Время пути

    //Заполнение информации
    fun FillInfo()
    {
        println("Введите номер рейса:")
        Number = readln()
        println("Введите пункт отправления:")
        Otkuda = readln()
        println("Введите пукнт назначения:")
        Kuda = readln()
        println("Введите дату отправления:")
        Data = readln()
        println("Введите время отправления:")
        Vremya = readln()
        println("Введите время пути:")
        Dlitelnost = readln()!!.toDouble()
        if (Dlitelnost <= 0)
        {
            println("Время не может быть <= 0")
        }
        println()
    }
    //Вывод информации
    fun PrintInfo() {
        println("Рейс: $Number")
        println("Маршрут: $Otkuda -> $Kuda")
        println("Дата: $Data")
        println("Время: $Vremya")
        println("Длительность: $Dlitelnost ч")
    }
    // Сравнение с самолетом
    fun sravnenieSSamoletom(s: Самолёт): String {
        return if (Otkuda == s.Departure && Kuda == s.Destination)
            "Рейс $Number и самолёт ${s.Brend} летят по одному маршруту"
        else
            "Рейс $Number и самолёт ${s.Brend} летят по разным маршрутам"
    }
}
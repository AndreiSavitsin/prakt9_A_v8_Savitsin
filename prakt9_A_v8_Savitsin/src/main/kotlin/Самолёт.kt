open class Самолёт(_brend: String)
{
    var Brend: String = _brend //Марка самолёта
    var Departure: String = "" //Пункт отправления
    var Destination: String = "" //Пункт назначения
    var Date: String = "" //Дата отправления
    var TimeDeparture: String = "" //Время отправления
    var TravelTime: Double = 0.0 //Время пути

    constructor(_brend:String, _departure:String, _destination:String, _date:String,
                _timeDeparture: String, _travelTime: Double): this(_brend)
    {
        Departure = _departure
        Destination = _destination
        Date = _date
        TimeDeparture = _timeDeparture
        TravelTime = _travelTime
    }

    //Заполнение информации
    open fun FillInfo()
    {
        println("Введите марку самолёта:")
        Brend = readln()
        println("Введите пункт отправления:")
        Departure = readln()
        println("Введите пукнт назначения:")
        Destination = readln()
        println("Введите дату отправления:")
        Date = readln()
        println("Введите время отправления:")
        TimeDeparture = readln()
        println("Введите время пути:")
        TravelTime = readln()!!.toDouble()
        if (TravelTime <= 0)
        {
            println("Время не может быть <= 0")
        }
        println()
    }

    //Вывод информации
    open fun PrintInfo()
    {
        println("Марка: $Brend. Пункт отправления: $Departure. Пункт назначения: $Destination." +
                " Дата отправления: $Date." +
                "Время отправления: $TimeDeparture. Время пути: $TravelTime")
    }

    //Проверка дальности рейса
    fun dalniyReyse(): String {
        return if (TravelTime > 5) "ДА" else "НЕТ"
    }
}
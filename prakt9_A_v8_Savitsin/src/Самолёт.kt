import java.util.*

open class Самолёт(_brend: String)
{
    var Brend: String = _brend
    var Departure: String = ""
    var Destination: String = ""
    var Date: String = ""
    var TimeDeparture: String = ""
    var TravelTime: Double = 0.0

    constructor(_brend:String, _departure:String, _destination:String, _date:String, _timeDeparture: String, _travelTime: Double): this(_brend)
    {
        Departure = _departure
        Destination = _destination
        Date = _date
        TimeDeparture = _timeDeparture
        TravelTime = _travelTime
    }

    //Вывод марки
    open fun PrintBrend()
    {
        println("Марка самолёта: $Brend")
    }
    //Вывод маршрута
    open fun PrintRoute()
    {
        println("Маршрут: $Departure -> $Destination")
    }
    //Вывод времени отправления
    open fun printDeparture()
    {
        println("Отправление: $Date в $TimeDeparture")
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
        println("Марка: $Brend. Пункт отправления: $Departure. Пункт назначения: $Destination. Дата отправления: $Date." +
                "Время отправления: $TimeDeparture. Время пути: $TravelTime")
    }
}
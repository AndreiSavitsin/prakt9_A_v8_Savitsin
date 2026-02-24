class ГрузовойСамолёт
(
    Brend: String,
    Departure: String,
    Destination: String,
    Date: String,
    TimeDeparture: String,
    TravelTime: Double,
    var Capacity: Double,
    var Cargo: String
) : Самолёт(Brend, Departure, Destination, Date, TimeDeparture, TravelTime)
{
    //Вывод грузоподъёмности
    open fun printCapacity()
    {
        println("Грузоподъёмность: $Capacity тонн")
    }

    //Вывод типа груза
    open fun printCargo()
    {
        println("Тип груза: $Cargo")
    }

    //Переопределение функции Info
    override fun Info()
    {
        println("Грузоподъёмность: $Capacity тонн")
        println("Тип груза: $Cargo")
        println("Стоимость перевозки: ${Capacity * TravelTime * 100} руб")
    }
}
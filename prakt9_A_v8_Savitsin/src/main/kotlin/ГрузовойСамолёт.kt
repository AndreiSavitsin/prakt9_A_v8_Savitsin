class ГрузовойСамолёт
    (
    Brend: String, //Марка самолёта
    Departure: String, //Пункт отправления
    Destination: String, //Пункт назначения
    Date: String, //Дата отправления
    TimeDeparture: String,//Время отправления
    TravelTime: Double, //Время пути
    var Capacity: Double, //Грузоподъёмность
    var Cargo: String //Тип груза
) : Самолёт(Brend, Departure, Destination, Date,
    TimeDeparture, TravelTime)
{

    // Переопределяем FillInfo для ввода грузовых данных
    override fun FillInfo() {
        super.FillInfo()  // сначала вводим базовые данные
        println("Введите грузоподъёмность (тонны):")
        Capacity = readln().toDouble()
        println("Введите тип груза:")
        Cargo = readln()
    }

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
    override fun PrintInfo()
    {
        println("Грузоподъёмность: $Capacity тонн")
        println("Тип груза: $Cargo")
        println("Стоимость перевозки: ${Capacity * TravelTime * 100} руб")
    }
}
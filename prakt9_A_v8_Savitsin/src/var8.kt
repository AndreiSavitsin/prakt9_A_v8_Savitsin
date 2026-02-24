fun main()
{
    var airplane = Array(3) {i -> Самолёт(_brend = "", _departure = "", _destination = "", _date = "", _timeDeparture =  "", _travelTime = 0.0)}
    for (i in 0..2)
    {
        airplane[i].FillInfo()
    }
    println("Список самолётов:")
    for (i in 0..2)
    {
        airplane[i].PrintInfo()
    }
}
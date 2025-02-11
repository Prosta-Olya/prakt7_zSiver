fun main(){
    try{
        println("Введите x:")
        val x = readLine()!!.toDouble()
        println("Введите y:")
        val y = readLine()!!.toDouble()
        println("Введите z:")
        val z = readLine()!!.toDouble()
        val a = (3+Math.pow(Math.E,y-1))/(1+Math.pow(x,2.0)*Math.abs(y-Math.tan(z)))
        val b = 1+Math.abs(y-x)+Math.pow(y-x,2.0)/2+Math.pow(Math.abs(y-x),3.0)/3
        println("Значение a = $a, значение b = $b")
    }
    catch(e:Exception)
    {
        println("Введен неверный формат данных")
    }
}
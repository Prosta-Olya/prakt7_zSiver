fun main(){
    try{
        println("Введите радиус окружности R:")
        val R = readLine()!!.toDouble()
        println("Введите сторону правильного вписанного многоугольника a:")
        val a = readLine()!!.toDouble()
        when{
            R<=0 || a<=0 -> println("Радиус и сторона не могут быть отрицательными или равными нулю")
            else -> {
                val b = Math.sqrt(2*Math.pow(R,2.0) - 2*R * Math.sqrt(Math.pow(R,2.0) - Math.pow(a,2.0)/4))
                println("Сторона правильного вписанного многоугольника с удвоенным числом сторон: $b")
            }
        }
    }
    catch(e:Exception){
        println("Введены некорректные значения")
    }
}
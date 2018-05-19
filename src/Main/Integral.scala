package Main

object Main {
  def main(args: Array[String]): Unit = {
  println("Trapezoidal integration")    
  var integral = IntegralT(0,math.Pi,20)
  println("Result: "+integral)
  }
  //Fuction SIN
  def function(x:Double) = Math.sin(x)
  
  //Trapezoid Method
  def IntegralT(a:Double, b:Double, n:Int)={
    var interval = ((b-a)/n)
    var xi = a
    var xin = b
    var left = (interval)/(2.0)*(function(xi)+function(xin))
    var sum = 0.0
    for( i <- 2 to n){
      sum += function(xi)
      xi = xi + interval
      }
    left + interval * sum
  }

}

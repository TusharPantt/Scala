class calculator
{
	def +(a:Int,b:Int): Int = a+b
	def -(a:Int,b:Int): Int = a-b
	def *(a:Int,b:Int): Int = a*b
	def /(a:Int,b:Int): Int = a/b
}
object cal
{
	def main(args: Array[String])
	{
		val calculator = new calculator();
		println("addition : "+calculator.+(15,5))
		println("subtraction : "+calculator.-(15,5))
		println("multiplication : "+calculator.*(15,5))
		println("division : "+calculator./(15,5))
	}
}
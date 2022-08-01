package Demo3

object Q1 {
  def main(args: Array[String]):Unit={

   print("Enter the deposit amount: ")
   val deposit_amount = scala.io.StdIn.readDouble()
    println("Interest = Rs. " + interest(deposit_amount))
  }

    def interest(amount:Double):Double =
        amount match{
        case x if x<0 =>0
        case x if x<=20000 => x * 0.02
        case x if x<=200000 => x * 0.04
        case x if x<=2000000 => x * 0.035
        case x if x>2000000 => x * 0.065
      }
}

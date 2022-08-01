package Demo3

object Q2 {
def main(args: Array[String]): Unit = {
print("Input a number: ")
  val num = scala.io.StdIn.readInt()

  patternMatching(num)
}

  def patternMatching(number: Int): Unit = {
    number match {
      case x if x <= 0 => println("Input is Negative/Zero")
      case x if x % 2 == 0 => println("Even number is given")
      case x if x % 2 != 0 => println("Odd number is given")
    }
  }



}

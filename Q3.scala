package Demo3

object Q3 {
  def main(args: Array[String]): Unit = {

    def toUpper(name1: String): String = {
      name1.toUpperCase()
    }

    def toLower(name1: String): String = {
      name1.toLowerCase()
    }

    def formatNames(name: String)(func: String => String): String = {
      func(name)
    }

    def first(name1: String): String = {
      name1.substring(0,2).toUpperCase()+ name1.substring(2,name1.length()).toLowerCase()
    }

    def second(name1: String): String = {
      name1.substring(0,1).toUpperCase()+name1.substring(1,name1.length()-1).toLowerCase()+ name1.substring(name1.length()-1).toUpperCase()
    }

    println(formatNames("Benny")(toUpper(_)))
    println(formatNames("Niroshan")(first(_)))
    println(formatNames("Saman")(toLower(_)))
    println(formatNames("Kumara")(second(_)))

  }

}

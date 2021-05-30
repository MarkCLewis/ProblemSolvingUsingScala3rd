package basics

@main def hello() = println("Hello, World!")

def explicitNullTest(): Unit = {
  val s = "hi there".substring(0,2)
  if (s != null) println(s.length)
}
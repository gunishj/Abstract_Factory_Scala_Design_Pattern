object App extends  App{
  println("Welcome to OM car Dealership")

val audi = new Car(new AudiCarFactory)
audi.drive()

  println()
  val bmw = new Car(new BMWCarFactory)
  bmw.drive()


}





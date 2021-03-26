object App extends  App{
  println("Welcome to OM car Dealership")

  val audi = new Car(AudiCarFactory)
  audi.drive()

  println()
  val bmw = new Car(BMWCarFactory)
  bmw.drive()


}





class Car (factory: CarFactory) {

  val engine = factory.CreateEngine()
  val wheel = factory.CreateWheel()
  val brand = factory.CreateBrand()

  def drive(): Unit = {
    println(brand.Name())
    println(engine.Start())
    println(wheel.Rotate())
  }

}

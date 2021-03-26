class BMWCarFactory extends CarFactory {
  override def CreateBrand(): Brand = new BMWBrand

  override def CreateEngine(): Engine = new V8Engine

  override def CreateWheel(): Wheel = new DunlopWheel


}

class AudiCarFactory extends  CarFactory {
  override def CreateBrand(): Brand = new AudiBrand

  override def CreateEngine(): Engine = new V6Engine

  override def CreateWheel(): Wheel = new MichelinWheel
}

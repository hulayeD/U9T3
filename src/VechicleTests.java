public class VechicleTests
{
  public static void main(String[] args)
  {
    Truck myTruck = new Truck("TY45LX", 20.0, 3, 5, true);
    System.out.println(myTruck.calculateTollPrice());

    Truck myTruck2 = new Truck("LM90LX", 20.0, 3, 5, false);
    System.out.println(myTruck2.calculateTollPrice());

    // the way toll price is calculated for a Vehicle
    // shouldn't have changed
    Vehicle myVehicle2 = new Vehicle("TR987", 10.0, 6);
    System.out.println(myVehicle2.calculateTollPrice());


  }
}

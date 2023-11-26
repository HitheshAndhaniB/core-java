class VehicalsStarted{
	
	public static void main(String... args){
		System.out.println("starting main in VehicalsStarted");
		Truck truck=new Truck(1500,6);
		truck.onRoad();
		truck.drift();
		truck.start();
		truck.stop();
		System.out.println("starting main in VehicalsStarted");

	}
}
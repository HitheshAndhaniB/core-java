class Truck extends Vehicals{
	double capacity;
	int weels;
	
	Truck(double capacity,int weels){
		super("tata",1000,12,"blue",8,50000,1000,"petrol");
		this.capacity=capacity;
		this.weels=weels;
		System.out.println("truck capacity is"+capacity);
		System.out.println("truck weels is"+weels);
	
	}
	void trucklood(){
		System.out.println("truck is looded");
	}
	void truckunlood(){
				System.out.println("truck is unlooded");

	}
	void truckstart(){
				System.out.println("truck is started");

	}
	void truckstop(){
				System.out.println("truck is stop");

	}
	@Override
	void onRoad(){
		
				System.out.println("truck is  onRoad");

	}
	@Override
	void drift(){
				System.out.println("truck is used to drift");

	}
	@Override
	void start(){
				System.out.println("truck is  start");

	}
	@Override
	void stop(){
				System.out.println("truck is used to stop");

	}
}
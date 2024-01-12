class Vehicals{
	String name;
	float weight;
	float height;
	String color;
	int noofWeels;
	double cost;
	int engineCc;
	String type;
	
	Vehicals(String name,float weight,float height,String color,int noofWeels,double cost,int engineCc,String type){
		this.name=name;
		this.weight=weight;
		this.height=height;
		this.color=color;
		this.noofWeels=noofWeels;
		this.cost=cost;
		this.engineCc=engineCc;
		this.type=type;
		System.out.println("name is :"+name);
		System.out.println("weight is :"+weight);
		System.out.println("height is :"+height);
		System.out.println("color is :"+color);
		System.out.println("noofWeels is:"+noofWeels);
		System.out.println("cost is :"+cost);
		System.out.println("engineCc is :"+engineCc);
		System.out.println("type is :"+type);
	}
	void travel(){
		
		System.out.println("vehical is used to travel");
	}
	void carry(){
				System.out.println("vehical is used to carry");

	}
	void loodItem(){
				System.out.println("vehical is used to loodItem");

	}
	void unLoodItem(){
				System.out.println("vehical is used to unLoodItem");

	}
	void offRoading(){
				System.out.println("vehical is used to offRoading");

	}
	void onRoad(){
		
				System.out.println("vehical is used to onRoad");

	}
	void drift(){
				System.out.println("vehical is used to drift");

	}
	void start(){
				System.out.println("vehical is used to start");

	}
	void stop(){
				System.out.println("vehical is used to stop");

	}
	
	void safety(){
				System.out.println("vehical is used to safety");

	}
}


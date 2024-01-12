class Agent{

	int id=1;
	String name= "Hithesh";
	String company= "qualcomm";
	Tent tent;
	
	void openTent(Tent tent){
		this.tent=tent;
		System.out.println("the slno is :"+ tent.slno);
		System.out.println("The width is:"+tent.width);
		System.out.println("The hight is:"+tent.hight);
		tent.open();
		
	}
	void closeTent(Tent tent){
		this.tent=tent;
		System.out.println("the slno is :"+ tent.slno);
		System.out.println("The width is:"+tent.width);
		System.out.println("The hight is:"+tent.hight);
		tent.close();
		
	}

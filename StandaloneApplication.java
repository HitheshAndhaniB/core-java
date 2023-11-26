class StandaloneApplication extends Application{
	int size;
	String compatablewith;
	Os os;
	
	
	StandaloneApplication(int size,String comopatablewith,Os os,int id,String name,Type type,double version,String developer,String date)
	{
		super(id,name,type,version,developer,date);
		this.size=size;
		this.compatablewith=compatablewith;
		this.os=os;
		System.out.println("Size is:"+size);
		System.out.println("compatablewith is:"+comopatablewith);
		System.out.println("Os is:"+os);

	}
	void consumerMemory(){
		System.out.println("StandaloneApplication is having consumerMemory");

	}
	void conumerInternet(){
		System.out.println("StandaloneApplication is having conumerInternet");
	
	}
}
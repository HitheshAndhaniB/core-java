class HardWare
{
	String name;
	String type;
	Brand brand;
	
	HardWare(String name,String type,Brand brand)
	{
		this.name=name;
		this.type=type;
		this.brand=brand;
	}
	
	void show()
	{
		System.out.println("starting of show in HardWare");
		System.out.println("name : "+this.name);
		System.out.println("typen: "+this.type);
		if(this.brand!=null)
		{
			System.out.println("brand:"+brand.name);
		}
	}
}
class Brand
{
	String name;
	String origin;
	String ceoName;
	City[] city;
	
	Brand(String name,String origin,String ceoName,City[] city)
	{
		this.name=name;
		this.origin=origin;
		this.ceoName=ceoName;
		this.city=city;
	}
	void show()
	{
		System.out.println("starting of show in Brand");
		System.out.println("Brand name : "+this.name);
		System.out.println("Brand origin : "+this.origin);
		System.out.println("Brand ceoName : "+this.ceoName);
		System.out.println("Brand located : "+this.city);
		if(this.city!=null)
		{
			for(int seq=0;seq<this.city.length;seq++)
			{
				City value=city[seq];
				value.show();
			}
		}
	}
}
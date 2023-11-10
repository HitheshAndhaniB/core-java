class Laptop
{
	HardWare[] hardware;
	Owner owner;
	Brand brand;
	
	Laptop(HardWare[] hardware,Owner owner,Brand brand)
	{
		this.hardware=hardware;
		this.owner=owner;
		this.brand=brand;
	}
	void show()
	{
				System.out.println("starting of show in laptop");

		if(this.brand!=null)
		{
			brand.show();
		}
		if(this.owner!=null)
		{
			owner.show();
		}
		if(this.hardware!=null)
		{
			for(int seq=0;seq<this.hard.length;seq++)
			{
				Hardware ref=hardware[seq];
				ref.show();
				
			}
		}
						System.out.println("ending of show in laptop");

	}
}
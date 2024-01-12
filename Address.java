class Address
{
	String street;
	int pinCode;
	City city;
	
	Address(String street,int pinCode,City city)
	{
		this.street=street;
		this.pinCode=pinCode;
		this.city=city;
		
	}
	void show()
	{
		System.out.println("starting of show in Address");
		System.out.println("street : "+this.street);
		System.out.println("pinCode : "+this.pinCode);
		
	}
}
class Owner
{
	String name;
	String email;
	Address permanentAddress;
	Address temporaryAddress;
	
	Owner(String name,String email,Address permanentAddress,Address temporaryAddress)
	{
		this.name=name;
		this.email=email;
		this.permanentAddress=permanentAddress;
		this.temporaryAddress=temporaryAddress;
	}
	
	void show()
	{
		System.out.println("starting of show in Owner");
		System.out.println("name : "+this.name);
		System.out.println("email : "+this.email);
		if(permanentAddress!=null)
		{
			permanentAddress.show();
		}
}
}
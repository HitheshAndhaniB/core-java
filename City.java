class City
{
	String name;
	String stateName;
	City(String name,String stateName)
	{
		this.name=name;
		this.stateName=stateName;
	}
	void show()
	{
		System.out.println("starting of show in City");
		System.out.println("city name : "+this.name);
		System.out.println("city stateName : "+this.stateName);
	}
}
class Canteen
{
	String type;
	String[] utensils;
	Canteen(String type,String[] utensils)
	{
		this.type=type;
		this.utensils=utensils;
	}
	
	void showInfo()
	{
		System.out.println("Canteen type: "+type);
		System.out.println("Canteen utensils: "+utensils);
		if(utensils!=null)
		{
			for(int index=0;index<utensils.length;index++)
			{
				String name=utensils[index];
				
		     System.out.println("Canteen utensils: "+name);
			}
		}
	}
}
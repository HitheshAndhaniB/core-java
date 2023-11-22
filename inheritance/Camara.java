class Camara{
	String brand;//const
	Color color;
	int pixel;//constactor
	double battaryDuration;
	
	Camara(String brand){
		this.brand=brand;
		System.out.println("Brand is :"+brand);
	}
	
	Camara(String brand,int pixel,double battaryDuration)
	{
		this.pixel=pixel;
		this.battaryDuration=battaryDuration;
		System.out.println("pixel is :"+pixel);
		System.out.println("battaryDuration is :"+battaryDuration);

	}
	
	void capture(Color color)
	{
		this.color = color;
	}
	
	
}
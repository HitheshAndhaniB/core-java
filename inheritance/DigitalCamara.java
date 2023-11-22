class DigitalCamara extends Camara{
	
	
	DigitalCamara(String brand,int pixel,double battaryDuration){
		super(brand,pixel,battaryDuration);
		System.out.println("init properties of camara");
		System.out.println("Brand is :"+brand);
		System.out.println("pixel is :"+pixel);
		System.out.println("battaryDuration is :"+battaryDuration);
		
	}
	
	
}
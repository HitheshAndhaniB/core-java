class CamaraStarter{
	
	public static void main (String... capture){
		
		System.out.println("Starting main in camarastarter");

		Camara camara=new Camara("cannon",1024,4);
		camara.capture(Color.WHITE);
		System.out.println("Color:"+camara.color);
		DigitalCamara digitalcamera=new DigitalCamara("sony",1024,3);
		System.out.println("ending main in camarastarter");
		

	}
}
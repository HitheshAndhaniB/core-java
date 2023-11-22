class GlassStarter{
	
	public static void main(String... args){
		
		
		System.out.println("Starting main in GlassStarter");
		LaminatedGlass laminatedglass=new LaminatedGlass(999d,2,2.2d,3);
		laminatedglass.setType(GlassType.GORILLAGLASS);
		
		ToughendedGlass toughendedglass=new ToughendedGlass(50d,"sagar");
		
		TintedGlass tint = new TintedGlass();
		System.out.println("Weight:"+tint.weight);
		System.out.println("Owner name:"+tint.ownername);
		
		System.out.println("Starting main in GlassStarter");


	}



}
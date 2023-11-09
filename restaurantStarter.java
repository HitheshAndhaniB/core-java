class RestaurantStarter
{
	public static void main(String[] any)
	{
				System.out.println("starting of main method");

		String[] items={"jamun","chicken","roti","eggrice","mashroombiryani"};
		Restuarant retaurant=new Restuarant();
		retaurant.setDetails("kiran",items);
		retaurant.showInfo();
				System.out.println("ending of main method");

	}
}
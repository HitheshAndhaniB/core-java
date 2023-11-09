class CanteenStarter
{
	public static void main(String[] any)
	{
				System.out.println("starting of main method");

		String[] items={"steel plate","silver plate","plastic plate","steel bowl","silver bowl","plastic bowl","bottle","steel bottle","steel cup","spoon",
		                 "plastic spoon","colander","tongs","ladle","grater","whishk","slotted spoon","spatula","rolling pin","wooden spoon","knife","mesureing cup",
						 "peeler","cutting board","potato masher","pan","fork","canopener","blender","cutler","scissors","chefs knife","garlic press","rod","bread bin","tea towel"};
						 Canteen canteen=new Canteen("veg",items);
						 canteen.showInfo();
		
				System.out.println("ending of main method");

	}
}
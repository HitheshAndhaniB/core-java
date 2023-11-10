class LaptopStarter
{
	public static void main(String[] any)
	{
		
		System.out.println("starting of main method");
		City city=new City("bangalore","karnataka");
		City city1=new City("chennai","tamilnadu");
		City city2=new City("dvg","karnataka");
		City city3=new City("mysore","karnataka");
		City city4=new City("hubbli","karnataka");
		City city5=new City("vijayanagar","karnataka");

		City[] ref={city,city1,city2,city3,city4,city5};
		
		Brand brand=new Brand("hp","india","georj",ref);
		
		Address address=new Address("btm",1223,city);
		Address address1=new Address("hsr",2433,city1);
		
		Owner owner=new Owner("Hithesh","Hithesh@gamil.com",address,address1);
		
		
		HardWare hardWare=new HardWare("mouse","wire",brand);
		HardWare hardWare1=new HardWare("keyboard","wire",brand);
		HardWare hardWare2=new HardWare("keyboard","wireless",brand);
		HardWare hardWare3=new HardWare("mouse","wireless",brand);
		HardWare hardWare4=new HardWare("display","optical",brand);
		HardWare hardWare5=new HardWare("display","crystal",brand);
		HardWare hardWare6=new HardWare("printer","wireless",brand);
		HardWare hardWare7=new HardWare("printer","wire",brand);
		HardWare hardWare8=new HardWare("blutooth","wireless",brand);
		HardWare hardWare9=new HardWare("blutooth","wire",brand);

		HardWare[] hardware={hardWare,hardWare1,hardWare2,hardWare3,hardWare4,hardWare5,hardWare6,hardWare7,hardWare8,hardWare9};
		
		Laptop laptop=new Laptop(hard,owner,brand);
		laptop.show();
				System.out.println("ending of main method");


		
	}
}
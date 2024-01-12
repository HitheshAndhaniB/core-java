class Restuarant{
	String ownerName;
	String[] specialItems;
	 
	 void setDetails(String ownerName,String[] specialItems)
	 {
		 this.ownerName=ownerName;
		 this.specialItems=specialItems;
	 }
	 
	 void showInfo()
	 {
		 		System.out.println("starting of showInfo in Restuarant");

		 System.out.println("ownerName: "+ownerName);
		 if(this.specialItems!=null)
		 {
			 for(int seq=0;seq<this.specialItems.length;seq++)
			 {
				 String value=specialItems[seq];
						 System.out.println("specialItems: "+value);
			 }
		 }
		 		 		System.out.println("ending of showInfo in Restuarant");

	 }
}
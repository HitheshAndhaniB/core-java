class Month
{
   String name;
   int noOfDays;
   int noOfWeekEnds;
   int noOfHolidays;
   
   Month(String name,  int noOfDays,int noOfWeekEnds,   int noOfHolidays)
   {
	   this.name=name;
	   this.noOfDays=noOfDays;
	   this.noOfWeekEnds=noOfWeekEnds;
	   this.noOfHolidays=noOfHolidays;
   }
   void showMonth()
   {
	   System.out.println("Starting month in showMonth");
	   System.out.println("name of the institution:"+name);
	   System.out.println("days course will be available:"+noOfDays);
	   System.out.println("how many weekeneds will be available:"+noOfWeekEnds);
	   System.out.println("how many holidays will be available:"+noOfHolidays);
	   System.out.println("Ending month in showMonth");


}
}
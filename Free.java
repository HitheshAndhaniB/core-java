class Free
{
   String what;
   String why;
   String freeforAll;
   
   
   Free(String what,String why,String freeforAll)
   {
   this.what=what;
   this.why=why;
   this.freeforAll=freeforAll;
   }
   void displayFree()
   {
	   System.out.println("Course:"+what);
	   System.out.println("why it will be free:"+why);
	   System.out.println("is there applicable for every students:"+freeforAll);


	}
}
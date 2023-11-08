class Tent{
	
	int slno=50;
	enum Colour{
		RED,BLACK,WHITE,BLUE;
	}
	double width=100, hight=150;	
	
	boolean open(){
		System.out.println("Starting open in Tent");
		System.out.println("this is open");
		System.out.println("Ending open in Tent");
		return false;
	
	}
	boolean close(){
		System.out.println("Starting close in Tent");
		System.out.println("this is close");
		System.out.println("Ending close in Tent");
		return false;
	}
	
	
	void ShowInfo(){
	System.out.println("Starting Showinfo in Tent");
	System.out.println("the slno is:"+this.slno);
	Colour colour=Colour.BLACK;
	System.out.println("The colour is :"+colour);
	System.out.println("The hight is :"+this.hight);
	System.out.println("the width is :"+this.width);
	open();
	close();
	System.out.println("Ending Showinfo in Tent");
	}

}
class Clock{
String brand;
String type;
String quality;
int quantity;

Clock(){
	super();
	System.out.println("Clock constucter");
}

Clock(String brand){
	super();
	this.brand=brand;
	System.out.println("Clock brand is: "+brand);
}
Clock(String brand,String type){
	super();
	this.brand=brand;
	this.type=type;
	System.out.println("Clock brand is: "+brand);
	System.out.println("Clock type is: "+type);
}
Clock(String brand,String type,String quality){
	super();
	this.brand=brand;
	this.type=type;
	this.quality=quality;
	System.out.println("Clock brand is: "+brand);
	System.out.println("Clock type is: "+type);
	System.out.println("Clock quality is: "+quality);
}
Clock(String brand,String type,String quality,int quantity){
	super();
	this.brand=brand;
	this.type=type;
	this.quality=quality;
	this.quantity=quantity;
	System.out.println("Clock brand is: "+brand);
	System.out.println("Clock type is: "+type);
	System.out.println("Clock quality is: "+quality);
	System.out.println("Clock quantity is: "+quantity);

}
}
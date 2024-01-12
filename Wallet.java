class Wallet{
String type;
String brand;
int noOfCantiner;
String quality;
 
 
 Wallet(){
	 super();
	System.out.println("Wallet constucter");
}

Wallet(String Type){
	super();
	this.type=type;
	System.out.println("Wallet Type is: "+Type);
}
Wallet(String type,String brand){
	super();
	this.type=type;
	this.brand=brand;
	System.out.println("Wallet type is: "+type);
	System.out.println("Wallet brand is: "+brand);
}
Wallet(String brand,String type,String quality,int noOfCantiner){
	super();
	this.type=type;
	this.brand=brand;
	this.noOfCantiner=noOfCantiner;
	this.quality=quality;
	System.out.println("Wallet type is: "+type);
	System.out.println("Wallet brand is: "+brand);
	System.out.println("Wallet noOfCantiner is: "+noOfCantiner);
}
Wallet(String brand,String type,int noOfCantiner,String quality){
	super();
	this.type=type;
	this.brand=brand;
	this.noOfCantiner=noOfCantiner;
	this.quality=quality;
	System.out.println("Wallet type is: "+type);
	System.out.println("Wallet brand is: "+brand);
	System.out.println("Wallet noOfCantiner is: "+noOfCantiner);
	System.out.println("Wallet quality is: "+quality);

}
 
 
 
 }
 
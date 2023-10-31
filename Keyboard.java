class Keyboard{
String brand;
String color;
int noOfStrick;
String type;
double cost;

Keyboard(){
	System.out.println("overloded constucter for keyboard");
	
}
Keyboard(String brand){
	this.brand=brand;
	System.out.println("brand of the keyboardis :"+brand);
}
Keyboard(String brand,double cost){
	this.brand=brand;
    this.cost=cost;
	System.out.println("cost of the keyboard is:"+cost);
	System.out.println("brand of the keyboardis :"+brand);

}
Keyboard(String brand,String color){
	this.brand=brand;
	this.color=color;
	System.out.println("brand and color of the keyboard is:"+brand  +color);
}
Keyboard(int noOfStrick){
	this.noOfStrick=noOfStrick;
	System.out.println("noOfStrick of the keyboard is:"+noOfStrick);
}
Keyboard(String brand,String color,int noOfStrick,String type,double cost){
	this.brand=brand;
	this.color=color;
	this.noOfStrick=noOfStrick;
	this.cost=cost;
	this.type=type;
	System.out.println("noOfStrick of the keyboard is:"+noOfStrick+   " cost of the keyboard is:"+cost+  "  type of the keyboard is:"+type);

}
}
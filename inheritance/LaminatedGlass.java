class LaminatedGlass extends Glass{
	double cost;
	int warranty;
	
	LaminatedGlass(double cost,int warranty,double length,int thickness){
		super(length,thickness);
	
	this.cost=cost;
	this.warranty=warranty;
	System.out.println("cost is:"+cost);
	System.out.println("warranty is:"+warranty);
System.out.println("length is :"+this.length);
		System.out.println("thickness is :"+this.thickness);	
		
		
	}
	
}
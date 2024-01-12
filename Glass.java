class Glass{
	double length;
	int thickness;
	String usage;
	String brand;
	GlassType type;
	Glass(){
		
		System.out.println("creating no-args constraction of glass");
		
	}
	
	Glass(	double length,int thickness){
		
		this.length=length;
		this.thickness=thickness;
		
	}
	
	Glass(String usage,String brand){
		this.usage=usage;
		this.brand=brand;
		System.out.println("usage is:"+usage);
		System.out.println("brand is:"+brand);
		
		
	}
	void setType(GlassType type)
	{
		this.type=type;
				System.out.println("type is:"+type);

	}
	
	}
class Application{
	int id;
	String name;
    Type type;
	double version;
	String developer;
	String date;
	
	Application(int id,String name,Type type,double version,String developer,String date){
		this.id=id;
		this.name=name;
		this.type=type;
		this.version=version;
		this.developer=developer;
		this.date=date;
		System.out.println("Id is:"+id);
		System.out.println("Name is:"+name);
		System.out.println("Type is:"+type);
		System.out.println("Version is:"+version);
		System.out.println("Developer is:"+developer);
		System.out.println("Date is:"+date);


	}
	void run(){
		System.out.println("Application is run");
	}
	
	void stop(){
		
		System.out.println("Application is stop");

	}
	void execute(){
		System.out.println("Application is execute");

	}
	void collectInfo(){
		System.out.println("collect Info in Application");

	}
	void displayInfo(){
		System.out.println("display Info in Application ");
	
	}
}
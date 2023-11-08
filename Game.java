class Game {
	
	int id;
	String name;
	enum TotalPlayers{
		ELEVEN,THIRTEEN,FIFTEEN
	}
	String origin;
	
	Game(int id,String name,String origin){
		
		this.id=id;
		this.name=name;
		this.origin=origin;
		
	}
	void play(){
		
		System.out.println("Starting play in Game");
		System.out.println("This is play method");
		System.out.println("Ending play in Game");
		
	}
	void pause(){
		
		System.out.println("Starting pause in Game");
		System.out.println("This is pause method");
		System.out.println("Ending pause in Game");
		
	}
	void end(){
		
		System.out.println("Starting end in Game");
		System.out.println("This is end method");
		System.out.println("Ending end in Game");
	}
	
	void ShowInfo(){
		System.out.println("Starting showinfo in game");
		System.out.println("The id is:"+this.id);
		System.out.println("The game name is :"+ this.name);
		System.out.println("The origion is:"+this.origin);
		TotalPlayers tp=TotalPlayers.ELEVEN;
		System.out.println("The total players are:"+tp.TotalPlayers);
		play();
		pause();
		end();
		
		System.out.println("Ending showinfo in game");
	} 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
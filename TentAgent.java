class TentAgent{
	
	public static void main(String[]Trip)
	{
		System.out.println("Starting main in TentAgent");
		Tent tent=new Tent();
		Agent agent=new Agent();
		System.out.println("\n"); 
		agent.openTent(tent);
		System.out.println("\n");
		agent.closeTent(tent);
		System.out.println("\n");
		tent.ShowInfo();
		System.out.println("\n");
		agent.ShowInfo();
		
		
		
		
		System.out.println("Ending main in TentAgent");
	}
	
	
	
	
	
	
}
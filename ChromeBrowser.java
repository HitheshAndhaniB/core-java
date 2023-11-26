class ChromeBrowser extends Browser{
	
	ChromeBrowser(){
		super();
	}
	@Override
	void settings(){
		System.out.println("settings of a Browser");
		
	}
	@Override
	void displayHistory(){
		System.out.println("Display history if the Browers");
		
	}
}
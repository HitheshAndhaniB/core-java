class Remote{
	int totalButtons;
	UsedFor usedFor;
	String original;
	
	Remote(int totalButtons,String original,UsedFor usedFor){
		
		this.totalButtons=totalButtons;
		this.original=original;
		this.usedFor=usedFor;
		System.out.println("TotalButtons is:"+totalButtons);
		System.out.println("Remote original is:"+original);
		System.out.println("Remote usedFor :"+usedFor);


	}
	
	void on(){
		
		System.out.println("Remote is on");
		
	}
	
	void off(){
		System.out.println("Remote is off");

		
	}
	
	void increaseVolume(){
		System.out.println("IncreaseVolume in Remote");
		
	}
	
	void decreaseVolume(){
		System.out.println("DecreaseVolume in Remote");
		
	}
	
	void chanelChange(){
		System.out.println("ChanelChange in Remote");
		
		
	}
}
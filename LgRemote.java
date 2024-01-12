class LgRemote extends Remote{
	int warranty;
	int totalBattary;
	
	LgRemote(int warranty,int totalBattary){
		super(28,"wireless",UsedFor.CONTROL);
		this.warranty=warranty;
		this.totalBattary=totalBattary;
		System.out.println("warranty is:"+warranty);
		System.out.println("totalBattary is:"+totalBattary);
		
	}
	
	
	void voiceCommands(){
		System.out.println("voiceCommands is available in lgremotes");

	}
	@Override
	void on(){
		
		System.out.println("LgRemote is on");
		
	}
	@Override
	void off(){
		System.out.println("LgRemote is off");

		
	}
	@Override
	void increaseVolume(){
		System.out.println("IncreaseVolume in LgRemote");
		
	}
	@Override
	void decreaseVolume(){
		System.out.println("DecreaseVolume in LgRemote");
		
	}
	void chanel(){
		System.out.println("ChanelChange in LgRemote");
		
		
	}
}
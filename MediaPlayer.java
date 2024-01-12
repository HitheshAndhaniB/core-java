class MediaPlayer extends StandaloneApplication{
	String[] favourites = {"Dramas","ActionMovie","MelodySons"};
	
	MediaPlayer(String[] favourites,int size,String comopatablewith,Os os,int id,String name,Type type,double version,String developer,String date){
		super(favourites,size,comopatablewith,os,id,name,type,version,developer,date);
		this.favourites=favourites;
		System.out.println("Favourites is:"+favourites);
		
	}
	
	void play(){
		
				System.out.println("Play the MediaPlayer");

	}
	
	void delete(){
				System.out.println("Delete the Meadiaplayer");

		
	}
	void download(){
				System.out.println("Download the medieaplayes");

	}
}
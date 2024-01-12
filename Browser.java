class Browser extends StandaloneApplication{
	String[] downlodes={"Movies","Videos","Songs","Images"};
	String[] browsingHistorySite={"MovieInfo","NewsInfo","weatherInfo"};
	
	Browser(String[] downlodes,String[] browsingHistorySite,int size,String comopatablewith,Os os,int id,String name,Type type,double version,String developer,String date){
		super(size,comopatablewith,os,id,name,type,version,developer,date);
		this.downlodes=downlodes;
		this.browsingHistorySite=browsingHistorySite;
		System.out.println("Downlodes is:"+downlodes);
		System.out.println("BrowsingHistorySite is:"+browsingHistorySite);

	}
	void settings(){
		System.out.println("settings of a Browser");
		
	}
	void displayHistory(){
		System.out.println("Display history if the Browers");
		
	}
	
	
	
}
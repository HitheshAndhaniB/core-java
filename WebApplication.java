class WebApplication extends Application{
	String[] supportedBrowser = {"Chrome","Mozilla Firefox","Microsoft Edge","opera","Brave"};
	String free;
	
	void WebApplication(String[] supportedBrowser,String free,int id,String name,Type type,double version,String developer,String date)
	{
		super(id,name,type,version,developer,dates);
		this.supportedBrowser=supportedBrowser;
		this.free=free;
		System.out.println("supportedBrowser is:"+supportedBrowser);
		System.out.println("free is:"+free);
	}
	void connectedInternet(){
		System.out.println("webApplication internet is connected");
	}
	void sendUser(){
		System.out.println("WebApplication is sends info to user");
	}
	void info(){
		
		for(int index=0;index<supportedBrowser.length;index++)
				{
					System.out.println("supportedBrowser: "+supportedBrowser[index]);
				}
				System.out.println("free: "+free);
	}
	
}
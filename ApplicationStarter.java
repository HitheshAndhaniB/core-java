class ApplicationStarter{
		public static void main(String... args){
			
			System.out.println("--------------------------------");
			Application app=new Application(112,"Govt",Type.INFO,2.23,"governament","2020");
		    app.stop();
			app.run();
			app.execute();
			System.out.println("--------------------------------");

			System.out.println("--------------------------------");
			StandaloneApplication sapp = new StandaloneApplication(123,"online",Os.WINDOWS);
			sapp.consumerMemory();
			System.out.println("--------------------------------");
			
			System.out.println("--------------------------------");
			WebApplication wapp=new WebApplication(supportedBrowser,"true");
		    System.out.println("--------------------------------");



}
}
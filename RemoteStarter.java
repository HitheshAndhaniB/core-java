class RemoteStarter{
	
		public static void main(String... args){
			
			System.out.println("Running main in RemoteStarter");
			LgRemote lg = new LgRemote(3,2);
			lg.on();
			lg.off();
			lg.increaseVolume();
			lg.voiceCommands();
			lg.chanelChange();
			System.out.println("ending main in RemoteStarter");
			System.out.println(lg.totalButtons);
			
		}

}
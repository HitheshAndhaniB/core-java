class AtmStarter
{
	public static void main(String[] any)
	{
		System.out.println("starting of main method");
		String[] branchName={"dvg","mysore","bangalore","hubbli","haveri"};
		String[] acs={"samsung","voltas","philips"};
	
		String[] ccTv={"mi","philips","hawels","orient","rally"};
		
		Atm atm=new Atm("SBI",branchName,acs,ccTv);
		
		atm.showBranchas();
		atm.showAcs();
		atm.showCcTv();
		System.out.println("ending of main method");

	}
}
class Atm
{
	String bankName;
	String[] branchs;
	String[] acs;
	String[] ccTvBrands;
	Atm(String bankName,String[] branchs,String[] acs,String[] ccTvBrands)
	{
		this.bankName=bankName;
		this.branchs=branchs;
		this.acs=acs;
		this.ccTvBrands=ccTvBrands;
	}
	void showBranchas()
	{
				System.out.println("starting of showBranchas in atm");

		System.out.println("bank name: "+bankName);
		System.out.println("bank name: "+this.branchs);
		if(this.branchs!=null)
		{
			for(int seq=0;seq<this.branchs.length;seq++)
			{
				String value=branchs[seq];
				System.out.println("location: "+value);
			}
		}
						System.out.println("ending of showBranchas in atm");

	}
	void showAcs()
	{
		System.out.println("starting of showAcs in atm");

		System.out.println("bank name: "+bankName);
		System.out.println("bank name: "+this.acs);
		if(this.acs!=null)
		{
			for(int seq=0;seq<this.acs.length;seq++)
			{
				String value1=acs[seq];
				System.out.println("acs: "+value1);
			}
		}
		else{

								System.out.println("ending of showAcs in atm");
		}
	
	}
	void showCcTv()
	{
						System.out.println("starting of showCcTv in atm");

		System.out.println("bank name: "+bankName);
		System.out.println("ccTvBrands: "+this.ccTvBrands);
		if(this.ccTvBrands!=null)
		{
			for(int seq=0;seq<this.ccTvBrands.length;seq++)
			{
				String value1=ccTvBrands[seq];
				System.out.println("ccTvBrands: "+value1);
			}
		}
								System.out.println("ending of showCcTv in atm");

	}
}
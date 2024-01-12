class WalletStarter{


public static void main(String[] args){
		Wallet wallet=new Wallet();
		System.out.println("Wallet type is :"+wallet.type);
		System.out.println("Wallet brand is :"+wallet.brand);
		System.out.println("Wallet noOfCantiner is :"+wallet.noOfCantiner);
		System.out.println("Wallet quality is :"+wallet.quality);

		
		Wallet wallet1=new Wallet("lether");
		System.out.println("Wallet type is :"+wallet1.type);
		System.out.println("Wallet brand is :"+wallet1.brand);
		System.out.println("Wallet noOfCantiner is :"+wallet1.noOfCantiner);
		System.out.println("Wallet quality is :"+wallet1.quality);
		
		
		Wallet wallet2=new Wallet("lether","Zara");
		System.out.println("Wallet type is :"+wallet2.type);
		System.out.println("Wallet brand is :"+wallet2.brand);
		System.out.println("Wallet noOfCantiner is :"+wallet2.noOfCantiner);
		System.out.println("Wallet quality is :"+wallet2.quality);

        Wallet wallet3=new Wallet("lether","Zara",4);
		System.out.println("Wallet type is :"+wallet3.type);
		System.out.println("Wallet brand is :"+wallet3.brand);
		System.out.println("Wallet noOfCantiner is :"+wallet3.noOfCantiner);
		System.out.println("Wallet quality is :"+wallet3.quality);
		
		Wallet wallet4=new Wallet("lether","Zara",4,"good");
		System.out.println("Wallet type is :"+wallet4.type);
		System.out.println("Wallet brand is :"+wallet4.brand);
		System.out.println("Wallet noOfCantiner is :"+wallet4.noOfCantiner);
		System.out.println("Wallet quality is :"+wallet4.quality);

}
}
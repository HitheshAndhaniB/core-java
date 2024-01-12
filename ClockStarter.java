class ClockStarter{
public static void main(String[] args){

System.out.println("Starting main to ClockStarter");
		
		Clock clock=new Clock();
		System.out.println("Clock brand is :"+clock.brand);
		System.out.println("Clock type is :"+clock.type);
		System.out.println("Clock quality is :"+clock.quality);
		System.out.println("Clock quantity is :"+clock.quantity);

		Clock clock1=new Clock("Titan");
		System.out.println("Clock brand is :"+clock1.brand);
		System.out.println("Clock type is :"+clock1.type);
		System.out.println("Clock quality is :"+clock1.quality);
		System.out.println("Clock quantity is :"+clock1.quantity);

		Clock clock2=new Clock("Titan","Digital");
		System.out.println("Clock brand is :"+clock2.brand);
		System.out.println("Clock type is :"+clock2.type);
		System.out.println("Clock quality is :"+clock2.quality);
		System.out.println("Clock quantity is :"+clock2.quantity);
		
		
		Clock clock3=new Clock("Titan","Digital","good");
		System.out.println("Clock brand is :"+clock3.brand);
		System.out.println("Clock type is :"+clock3.type);
		System.out.println("Clock quality is :"+clock3.quality);
		System.out.println("Clock quantity is :"+clock3.quantity);
		
		
		Clock clock4=new Clock("Titan","Digital","good",7);
		System.out.println("Clock brand is :"+clock4.brand);
		System.out.println("Clock type is :"+clock4.type);
		System.out.println("Clock quality is :"+clock4.quality);
		System.out.println("Clock quantity is :"+clock4.quantity);
		}




}
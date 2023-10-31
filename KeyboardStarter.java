class KeyboardStarter{

public static void main(String[] args)
{

Keyboard keyboard=new Keyboard();
System.out.println("staring main keyboard");
System.out.println("keyboard brand is:"+keyboard.brand);
System.out.println("keyboard color is:"+keyboard.color);
System.out.println("keyboard noofStrick is :"+keyboard.noOfStrick);
System.out.println("keyboard type is:"+keyboard.type);
System.out.println("keyboard cost is:"+keyboard.cost);
System.out.println("ending main keyboard");

Keyboard keyboard1=new Keyboard("Ducky");
System.out.println("staring main keyboard1");
System.out.println("keyboard1 brand is:"+keyboard1.brand);
System.out.println("keyboard1 color is:"+keyboard1.color);
System.out.println("keyboard1 noofStrick is :"+keyboard1.noOfStrick);
System.out.println("keyboard1 type is:"+keyboard1.type);
System.out.println("keyboard1 cost is:"+keyboard1.cost);
System.out.println("ending main keyboard1");

Keyboard keyboard2=new Keyboard("Ducky",799.0);
System.out.println("staring main keyboard2");
System.out.println("keyboard2 brand is:"+keyboard2.brand);
System.out.println("keyboard2 color is:"+keyboard2.color);
System.out.println("keyboard2 noofStrick is :"+keyboard2.noOfStrick);
System.out.println("keyboard2 type is:"+keyboard2.type);
System.out.println("keyboard2 cost is:"+keyboard2.cost);
System.out.println("ending main keyboard2");

Keyboard keyboard3=new Keyboard("Ducky",  "black");
System.out.println("staring main keyboard3");
System.out.println("keyboard3 brand is:"+keyboard3.brand);
System.out.println("keyboard3 color is:"+keyboard3.color);
System.out.println("keyboard3 noofStrick is :"+keyboard3.noOfStrick);
System.out.println("keyboard3 type is:"+keyboard3.type);
System.out.println("keyboard3 cost is:"+keyboard3.cost);
System.out.println("ending main keyboard3");

Keyboard keyboard4=new Keyboard(104);
System.out.println("staring main keyboard4");
System.out.println("keyboard4 brand is:"+keyboard4.brand);
System.out.println("keyboard4 color is:"+keyboard4.color);
System.out.println("keyboard4 noofStrick is :"+keyboard4.noOfStrick);
System.out.println("keyboard4 type is:"+keyboard4.type);
System.out.println("keyboard4 cost is:"+keyboard4.cost);
System.out.println("ending main keyboard4");

Keyboard keyboard5=new Keyboard("Ducky","Black",104,"Wireless",799.0);
System.out.println("staring main keyboard5");
System.out.println("keyboard5 brand is:"+keyboard5.brand);
System.out.println("keyboard5 color is:"+keyboard5.color);
System.out.println("keyboard5 noofStrick is :"+keyboard5.noOfStrick);
System.out.println("keyboard5 type is:"+keyboard5.type);
System.out.println("keyboard5 cost is:"+keyboard5.cost);
System.out.println("ending main keyboard5");
}


}
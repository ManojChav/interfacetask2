package com.bellinfo.interfacetask2;
//1,2
interface firstinterface{
	public void display();
	public int i();
}
interface secondinterface{
	public void display();
public int i();
}
/*public abstract class fiveclass implements firstinterface,secondinterface{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
   public int i(){
    	return 0;
    }
    public void display(){
    	
   }
}*/
//3.
interface thirdinterface{
	
	//static {
	//	System.out.println("static hi");
	//}
}

//4.

abstract class fourclass{
	{System.out.println("instance hello 4C");}
    static {
		System.out.println("static hi 4C");
	}
}
//5.
class fiveclass extends fourclass{
	static {System.out.println("static hi 5C");}
	fiveclass(){
		System.out.println("constructor hey 5C");
	}
	{System.out.println("instance hello 5C");}


	public static void main(String[] args){
		 fiveclass fco = new fiveclass();
	}
}
//1.we can implement two interfaces with same method name and same return type
//2.we cannot implement using same method name and different return type
//3.we cannot add either static block or instance block inside interface
//4.The sequence of execution is static block and then the instance block
//5.The sequence of execution is sttaic block, instance block and then the constructor  
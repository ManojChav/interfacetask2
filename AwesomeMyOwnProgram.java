package com.bellinfo.interfacetask2;

public class AwesomeMyOwnProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Buick Blesabre = new Buick();
		CadillacGTS Gts17 = new CadillacGTS();
		
		System.out.println("Features of Buick Lesabre");
		Blesabre.AutomaticGearingSystem();
		Blesabre.ACandHeating();
		Blesabre. ReverseParkingDisplay();
		Blesabre.AirBreaks();
		Blesabre.SportsCarMode();
		Blesabre.ToplessConvertible();
		System.out.println("\nFeatures of CadillacGTS17");
		Gts17.AutomaticGearingSystem();
		Gts17.ACandHeating();
		Gts17. ReverseParkingDisplay();
		Gts17.AirBreaks();
		Gts17.SportsCarMode();
		Gts17.ToplessConvertible();
	}

}
abstract class Car{
	
	public void AutomaticGearingSystem(){
		System.out.println("Most of the cars in USA have Automatic gearing system");
	}
	
	public void ACandHeating(){
		System.out.println("Every car comes with AC and heater system");
	}
}

interface features{
	
	public void ReverseParkingDisplay();
	public void AirBreaks();
	public void SportsCarMode();
	public void ToplessConvertible();
}
class Buick extends Car implements features{
	
	public void ReverseParkingDisplay(){
		System.out.println("Buick does not have reverse parking display");
	}
	public void AirBreaks(){
		System.out.println("Buick does not provide a preinstalled Airbreaks");
	}
	public void SportsCarMode(){
		System.out.println("Buick doesnt have a Sports Mode and not used in racing");
	}
	public void ToplessConvertible(){
		System.out.println("Buick cannot be converted to topless car");
	}
	
	
}
class CadillacGTS extends Car implements features{
	
	private int displaySize=0;
	
	CadillacGTS(){}
	
	CadillacGTS(int displaySize){
		this.displaySize = displaySize;
	}
	public void ReverseParkingDisplay(){
		System.out.println("CadillacGTS have Reverse Parking Display and cameras ");
	}
	public void AirBreaks(){
		System.out.println("CadillacGTS comes with a preinstalled Airbreaks");
	}
	public void SportsCarMode(){
		System.out.println("It can be operated in both normal mode and Sports Mode and so used in Racing");
	}
	public void ToplessConvertible(){
		System.out.println("CadillacGTS is not a topless convertible");
	}
	public void AutomaticGearingSystem(){
		System.out.println("Like all the cars it have excellent automatic gearing system");
	}
}

package com.bellinfo.interfacetask2;

public class parentchild {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P p = new C();
		System.out.println(p.Name);
		System.out.println(p.Occupation);
		System.out.println(p.PhoneNumber);
		p.ChangeName();
		p.ChangePhoneNumber();
		p.ChangeOccupation();
		//p.ChangeSchoolFees();
		
	}

}

class P{	
	String Name = "Suresh";
	String Occupation = "Microbiologist";
	long PhoneNumber=2062882914;
	void ChangeName(){
		Name="Suresh Kumar";
		System.out.println("Name changed to Suresh Kumar");
	}
	void ChangeOccupation(){
		Occupation = "Philanthrologist";
		System.out.println("New occupation is philanthrologist");
	}
	
	void ChangePhoneNumber(){
		PhoneNumber=2067829074;
		System.out.println("new Phonenumber is "+PhoneNumber);
	}
}

class C extends P{
	
	String Name ="Manoj";
	String Occupation ="Student";
	long PhoneNumber =2062662194;
	float SchoolFees= 30279.90f;
	
	void changename(){
		Name ="Manoj Kumar";
		System.out.println("name changed to Manoj Kumar");
	}
	
	void ChangeSchoolFees(){
		SchoolFees+=1150;
		System.out.println("New salary is "+ SchoolFees);
	}


}
//7,8:
//Variables are called from child class and got executed
// where as methods that are overrided in child class are executed instead of methods in parent class
// methods of parent class are accessible
// variables of parent class are accessible too
// if the method in parent class is given as variable in child class then the methos is executed but not the variable in child class


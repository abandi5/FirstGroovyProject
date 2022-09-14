package oops.com

class CarObjects {
	
	
	static void main(args) {
		// TODO Auto-generated method stub
		
		Car Toyota = new Car()
		Car Mercedes = new Car()
		
		
		Toyota.name= "Toyota"
		Toyota.color= "Blue"
		Toyota.model= 2019
		
		Mercedes.name="Mercedes"
		Mercedes.color="Orange"
		Mercedes.model=2018
		
		println "car details of toyota is ........."
		
		Toyota.CarDetails()
		Toyota.StartEngine()
		println "car details of merceds is ........."
		
		Mercedes.CarDetails()
		Mercedes.StartEngine()
			}
}

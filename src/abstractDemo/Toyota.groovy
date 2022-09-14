package abstractDemo

class Toyota extends Car{

	int topSpeed;
	@Override
	public Object topSpeed() {
		// TODO Auto-generated method stub
		println "Top speed for $name is $topSpeed"
	}
	static void main(args) {
		// TODO Auto-generated method stub
		
	
 
	
		Toyota car1= new Toyota()
		car1.name="Toyota"
		car1.color="Black"
		car1.model= 2020
		car1.topSpeed=200
		car1.startEngine()
		car1.topSpeed()
		
	}
}

package oops.com

class Car {

	String name
	String color
	int model
	
	def CarDetails()
	{
		println "Name of car$name $color coloured and model is $model"
	}
	
	def StartEngine()
	{
		println "Starting a engine $name"
	}
}
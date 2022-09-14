package com.test.demo

class FruitClass {

	private String FruitName
	private  String FruitColor

	def setFruitName(String Name) {
		FruitName = Name
	}
	def setFruitColor(String Color) {
		FruitColor = Color
	
	}

	def  getFruitColor() {
	println"Fruit name is  $FruitColor"
	}

	
	def  getFruitName() {
		println"Fruit name is  $FruitName"
	}



	static void main(args) {
		// TODO Auto-generated method stub
		
		FruitClass Fruit = new FruitClass()
		Fruit.setFruitName("Apple")
		Fruit.setFruitColor("Red")
		Fruit.getFruitColor()
		Fruit.getFruitName()
	}
}

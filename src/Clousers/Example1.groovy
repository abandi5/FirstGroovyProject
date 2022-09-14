package Clousers

/*def sayHello = { println "Hello"}

sayHello()
sayHello.call()*/


/*
String myname= "Arun"
def sayHello = {it-> 
	return "Hello $it, is $myname"
}

println sayHello("Bandi")

myname="Arun Kumar"

println sayHello("King") */

//java 8 working with collections

def names = ["Arun","kiran", "123", "cat", "Bob","<mca"]
 def result= names.findAll{it ==~ /[A-Z][a-z]+/} //accepts only capital letter followed by small letter
 
 println result




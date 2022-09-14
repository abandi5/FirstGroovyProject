package com.test.demo

try {
	
	int i=1/0

}
catch(Exception exp)
{
	println"I am inside exception"
	println exp.getCause()
	println exp.getMessage()
}
println "another set of code"



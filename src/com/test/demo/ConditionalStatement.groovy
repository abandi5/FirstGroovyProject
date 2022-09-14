package com.test.demo

def num=-11
if(num >0)
{
	println"num is positive"
}
else if(num == 0)
{
	println"num is zero"
}
else
{
	println"num is negative"
}

//Switch case

def x=10
def result = ""

switch(11)
{
	case 0: 
	result = "x is zero"
	break
	case {x<0}:
	result ="x is +ve"
	break
	case 10:
	result = "x is 11"
	break
	default:
	result = "invalid number"
}
println(result)
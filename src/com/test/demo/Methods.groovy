package com.test.demo

def printMethod(int a, b)
{
	println"create methods"  :+(a+b)
}

printMethod(5,10)

def Subract(d,int c=10)
{
	return "Subract of a-b:" +(d+c)
}
def result = Subract(5)
println'result'+result
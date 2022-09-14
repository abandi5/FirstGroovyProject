package com.test.demo

import java.awt.event.ItemEvent

def Clousers = {println "Hello world"}
Clousers.call()

def Clousers1 = {name-> println "Hello ${name}"}
Clousers1.call("Arun")

// refering a variable

def str ="Hello"
def Clousers2 = {name->println"$str $name"}
Clousers2.call("kiran")



// we can also pass clousers as variables in method

def str1="welcome"
def Clousers3= {name->println "$str1$name"}
Clousers3.call("Evoke")

def myMethod(closs)
{
	closs.call("Technologies")
}
myMethod(Clousers2)

// Clousers can also have return type

def ClousersReturn = {a,b,c-> return(a+b+c)}
def result = ClousersReturn(10,20,30)
println "Result is ": +result

//Using list

def ClousersList = ["Arun","kiran","Mahesh"]
println ClousersList.each{it}


// Using 
def ClousersMap = [
	"Subject": "groovy",
	"Student": "Arun"]
println ClousersMap.each { it }

// finding element is clouser

def ClouserFind = [1,2,3,4,5]
println ClouserFind.find{item->item==3}

// findall checks all the values present and returns according to condition

def ClousersFindall= [11,13,30,40,50]
println ClousersFindall.findAll{item->item >25}

// Every it will check everytime has satisified a condition if satisfied return true or else returns false

def ClousersEvery = [12,14, 15]
println ClousersEvery.every{item-> item>15}

//any if found prints true or else false

def ClouserAny = [1,3,4,6,8]
println ClouserAny.any { item-> item >7 }

// Collect use to do some mathematical operations

def ClouserCollect = [12, 23, 45, 56,78]
println ClouserCollect.collect{ item-> item +10 }


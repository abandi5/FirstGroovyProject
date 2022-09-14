package com.test.demo

def myFile = new File("data4.txt")
// writes data into data4.txt
myFile.write("This is line 1")

myFile <<"\n This is line no 2"

//overirdes
myFile.text = "This isline no 3"


//overrides
myFile.withWriter { writer -> writer.writeLine("This is lne no 4i") }
myFile.append("\n This is Line no 5")

println myFile.text

println myFile.length()
println myFile.isFile()
println myFile.isDirectory()
println myFile.isHidden()
//println myFile.text

//copy or push

def newFile = new File("data5.txt")
newFile<< myFile.text

//rename file and create

myFile.renameTo(new File("newFile.txt"))

println myFile.text
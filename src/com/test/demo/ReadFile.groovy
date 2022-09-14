package com.test.demo

String FilePath = "C:/Users/nanne/eclipse-workspace/FirstGroovyProject/data1.txt"

//String FilePath1 = "data1.txt"

File myFile = new File(FilePath)

// reading entire content as string
println myFile.text

//collect lines into a list

def list = myFile.collect{it}
println "list : $list"

//Store file content in an array
def array = myFile as String[]
println "array : $array"

//read file into a list of String

def lines = myFile.readLines()
println "lines : $lines"

//read file line by line

myFile.eachLine { line, lineNo->
	println"$lineNo : $line "
}


//read with reader

def line
myFile.withReader {reader->
	while((line=reader.readLine()!=null))
	{
		println "line :$line"
	}
}

// reading with new reader , all the above methods files closes automatically if you want
// close manually use this below code

def outputFile =  "data2.txt"
def reader = myFile.newReader()
new File(outputFile).append(reader)
reader.close()


// copying the file

def File3= new File("data3.txt")
File3<< myFile.text
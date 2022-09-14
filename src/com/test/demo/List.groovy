package com.test.demo
def list2= []
def myList = [1,2,4,5]
//println myList
//println myList.get(2)
def List =[4,3,7,[1,9,"Groovy"], 5, 6]
println List
println List[3]
println List[3][1]
println List.get(3).get(2)
println List[0..2]
println List[4..0]
println List
println List[3].contains(9)
println List[3].size()
 List.add(23)
 println List
 List.add(2, "King")
 println List
 List.remove(1)
 println List
List = List+[25,60]
println List

List = List.plus(["Arun",62])
println List

List = List-[25,60]
println List

List = List.minus([62])
println List

println List.pop()
println List.removeLast()
println List

println List.intersect([1,2,3])

println List.reverse()

println List.sort()

println List+["Queen", "Chess"]
List.clear()

println List.isEmpty()

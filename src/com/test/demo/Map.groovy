package com.test.demo
def map6= [:]
def map = ['name':'john',
	'age':'40']
println map

println map.name
println map.age
println map["name"]
println map["age"]
println map.getAt('age')
println map.get("age")
println map.size()
map.put('City', 'paris')
println map
println map.containsKey('City')
println map.containsValue("40")

//cloning a map

def map1 = map.clone()
println map1

map.each { Key,Value -> 
	println "$Key :$Value"
}
map.eachWithIndex { Key,Value,i -> 
	println "$i | $Key $Value"
}

map.each { entry -> 
	println "$entry.key :$entry.value"
}


def map2= ['a':1 , 'b': 2]
def entries= map2.entrySet()
entries.each { entry ->
	assert entry.key in ['a','b']
	assert entry.value in [1,2]
}

//map2.clear()
println map2

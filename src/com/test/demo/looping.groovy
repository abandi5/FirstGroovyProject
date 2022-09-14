package com.test.demo

//for in
for(a in 1..5)
{
	println a
}

1.upto(5) { println"Arun" }
1.upto(5) {println"$it"  }


def map = ['abc':1, 'def':2, 'xyz':3]
for ( e in map ) {
	print e.key +":"
	print e.value +". "
}

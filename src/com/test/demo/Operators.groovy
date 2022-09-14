package com.test.demo

//Arithmetic operator
assert 1+2 == 3
assert 2-2 == 0
assert 1*2 == 2
assert 1/2 == 0.5
assert 1%2 == 1
assert 1**2 == 1
assert 9.intdiv(5) == 1
assert 2.2.plus(1.1)==3.3

//Uninary Operators
assert +3 == 3
assert -4 == 0 - 4

assert -(-1) == 1

//increment 

def a = 2
def b = a++ * 3

assert a == 3 && b == 6

def c = 3
def d = c-- * 2

assert c == 2 && d == 6

def e = 1
def f = ++e + 3

assert e == 2 && f == 5

def g = 4
def h = --g + 1

assert g == 3 && h == 4

def a1 =4
a1+=3

assert a1==7

int b1=2
b1-=1
assert b1==1


// Relation operator

assert 1 + 2 == 3
assert 3 != 4

assert -2 < 3
assert 2 <= 2
assert 3 <= 4

assert 5 > 1
assert 5 >= -2


//logical 

assert !false
assert true && true
assert true || false

//precedence logical not has higher precendce than logical end

assert (!false && false) == false

// and has more priority
                                           
assert true || true && false

//bitwise operator
int a2=20
int b2=25
println(a2&b2)
println Integer.toBinaryString(20) // 10100
println Integer.toBinaryString(25) // 11001
                                   // 10000
println Integer.parseInt("10000", 2)  // 16

// conditional operator

assert (!true)    == false
assert (!'foo')   == false
assert (!'')      == true


// ternary operator

string="arun"
result = (string!=null && string.length()>0)? 'Found': 'notFound'
print(result )




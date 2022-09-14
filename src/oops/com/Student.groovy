package oops.com

class Student {
	
	private String name
	private int subject1
	private int subject2
	
	def printTotal()
	{
		println"$name has total marks":+(subject1+subject2)
	}

	static void main(args) {
		// TODO Auto-generated method stub
		
		Student s1 = new Student()
		s1.name="Arun"
		s1.subject1=45
		s1.subject2=45
		s1.printTotal()	
		}
}

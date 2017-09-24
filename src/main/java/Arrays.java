package main.java;

public class Arrays {

	public void run() {
		//initializing students list
		String[] students = {"Stud1","Stud2","Stud3","Stud4","Stud5",
                          	"Stud6","Stud7","Stud8","Stud9","Stud10",
                          	"Stud11","Stud12","Stud13","Stud14","Stud15"};
		
		//getting student with roll number 5
		System.out.println("Student with roll number 5: " + getStudentForRollNumber(5, students));
	}
	
	public String getStudentForRollNumber(int rollNo, String[] students) {
		//subtracting 1 from rollNo as indexing starts from 0
		return students[rollNo-1];
	}

}
